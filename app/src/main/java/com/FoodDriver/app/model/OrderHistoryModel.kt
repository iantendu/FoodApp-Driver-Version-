package com.FoodDriver.app.model

class OrderHistoryModel {
    private var payment_type: String? = null

    private var total_price: String? = null

    private var order_number: String? = null

    private var id: String? = null

    private var status: String? = null

    private var date: String? = null

    fun getPayment_type(): String? {
        return payment_type
    }

    fun getTotal_price(): String? {
        return total_price
    }

    fun getOrder_number(): String? {
        return order_number
    }

    fun getId(): String? {
        return id
    }

    fun getStatus(): String? {
        return status
    }

    fun getDate(): String? {
        return date
    }

}