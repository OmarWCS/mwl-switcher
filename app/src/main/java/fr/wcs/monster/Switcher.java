package fr.wcs.monster;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewSwitcher;

public class Switcher extends AppCompatActivity {

    ImageSwitcher imgsw;
    Button nx;


    // Array of Image IDs to Show In ImageSwitcher
    int imageIds[] = {R.drawable.genie, R.drawable.mersnake, R.drawable.metalsaur, R.drawable.rockilla};
    int count = imageIds.length;
    // to keep current Index of ImageID array
    int currentIndex = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // get The references of Button and ImageSwitcher
        nx = (Button) findViewById(R.id.nx);
        imgsw = (ImageSwitcher) findViewById(R.id.imgsw);
        // Set the ViewFactory of the ImageSwitcher that will create ImageView object when asked
        imgsw.setFactory(new ViewSwitcher.ViewFactory() {

            public View makeView() {


                // Create a new ImageView and set it's properties
                ImageView imageView = new ImageView(getApplicationContext());
                // set Scale type of ImageView to Fit Center
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                // set the Height And Width of ImageView To FIll PARENT
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
                return imageView;
            }
        });

        // Declare in and out animations and load them using AnimationUtils class
        Animation in = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        Animation out = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);

        // set the animation type to ImageSwitcher
        imgsw.setInAnimation(in);
        imgsw.setOutAnimation(out);


        // ClickListener for NEXT button
        // When clicked on Button ImageSwitcher will switch between Images
        // The current Image will go OUT and next Image  will come in with specified animation
        nx.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                currentIndex++;
                //  Check If index reaches maximum then reset it
                if (currentIndex == count)
                    currentIndex = 0;
                imgsw.setImageResource(imageIds[currentIndex]); // set the image in ImageSwitcher
            }
        });

    }

}