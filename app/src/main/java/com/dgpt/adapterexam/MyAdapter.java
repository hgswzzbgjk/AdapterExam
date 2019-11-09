package com.dgpt.adapterexam;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
    private Context context;
    private String[] names;
    private int[] ages;
    private int[] icons;

    public MyAdapter(Context context, String[] names, int[] ages, int[] icons) {
        this.context = context;
        this.names = names;
        this.ages = ages;
        this.icons = icons;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int i) {
        return names[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View itemview=View.inflate(context, R.layout.item_view, null);



        ImageView iv_icon=(ImageView)itemview.findViewById(R.id.iv_icon);
        TextView tv_name=(TextView)itemview.findViewById(R.id.tv_name);
        TextView tv_age=(TextView)itemview.findViewById(R.id.tv_age);

        iv_icon.setImageResource(icons[i]);
        tv_name.setText(names[i]);
        tv_age.setText(ages[i]+"");

        return itemview;
    }
}
