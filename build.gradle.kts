buildscript {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://jitpack.io")
    }

    dependencies {
        classpath(Android.Classpaths.gradle)
        classpath(Android.Classpaths.kotlin)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.0")
    }
}

tasks.register("clean", Delete::class) {
    rootProject.buildDir
}