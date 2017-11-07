package com.kast.animations;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {

        ImageView cartman = (ImageView) findViewById(R.id.cartman);
       // ImageView kenny = (ImageView) findViewById(R.id.kenny);

        cartman.animate().translationYBy(2000f).setDuration(2000);
       // kenny.animate().translationYBy(1000f).setDuration(2000);
      //  kenny.bringToFront();

    }

    /** public void crossfade (View view) {

        ImageView kenny = (ImageView) findViewById(R.id.kenny);
        ImageView cartman = (ImageView) findViewById(R.id.cartman);

        kenny.animate().alpha(0f).setDuration(2000);
        cartman.animate().alpha(1f).setDuration(2000);
        cartman.bringToFront();

    }   **/

    // Tere

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
