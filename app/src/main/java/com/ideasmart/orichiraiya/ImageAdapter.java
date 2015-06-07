package com.ideasmart.orichiraiya;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.ideasmart.orichiraiya.R;

/**
 * Created by Saini on 6/5/2015.
 */
public class ImageAdapter extends BaseAdapter {

    Context mContext;

    // references to our images
    private Integer[] bills = {
            R.drawable.ibeak1, R.drawable.ibeak2,
            R.drawable.ibeak3, R.drawable.ibeak4,
            R.drawable.ibeak5, R.drawable.ibeak6,
            R.drawable.ibeak7, R.drawable.ibeak8,
            R.drawable.ibeak9, R.drawable.ibeak10,
            R.drawable.ibeak11

    };

    public ImageAdapter(Context c) {
        mContext = c;
    }

    @Override
    public int getCount() {
        return bills.length;
    }


    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(200, 200));
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setPadding(5, 5, 5, 5);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(bills[position]);
        return imageView;
    }
}
