object BuildVersion {
    const val compileSdkVersion = 30
    const val buildToolsVersion = "30.0.3"
    const val minSdkVersion = 16
    const val targetSdkVersion = 30
    const val versionCode = 1
    const val versionName = "1.0"
}

object Versions {
    const val kotlin_version = "1.5.10"
    const val core_ktx = "1.3.1"
    const val appcompat = "1.2.0"
    const val material = "1.2.1"
    const val retrofit = "2.9.0"

    const val constraintlayout = "2.0.1"
    const val livedata = "2.2.0"
    const val viewmodel = "2.2.0"
    const val junit = "4.+"
}

object Libs {
    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin_version}"
    const val core_ktx = "androidx.core:core-ktx:${Versions.core_ktx}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val constraintlayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
    const val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.livedata}"
    const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.viewmodel}"
    const val junit = "junit:junit:${Versions.junit}"
}