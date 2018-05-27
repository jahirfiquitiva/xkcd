@file:Suppress("unused")

object Libs {
    // Testing Libs
    const val junit = "junit:junit:${Versions.junit}"
    const val mockito = "org.mockito:mockito-core:${Versions.mockito}"
    const val runner = "com.android.support.test:runner:${Versions.runner}"
    const val rules = "com.android.support.test:rules:${Versions.runner}"
    const val espresso = "com.android.support.test.espresso:espresso-core:${Versions.espresso}"
    
    // MultiDex
    const val multiDex = "com.android.support:multidex:${Versions.multiDex}"
    
    // Kotlin
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    
    // Architecture Components
    const val room = "android.arch.persistence.room:runtime:${Versions.room}"
    const val roomCompiler = "android.arch.persistence.room:compiler:${Versions.room}"
    
    // Support Libraries
    const val appcompat = "com.android.support:appcompat-v7:${Versions.supportLibs}"
    const val design = "com.android.support:design:${Versions.supportLibs}"
    const val cardview = "com.android.support:cardview-v7:${Versions.supportLibs}"
    const val recyclerview = "com.android.support:recyclerview-v7:${Versions.supportLibs}"
    const val annotas = "com.android.support:support-annotations:${Versions.supportLibs}"
    
    // Permissions
    const val permissions = "com.github.fondesa:kpermissions:${Versions.permissions}"
    
    // Google Authentication
    const val firebaseCore = "com.google.firebase:firebase-core:${Versions.firebase}"
    const val firebaseAuth = "com.google.firebase:firebase-auth:${Versions.firebase}"
    const val firebaseStorage = "com.google.firebase:firebase-storage:${Versions.firebase}"
    const val auth = "com.google.android.gms:play-services-auth:${Versions.firebase}"
    
    // Square Libs
    const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitScalars = "com.squareup.retrofit2:converter-scalars:${Versions.retrofit}"
    
    // Material Design Dialogs
    const val mdDialogs = "com.afollestad.material-dialogs:core:${Versions.mdDialogs}@aar"
    const val mdDialogsCommons = "com.afollestad.material-dialogs:commons:${Versions.mdDialogs}@aar"
    
    // Material Design Drawer
    const val mdDrawer = "co.zsmb:materialdrawer-kt:${Versions.mdDrawer}@aar"
    
    // Glide
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
    const val glideOkhttp = "com.github.bumptech.glide:okhttp3-integration:${Versions.glide}"
    
    // KAU Extensions
    const val kauExt = "com.jahirfiquitiva.KAUExtensions:core:${Versions.kauExt}@aar"
    const val archHelpers = "com.jahirfiquitiva.KAUExtensions:archhelpers:${Versions.kauExt}"
    const val ziv = "com.jahirfiquitiva.KAUExtensions:ziv:${Versions.kauExt}"
    
    // FABs Dial
    const val fabsDial = "com.github.leinardi:FloatingActionButtonSpeedDial:${Versions.fabsDial}"
    
    // Sectioned RecyclerView
    const val srv = "com.jahirfiquitiva:sectioned-recyclerview:${Versions.srv}@aar"
    
    // RecyclerView Fast Scroller
    const val fastScroll = "com.jahirfiquitiva:recycler-fast-scroll:${Versions.fastScroll}@aar"
    
    // Text Drawable
    const val textDrawable = "com.jahirfiquitiva:TextDrawable:${Versions.textDrawable}"
    
    // Licenses Dialog
    const val licDialog = "de.psdev.licensesdialog:licensesdialog:${Versions.licDialog}"
    
    // Meteor DDP
    // const val ddp = "com.github.delight-im:Android-DDP:${Versions.ddp}"
    const val ddpj = "com.jahirfiquitiva:Android-DDP:${Versions.ddpj}@aar"
    
    // Jackson
    const val jackson = "com.fasterxml.jackson.core:jackson-databind:${Versions.jackson}"
    
    // Crashlytics
    const val crashlytics = "com.crashlytics.sdk.android:crashlytics:${Versions.crashlytics}@aar"
    
    // EventBus
    const val eventBus = "org.greenrobot:eventbus:${Versions.eventBus}"
    const val eventBusProcessor =
        "org.greenrobot:eventbus-annotation-processor:${Versions.eventBus}"
}