plugins {
    kotlin("jvm") version "2.3.0"
}

group = "com"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1")
}

kotlin {
    jvmToolchain(25)
}

tasks.test {
    useJUnitPlatform()
}