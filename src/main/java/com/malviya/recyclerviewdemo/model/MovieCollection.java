package com.malviya.recyclerviewdemo.model;

import java.util.ArrayList;

/**
 * Created by Prafulla on 10/18/2016.
 */

 public class MovieCollection {

    public static ArrayList<MovieDataModel> getData(){
        ArrayList<MovieDataModel> arrayList = new ArrayList<>();
        MovieDataModel movieDataModel = new MovieDataModel("Movie1","Directer1");
        arrayList.add(movieDataModel);
        MovieDataModel movieDataMode2 = new MovieDataModel("Movie2","Directer2");
        arrayList.add(movieDataMode2);
        MovieDataModel movieDataMode3 = new MovieDataModel("Movie3","Directer3");
        arrayList.add(movieDataMode3);
        MovieDataModel movieDataMode4 = new MovieDataModel("Movie4","Directer4");
        arrayList.add(movieDataMode4);
        MovieDataModel movieDataMode5 = new MovieDataModel("Movie5","Directer5");
        arrayList.add(movieDataMode5);
        MovieDataModel movieDataMode6 = new MovieDataModel("Movie6","Directer6");
        arrayList.add(movieDataMode6);
        MovieDataModel movieDataMode7 = new MovieDataModel("Movie1","Directer1");
        arrayList.add(movieDataMode7);
        MovieDataModel movieDataMode8 = new MovieDataModel("Movie2","Directer2");
        arrayList.add(movieDataMode8);
        MovieDataModel movieDataMode9 = new MovieDataModel("Movie3","Directer3");
        arrayList.add(movieDataMode9);
        arrayList.add(movieDataMode9);arrayList.add(movieDataMode9);arrayList.add(movieDataMode9);
        arrayList.add(movieDataMode9);
        arrayList.add(movieDataMode9);
        arrayList.add(movieDataMode9);

        return arrayList;
    }
}
