package com.malviya.recyclerviewdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.malviya.recyclerviewdemo.R;

/**
 * Created by Prafulla on 10/18/2016.
 */

public class MyHolder extends RecyclerView.ViewHolder {
     TextView mMovieName;
    TextView mDirectorName;

    public MyHolder(View itemView) {
        super(itemView);
        this.mMovieName = (TextView) itemView.findViewById(R.id.txt_movie_name);
        this.mDirectorName = (TextView) itemView.findViewById(R.id.txt_movie_director);
    }
}
