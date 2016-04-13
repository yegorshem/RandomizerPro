package net.greenrivertech.yegorshem.randomizerpro;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random random = new Random();

    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton = (ImageButton) findViewById(R.id.imageButton);
    }

    public void randomizer(View view) {
        int choice = random.nextInt(2);

        if (choice == 1) {

            new CountDownTimer(3000, 1000) {

                public void onTick(long millisUntilFinished) {
                    imageButton.setImageResource(R.drawable.arrow_left_small);
                }

                public void onFinish() {
                    imageButton.setImageResource(R.drawable.press_small);
                }

            }.start();


        } else {

            new CountDownTimer(3000, 1000) {

                public void onTick(long millisUntilFinished) {
                    imageButton.setImageResource(R.drawable.arrow_right_small);
                }

                public void onFinish() {
                    imageButton.setImageResource(R.drawable.press_small);
                }

            }.start();


        }
    }
}
