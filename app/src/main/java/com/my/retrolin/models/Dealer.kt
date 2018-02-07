package com.my.retrolin.models

data class Dealer(
        var id:Int,
        var title:String,
        var name:String,
        var phone:String,
        var email:String,
        var address:String,
        var district_id:Int,
        var organisation:String,
        var details:String,
        var lang:Double,
        var lat:Double,
        var created_at:String
)