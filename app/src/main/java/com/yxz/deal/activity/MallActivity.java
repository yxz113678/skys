package com.yxz.deal.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.yxz.deal.R;
import com.yxz.deal.adapter.WzAdapter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static java.security.AccessController.getContext;

public class MallActivity extends AppCompatActivity {

    @BindView(R.id.lv_goods)
    ListView lvGoods;

    private ArrayAdapter<String> adapter = null;  //适配器
    private List<String> data = null;  //用于存储数据，记载到适配器中
    private List<String> pathData = null;   //记录路径

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mall);
        ButterKnife.bind(this);
        WzAdapter wzAdapter = new WzAdapter(getContext());
        lvGoods.setAdapter(wzAdapter);
    }

    @OnClick(R.id.lv_goods)
    public void onViewClicked() {
    }
}
