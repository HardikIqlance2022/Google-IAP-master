package com.aemerse.iapsample

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.aemerse.iapsample.databinding.ActivityGameBinding


class GameActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGameBinding
    val url ="https://www.gamesgames.com/game/erase-it"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.webView.webViewClient = MyBrowser()
        binding.webView.getSettings().setLoadsImagesAutomatically(true);
        binding.webView.getSettings().setJavaScriptEnabled(true);
        binding.webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        binding.webView.loadUrl(url);

        binding.button.setOnClickListener {
            startActivity(Intent(this,KotlinSampleActivity::class.java))
        }
    }

    private class MyBrowser : WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
            view.loadUrl(url)
            return true
        }
    }
}