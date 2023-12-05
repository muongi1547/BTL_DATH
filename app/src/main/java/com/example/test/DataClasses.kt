package com.example.test

import android.widget.Button
import kotlinx.coroutines.processNextEventInCurrentThread
import java.util.Date

// DataClasses.kt
data class SectionTitle(val title: String)
class SectionItem1{
    var stockName:String=""
    var priceBought:String=""
    var amountChange:String=""
    var volumn:String=""
    constructor(stockName:String,priceBought:String,amountChange:String,volumn:String){
        this.stockName=stockName
        this.priceBought=priceBought
        this.amountChange=amountChange
        this.volumn=volumn
    }
}
class SectionItem2 {
    var totalAssests: String = ""
    var purchasingPower: String = ""
    var stockValue: String = ""

    constructor(totalAssests: String, purchasingPower: String, stockValue: String) {
        this.totalAssests = totalAssests
        this.purchasingPower = purchasingPower
        this.stockValue = stockValue
    }
}
class SectionItem3{
    var date_time:String=""
    var stockName:String=""
    var status:String=""
    var volumn:String=""
    var price:String=""
    constructor(date_time:String,stockName:String,status:String,volumn:String,price:String){
        this.date_time = date_time
        this.stockName = stockName
        this.status = status
        this.volumn=volumn
        this.price= price
    }
}
class SectionNotifications{
    var status:String=""
    var stockName:String=""
    var volumn:String=""
    var price:String=""
    constructor(status: String,stockName: String,volumn: String="",price: String=""){
        this.status=status
        this.stockName=stockName
        this.volumn=volumn
        this.price=price

    }
}