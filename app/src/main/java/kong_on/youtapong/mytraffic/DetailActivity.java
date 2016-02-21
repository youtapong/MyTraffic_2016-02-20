package kong_on.youtapong.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {

    //explicxit
    private TextView titleTextview, detailTextView;
    private ImageView trafficImageView;
    private Button preButton, backButton, nextbutton;
    private int[] iconInts;
    private String[] titleStrings, detailLongStrings;
    private int myIndexAnInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ///bind widget
        bindwidget();

        //Show view
        showView();

        buttonController();


    }

    private void buttonController() {
        preButton.setOnClickListener(this);
        backButton.setOnClickListener(this);
        nextbutton.setOnClickListener(this);

    }// buttoncontroller

    private void showView() {
        //Receive Value from Intent
        titleStrings = getIntent().getStringArrayExtra("Title");
        iconInts = getIntent().getIntArrayExtra("Image");
        myIndexAnInt = getIntent().getIntExtra("Index", 0);

        detailLongStrings = getResources().getStringArray(R.array.detail_long);

        changView(myIndexAnInt);


    }

    private void changView(int myIndexAnInt) {

        titleTextview.setText(titleStrings[myIndexAnInt]);
        trafficImageView.setImageResource(iconInts[myIndexAnInt]);
        detailTextView.setText(detailLongStrings[myIndexAnInt]);
    }

    private void bindwidget() {
        titleTextview = (TextView) findViewById(R.id.textView4);
        detailTextView = (TextView) findViewById(R.id.textView5);
        trafficImageView = (ImageView) findViewById(R.id.imageView2);
        preButton = (Button) findViewById(R.id.button2);
        backButton = (Button) findViewById(R.id.button3);
        nextbutton = (Button) findViewById(R.id.button4);


    }///bind widget

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:
                myIndexAnInt -= 1;
                if(myIndexAnInt < 0){myIndexAnInt = 19;}
                changView(myIndexAnInt);
                break;

            case R.id.button3:
                finish();
                break;

            case R.id.button4:
                myIndexAnInt += 1;
                if(myIndexAnInt >= 20){myIndexAnInt = 0;}
                changView(myIndexAnInt);
                break;
        }//switch


    }//on click
}// main class
