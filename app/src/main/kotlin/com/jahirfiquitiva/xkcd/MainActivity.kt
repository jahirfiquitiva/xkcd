package com.jahirfiquitiva.xkcd

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.support.v7.widget.Toolbar
import ca.allanwang.kau.logging.KL
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target
import com.squareup.picasso.Picasso
import jahirfiquitiva.libs.kauextensions.extensions.bind
import jahirfiquitiva.libs.kauextensions.extensions.isLowRamDevice
import jahirfiquitiva.libs.kauextensions.ui.activities.ThemedActivity
import jahirfiquitiva.libs.ziv.ZoomableImageView

class MainActivity : ThemedActivity<Configurations>() {
    override val configs: Configurations by lazy {
        Configurations(this)
    }
    
    override fun lightTheme(): Int = R.style.AppTheme
    override fun darkTheme(): Int = R.style.DarkAppTheme
    override fun transparentTheme(): Int = lightTheme()
    override fun amoledTheme(): Int = darkTheme()
    
    override fun autoTintStatusBar(): Boolean = true
    override fun autoTintNavigationBar(): Boolean = true
    
    private val toolbar: Toolbar? by bind(R.id.toolbar)
    // private val comicImageView: ZoomableImageView? by bind(R.id.comic_image)
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        setSupportActionBar(toolbar)
        
        val options = RequestOptions()
            .format(
                if (isLowRamDevice) DecodeFormat.PREFER_RGB_565
                else DecodeFormat.PREFER_ARGB_8888)
            .disallowHardwareConfig()
            .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
            .timeout(10000)
            .fitCenter()
            .priority(Priority.HIGH)
            .dontAnimate()
    
        QL.d { "Testing outside" }
        
        val comicImageView:ZoomableImageView? = findViewById(R.id.comic_image)
        
        comicImageView?.let {
            QL.d { "Testing" }
            
            Picasso.get()
                .load("https://imgs.xkcd.com/comics/mc_hammer_age.png")
                .fit()
                .into(it)
            /*
            GlideApp.with(this)
                .load("https://imgs.xkcd.com/comics/mc_hammer_age.png")
                .apply(options)
                .centerCrop()
                .listener(object : RequestListener<Drawable> {
                    override fun onLoadFailed(
                        e: GlideException?,
                        model: Any?,
                        target: Target<Drawable>?,
                        isFirstResource: Boolean
                                             ): Boolean {
                        QL.e { "Load failed! D:" }
                        return false
                    }
                    
                    override fun onResourceReady(
                        resource: Drawable?,
                        model: Any?,
                        target: Target<Drawable>?,
                        dataSource: DataSource?,
                        isFirstResource: Boolean
                                                ): Boolean {
                        QL.d { "Is image null? ${resource == null}" }
                        it.setImageDrawable(resource)
                        return true
                    }
                    
                })
                .into(it)*/
            
        } ?: { QL.d { "View is null" } }()
    }
    
}