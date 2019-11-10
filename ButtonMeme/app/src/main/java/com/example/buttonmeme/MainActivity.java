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

        int signal = 0;

        final ScrollView selectScroll = (ScrollView) findViewById(R.id.selectScroll);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        MediaPlayer mp;

        //Declare and initialize all meme buttons
        Button meme1, meme2, meme3, meme4, meme5, meme6, meme7, meme8;
        meme1 = (Button) findViewById(R.id.meme1);
        meme2 = (Button) findViewById(R.id.meme2);
        meme3 = (Button) findViewById(R.id.meme3);
        meme4 = (Button) findViewById(R.id.meme4);
        meme5 = (Button) findViewById(R.id.meme5);
        meme6 = (Button) findViewById(R.id.meme6);
        meme7 = (Button) findViewById(R.id.meme7);
        meme8 = (Button) findViewById(R.id.meme8);


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
                TextView memeView = (TextView) findViewById(R.id.memeView);
                memeView.setText(getText(R.string.meme_2));
            }
        });
        meme3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectScroll.setVisibility(View.GONE);
                TextView memeView = (TextView) findViewById(R.id.memeView);
                memeView.setText(getText(R.string.meme_3));
            }
        });
        meme4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectScroll.setVisibility(View.GONE);
                TextView memeView = (TextView) findViewById(R.id.memeView);
                memeView.setText(getText(R.string.meme_4));
            }
        });
        meme5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectScroll.setVisibility(View.GONE);
                TextView memeView = (TextView) findViewById(R.id.memeView);
                memeView.setText(getText(R.string.meme_5));
            }
        });
        meme6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectScroll.setVisibility(View.GONE);
                TextView memeView = (TextView) findViewById(R.id.memeView);
                memeView.setText(getText(R.string.meme_6));
            }
        });
        meme7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectScroll.setVisibility(View.GONE);
                TextView memeView = (TextView) findViewById(R.id.memeView);
                memeView.setText(getText(R.string.meme_7));
            }
        });
        meme8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectScroll.setVisibility(View.GONE);
                TextView memeView = (TextView) findViewById(R.id.memeView);
                memeView.setText(getText(R.string.meme_8));
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
                MediaPlayer mp;
                String shareMeme = memeView.getText().toString();
                switch(shareMeme) {
                    case "Now That's A Lot of Damage":
                        mp = MediaPlayer.create(MainActivity.this, R.raw.alotofdamage);
                        mp.start();
                        break;
                    case "I Can't Believe You've Done This":
                        mp = MediaPlayer.create(MainActivity.this, R.raw.cantbelieve);
                        mp.start();
                        break;
                    case "Bruh":
                        mp = MediaPlayer.create(MainActivity.this, R.raw.bruh);
                        mp.start();
                        break;
                    case "John Cena":
                        mp = MediaPlayer.create(MainActivity.this, R.raw.johncena);
                        mp.start();
                        break;
                    case "Do You Know Da Wey":
                        mp = MediaPlayer.create(MainActivity.this, R.raw.knowdaway);
                        mp.start();
                        break;
                    case "Oof":
                        mp = MediaPlayer.create(MainActivity.this, R.raw.oof);
                        mp.start();
                        break;
                    case "Where's My Super Suit":
                        mp = MediaPlayer.create(MainActivity.this, R.raw.supersuit);
                        mp.start();
                        break;
                    default:
                        break;

                }
            }
        });

    }

}
