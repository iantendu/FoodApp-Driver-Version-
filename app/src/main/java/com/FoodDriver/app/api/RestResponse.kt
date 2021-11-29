package com.FoodDriver.app.api

class RestResponse<T> {

    private var data: T? = null

    private var message: String? = null

    private var status: String? = null

    fun getData(): T? {
        return data
    }

    fun getMessage(): String? {
        return message
    }

    fun getStatus(): String? {
        return status
    }

}