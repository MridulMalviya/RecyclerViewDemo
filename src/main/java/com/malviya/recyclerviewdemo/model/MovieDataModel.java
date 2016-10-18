package com.malviya.recyclerviewdemo.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Prafulla on 10/18/2016.
 */

 public class MovieDataModel implements Parcelable {

    private String movieName;
    private String directerName;

    public MovieDataModel(String movieName, String directerName) {
        this.movieName = movieName;
        this.directerName = directerName;
    }

    protected MovieDataModel(Parcel in) {
        movieName = in.readString();
        directerName = in.readString();
    }

    public static final Creator<MovieDataModel> CREATOR = new Creator<MovieDataModel>() {
        @Override
        public MovieDataModel createFromParcel(Parcel in) {
            return new MovieDataModel(in);
        }

        @Override
        public MovieDataModel[] newArray(int size) {
            return new MovieDataModel[size];
        }
    };

    public String getMovieName() {
        return movieName;
    }

    public String getDirecterName() {
        return directerName;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(movieName);
        dest.writeString(directerName);
    }
}
