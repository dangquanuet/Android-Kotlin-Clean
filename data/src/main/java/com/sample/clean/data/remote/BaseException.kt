package com.sample.clean.data.remote

import com.sample.clean.data.remote.response.BaseErrorResponse
import retrofit2.Response
import java.io.IOException

class BaseException : RuntimeException {

    var errorType: Int = NETWORK
    var errorResponse: BaseErrorResponse? = null
    var response: Response<*>? = null

    val serverErrorCode: Int
        get() = if (errorResponse != null
            && errorResponse!!.code != null
        ) errorResponse!!.code!! else -1

    constructor(type: Int, cause: Throwable) : super(cause.message, cause) {
        this.errorType = type
    }

    constructor(type: Int, errorResponse: BaseErrorResponse?) {
        this.errorType = type
        this.errorResponse = errorResponse
    }

    constructor(type: Int, response: Response<*>?) {
        this.errorType = type
        this.response = response
    }

    override val message: String?
        get() = when (errorType) {
            SERVER -> if (errorResponse != null
                && errorResponse!!.errors != null
                && errorResponse!!.errors!!.isNotEmpty()
                && errorResponse!!.errors!!.get(0).name != null
                && errorResponse!!.errors!!.get(0).name!!.isNotEmpty()
            ) {
                errorResponse!!.errors!!.get(0).name!!.get(0)
            } else null

            NETWORK -> getNetworkErrorMessage(cause)

            HTTP -> if (response != null
                && response!!.message().isNotEmpty()
            ) {
                response!!.message()
            } else null

            UNEXPECTED -> cause?.message

            else -> {
                "Unexpected error has occurred"
            }
        }

    private fun getNetworkErrorMessage(throwable: Throwable?): String {
        return throwable?.message.toString()
    }

    companion object {

        /**
         * An [IOException] occurred while communicating to the server.
         */
        const val NETWORK = 0
        /**
         * A non-2xx HTTP status code was received from the server.
         */
        const val HTTP = 1
        /**
         * A error server with code & message
         */
        const val SERVER = 2
        /**
         * An internal error occurred while attempting to execute a request. It is best practice to
         * re-throw this exception so your application crashes.
         */
        const val UNEXPECTED = 3

        fun toHttpError(response: Response<*>): BaseException {
            return BaseException(HTTP, response)
        }

        fun toNetworkError(cause: Throwable): BaseException {
            return BaseException(NETWORK, cause)
        }

        fun toServerError(errorResponse: BaseErrorResponse): BaseException {
            return BaseException(SERVER, errorResponse)
        }

        fun toUnexpectedError(cause: Throwable): BaseException {
            return BaseException(UNEXPECTED, cause)
        }
    }
}
