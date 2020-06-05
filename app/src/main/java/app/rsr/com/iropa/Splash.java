package app.rsr.com.iropa;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {

    ImageView iamgen;
    static  final int duracion =2000;
    static final int duraciondespues = 500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        AlphaAnimation  fadeIn = new AlphaAnimation(0.0f,1.0f);
        fadeIn.setDuration(duracion);
        fadeIn.setStartOffset(duraciondespues);
        fadeIn.setFillAfter(true);

        iamgen = (ImageView)findViewById(R.id.imagenSplag);

        AlphaAnimation  fadeOut = new AlphaAnimation(1.0f,0.0f);
        fadeOut.setDuration(duracion);
        fadeOut.setStartOffset(duraciondespues);
        fadeOut.setFillAfter(true);
        fadeIn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        iamgen.startAnimation(fadeIn);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent miInten = new Intent(Splash.this,MainActivity.class);
                startActivity(miInten);
                finish();
            }
        },3000);
    }
}