package com.example.callapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentResolver;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.callapi.Api.ApiClient;
import com.example.callapi.Model.request.RequestLogin;
import com.example.callapi.Model.response.ResponeLogin;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    //public static String device = Secure.getString(getAp.getContentResolver(), Secure.ANDROID_ID);
    Button buttonLogIn,buttonSignUp;
    EditText textEmail,textPassword;
    static String idDine;
    String string1,string2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        ContentResolver cr = getApplicationContext().getContentResolver();
        idDine =  Settings.Secure.getString(cr, Settings.Secure.ANDROID_ID);

        buttonLogIn = findViewById(R.id.buttonLogin);
        textEmail = findViewById(R.id.editTextEmail);
        textPassword = findViewById(R.id.editTextPassword);

        String string1 = textEmail.getText().toString();
        String string2 = textPassword.getText().toString();
        buttonLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dangnhap();
                //Log.d(TAG, string1);
                // Toast.makeText(MainActivity.this, string1, Toast.LENGTH_SHORT).show();
//                Log.d("EditText value=",textEmail.getText().toString());
//                Log.d(TAG, "onClick: "+ string2);
                Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });

    }
        public void dangnhap() {
           /* Gson gson = new GsonBuilder().serializeNulls().create();

            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient okHttpClient = new OkHttpClient.Builder()
                    .addInterceptor(loggingInterceptor)
                    .addInterceptor(new Interceptor() {
                        @NotNull
                        @Override
                        public okhttp3.Response intercept(@NotNull Chain chain) throws IOException {
                            Request request = chain.request()
                                    .newBuilder()
                                    .addHeader("accept","application/json")
                                    .addHeader("Content-Type","application/json")
                                    .addHeader("X-CmdId",MainActivity.getLegacyId())
                                    .addHeader("X-SentTime", String.valueOf(System.currentTimeMillis()))
                                    .build();

                            return chain.proceed(request);
                        }
                    })
                    .build();

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://10.1.13.30:8883/v1/vm-application/")
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .client(okHttpClient)
                    .build();

            InJsonPlaceHolder inJsonPlaceHolder = retrofit.create(InJsonPlaceHolder.class);
           */
           Call<ResponeLogin> responeLoginCall = ApiClient.getUserService().responseLogin(new RequestLogin(getLegacyId(), "ABC_desktop", textEmail.getText().toString(), textPassword.getText().toString()));
            responeLoginCall.enqueue(new Callback<ResponeLogin>() {
                @Override
                public void onResponse(Call<ResponeLogin> call, Response<ResponeLogin> response) {
                    if (response.isSuccessful()) {
                        Log.d(TAG, "Success");

                    }

                }
                @Override
                public void onFailure(Call<ResponeLogin> call, Throwable t) {

                }
            });
        }
        public static String getLegacyId() {
            return idDine;
        }



        /*InJsonPlaceHolder inJsonPlaceHolder = retrofit.create(InJsonPlaceHolder.class);
        Call<List<Post>> posts = inJsonPlaceHolder.getPosts(new Integer[]{2,3,6},3,"abc");

        posts.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                if(!response.isSuccessful()){
                    Log.d(TAG, "onResponse: "+"Response failed");
                }
                List<Post> posts1 = response.body();
                for(Post i :posts1){
                    textView.append(i.toString());
                }
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                Log.d(TAG, "onFailure: Failed");

            }
        });*/
        /*Call<List<Comments>> comments = inJsonPlaceHolder.getComments();
        comments.enqueue(new Callback<List<Comments>>() {
            @Override
            public void onResponse(Call<List<Comments>> call, Response<List<Comments>> response) {
                if(!response.isSuccessful()){
                    Log.d(TAG, "onResponse: " +" Failed");
                }
                List<Comments> comments1 = response.body();
                for(Comments i: comments1){

                   textView.append(i.toString());


                }
            }

            @Override
            public void onFailure(Call<List<Comments>> call, Throwable t) {
                Log.d(TAG, "onFailure: " + t.getMessage());

            }
        });*/
      /*  Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        InJsonPlaceHolder jsonPlaceHolder = retrofit.create(InJsonPlaceHolder.class);
        Call<List<Post>> call = jsonPlaceHolder.getPosts();
        call.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                if(!response.isSuccessful()){
                    textView.setText("Code"+response.code());
                    return;
                }
                List<Post> posts = response.body();
                for(Post post : posts){
                    String content = "";
                    content += "User ID: " + post.getUserId()
                            + " \nID: " + post.getId()
                            + "\nTitle: " +post.getTitle()
                            +"\nBody: "+post.getBody() + '\n'+'\n';
                    textView.append(content);
                }

            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                textView.setText(t.getMessage());
            }
        });*/

        //Register();
