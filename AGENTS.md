# Bablo — AGENTS.md

## Build & test

```sh
./gradlew assembleDebug          # build debug APK
./gradlew test                   # run unit tests (JUnit 4, `src/test/`)
./gradlew connectedAndroidTest   # run instrumented tests (requires device/emulator, `src/androidTest/`)
./gradlew :app:test --tests "*ExampleUnitTest"  # single test class
```

## Key facts

- Single module (`:app`), namespace `com.lyadsky.bablo`, JDK 21, Gradle 9.5, AGP 9.3.0, Kotlin 2.2.10
- Kotlin code style: `official` (`kotlin.code.style=official`)
- Configuration cache enabled (`org.gradle.configuration-cache=true`) — invalidates on changes to build logic or inputs
- No README, no CI, no lint config, no codegen steps
- Compose BOM `2026.02.01`, Material 3, Java 11 source/target
- Min SDK 28, Target SDK 36
