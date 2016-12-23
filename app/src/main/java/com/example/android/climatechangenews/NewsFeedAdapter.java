package com.example.android.climatechangenews;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsFeedAdapter extends RecyclerView.Adapter<NewsFeedAdapter.ViewHolder> {

    private ArrayList<NewsItem> mNewsItems;

    public NewsFeedAdapter(ArrayList<NewsItem> newsItems) {
        this.mNewsItems = newsItems;
    }

    public void clearList() {
        mNewsItems.clear();
    }

    public void setNewsItems(ArrayList<NewsItem> newsItems) {
        this.mNewsItems = newsItems;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View newsItemCardView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.news_item_card_view, parent, false);
        return new ViewHolder(newsItemCardView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        NewsItem currentItem = mNewsItems.get(position);
        holder.headlineText.setText(currentItem.getHeadline());
        holder.trailText.setText(currentItem.getTrailText());
        holder.imgUrlText.setText(currentItem.getImgUrl());
        holder.webUrlText.setText(currentItem.getWebUrl());
    }

    @Override
    public int getItemCount() {
        return mNewsItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView headlineText;
        public TextView trailText;
        public TextView imgUrlText;
        public TextView webUrlText;

        public ViewHolder(View itemView) {
            super(itemView);
            this.headlineText = (TextView) itemView.findViewById(R.id.news_item_headline);
            this.trailText = (TextView) itemView.findViewById(R.id.news_item_trail_text);
            this.imgUrlText = (TextView) itemView.findViewById(R.id.news_item_img_url);
            this.webUrlText = (TextView) itemView.findViewById(R.id.news_item_web_url);
        }
    }
}
