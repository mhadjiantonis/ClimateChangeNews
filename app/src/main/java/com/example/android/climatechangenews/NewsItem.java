package com.example.android.climatechangenews;

public class NewsItem {

    private String mHeadline;
    private String mTrailText;
    private String mImgUrl;
    private String mWebUrl;

    public NewsItem(String headline, String trailText, String imgUrl, String webUrl) {
        mHeadline = headline;
        mTrailText = trailText;
        mImgUrl = imgUrl;
        mWebUrl = webUrl;
    }

    public String getHeadline() {
        return this.mHeadline;
    }

    public String getTrailText() {
        return this.mTrailText;
    }

    public String getImgUrl() {
        return this.mImgUrl;
    }

    public String getWebUrl() {
        return this.mWebUrl;
    }

    @Override
    public String toString() {
        String str = "Headline: " + this.mHeadline + "\n";
        str += "Trail text: " + this.mTrailText + "\n";
        str += "Image URL: " + this.mImgUrl + "\n";
        str += "Web URL: " + this.mWebUrl;
        return str;
    }
}
