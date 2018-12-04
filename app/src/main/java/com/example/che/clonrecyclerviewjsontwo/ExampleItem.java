package com.example.che.clonrecyclerviewjsontwo;

public class ExampleItem {
    private String mImageUrl;
    private String mCreator;
    private int mLikes;
    private int mPosition;

    public ExampleItem(String imageUrl, String creator, int likes, int position) {
        mImageUrl = imageUrl;
        mCreator = creator;
        mLikes = likes;
        mPosition = position;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public String getCreator() {
        return mCreator;
    }
    public int getLikeCount() {
        return mLikes;
    }
    public int getmPositionCount() {        return mPosition;    }
}