package com.nguyendinhdoan.retrofitexample.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.nguyendinhdoan.retrofitexample.R;
import com.nguyendinhdoan.retrofitexample.data.model.Item;
import com.nguyendinhdoan.retrofitexample.data.model.SOAnswerResponse;
import com.nguyendinhdoan.retrofitexample.data.remote.ApiUtils;
import com.nguyendinhdoan.retrofitexample.data.remote.SOService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private SOService mService;
    private AnswersAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mService = ApiUtils.getSOService();
        mRecyclerView = findViewById(R.id.rv_answers);
        mAdapter = new AnswersAdapter(
                this, new ArrayList<Item>(0), new AnswersAdapter.PostItemListener() {
            @Override
            public void onPostClick(long id) {
                Toast.makeText(MainActivity.this, "post is id: " + id, Toast.LENGTH_SHORT).show();
            }
          }
        );

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setHasFixedSize(true);
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        mRecyclerView.addItemDecoration(itemDecoration);

        loadAnswers();
    }

    private void loadAnswers() {
        mService.getAnswsers().enqueue(new Callback<SOAnswerResponse>() {
            @Override
            public void onResponse(Call<SOAnswerResponse> call, Response<SOAnswerResponse> response) {
                if (response.isSuccessful()) {
                    mAdapter.updateAnswers(response.body().getItems());
                } else {
                    int statuscode = response.code();
                }
            }

            @Override
            public void onFailure(Call<SOAnswerResponse> call, Throwable t) {

            }
        });
    }
}
