package com.Sujichun.mode;

import android.os.Handler;
import android.os.Looper;

import com.Sujichun.bean.GoosBean;
import com.Sujichun.net.Api;
import com.Sujichun.net.HttpUtils;
import com.Sujichun.net.OnNetListener;
import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Created by peng on 2017/11/16.
 */

public class MainModel implements IMainModel {
    private Handler handler = new Handler(Looper.getMainLooper());


    public void getGoods(final OnNetListener<GoosBean> onNetListener) {
        HttpUtils.getHttpUtils().doGet( Api.url, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
                final GoosBean goosBean = new Gson().fromJson(string, GoosBean.class);
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        onNetListener.onSuccess(goosBean);
                    }
                });
            }
        });
    }
}
