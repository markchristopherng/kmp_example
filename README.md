# Multiplatform example

This example demonstrates how you might want to integrate KMP into your project with minimal risks.
THe example provides a greeting for a person and tailored per platform. Logging is performed on the
device to indicate the greeting took place.

## iOS
To compile the project from Xcode just open `iosApp/iosApp.xcworkspace` and run the application.

## Android
To compile the project import the root level build.gradle in Android Studio

To run the unit tests 

```
   > ./gradlew test
```