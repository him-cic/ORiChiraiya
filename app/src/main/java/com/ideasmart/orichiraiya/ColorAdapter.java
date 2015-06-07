package com.ideasmart.orichiraiya;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by OFFICE on 6/5/2015.
 */
public class ColorAdapter extends BaseAdapter {
    Context mContext;

    // references to our images
    private Integer[] colors = {
            R.color.greyish_black, R.color.orange2,
            R.color.chocolate_brown
    };

    public ColorAdapter(Context c) {
        mContext = c;
    }

    @Override
    public int getCount() {
        return colors.length;
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
            imageView.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            //imageView.setPadding(5, 5, 5, 5);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(colors[position]);

        //imageView.setBackgroundDrawable(new ColorDrawable(Color.RED));
        return imageView;
    }
}
