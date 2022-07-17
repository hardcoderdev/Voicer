plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("kotlin-parcelize")
}

android {

    defaultConfig {
        applicationId = Android.DefaultConfig.applicationId
        minSdk = Android.DefaultConfig.minSdk
        compileSdk = Android.DefaultConfig.compileSdk
        targetSdk = Android.DefaultConfig.targetSdk
        versionCode = Android.DefaultConfig.versionCode
        versionName = Android.DefaultConfig.versionName

        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName(Android.BuildTypes.release) {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile(Android.Proguard.androidOptimizedRules), Android.Proguard.projectRules)
        }
        getByName(Android.BuildTypes.debug) {
            isMinifyEnabled = false
            isShrinkResources = false
            proguardFiles(getDefaultProguardFile(Android.Proguard.androidOptimizedRules), Android.Proguard.projectRules)
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = Android.KotlinOptions.jvmTargetVersion
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Android.ComposeOptions.compilerVersion
    }

    packagingOptions {
        resources {
            excludes += Android.PackagingOptions.metaInf
        }
    }
}

dependencies {
    addCommonAndroid()
    addDI()
    addRoom()
    addCoroutines()
    addCompose()
    addLifecycle()
}