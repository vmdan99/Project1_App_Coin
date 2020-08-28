package com.example.callapi.Api;

import com.example.callapi.Model.request.RequestLogin;
import com.example.callapi.Model.response.ResponeLogin;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface InJsonPlaceHolder {
   /* @GET ("posts")
    Call<List<Post>> getPosts() ;

    @GET("posts/1/comments")
    Call<List<Comments>> getComments();*/

   /* @GET("posts/{id}/comments")
    Call<List<Comments>> getComments(@Path("id") int postId);*/
   /*@GET("posts")
    Call<List<Post>> getPosts(@Query("userId") Integer[] userid,
   @Query("data") int data, @Query("index") String index);

   @POST("posts")
    Call<Post> createPost(@Body Post post);

   @POST("authentication/login")
    Call<RequestLogin> createRequestLogin(@Body RequestLogin requestLogin);*/
   @POST("authentication/login")
   Call<ResponeLogin> responseLogin (@Body RequestLogin requestLogin);
}
