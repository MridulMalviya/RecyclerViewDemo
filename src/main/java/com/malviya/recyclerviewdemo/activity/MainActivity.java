package com.malviya.recyclerviewdemo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.malviya.recyclerviewdemo.R;
import com.malviya.recyclerviewdemo.adapter.MovieAdapter;
import com.malviya.recyclerviewdemo.model.MovieCollection;
import com.malviya.recyclerviewdemo.model.MovieDataModel;

import java.util.ArrayList;

/**
 * Created by Prafulla on 10/18/2016.
 */

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MovieAdapter movieAdapter;
    private ArrayList<MovieDataModel> movieDataModels;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Data
        movieDataModels = MovieCollection.getData();
        //Adapter
        movieAdapter = new MovieAdapter(movieDataModels);
        //RecyclerView
        recyclerView =(RecyclerView)findViewById(R.id.recycle_container);
        RecyclerView.LayoutManager manager =new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(movieAdapter);
        movieAdapter.notifyDataSetChanged();
    }
}
