package com.example.android.climatechangenews;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.ArrayList;

/**
 * Created by Marios on 12/22/2016.
 */

public class NewsLoader extends AsyncTaskLoader<ArrayList<NewsItem>> {

    public NewsLoader(Context context) {
        super(context);
    }

    @Override
    public ArrayList<NewsItem> loadInBackground() {
        ArrayList<NewsItem> newsItems = new ArrayList<>();

        newsItems.add(new NewsItem("a", "b", "c", "d"));
        newsItems.add(new NewsItem("a", "b", "c", "d"));
        newsItems.add(new NewsItem("a", "b", "c", "d"));
        newsItems.add(new NewsItem("a", "b", "c", "d"));
        newsItems.add(new NewsItem("a", "b", "c", "d"));
        newsItems.add(new NewsItem("a", "b", "c", "d"));
        newsItems.add(new NewsItem("a", "b", "c", "d"));
        newsItems.add(new NewsItem("a", "b", "c", "d"));
        newsItems.add(new NewsItem("a", "b", "c", "d"));
        newsItems.add(new NewsItem("a", "b", "c", "d"));

        return newsItems;
    }
}
