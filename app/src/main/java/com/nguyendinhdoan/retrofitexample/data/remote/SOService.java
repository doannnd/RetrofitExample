package com.nguyendinhdoan.retrofitexample.data.remote;

import com.nguyendinhdoan.retrofitexample.data.model.SOAnswerResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SOService {

    @GET("answers?order=desc&sort=activity&site=stackoverflow")
    Call<SOAnswerResponse> getAnswsers();

    @GET("answers?order=desc&sort=activity&site=stackoverflow")
    Call<List<SOAnswerResponse>> getAnswsers(@Query("tagged") String tags);
}
