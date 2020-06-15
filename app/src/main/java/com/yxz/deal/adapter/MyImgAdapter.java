package com.yxz.deal.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;

public class MyImgAdapter extends PagerAdapter {
    private Context context;
    public MyImgAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }
}
