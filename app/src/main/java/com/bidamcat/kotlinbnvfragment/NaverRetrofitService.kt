package com.bidamcat.kotlinbnvfragment

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface NaverRetrofitService {

    @Headers("X-Naver-Client-Id: HPnUI1rFzlyRU1I4Gwk1","X-Naver-Client-Secret: on0k8aOwtZ")
    @GET("/v1/search/shop.json")
    fun searchDataString(@Query("query") query:String):Call<String>


    @Headers("X-Naver-Client-Id: HPnUI1rFzlyRU1I4Gwk1","X-Naver-Client-Secret: on0k8aOwtZ")
    @GET("/v1/search/shop.json")
    fun searchData(@Query("query") query:String):Call<NaverShoppingApiResponse>



}