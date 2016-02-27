package com.zhonghua.presenter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.NetworkImageView;
import com.zhonghua.app.Configer;
import com.zhonghua.delegate.MainViewDelegate;
import com.zhonghua.dileber.R;
import com.zhonghua.dileber.http.HttpListener;
import com.zhonghua.dileber.mvp.presenter.ActivityPresenter;
import com.zhonghua.dileber.tools.SLog;
import com.zhonghua.scm.IMainScm;
import com.zhonghua.scm.MainScm;
import com.zhonghua.view.MatrixImageView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActivityPresenter<MainViewDelegate> {

    List<String> url = null;
    IMainScm scm;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //网络请求返回是一个string字符数组～～网络解析～～～
        //但是呢demo我就不用网了先注释掉

         /*
        scm = new MainScm();
        scm.getImagePath(new HttpListener<String[]>() {
            @Override
            protected void onSuccess(String[] response) {
                if(response!=null){
                    SLog.w("tag", response, ">>>>>>>>>>>>>");
                    url = new ArrayList<String>();
                    for(int i = 0;i<response.length;i++){
                        SLog.w("tag", response[i], ">>>>>>>>>>>>>");
                        url.add(response[i]);

                    }
                    show();
                }
            }

            @Override
            protected void onFailure(VolleyError error) {

            }
        });
        */
        //测试代码
        url = new ArrayList<String>();
        url.add("http://tse3.mm.bing.net/th?id=OIP.Mbce6afcc7c220a90958b0ae26158e115H0&pid=15.1&P=0&w=268&h=168");
        url.add("http://tse1.mm.bing.net/th?id=OIP.Ma58f12d5ff75af5f750667754096897aH0&pid=15.1&P=0&w=250&h=157");
        url.add("http://tse1.mm.bing.net/th?id=OIP.M42e8aa42827d3b994516fe86973cd3bcH0&pid=15.1&P=0&w=318&h=179");
        url.add("http://tse4.mm.bing.net/th?id=OIP.M0bbf256c1658757875c2bd06c2fe3cc9o0&pid=15.1&P=0&w=250&h=157");
        url.add("http://tse1.mm.bing.net/th?id=OIP.M6d2e11f4f1b4aed73ec42c23f62a263bH0&pid=15.1&P=0&w=250&h=157");

        show();

    }

    void show(){
        List<View> list = new ArrayList<View>();
        for(int i = 0;i<url.size();i++){
            list.add(viewDelegate.imageViews(url.get(i)));
        }
        viewDelegate.imageAdapter(list,url);
    }

    @Override
    protected Class<MainViewDelegate> getDelegateClass() {
        return MainViewDelegate.class;
    }

    @Override
    protected void bindEvenListener() {
        super.bindEvenListener();
    }


    @Override
    public void onClick(View view) {

    }
}