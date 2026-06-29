plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.hilt)
    alias(libs.plugins.ksp)
}

android {
    namespace = "com.example.hmo_app"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.hmo_app"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        viewBinding = true
        buildConfig = true
        compose = true
    }
}

dependencies {
    implementation(libs.hilt.android)
    implementation(libs.ui.graphics)
    ksp(libs.hilt.compiler)
    implementation(libs.hilt.work)
    ksp(libs.hilt.work.compiler)

    implementation(libs.retrofit)
    implementation(libs.retrofit.gson)
    implementation(libs.okhttp)
    implementation(libs.okhttp.logging)

    implementation(libs.datastore.prefs)
    implementation(libs.coroutines.android)
    implementation(libs.coroutines.play.services)

    implementation(libs.room.runtime)
    implementation(libs.room.ktx)
    ksp(libs.room.compiler)

    implementation(libs.lifecycle.service)
    implementation(libs.lifecycle.runtime)
    implementation(libs.activity)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)

    implementation(libs.play.services.location)
    implementation(libs.work.runtime)

    // Compose
    implementation(platform(libs.compose.bom))
    implementation(libs.compose.ui)
    implementation(libs.compose.ui.graphics)
    implementation(libs.compose.ui.tooling.preview)
    implementation(libs.compose.material3)
    implementation(libs.compose.material.icons)
    implementation(libs.compose.foundation)
    implementation(libs.compose.runtime)
    debugImplementation(libs.compose.ui.tooling)

    implementation(libs.activity.compose)
    implementation(libs.lifecycle.runtime.compose)
    implementation(libs.lifecycle.viewmodel.compose)
    implementation(libs.navigation.compose)
    implementation(libs.hilt.navigation.compose)

    // OSMDroid
    implementation(libs.osmdroid)

    // MapLibre (used for turn-by-turn navigation screen)
//    implementation(libs.maplibre) {
//        exclude(group = "org.maplibre.gl", module = "android-sdk-geojson")
//        exclude(group = "org.maplibre.gl", module = "android-sdk-turf")
//    }

    // MapLibre Navigation Core
//    implementation(libs.maplibre.navigation.core)
//    implementation(libs.maplibre.geojson)
    implementation(libs.kotlinx.serialization.json)

    // For Live Location Tracking
    implementation("com.squareup.okhttp3:okhttp-sse:4.12.0")

    // CameraX for QR scanning
    implementation(libs.camerax.core)
    implementation(libs.camerax.camera2)
    implementation(libs.camerax.lifecycle)
    implementation(libs.camerax.view)

    // ML Kit barcode scanning
    implementation(libs.mlkit.barcode)

    // Coil for image loading
    implementation(libs.coil.compose)

    // Firebase for Push Notifications Story
    implementation("com.google.firebase:firebase-messaging-ktx:24.1.0")
}

// Edited for dependencies (-Jeff)