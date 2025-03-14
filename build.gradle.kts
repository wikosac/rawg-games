import java.util.Properties

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.google.devtools.ksp) apply false
    alias(libs.plugins.google.dagger.hilt.android) apply false
    alias(libs.plugins.org.jetbrains.kotlin.kapt) apply false
}

val localProperties = Properties().apply {
    file("local.properties").inputStream().use { load(it) }
}

val apiKey: String? = localProperties.getProperty("apiKey")

extensions.extraProperties["apiKey"] = apiKey