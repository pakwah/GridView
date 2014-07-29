package com.practice.baihua.gridviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by kenhuen on 7/28/14.
 */
public class MyGridAdapter extends BaseAdapter {

    private Context context;
    private String[] countries;
    private int[] images;

    MyGridAdapter(Context context, String[] countries, int[] images) {
        this.context = context;
        this.countries = countries;
        this.images = images;
    }

    @Override
    public int getCount() {
        return countries.length;
    }

    @Override
    public Object getItem(int position) {
        return countries[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if(convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.grid_item, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.mImage.setImageResource(images[position]);
        holder.mText.setText(countries[position]);

        return convertView;
    }

    class ViewHolder {
        public ImageView mImage;
        public TextView mText;

        ViewHolder(View view) {
            mImage = (ImageView) view.findViewById(R.id.image);
            mText = (TextView) view.findViewById(R.id.text);
        }
    }
}
