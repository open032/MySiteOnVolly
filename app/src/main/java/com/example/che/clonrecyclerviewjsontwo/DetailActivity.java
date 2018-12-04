package com.example.che.clonrecyclerviewjsontwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import static com.example.che.clonrecyclerviewjsontwo.Main.*;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener{

    private Button comments;
    private static final String TAG = "myLogs";
    private int mPositionCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        comments = (Button)findViewById(R.id.btnComment);
        comments.setOnClickListener(this);

        Intent intent = getIntent();
        String imageUrl = intent.getStringExtra(EXTRA_URL);
        String creatorName = intent.getStringExtra(EXTRA_CREATOR);
        int likeCount = intent.getIntExtra(EXTRA_LIKES, 0);
        mPositionCount = intent.getIntExtra(EXTRA_POSITION, 0);

        ImageView imageView = findViewById(R.id.image_view_detail);
        TextView textViewCreator = findViewById(R.id.text_view_creator_detail);
        TextView textViewLikes = findViewById(R.id.text_view_like_detail);

        Picasso.with(this).load(imageUrl).fit().centerInside().into(imageView);
        textViewCreator.setText(creatorName);
        textViewLikes.setText("Likes: " + likeCount);
    }
    public void onClick(View view) {
        Intent intentComments = new Intent(DetailActivity.this, Comments.class);
        startActivity(intentComments);
        Log.d(TAG, "find number"+ mPositionCount);

    }
}
