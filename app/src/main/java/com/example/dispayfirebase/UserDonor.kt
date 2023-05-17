package com.example.dispayfirebase




class UserDonor {

    var name:String = ""
    var age:String = ""
    var group:String = ""
    var phone:String = ""
    var location:String = ""
    var time_id:String =""


    constructor(name: String, age: String, group: String, phone: String, location: String,  time_id: String) {
        this.name = name
        this.age = age
        this.group = group
        this.phone = phone
        this.location = location
        this.time_id = time_id
    }

    constructor()

}