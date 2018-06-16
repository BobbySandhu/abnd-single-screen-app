package com.profurniture;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private ImageView mImageFb;
    private ImageView mImageTwitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = findViewById(R.id.toolbar);
        mImageFb = findViewById(R.id.image_fb);
        mImageTwitter = findViewById(R.id.image_twitter);

        mToolbar.setTitle(getString(R.string.app_name));

        final String fbUrl = "https://www.facebook.com/bobby.sandhu.333";
        final String twitterUrl = "https://www.twitter.com/bobbysandhu333";

        mImageFb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(fbUrl));
                startActivity(browserIntent);
            }
        });

        mImageTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(twitterUrl));
                startActivity(browserIntent);
            }
        });
    }
}
