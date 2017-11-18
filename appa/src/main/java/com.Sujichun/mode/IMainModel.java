package com.Sujichun.mode;

import com.Sujichun.bean.GoosBean;
import com.Sujichun.net.OnNetListener;

/**
 * Created by peng on 2017/11/16.
 */

public interface IMainModel {
    public void getGoods(OnNetListener<GoosBean> onNetListener);
}
