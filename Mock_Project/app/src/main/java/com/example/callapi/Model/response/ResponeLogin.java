package com.example.callapi.Model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponeLogin {

        @SerializedName("code")
        @Expose
        private String code;
        @SerializedName("message")
        @Expose
        private String message;
        @SerializedName("responseTime")
        @Expose
        private Integer responseTime;
        @SerializedName("secret")
        @Expose
        private String secret;
        @SerializedName("token")
        @Expose
        private String token;
        @SerializedName("user")
        @Expose
        private User user;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }



        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }



        public Integer getResponseTime() {
            return responseTime;
        }

        public void setResponseTime(Integer responseTime) {
            this.responseTime = responseTime;
        }



        public String getSecret() {
            return secret;
        }

        public void setSecret(String secret) {
            this.secret = secret;
        }


        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

    public ResponeLogin(String code, String message, Integer responseTime, String secret, String token, User user) {
        this.code = code;
        this.message = message;
        this.responseTime = responseTime;
        this.secret = secret;
        this.token = token;
        this.user = user;
    }

    @Override
    public String toString() {
        return "RequestLogin{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", responseTime=" + responseTime +
                ", secret='" + secret + '\'' +
                ", token='" + token + '\'' +
                ", user=" + user +
                '}';
    }

    public class User {

        @SerializedName("address")
        @Expose
        private String address;
        @SerializedName("avatar")
        @Expose
        private String avatar;
        @SerializedName("birthday")
        @Expose
        private String birthday;
        @SerializedName("coin")
        @Expose
        private Integer coin;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("fullName")
        @Expose
        private String fullName;
        @SerializedName("gender")
        @Expose
        private String gender;
        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("phone")
        @Expose
        private String phone;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("username")
        @Expose
        private String username;

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }



        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }



        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public Integer getCoin() {
            return coin;
        }

        public void setCoin(Integer coin) {
            this.coin = coin;
        }



        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }


        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }



        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }



        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public User withId(Integer id) {
            this.id = id;
            return this;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }



        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }



        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public User(String address, String avatar, String birthday, Integer coin, String email, String fullName, String gender, Integer id, String phone, String status, String username) {
            this.address = address;
            this.avatar = avatar;
            this.birthday = birthday;
            this.coin = coin;
            this.email = email;
            this.fullName = fullName;
            this.gender = gender;
            this.id = id;
            this.phone = phone;
            this.status = status;
            this.username = username;
        }

        @Override
        public String toString() {
            return "User{" +
                    "address='" + address + '\'' +
                    ", avatar='" + avatar + '\'' +
                    ", birthday='" + birthday + '\'' +
                    ", coin=" + coin +
                    ", email='" + email + '\'' +
                    ", fullName='" + fullName + '\'' +
                    ", gender='" + gender + '\'' +
                    ", id=" + id +
                    ", phone='" + phone + '\'' +
                    ", status='" + status + '\'' +
                    ", username='" + username + '\'' +
                    '}';
        }
    }
}
