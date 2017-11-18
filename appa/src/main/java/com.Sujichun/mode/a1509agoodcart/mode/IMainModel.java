package com.Sujichun.mode.a1509agoodcart.mode;

import com.Sujichun.mode.a1509agoodcart.bean.GoosBean;
import com.Sujichun.mode.a1509agoodcart.net.OnNetListener;

/**
 * Created by peng on 2017/11/16.
 */

public interface IMainModel {
    public void getGoods(OnNetListener<GoosBean> onNetListener);
}
