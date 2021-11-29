package com.FoodDriver.app.model

class ProfileModel {
    private var profile_image: String? = null

    private var name: String? = null

    private var mobile: String? = null

    private var id: String? = null

    private var email: String? = null

    fun getProfile_image(): String? {
        return profile_image
    }

    fun getName(): String? {
        return name
    }

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