package com.example.myapplication.api

import com.example.myapplication.model.User

interface ApiHelper {

    suspend fun getUsers(): List<User>

}