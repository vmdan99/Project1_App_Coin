package com.example.callapi.Api;

import com.example.callapi.MainActivity;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import static com.example.callapi.MainActivity.getLegacyId;

public class MyInterceptor implements Interceptor {
    @NotNull
    @Override
    public Response intercept(@NotNull Chain chain) throws IOException {
        Request request = chain.request()
                .newBuilder()
                .addHeader("accept","application/json")
                .addHeader("Content-Type","application/json")
                .addHeader("X-CmdId",  getLegacyId())
                .addHeader("X-SentTime", String.valueOf(System.currentTimeMillis()))
                .build();

       return chain.proceed(request);
    }
}
