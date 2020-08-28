package com.example.callapi.Api;

import com.example.callapi.Model.request.RequestLogin;
import com.example.callapi.Model.response.ResponeLogin;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserService {

    @POST("authentication/login")
    Call<ResponeLogin> responseLogin ( @Body RequestLogin requestLogin);


    /*@PUT("authentication/register")
    Call<ResponseRegisterTemp> register (@Header("X-CmdId") String cmId, @Header("X-SentTime") String timeSent, @Body RequestRegisterTemp requestRegister);

    @POST("authentication/user-active")
    Call<ResponseUser_ActiveTemp> user_active (@Header("X-CmdId") String cmId, @Header("X-SentTime") String timeSent, @Body RequestUser_ActiveTemp requestUser_active);


    @GET("authentication/user-info")
    Call<RequestLoginTemp> takeInfo (@Header("Authotization") String token, @Header("X-CmdId") String cmId, @Header("X-SentTime") String timeSent);*/


}
