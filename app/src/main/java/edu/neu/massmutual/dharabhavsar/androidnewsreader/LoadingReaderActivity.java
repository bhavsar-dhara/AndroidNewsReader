package edu.neu.massmutual.dharabhavsar.androidnewsreader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;

/**
 * Created by Dhara on 4/3/2016.
 */
public class LoadingReaderActivity extends Activity {

    private static final int LOADING_TIME = 2500;
    private static final String LOG_TAG = "LoadingReaderActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(LOG_TAG, "LoadingReaderActivity started");
        setContentView(R.layout.loading_screen);
        findViewById(R.id.main_spinner).setVisibility(View.VISIBLE);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
//	              Creating an Intent that will re-direct the Main-Reader-Activity class
                Intent mainIntent = new Intent(LoadingReaderActivity.this, MainActivity.class);
                LoadingReaderActivity.this.startActivity(mainIntent);
                LoadingReaderActivity.this.finish();
            }
        }, LOADING_TIME);
    }

}
