package com.mvp.jan.data.network.base

interface BaseAPIListener {
    fun onUnauthorizedError(errorResponse: BaseErrorResponse)

    fun onAuthenticationError(errorResponse: BaseErrorResponse)

    fun onConflictError(errorResponse: BaseErrorResponse)

    fun onNotFoundError(errorResponse: BaseErrorResponse)
}