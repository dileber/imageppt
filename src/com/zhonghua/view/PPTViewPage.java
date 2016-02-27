package com.zhonghua.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by yy on 2016/2/15.
 */
public class PPTViewPage extends ViewPager implements MatrixImageView.OnMovingListener{

    /**  当前子控件是否处理拖动状态  */
    private boolean mChildIsBeingDragged=false;

    public PPTViewPage(Context context) {
        super(context);
    }

    public PPTViewPage(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent arg0) {
        if(mChildIsBeingDragged)
            return false;
        return super.onInterceptTouchEvent(arg0);
    }

    @Override
    public void startDrag() {
        // TODO Auto-generated method stub
        mChildIsBeingDragged=true;
    }


    @Override
    public void stopDrag() {
        // TODO Auto-generated method stub
        mChildIsBeingDragged=false;
    }


    public interface OnPlayVideoListener{
        void onPlay(String path);
    }
}
