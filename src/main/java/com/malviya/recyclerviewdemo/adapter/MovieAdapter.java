package com.malviya.recyclerviewdemo.adapter;



import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.malviya.recyclerviewdemo.R;
import com.malviya.recyclerviewdemo.model.MovieDataModel;

import java.util.ArrayList;

/**
 * Created by Prafulla on 10/18/2016.
 */

public class MovieAdapter extends RecyclerView.Adapter<MyHolder> {
    private ArrayList<MovieDataModel> movies;
    public MovieAdapter(ArrayList<MovieDataModel> movies){
        this.movies=movies;
    }
    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.demo_row,parent,false);
        MyHolder holder = new MyHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
       holder.mMovieName.setText(movies.get(position).getMovieName());
        holder.mDirectorName.setText(movies.get(position).getDirecterName());    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

}
