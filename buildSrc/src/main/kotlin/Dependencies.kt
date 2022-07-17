import org.gradle.api.artifacts.dsl.DependencyHandler

object Dependencies {

    private object Versions {
        const val room = "2.5.0-alpha02"
        const val coroutines = "1.5.0"
        const val lifecycleRuntimeKtx = "2.5.0"
        const val lifecycleKtx = "2.2.0"
        const val coreKtx = "1.8.0"
        const val compose = "1.3.0-alpha01"
        const val composeActivity = "1.5.0"
        const val koin = "3.2.0"
        const val voyager = "1.0.0-rc02"
        const val voiceTranslation = "0.1.0"
    }

    const val room = "androidx.room:room-runtime:${Versions.room}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"

    const val coroutinesCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val coroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"

    const val lifecycleViewModelKtx =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleRuntimeKtx}"
    const val lifecycleRuntimeKtx =
        "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntimeKtx}"
    const val lifecycleExtensions =
        "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycleKtx}"

    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"

    const val composeUI = "androidx.compose.ui:ui:${Versions.compose}"
    const val composeMaterial = "androidx.compose.material:material:${Versions.compose}"
    const val composePreview = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
    const val composeActivity = "androidx.activity:activity-compose:${Versions.composeActivity}"

    const val koinCore = "io.insert-koin:koin-core:${Versions.koin}"
    const val koinAndroid = "io.insert-koin:koin-android:${Versions.koin}"

    const val voyagerNavigator = "cafe.adriel.voyager:voyager-navigator:${Versions.voyager}"
    const val voyagerBottomSheetNavigator = "cafe.adriel.voyager:voyager-bottom-sheet-navigator:${Versions.voyager}"
    const val voyagerTabNavigator = "cafe.adriel.voyager:voyager-tab-navigator:${Versions.voyager}"
    const val voyagerTransitions = "cafe.adriel.voyager:voyager-transitions:${Versions.voyager}"
    const val voyagerAndroidX = "cafe.adriel.voyager:voyager-androidx:${Versions.voyager}"
    const val voyagerKoin = "cafe.adriel.voyager:voyager-koin:${Versions.voyager}"

    const val voiceTranslation = "com.google.cloud:google-cloud-mediatranslation:${Versions.voiceTranslation}"
}

fun DependencyHandler.addVoiceTranslation() {
    implementation(Dependencies.voiceTranslation)
}

fun DependencyHandler.addNavigation() {
    implementation(Dependencies.voyagerNavigator)
    implementation(Dependencies.voyagerBottomSheetNavigator)
    implementation(Dependencies.voyagerTabNavigator)
    implementation(Dependencies.voyagerTransitions)
    implementation(Dependencies.voyagerAndroidX)
    implementation(Dependencies.voyagerKoin)
}

fun DependencyHandler.addCompose() {
    implementation(Dependencies.composeUI)
    implementation(Dependencies.composeMaterial)
    implementation(Dependencies.composePreview)
    implementation(Dependencies.composeActivity)
}

fun DependencyHandler.addCommonAndroid() {
    implementation(Dependencies.coreKtx)
}

fun DependencyHandler.addDI() {
    implementation(Dependencies.koinCore)
    implementation(Dependencies.koinAndroid)
}

fun DependencyHandler.addLifecycle() {
    implementation(Dependencies.lifecycleViewModelKtx)
    implementation(Dependencies.lifecycleRuntimeKtx)
    implementation(Dependencies.lifecycleExtensions)
}

fun DependencyHandler.addCoroutines() {
    implementation(Dependencies.coroutinesCore)
    implementation(Dependencies.coroutinesAndroid)
}

fun DependencyHandler.addRoom() {
    implementation(Dependencies.room)
    implementation(Dependencies.roomKtx)
    ksp(Dependencies.roomCompiler)
}