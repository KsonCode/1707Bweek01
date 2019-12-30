package com.laoxu.a1707bweek01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.laoxu.a1707bweek01.adapter.HomeAdapter;
import com.laoxu.a1707bweek01.api.Api;
import com.laoxu.a1707bweek01.base.BaseActivity;
import com.laoxu.a1707bweek01.base.BasePresenter;
import com.laoxu.a1707bweek01.contract.IHomeContract;
import com.laoxu.a1707bweek01.entity.HomeEntity;
import com.laoxu.a1707bweek01.presenter.HomePresenter;

import butterknife.BindView;

public class MainActivity extends BaseActivity<HomePresenter> implements IHomeContract.IView {
    @BindView(R.id.rv)
    RecyclerView rv;


    @Override
    protected HomePresenter initPresenter() {
        return new HomePresenter();
    }

    @Override
    protected void initData() {

        presenter.getData(Api.HOME_URL+"?keyword=手机&count=10&page=1");

    }

    @Override
    protected void initView() {

        rv.setLayoutManager(new GridLayoutManager(this,2));

    }

    @Override
    protected int bindLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void success(HomeEntity homeEntity) {

        HomeAdapter homeAdapter = new HomeAdapter(this,homeEntity.result);
        rv.setAdapter(homeAdapter);


    }

    @Override
    public void failure(Throwable throwable) {

    }
}
