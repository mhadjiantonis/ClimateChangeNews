package com.example.android.climatechangenews;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class NewsFeed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_feed);

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

        RecyclerView newsFeedRecyclerView = (RecyclerView)
                findViewById(R.id.news_feed_recycler_view);
        newsFeedRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        newsFeedRecyclerView.setAdapter(new NewsFeedAdapter(newsItems));
    }
}
