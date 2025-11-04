/*
 *
 *  * Copyright (c) 2025 StylesDevelopments. Logger.
 *  *
 *  * Created by Taylor Styles on 04/11/2025, 17:52.
 *
 */

import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("com.android.library") version "8.3.2"
    id("org.jetbrains.kotlin.android") version "1.9.22"
    id("maven-publish")
}

android {
    namespace = "com.stylesdevelopments.logging"
    compileSdk = 34

    defaultConfig {
        minSdk = 28
        consumerProguardFiles("consumer-rules.pro")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlin {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_17)
        }
    }
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("release") {
                from(components["release"])
                groupId = "com.github.stylesdevelopments"
                artifactId = "logger"
                version = "1.0.0"
            }
        }
    }
}
