package com.yxz.deal.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yxz.deal.R;

import me.yokeyword.fragmentation.SupportFragment;

public class ChatFragment extends SupportFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        initBanner();
        return inflater.inflate(R.layout.fr_chat, null);
    }

    //初始化轮播图
//    private void initBanner() {
//        new MyImgAdapter();
//    }
}
