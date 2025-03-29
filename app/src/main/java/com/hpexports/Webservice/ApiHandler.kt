package com.hpexports.Webservice

import com.google.gson.GsonBuilder
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiHandler {
    var apiService: WebServices? = null
        get() {
            if (field == null) {
                //Here a logging interceptor is created

                val logging = HttpLoggingInterceptor()
                //            logging.setLevel(HttpLoggingInterceptor.Level.NONE);
                logging.setLevel(HttpLoggingInterceptor.Level.BODY)

                //The logging interceptor will be added to the http client
                val httpClient = OkHttpClient.Builder()
                httpClient.addInterceptor(logging)

                val gson = GsonBuilder()
                    .setLenient()
                    .create()

                val retrofit = Retrofit.Builder()
                    .client(httpClient.build())
                    .baseUrl(Constant.str_BaseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build()

                field = retrofit.create(WebServices::class.java)

                return field
            } else {
                return field
            }
        }
        private set
}
