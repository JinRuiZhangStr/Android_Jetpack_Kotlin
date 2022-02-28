package com.eflagcomm.android_jetpack_kotlin.sndemo

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.webkit.WebResourceRequest
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.eflagcomm.android_jetpack_kotlin.R
import kotlinx.android.synthetic.main.activity_videoplayer.*

/**
 *Created by 张金瑞.
 *Data: 2020-12-23
 */
private const val VIDEO_URL =
    "http://citic_beetest:0605a9a412fed8e1e01b0842693bc260@202.108.57.33/nas/uploads/video/2020/12/23d2b8f3d789ddd2a840373da1ef15efc4.mp4"
private const val TAG = "VideoPlayerActivity"

class VideoPlayerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_videoplayer)
        webview?.let {
            it.settings.javaScriptEnabled = true
            it.settings.loadWithOverviewMode = true
            it.settings.builtInZoomControls = true
            it.settings.useWideViewPort = true
            it.settings.setSupportZoom(true)
            it.settings.javaScriptCanOpenWindowsAutomatically = true
            it.settings.cacheMode = WebSettings.LOAD_NO_CACHE
            it.settings.setGeolocationEnabled(true)
            it.settings.domStorageEnabled = true
            it.settings.databaseEnabled = true
            it.settings.useWideViewPort = true
            it.settings.allowFileAccess = true
//            it.settings.mediaPlaybackRequiresUserGesture = false

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    it.settings.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
                }
            }

            it.loadUrl(VIDEO_URL)

            Log.e(TAG, "onCreate: " + VIDEO_URL)

            it.webViewClient = object : WebViewClient() {
                override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                    view?.loadUrl(url!!)
                    return true
                }
            }

        }

    }
}