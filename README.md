# Java Android Application (Java 11)

A complete single-activity Android application with a testable domain service,
responsive XML layout, unit tests, lint, APK assembly CI, and 12 Java analysis
tool-trigger integrations.

## Build

Open in Android Studio or run `gradle testDebugUnitTest assembleDebug lintDebug`.
The debug APK is generated at `app/build/outputs/apk/debug/app-debug.apk`.

The application accepts a name and displays a greeting. Java 11 source syntax
is compiled with Android Gradle Plugin 7.4.2 and Gradle 7.5.
