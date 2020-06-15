package com.yxz.deal.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.yxz.deal.R;

public class WzAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater layoutInflater;

    public WzAdapter(Context context) {
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    /**
     * 列表长度
     * @return
     */
    @Override
    public int getCount() {
        return 20;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class ViewHolder{
        public ImageView imageView;
        public TextView wzName,WzDetails;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null){
            convertView = layoutInflater.inflate(R.layout.item_goods, null);
            holder = new ViewHolder();
            holder.imageView = convertView.findViewById(R.id.img_good);
            holder.wzName = convertView.findViewById(R.id.good_name);
            holder.WzDetails = convertView.findViewById(R.id.good_detail);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        //给控件赋值
        holder.wzName.setText("这是商品的名称");
        holder.WzDetails.setText("这是商品的详情");
        Glide.with(context).load("http://image.baidu.com/search/detail?ct=503316480&z=undefined&tn=baiduimagedetail&ipn=d&word=%E7%8E%8B%E8%80%85%E8%8D%A3%E8%80%80%E5%95%86%E5%93%81&step_word=&ie=utf-8&in=&cl=2&lm=-1&st=undefined&hd=undefined&latest=undefined&copyright=undefined&cs=3265071518,2188919566&os=1685484899,1589511224&simid=0,0&pn=0&rn=1&di=107690&ln=1849&fr=&fmq=1591927606316_R&fm=&ic=undefined&s=undefined&se=&sme=&tab=0&width=undefined&height=undefined&face=undefined&is=0,0&istype=0&ist=&jit=&bdtype=0&spn=0&pi=0&gsm=0&objurl=http%3A%2F%2Fres.moyoyo.com%2Fupload%2Fimage%2F1808%2F5xcjl8nigg7.jpg&rpstart=0&rpnum=0&adpicid=0&force=undefined").into(holder.imageView);
        return convertView;
    }
}
