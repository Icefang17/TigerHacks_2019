package com.example.buttonmeme;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button soundButton = (Button) findViewById(R.id.soundButton);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.alotofdamage);
        soundButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });

        final ScrollView selectScroll = (ScrollView) findViewById(R.id.selectScroll);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        //Declare and initialize all meme buttons
        Button meme1, meme2, meme3, meme4, meme5;
        meme1 = (Button) findViewById(R.id.meme1);
        meme2 = (Button) findViewById(R.id.meme2);
        meme3 = (Button) findViewById(R.id.meme3);
        meme4 = (Button) findViewById(R.id.meme4);
        meme5 = (Button) findViewById(R.id.meme5);

        meme1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



        Button selectButton = (Button) findViewById(R.id.selectButton);
        selectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectScroll.isShown())
                    selectScroll.setVisibility(View.GONE);
                else
                    selectScroll.setVisibility(View.VISIBLE);
            }
        });
    }

}
