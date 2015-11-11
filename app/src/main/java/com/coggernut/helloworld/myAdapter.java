package com.coggernut.helloworld;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ziyaowang on 11/11/2015.
 */
public class myAdapter extends ArrayAdapter<String> {


    public myAdapter(Context context, String[] values) {
        super(context, R.layout.row_layout_2,values);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater theInflater = LayoutInflater.from(getContext());

        View theView = theInflater.inflate(R.layout.row_layout_2,
                parent, false);

        String tvShow = getItem(position);

        TextView theTextView = (TextView) theView.findViewById(R.id.textView1);

        theTextView.setText(tvShow);

        ImageView theImageView = (ImageView) theView.findViewById( R.id.imageView1);

        theImageView.setImageResource(R.drawable.bullet);

        return theView;
    }
}
