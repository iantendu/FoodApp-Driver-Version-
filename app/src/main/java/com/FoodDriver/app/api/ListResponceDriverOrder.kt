package com.FoodDriver.app.api

import com.FoodDriver.app.model.OrderHistoryModel

class ListResponceDriverOrder {
    private var data: ArrayList<OrderHistoryModel>? = null

    private var ongoing_order: String? = null

    private var completed_order: String? = null

    private var status: String? = null

    private var currency: String? = null

    fun getData(): ArrayList<OrderHistoryModel> {
        return data!!
    }

    fun getOngoing_order(): String? {
        return ongoing_order
    }

    fun getCompleted_order(): String? {
        return completed_order
    }

    fun getStatus(): String? {
        return status
    }

    fun getCurrency(): String? {
        return currency
    }

}