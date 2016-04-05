package edu.neu.massmutual.dharabhavsar.androidnewsreader.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import edu.neu.massmutual.dharabhavsar.androidnewsreader.R;

/**
 * Created by Dhara on 4/4/2016.
 */
public class DisplayNews extends Activity {

    private static final String LOG_TAG = "DisplayNews";
    private ProgressDialog progressDialog;
    private CollapsingToolbarLayout collapsingToolbar;
    private ImageView header;
    private Toolbar toolbar;
    private WebView webview;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_news);

        progressDialog = ProgressDialog.show(DisplayNews.this,
                "Getting Article", "Loading...");

        Intent intent = getIntent();
        String url = intent.getStringExtra("newsURL");
        String title = intent.getStringExtra("newsTitle");
        String image = intent.getStringExtra("imageURL");

        this.setTitle(title);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(title);
        header = (ImageView) findViewById(R.id.image);
        header.setImageResource(R.mipmap.ic_launcher);
        /*try {
//            Log.e(LOG_TAG, "in TRY Picasso");
            Picasso.with(this)
                    .load(image)
                    .placeholder(R.mipmap.ic_launcher)
                    .error(R.mipmap.ic_launcher)
                    .into(header);
        } catch (Exception e) {
//            Log.e(LOG_TAG, "in CATCH");
            header.setImageResource(R.mipmap.ic_launcher);
        }*/

        NestedScrollView nestedScrollView = (NestedScrollView) findViewById(R.id.nest_scroll);
        nestedScrollView.scrollTo(0, 0);

        webview = (WebView) findViewById(R.id.news_article);
        webview.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }

            public void onPageFinished(WebView view, String url) {
                if (progressDialog.isShowing()) {
                    progressDialog.dismiss();
                }
            }
        });
        webview.loadUrl(url);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
