package com.laoxu.a1707bweek01.presenter;

import com.laoxu.a1707bweek01.base.BasePresenter;
import com.laoxu.a1707bweek01.contract.IHomeContract;
import com.laoxu.a1707bweek01.entity.HomeEntity;
import com.laoxu.a1707bweek01.model.HomeModel;

public class HomePresenter extends BasePresenter<HomeModel, IHomeContract.IView> implements IHomeContract.IPresenter {
    @Override
    protected HomeModel initModel() {
        return new HomeModel();
    }

    @Override
    public void getData(String url) {

        model.getData(url, new IHomeContract.IModel.IModelCallback() {
            @Override
            public void success(HomeEntity homeEntity) {
                getView().success(homeEntity);
            }

            @Override
            public void failure(Throwable throwable) {

                getView().failure(throwable);
            }
        });
    }
}
