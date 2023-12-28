package practice.library.retrofit

import okhttp3.ResponseBody
import practice.library.models.*
import retrofit2.Call
import retrofit2.http.*

interface RetrofitService {
    @GET("users/")
    @Headers(
        "Accept:application/json",
        "Content-Type:application/json",
        "token: uli123"
    )
    fun getUsers(): Call<MutableList<User>>

    @POST("users/")
    @Headers(
        "Accept:application/json",
        "Content-Type:application/json",
        "token: uli123"
    )
    fun createUser(@Body data: UserCreate): Call<User>

}