package com.FoodDriver.app.model

class SummaryModel {
    private var delivery_charge: String? = null

    private var discount_amount: String? = null

    private var promocode: String? = null

    private var order_total: String? = null

    private var tax: String? = null

    private var order_notes: String? = null

    fun getDelivery_charge(): String? {
        return delivery_charge
    }

    fun getDiscount_amount(): String? {
        return discount_amount
    }

    fun getPromocode(): String? {
        return promocode
    }

    fun getOrder_total(): String? {
        return order_total
    }

    fun getTax(): String? {
        return tax
    }

    fun getOrder_notes(): String? {
        return order_notes
    }

}