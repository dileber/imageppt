package com.zhonghua.delegate;

import android.view.View;
import com.zhonghua.app.Configer;
import com.zhonghua.dileber.mvp.view.AppViewDelegate;
import com.zhonghua.imageppt.R;
import com.zhonghua.view.MatrixImageView;
import com.zhonghua.view.PPTViewPage;
import com.zhonghua.view.ViewPPTAdapter;

import java.util.List;

/**
 * View 委托器
 * Created by  on 16/1/17.
 */
public class MainViewDelegate extends AppViewDelegate implements IMainView{


    @Override
    public int getRootLayoutId() {
        return R.layout.main;
    }


    PPTViewPage pptViewPage;

    @Override
    public void initWidget() {
        super.initWidget();
        pptViewPage = get(R.id.adapter);
    }


    @Override
    public void imageAdapter(List<View> list,List<String> url) {
        pptViewPage.setAdapter(new ViewPPTAdapter(list,url,this));
    }

    @Override
    public View imageViews(String url) {
        MatrixImageView imageView = new MatrixImageView(getActivity());
        String urln = Configer.HTTP_CONFIG+url;
        imageView.setImageUrl(urln, com.zhonghua.dileber.R.drawable.ic_launcher);
        return imageView;
    }
}