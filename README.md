# Java Android Application (Java 25 build)

A complete single-activity Android application with a testable domain service,
responsive XML layout, unit tests, lint, APK assembly CI, and 12 Java analysis
tool-trigger integrations.

## Build

Open in Android Studio or run `gradle testDebugUnitTest assembleDebug lintDebug`.
The debug APK is generated at `app/build/outputs/apk/debug/app-debug.apk`.

The application accepts a name and displays a greeting. JDK 25 runs Android
Gradle Plugin 9.2.0 and Gradle 9.4.1. Application sources deliberately target
Java 17 bytecode, the supported Android language level, so the resulting APK
runs safely on Android devices instead of requiring a desktop Java 25 runtime.
