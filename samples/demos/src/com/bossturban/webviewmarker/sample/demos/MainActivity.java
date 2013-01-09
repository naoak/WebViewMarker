package com.bossturban.webviewmarker.sample.demos;

import com.bossturban.webviewmarker.TextSelectionSupport;
import com.bossturban.webviewmarker.sample.demos.R;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends Activity {
    private WebView mWebView;
    private TextSelectionSupport mTextSelectionSupport;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mWebView = (WebView)findViewById(R.id.webView);
        mTextSelectionSupport = TextSelectionSupport.support(this, mWebView);
        mTextSelectionSupport.setSelectionListener(new TextSelectionSupport.SelectionListener() {
			@Override
			public void startSelection() {
			}
			@Override
			public void selectionChanged(String text) {
				Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
			}
			@Override
			public void endSelection() {
			}
        });
        mWebView.setWebViewClient(new WebViewClient() {
        	public void onScaleChanged(WebView view, float oldScale, float newScale) {
        		mTextSelectionSupport.onScaleChanged(oldScale, newScale);
        	}
        });
        mWebView.loadUrl("file:///android_asset/content.html");
    }
}
