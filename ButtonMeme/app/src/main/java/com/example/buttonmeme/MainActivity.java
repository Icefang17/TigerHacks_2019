package com.example.buttonmeme;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ScrollView selectScroll = (ScrollView) findViewById(R.id.selectScroll);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        MediaPlayer mp;

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
                selectScroll.setVisibility(View.GONE);
                TextView memeView = (TextView) findViewById(R.id.memeView);
                memeView.setText(getText(R.string.meme_1));
            }
        });
        meme2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectScroll.setVisibility(View.GONE);
                //final mp = MediaPlayer.create(this, R.raw.alotofdamage);
                TextView memeView = (TextView) findViewById(R.id.memeView);
                memeView.setText(getText(R.string.meme_2));
            }
        });
        meme3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectScroll.setVisibility(View.GONE);
                //MediaPlayer mp = MediaPlayer.create(this, R.raw.cantbelieve);
                TextView memeView = (TextView) findViewById(R.id.memeView);
                memeView.setText(getText(R.string.meme_3));
            }
        });
        meme4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectScroll.setVisibility(View.GONE);
                //MediaPlayer mp = MediaPlayer.create(this, R.raw.bruh);
                TextView memeView = (TextView) findViewById(R.id.memeView);
                memeView.setText(getText(R.string.meme_4));
            }
        });
        meme5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectScroll.setVisibility(View.GONE);
                //MediaPlayer mp = MediaPlayer.create(this, R.raw.johncena);
                TextView memeView = (TextView) findViewById(R.id.memeView);
                memeView.setText(getText(R.string.meme_5));
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


        Button soundButton = (Button) findViewById(R.id.soundButton);
        soundButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView memeView = (TextView) findViewById(R.id.memeView);
                //if(memeView.getText() != getText(R.string.meme_1))
                    //mp.start();
            }
        });

    }

}
