package com.zhonghua.delegate;

import android.view.View;

import java.util.List;

/**
 * view 接口
 * Created by  on 16/1/17.
 */
public interface IMainView {

    void imageAdapter(List<View> list,List<String> url);

    View imageViews(String url);

}
