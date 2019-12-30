package com.laoxu.a1707bweek01.model;

import com.google.gson.Gson;
import com.laoxu.a1707bweek01.contract.IHomeContract;
import com.laoxu.a1707bweek01.entity.HomeEntity;
import com.laoxu.a1707bweek01.utils.OkhttpUtils;

public class HomeModel implements IHomeContract.IModel {
    @Override
    public void getData(String url, IModelCallback iModelCallback) {

        OkhttpUtils.getInstance().doGet(url, new OkhttpUtils.OkhttpCallback() {
            @Override
            public void success(String result) {
                HomeEntity homeEntity = new Gson().fromJson(result,HomeEntity.class);
                iModelCallback.success(homeEntity);
            }

            @Override
            public void failure(Throwable throwable) {

                iModelCallback.failure(throwable);
            }
        });
    }
}
