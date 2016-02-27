package com.zhonghua.scm;

import android.widget.ImageView;
import com.zhonghua.dileber.http.HttpListener;

/**
 * Created by  on 16/1/17.
 */
public interface IMainScm {

    void getImage(String url,ImageView view);

    void getImagePath(HttpListener<String[]> httpListener);
}
