package com.africastalking.interfaces;


import com.africastalking.models.AirtimeResponses;

import retrofit2.Call;
import retrofit2.http.*;

public interface IAirtime {

    @FormUrlEncoded
    @POST("send")
    Call<AirtimeResponses> send(@Field("username") String username, @Field(value = "recipients", encoded = false) String recipients);

}
