package com.example.webviewapp;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private WebView myWebView;
    private WebViewClient myWebViewClient;
    private WebSettings myWebSetting;
    public void showExternalWebPage(){
        myWebView.loadUrl("https://www.svt.se/");
    }

    public void showInternalWebPage(){
        myWebView.loadUrl("https://www.msn.com/sv-se/nyheter/utrikes/ny-analys-sverige-bommar-alla-klimatm%C3%A5l/ar-BB1lv1E4?ocid=msedgntp&pc=U531&cvid=4f17734e6c154f938ec047e1f9f4da63&ei=10");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);

        myWebView = findViewById(R.id.my_webview);
        myWebView.setWebViewClient(myWebViewClient);
        myWebSetting = myWebView.getSettings();
        myWebSetting.setJavaScriptEnabled(true);

        setSupportActionBar(toolbar);

        /*
        * Rename your App. Tip: Values->Strings
        * Enable Internet access for your App. Tip: Manifest
        * Create a WebView element in the layout file main_activity.xml
        * Give the WebView element ID "my_webview"
        -- Commit and push to your github fork
        * Create a private member variable called "myWebView" of type WebView
        * Locate the WebView element created in step 1 using the ID created in step 2
        * Create a new WebViewClient to attach to our WebView. This allows us to
          browse the web inside our app.
        -- Commit and push to your github fork
        * Enable Javascript execution in your WebViewClient
        * Enter the url to load in our WebView
        -- Commit and push to your github fork
        * Move the code that loads a URL into your WebView into the two methods
          "showExternalWebPage()" and "showInternalWebPage()".
        * Call the "showExternalWebPage()" / "showInternalWebPage()" methods
          when you select menu options "External Web Page" or "Internal Web Page"
          respectively
        -- Commit and push to your github fork
        * Take two screenshots using the "Take a screenshot" tool in the AVD
           showing your App. One (1) screenshot showing your internal web page and
           one (1) screenshot showing your external web page.
        */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_external_web) {
            Log.d("==>","Will display external web page");
            showExternalWebPage();
            return true;
        }

        if (id == R.id.action_internal_web) {
            Log.d("==>","Will display internal web page");
            showInternalWebPage();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
