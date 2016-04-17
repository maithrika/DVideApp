package com.example.maithrika.scicalc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SlidingDrawer;

@SuppressWarnings("deprecation")
public class DVideRedButton extends AppCompatActivity {
 private static SlidingDrawer slidingDrawer;
 private static ImageButton redButton;
 private static Button slideButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dvide_red_button);

        slideButton = (Button)findViewById(R.id.slideButton);
        redButton = (ImageButton)findViewById(R.id.redButton);
        slidingDrawer = (SlidingDrawer)findViewById(R.id.slidingDrawer);

        //Sliding drawer listener
        slidingDrawer.setOnDrawerOpenListener(new SlidingDrawer.OnDrawerOpenListener() {
            @Override
            public void onDrawerOpened() {
                slideButton.setText("SLIDE DOWN TO HIDE EMERGENCY CALLER");
            }
        });

        slidingDrawer.setOnDrawerCloseListener(new SlidingDrawer.OnDrawerCloseListener() {
            @Override
            public void onDrawerClosed() {
                slideButton.setText("SLIDE UP TO SHOW EMERGENCY CALLER");
            }
        });

        //TODO on emergency click, timer animation
        //TODO second click cancels timer


        /**Toolbar actionBar = (Toolbar) findViewById(R.id.actionBar);
        TextView actionBarTitle = (TextView) actionBar.findViewById(R.id.actionBar);
        Typeface mainFont = Typeface.createFromAsset(getAssets(), "Oswald-Bold.ttf");
        actionBarTitle.setTypeface(mainFont);*/
        }

    }

