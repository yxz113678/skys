package com.yxz.deal.activity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.yxz.deal.R;
import com.yxz.deal.fragment.ChatFragment;
import com.yxz.deal.fragment.HomePageFragment;
import com.yxz.deal.fragment.MessageFragment;
import com.yxz.deal.fragment.MyFragment;

import me.yokeyword.fragmentation.SupportActivity;
import me.yokeyword.fragmentation.SupportFragment;

public class MainActivity extends SupportActivity implements RadioGroup.OnCheckedChangeListener {
    private HomePageFragment homePageFragment;
    private ChatFragment chatFragment;
    private MessageFragment messageFragment;
    private MyFragment myFragment;
    private int curPosition = 0;  //当前展示的fragment下标

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup group = findViewById(R.id.rd_group);
        group.setOnCheckedChangeListener(this);

        loadFragment();
        //默认选中fragment
        RadioButton rbHome = (RadioButton) group.getChildAt(0);
        rbHome.setChecked(true);
    }

    /**
     * 装载fragment
     */
    private void loadFragment() {
        if (homePageFragment == null){  //当Fragment为空，则新建并加载
            homePageFragment = new HomePageFragment();
            chatFragment = new ChatFragment();
            messageFragment = new MessageFragment();
            myFragment = new MyFragment();
        }else {
            homePageFragment = findFragment(HomePageFragment.class);
            chatFragment = findFragment(ChatFragment.class);
            messageFragment = findFragment(MessageFragment.class);
            myFragment = findFragment(MyFragment.class);
        }
        //装载多个Fragment
        loadMultipleRootFragment(R.id.fragment_layout, 0,homePageFragment,chatFragment,messageFragment,myFragment);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.btn_homepage:
                showHideFragment(homePageFragment,getPreFragment());
                curPosition = 0;
                break;
            case R.id.btn_chat:
                showHideFragment(chatFragment,getPreFragment());
                curPosition = 1;
                break;
            case R.id.btn_message:
                showHideFragment(messageFragment,getPreFragment());
                curPosition = 2;
                break;
            case R.id.btn_my:
                showHideFragment(myFragment,getPreFragment());
                curPosition = 3;
                break;
        }
    }
    /**
     *获取上一个显示的fragment对象
     * @return
     */
    private SupportFragment getPreFragment(){
        switch (curPosition){
            case 0:
                return homePageFragment;
            case 1:
                return chatFragment;
            case 2:
                return messageFragment;
            case 3:
                return myFragment;
        }
        return null;
    }
}
