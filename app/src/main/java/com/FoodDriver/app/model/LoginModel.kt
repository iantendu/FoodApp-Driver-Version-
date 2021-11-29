package com.FoodDriver.app.model

class LoginModel {

    private var mobile: String? = null

    private var id: String? = null

    private var email: String? = null

    fun getMobile(): String? {
        return mobile
    }

    fun getId(): String? {
        return id
    }

    fun getEmail(): String? {
        return email
    }
}