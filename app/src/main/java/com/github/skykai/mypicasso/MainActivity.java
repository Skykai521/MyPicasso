package com.github.skykai.mypicasso;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageView = (ImageView) findViewById(R.id.imageView);
//        Picasso.with(this).load("http://fujian.86516.com/forum/201209/28/16042484m9y9izwbrwuixj.jpg")
//                .resize(200,200).centerCrop().into(imageView);

//        Picasso.with(this).load("http://fujian.86516.com/forum/201209/28/16042484m9y9izwbrwuixj.jpg")
//                .resize(200,200).centerCrop().into(imageView);


        new Thread() {
            @Override
            public void run() {
                try {
                    final Bitmap bitmap = Picasso.with(getApplicationContext()).load("http://fujian.86516.com/forum/201209/28/16042484m9y9izwbrwuixj.jpg").get();
                    mHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            imageView.setImageBitmap(bitmap);
                        }
                    });
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.start();

    }


}
