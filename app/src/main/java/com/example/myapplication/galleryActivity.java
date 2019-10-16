package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.ImageView;

public class galleryActivity extends AppCompatActivity {
    ImageView imageView;
    int i=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        imageView=findViewById(R.id.imageView9);
        new CountDownTimer(27000, 3000) {
            @Override
            public void onTick(long l) {
                imageView.setAlpha(((float)1));
                if(i%8==0)
                    imageView.setImageResource(R.drawable.k1);
                else if(i%8==1)
                    imageView.setImageResource(R.drawable.k2);
                else if(i%8==2)
                    imageView.setImageResource(R.drawable.k3);
                else if(i%8==3)
                    imageView.setImageResource(R.drawable.k4);
                else if(i%8==4)
                    imageView.setImageResource(R.drawable.k5);
                else if(i%8==5)
                    imageView.setImageResource(R.drawable.k6);
                else if(i%8==6)
                    imageView.setImageResource(R.drawable.k7);
                else if(i%8==7)
                    imageView.setImageResource(R.drawable.k8);
                else
                    imageView.setImageResource(R.drawable.k9);
                i++;
            }
            @Override
            public void onFinish() {
                start();
            }
        }.start();
    }

}

