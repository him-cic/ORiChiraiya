package com.ideasmart.orichiraiya;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;


public class SplashActivity extends Activity {
    ImageView logo;
    MediaPlayer chirp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        chirp = MediaPlayer.create(this, R.raw.chirp);
        logo = (ImageView) findViewById(R.id.logo);
        bounce(logo);
    }

    public void bounce(View v) {
        YoYo.with(Techniques.Bounce).duration(1000).playOn(logo);
        chirp.start();

    }

    public void go(View v) {
        startActivity(new Intent(SplashActivity.this,ChooseBillTypeActivity.class));

    }
}
