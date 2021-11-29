package com.FoodDriver.app.model

class AddonsModel {

    private var price: String? = null

    private var name: String? = null

    private var id: String? = null

    constructor(price: String?, name: String?, id: String?) {
        this.price = price
        this.name = name
        this.id = id
    }

    fun getPrice(): String? {
        return price
    }

    fun getName(): String? {
        return name
    }

    fun getId(): String? {
        return id
    }

}