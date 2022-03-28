package com.example.rabbitapp.data

import retrofit2.http.GET

interface RabbitsApi {
    @GET("/randomrabbit")
    suspend fun getRandomRabbit(): Rabbit

    companion object{
        const val BASE_URl = "http://192.168.43.53:8080"
    }

}