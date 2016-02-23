package com.github.skykai.mypicasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
//        Picasso.with(this).load("http://fujian.86516.com/forum/201209/28/16042484m9y9izwbrwuixj.jpg")
//                .resize(200,200).centerCrop().into(imageView);

        Picasso.with(this).load("http://fujian.86516.com/forum/201209/28/16042484m9y9izwbrwuixj.jpg")
                .resize(200,200).centerCrop().into(imageView);
    }
}
