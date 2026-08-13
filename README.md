# Java Android Application (Java 17)

A complete single-activity Android application with a testable domain service,
responsive XML layout, unit tests, lint, APK assembly CI, and 12 Java analysis
tool-trigger integrations.

## Build

Open in Android Studio or run `gradle testDebugUnitTest assembleDebug lintDebug`.
The debug APK is generated at `app/build/outputs/apk/debug/app-debug.apk`.

The application accepts a name and displays a greeting. Java 17 source syntax
is compiled with Android Gradle Plugin 9.2.0 and Gradle 9.4.1.
