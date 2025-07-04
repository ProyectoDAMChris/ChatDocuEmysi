// Top-level build file where you can add configuration options common to all sub-projects/modules.
// Top-level build file
buildscript {
    dependencies {
        classpath(libs.google.services)
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android)    apply false
    alias(libs.plugins.kotlin.compose)    apply false
    alias(libs.plugins.googleService)     apply false
}
