/*
package com.example.che.clonrecyclerviewjsontwo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

import static com.example.che.clonrecyclerviewjsontwo.Main.*;

public class DetailComments extends AppCompatActivity {

    private int mPositionCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailcomments);


        Intent intent = getIntent();
        String creatorName = intent.getStringExtra(EXTRA_TEXTCOMMENT);
        mPositionCount = intent.getIntExtra(EXTRA_ID, 0);

        TextView textViewCreator = findViewById(R.id.text_view_creator_detail_comment);

        //Picasso.with(this).load(imageUrl).fit().centerInside().into(imageView);
        textViewCreator.setText(creatorName);
        //textViewLikes.setText("Likes: " + likeCount);
    }
}
*/
