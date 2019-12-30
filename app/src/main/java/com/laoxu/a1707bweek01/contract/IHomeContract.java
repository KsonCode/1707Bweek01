package com.laoxu.a1707bweek01.contract;

import com.laoxu.a1707bweek01.base.IBaseModel;
import com.laoxu.a1707bweek01.base.IBaseView;
import com.laoxu.a1707bweek01.entity.HomeEntity;

/**
 * 契约类
 */
public interface IHomeContract {

    interface IModel extends IBaseModel {

        void getData(String url,IModelCallback iModelCallback);

        interface IModelCallback{
            void success(HomeEntity homeEntity);
            void failure(Throwable throwable);
        }

    }


    interface IView extends IBaseView{

        void success(HomeEntity homeEntity);
        void failure(Throwable throwable);

    }

    interface IPresenter{

        void getData(String url);

    }

}
