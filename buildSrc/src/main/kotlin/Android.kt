object Android {

    object Classpaths {
        object Versions {
            const val kotlin = "1.7.0"
            const val gradle = "7.2.1"
            const val ksp = "1.7.0-1.0.6"
        }

        const val gradle = "com.android.tools.build:gradle:${Versions.gradle}"
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
        const val ksp = "com.google.devtools.ksp:com.google.devtools.ksp.gradle.plugin:${Versions.ksp}"
    }

    object DefaultConfig {
        const val applicationId = "hardcoder.dev.voicer"
        const val minSdk = 21
        const val targetSdk = 32
        const val compileSdk = 32

        const val versionCode = 1
        const val versionName = "1.0"
    }

    object KotlinOptions {
        const val jvmTargetVersion = "1.8"
    }

    object PackagingOptions {
        const val lgpl = "/META-INF/{AL2.0,LGPL2.1}"
        const val indexList = "/META-INF/INDEX.LIST"
    }

    object ComposeOptions {
        const val compilerVersion = "1.2.0"
    }

    object BuildTypes {
        const val release = "release"
        const val debug = "debug"
    }

    object Proguard {
        const val androidOptimizedRules = "proguard-android-optimize.txt"
        const val projectRules = "proguard-rules.pro"
    }
}