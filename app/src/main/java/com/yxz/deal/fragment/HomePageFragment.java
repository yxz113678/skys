package com.yxz.deal.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.yxz.deal.R;
import com.yxz.deal.activity.MallActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import me.yokeyword.fragmentation.SupportFragment;

public class HomePageFragment extends SupportFragment {
    @BindView(R.id.wz)
    ImageView wz;
    @BindView(R.id.js)
    ImageView js;
    Unbinder unbinder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fr_homepage, null);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick({R.id.wz, R.id.js})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.wz:
                Intent intent = new Intent(getActivity(), MallActivity.class);
                startActivity(intent);
                break;
            case R.id.js:
                break;
        }
    }
}
