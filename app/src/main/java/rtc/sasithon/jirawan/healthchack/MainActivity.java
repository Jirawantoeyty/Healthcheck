package rtc.sasithon.jirawan.healthchack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Explicit ประกาศตัวแปร
    private ImageView headImageView,BodyImageView,ButtonImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set Controller to ImageView
        headImageView.setOnClickListener(this);
        BodyImageView.setOnClickListener(this);
        ButtonImageView.setOnClickListener(this);


    }// Main Method นี่คือ เมธอต

    @Override
    public void onClick(View v) {

    }//onClick

}// Main Class
