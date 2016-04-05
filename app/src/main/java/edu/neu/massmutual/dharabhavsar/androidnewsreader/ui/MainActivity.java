package edu.neu.massmutual.dharabhavsar.androidnewsreader.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import edu.neu.massmutual.dharabhavsar.androidnewsreader.R;
import edu.neu.massmutual.dharabhavsar.androidnewsreader.model.ApiResponse;
import edu.neu.massmutual.dharabhavsar.androidnewsreader.model.Result;
import edu.neu.massmutual.dharabhavsar.androidnewsreader.utils.Constants;
import edu.neu.massmutual.dharabhavsar.androidnewsreader.utils.NYTimesAPI;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = "MainActivity";
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*Intent intent = new Intent(MainActivity.this, LoadingReaderActivity.class);
        startActivity(intent);*/

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        progressDialog = ProgressDialog.show(MainActivity.this,
                "Getting Recent News", "Loading....");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        if (fab != null) {
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });
        }

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.NEWS_API)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        NYTimesAPI apiService = retrofit.create(NYTimesAPI.class);

        Call<ApiResponse> call = apiService.getNews();

        call.enqueue(new Callback<ApiResponse>() {
            @Override
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                Log.e(LOG_TAG, "Trying to fetch.");
                if (response.code() == 200) {
                    Log.e(LOG_TAG, "Fetching successful.");
                    ApiResponse responseList = response.body();
                    ArrayList<Result> newsList = new ArrayList<Result>();
                    for (Result r : responseList.getResults()) {
                        newsList.add(r);
                    }
//                    specify an adapter
                    NewsArrayAdapter mAdapter = new NewsArrayAdapter(MainActivity.this, newsList);

                    ListView newsListView = (ListView) findViewById(R.id.news_list);
                    newsListView.setAdapter(mAdapter);

                    if (progressDialog.isShowing()) {
                        progressDialog.dismiss();
                    }

                    newsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            Result newsObj = (Result) parent.getItemAtPosition(position);

                            Intent intent = new Intent(MainActivity.this, DisplayNews.class);
                            intent.putExtra("newsURL", newsObj.getUrl().toString());
                            intent.putExtra("newsTitle", newsObj.getTitle());
                            intent.putExtra("imageURL", newsObj.getThumbnailStandard());

                            startActivity(intent);
                        }
                    });
                } else {
                    Log.e(LOG_TAG, "ERROR fetching data from the API.");
//                    Notification for the users
                    Toast.makeText(MainActivity.this, "Please try again...",
                            Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ApiResponse> call, Throwable t) {
                // Log error here since request failed
//                t.printStackTrace();
                Log.e(LOG_TAG, t.getMessage());
                Log.e(LOG_TAG, t.toString());
                Log.e(LOG_TAG, "Something failed. No response. Please check internet connection..");
//                    Notification for the users
                Toast.makeText(MainActivity.this, "Please try again... No Internet Connection",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