//        Register();
//        User_Active();

/*
    public void LogIn(){
        Call<ResponeLogin> responeLoginCall = ApiClient.getUserService().responseLogin(new RequestLogin(getLegacyId(), "ABC_desktop","test2@gmail.com","123456789"));

        responeLoginCall.enqueue(new Callback<ResponeLogin>() {
            @Override
            public void onResponse(Call<ResponeLogin> call, Response<ResponeLogin> response) {
                if(response.isSuccessful()){
                    Log.d(TAG, "Success");
                }

            }

            @Override
            public void onFailure(Call<ResponeLogin> call, Throwable t) {
                Log.d(TAG, "Failed more than");

            }
        });


    }*/

    /*public void Register(){
        Call<ResponseRegisterTemp> resLogin = ApiClient.getUserService().register("X","12",
                new RequestRegisterTemp(null,null,"vumanhdan99@gmail.com",0,"abcde"));
        resLogin.enqueue(new Callback<ResponseRegisterTemp>() {
            @Override
            public void onResponse(Call<ResponseRegisterTemp> call, Response<ResponseRegisterTemp> response) {
                if(response.isSuccessful()){
                   ResponseRegisterTemp responseLogins = response.body();
                    Toast.makeText(MainActivity.this,"responseLogins.toString()", Toast.LENGTH_LONG).show();
                }

            }

            @Override
            public void onFailure(Call<ResponseRegisterTemp> call, Throwable t) {
                Log.e("failure",t.getLocalizedMessage());
            }
        });

    }*/

     /*Call<List<ResponseLogin>> resLogin = ApiClient.getUserService().respone_login(null,null,"gafha@gmail.com","fhahfa");
        resLogin.enqueue(new Callback<List<ResponseLogin>>() {
            @Override
            public void onResponse(Call<List<ResponseLogin>> call, Response<List<ResponseLogin>> response) {
                if(response.isSuccessful()){
                    List<ResponseLogin> responseLogins = response.body();
                }

            }

            @Override
            public void onFailure(Call<List<ResponseLogin>> call, Throwable t) {
                Log.e("failure",t.getLocalizedMessage());
            }
        });

    }
     Call<List<ResponseLogin>> resLogin = ApiClient.getUserService().respone_login(null,null,"gafha@gmail.com","fhahfa");
        resLogin.enqueue(new Callback<List<ResponseLogin>>() {
            @Override
            public void onResponse(Call<List<ResponseLogin>> call, Response<List<ResponseLogin>> response) {
                if(response.isSuccessful()){
                    List<ResponseLogin> responseLogins = response.body();
                }

            }

            @Override
            public void onFailure(Call<List<ResponseLogin>> call, Throwable t) {
                Log.e("failure",t.getLocalizedMessage());
            }
        });

    }
    public void Register(){
        Call<List<ResponeRegister>> resResgis = ApiClient.getUserService().register("10","10");
        resResgis.enqueue(new Callback<List<ResponeRegister>>() {
            @Override
            public void onResponse(Call<List<ResponeRegister>> call, Response<List<ResponeRegister>> response) {
                List<ResponeRegister> responeRegisters = response.body();
            }

            @Override
            public void onFailure(Call<List<ResponeRegister>> call, Throwable t) {
                Log.e("failure",t.getLocalizedMessage());

            }
        });
    }
    public  void User_Active(){
        Call<List<ResponeUser_Active>> resUser_Active = ApiClient.getUserService().user_active("10","10");
        resUser_Active.enqueue(new Callback<List<ResponeUser_Active>>() {
            @Override
            public void onResponse(Call<List<ResponeUser_Active>> call, Response<List<ResponeUser_Active>> response) {
                List<ResponeUser_Active> responeUser_actives = response.body();
            }

            @Override
            public void onFailure(Call<List<ResponeUser_Active>> call, Throwable t) {
                Log.e("failure",t.getLocalizedMessage());

            }
        });
    }*/

}