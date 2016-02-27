package com.zhonghua.scm;
import android.widget.ImageView;
import com.android.volley.VolleyError;
import com.zhonghua.app.Configer;
import com.zhonghua.dileber.http.HttpListener;
import com.zhonghua.dileber.mvp.scm.Scm;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by  on 16/1/17.
 */
public class MainScm extends Scm implements IMainScm {


    @Override
    public void getImage(String url, ImageView imageView) {
        netWorkForImage(imageView,url, com.zhonghua.dileber.R.drawable.ic_launcher);
    }

    @Override
    public void getImagePath(HttpListener<String[]> httpListener) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("filepath","/upload_file/1876");
        netWork(Configer.HTTP_CONFIG+"/api/util/newfile/getppt", map, String[].class,httpListener,TYPE_GET);
    }


}
