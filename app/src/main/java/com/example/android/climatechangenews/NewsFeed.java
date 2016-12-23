package com.example.android.climatechangenews;

import android.content.Loader;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class NewsFeed extends AppCompatActivity
        implements android.app.LoaderManager.LoaderCallbacks<ArrayList<NewsItem>> {

    private static final int NEWS_LOADER_ID = 0;

    private NewsFeedAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_feed);

        RecyclerView newsFeedRecyclerView = (RecyclerView)
                findViewById(R.id.news_feed_recycler_view);
        newsFeedRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mAdapter = new NewsFeedAdapter(new ArrayList<NewsItem>());
        newsFeedRecyclerView.setAdapter(mAdapter);

        getLoaderManager().initLoader(NEWS_LOADER_ID, null, this);
    }

    @Override
    public Loader<ArrayList<NewsItem>> onCreateLoader(int id, Bundle args) {
        return new NewsLoader(this);
    }

    @Override
    public void onLoadFinished(Loader<ArrayList<NewsItem>> loader, ArrayList<NewsItem> data) {
        mAdapter.clearList();
        mAdapter.setNewsItems(data);
    }

    @Override
    public void onLoaderReset(Loader<ArrayList<NewsItem>> loader) {
        mAdapter.clearList();
    }
}
