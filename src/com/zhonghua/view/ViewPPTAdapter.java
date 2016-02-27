package com.zhonghua.view;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhonghua.app.Configer;
import com.zhonghua.delegate.MainViewDelegate;
import com.zhonghua.dileber.mvp.view.AppViewDelegate;
import com.zhonghua.imageppt.R;

import java.util.List;

/**
 * PPT adapter
 * Created by yy on 2016/2/15.
 */
public class ViewPPTAdapter extends PagerAdapter{

    List<View> list = null;
    List<String> url = null;
    AppViewDelegate delegate;

    public ViewPPTAdapter(List<View> list,List<String> url,AppViewDelegate delegate){
        this.url = url;
        this.list = list;
        this.delegate = delegate;
    }

    @Override
    public int getCount() {
        return list.size();
    }


    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view == o;
    }

    /**
     * 每次滑动的时候生成的组件
     * @param container
     * @param position
     * @return
     */
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View v = list.get(position);
        container.addView(v);
        return v;
    }

    /**
     * 滑动切换的时候销毁当前的组件
     * @param container
     * @param position
     * @param object
     */
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        //container.removeView(list.get(position));
        View v = list.get(position);
        ((ViewPager) container).removeView(v);
        list.set(position,((MainViewDelegate)delegate).imageViews(url.get(position)));

    }

    @Override
    public int getItemPosition(Object object) {
        return super.getItemPosition(object);
    }

}
