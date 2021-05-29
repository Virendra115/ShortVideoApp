package com.virendra.shortvideoapp;

import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewPager2 vpager;
    ArrayList<VideoModel> videos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        vpager = findViewById(R.id.vpager);
        videos = new ArrayList<>();

        VideoModel ob1 = new VideoModel("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4","title1","this is description");
        videos.add(ob1);

        VideoModel ob2 = new VideoModel("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerEscapes.mp4","title2","this is description");
        videos.add(ob2);

        VideoModel ob3 = new VideoModel("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/WeAreGoingOnBullrun.mp4","title3","this is description");
        videos.add(ob3);

        VideoModel ob4 = new VideoModel("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerMeltdowns.mp4","title4","this is description");
        videos.add(ob4);

        VideoModel ob5 = new VideoModel("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerFun.mp4","title5","this is description");
        videos.add(ob5);

        vpager.setAdapter(new VideoAdapter(videos));

    }

}