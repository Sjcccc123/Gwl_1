package com.Sujichun.mode.a1509agoodcart.view;

import com.Sujichun.mode.a1509agoodcart.bean.GoosBean;

import java.util.List;

/**
 * Created by peng on 2017/11/16.
 */

public interface IMainActivity {
    public void showList(List<GoosBean.DataBean> groupList, List<List<GoosBean.DataBean.DatasBean>> childList);
}
