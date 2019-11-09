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

        //Add Buttons to selectScroll
        /*Button memeButton = (Button) new Button(this);
        memeButton.setText("Some Text");
        linearLayout.addView(memeButton);

        selectScroll.addView(linearLayout);*/

        Button selectButton = (Button) findViewById(R.id.selectButton);
        selectButton.setOnClickListener(new View.OnClickListener(){
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
