package com.example.che.clonrecyclerviewjsontwo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.ExampleViewHolder> {
    private Context mContext;
    private ArrayList<Comment> mExampleList;

    public CommentAdapter(Context context, ArrayList<Comment> exampleList) {
        mContext = context;
        mExampleList = exampleList;
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.example_comment_item, parent, false);
        return new ExampleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        Comment currentItem = mExampleList.get(position);


        String creatorName = currentItem.getCreator();


        holder.mTextViewCreator.setText(creatorName);


    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }

    public class ExampleViewHolder extends RecyclerView.ViewHolder {
        //public ImageView mImageView;
        public TextView mTextViewCreator;
        //public TextView mTextViewLikes;

        public ExampleViewHolder(View itemView) {
            super(itemView);
            //mImageView = itemView.findViewById(R.id.image_view);
            mTextViewCreator = itemView.findViewById(R.id.text_view_creator_comment);
           // mTextViewLikes = itemView.findViewById(R.id.text_view_likes);
        }
    }
}