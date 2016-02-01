package rtc.sasithon.jirawan.healthchack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Explicit ประกาศตัวแปร
    private ImageView headImageView, BodyImageView, ButtonImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Brind Widget
        headImageView = (ImageView) findViewById(R.id.imageView);
        BodyImageView = (ImageView) findViewById(R.id.imageView2);
        ButtonImageView = (ImageView) findViewById(R.id.imageView3);

        //set Controller to ImageView
        headImageView.setOnClickListener(this);
        BodyImageView.setOnClickListener(this);
        ButtonImageView.setOnClickListener(this);


    }// Main Method นี่คือ เมธอต

    @Override
    public void onClick(View view) {
        int intIndex = 1;
        switch (view.getId()) {
            case R.id.imageView:
                intIndex = 1;
                break;
            case R.id.imageView2:
                intIndex = 2;
                break;
            case R.id.imageView3:
                intIndex = 3;
                break;
        }//swich
        Intent objIntent = new Intent(MainActivity.this, ListDisease.class);
        objIntent.putExtra("Index", intIndex);
        startActivity(objIntent);
    }//onClick

}// Main Class
