# 🧾 Logger
*A lightweight Kotlin logging utility for Android - designed for simplicity, consistency, and speed.*

[![Release](https://jitpack.io/v/StylesDevelopments/Logger.svg)](https://jitpack.io/#StylesDevelopments/Logger)
[![Android](https://img.shields.io/badge/Android-API%2028%2B-brightgreen.svg?logo=android)](https://developer.android.com)
[![Kotlin](https://img.shields.io/badge/Kotlin-1.9.22-blue.svg?logo=kotlin)](https://kotlinlang.org)
[![License: Apache-2.0](https://img.shields.io/badge/License-Apache_2.0-lightgrey.svg)](LICENSE)

---

## 🚀 Overview

`Logger` is a **minimal Kotlin-based logging library** built for modern Android development.  
It provides a structured, lightweight wrapper around Android’s native `Log` class —  
adding automatic tag generation, cleaner stack traces, and consistent output formatting.

> Perfect for developers who want a quick, dependency-free logging solution that just works.

---

## 🧠 Stack & Requirements

| Component | Version / Target |
|------------|------------------|
| **JDK** | 17 (OpenJDK) |
| **Android Gradle Plugin** | 8.3.2+ |
| **Kotlin** | 1.9.22+ |
| **Min SDK** | 28 |
| **Compile SDK** | 34 |
| **Gradle** | 8.x |
| **Publisher** | [JitPack](https://jitpack.io/#StylesDevelopments/Logger) |

---

## ⚙️ Installation

Add the JitPack repository and dependency in your project.

### 🔹 Kotlin DSL (`build.gradle.kts`)
```kotlin
repositories {
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.github.StylesDevelopments:Logger:1.0.0")
}
```

---

### 🔹 Groovy DSL (`build.gradle`)
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.StylesDevelopments:Logger:1.0.0'
}
```

---

### 🔹 Version Catalog (`libs.versions.toml`)
```toml
[versions]
logger = "1.0.0"

[libraries]
stylesdevelopments-logger = { module = "com.github.StylesDevelopments:Logger", version.ref = "logger" }
```

Usage in Gradle:
```kotlin
implementation(libs.stylesdevelopments.logging)
```

---

## 🧩 Usage Example

```kotlin
import com.stylesdevelopments.logging.Logger

class Example {
    fun doSomething() {
        Logger.d("Debug message")
        Logger.w("Warning message")
        Logger.e("Error message")
    }
}
```

### ✅ Automatic Tagging
`Logger` automatically derives the tag from the calling class name,  
so the above will print something like:
```
D/Example: Debug message
W/Example: Warning message
E/Example: Error message
```

---

## 🧰 API Reference

| Method | Description |
|--------|--------------|
| `Logger.d(message: String)` | Debug log |
| `Logger.d(message: String, throwable: Throwable?)` | Debug log with exception |
| `Logger.w(message: String)` | Warning log |
| `Logger.w(message: String, throwable: Throwable?)` | Warning log with exception |
| `Logger.e(message: String)` | Error log |
| `Logger.e(message: String, throwable: Throwable?)` | Error log with exception |

---

## 🧩 Project Setup

### Build Configuration
```kotlin
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
            jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17)
        }
    }
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("release") {
                from(components["release"])
                groupId = "com.github.StylesDevelopments"
                artifactId = "Logger"
                version = "1.0.0"
            }
        }
    }
}
```

---

## 🧩 JitPack Configuration

```yaml
jdk:
  - openjdk17

install:
  - ./gradlew publishToMavenLocal
```

---

## 🪪 License

```
                                 Apache License
                           Version 2.0, January 2004
                        http://www.apache.org/licenses/

   TERMS AND CONDITIONS FOR USE, REPRODUCTION, AND DISTRIBUTION

   Copyright (c) 2025 StylesDevelopments.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```

---

## 💬 Author

**Taylor Styles**  
👨‍💻 Android Engineer
📍 Bristol, UK  
💼 [StylesDevelopments](https://github.com/StylesDevelopments)

---

> “A logger should be invisible until you need it — then it should tell you everything.”

---

### 🌟 Star the repo if you find it useful!
