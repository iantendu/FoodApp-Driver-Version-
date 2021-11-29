package com.FoodDriver.app.api

import com.FoodDriver.app.model.OrderDetailModel
import com.FoodDriver.app.model.SummaryModel

class RestOrderDetailResponse {

    private var delivery_address: String? = null

    private var profile_image: String? = null

    private var name: String? = null

    private var mobile: String? = null

    private var lang: String? = null

    private var lat: String? = null

    private var data: ArrayList<OrderDetailModel>? = null

    private var status: String? = null

    private var summery: SummaryModel? = null

    private var landmark: String? = null

    private var building: String? = null

    private var pincode: String? = null


    fun getData(): ArrayList<OrderDetailModel> {
        return data!!
    }

    fun getStatus(): String? {
        return status
    }

    fun getSummery(): SummaryModel? {
        return summery
    }

    fun getLat(): String? {
        return lat
    }

    fun getLang(): String? {
        return lang
    }

    fun getMobile(): String? {
        return mobile
    }

    fun getName(): String? {
        return name
    }

    fun getProfile_image(): String? {
        return profile_image
    }

    fun getDelivery_address(): String? {
        return delivery_address
    }

    fun getBuilding(): String? {
        return building
    }

    fun getLandmark(): String? {
        return landmark
    }

    fun getPincode(): String? {
        return pincode
    }

}