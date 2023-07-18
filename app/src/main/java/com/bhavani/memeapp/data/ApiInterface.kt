package com.bhavani.memeapp.data

import com.bhavani.memeapp.models.AllMemesData
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("get_memes")
    suspend fun getMemes():Response<AllMemesData>
}