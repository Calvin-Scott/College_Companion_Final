package com.example.teamduke.collegecompanion;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MoodleActivity extends ActionBarActivity {

    private WebView moodleWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ;
        moodleWebView  = new WebView(this);

        moodleWebView.getSettings().setJavaScriptEnabled(true); // enable javascript

        final Activity activity = this;

        moodleWebView.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
            }
        });

        moodleWebView .loadUrl("https://moodle2.lincolncollege.ac.uk"); // accesses link to then display
        setContentView(moodleWebView );

    }
}
