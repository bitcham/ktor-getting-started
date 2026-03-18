val exposedVersion = "1.0.0"
val postgresqlVersion = "42.7.10"
val hikariCpVersion = "7.0.2"
val koinVersion = "4.1.1"
val jacksonVersion = "2.21.0"
val logbackVersion = "1.5.32"
val jpasetoVersion = "0.7.0"
val ulidVersion = "5.2.3"
val minioVersion = "8.6.0"
val jakartaMailVersion = "2.0.2"

plugins {
    kotlin("jvm") version "2.2.20"
    id("io.ktor.plugin") version "3.4.1"
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("com.fasterxml.jackson:jackson-bom:$jacksonVersion"))

    // Ktor
    implementation("io.ktor:ktor-server-core")
    implementation("io.ktor:ktor-server-netty")
    implementation("io.ktor:ktor-server-config-yaml")
    implementation("io.ktor:ktor-server-content-negotiation")
    implementation("io.ktor:ktor-serialization-jackson")

    // Logging
    implementation("ch.qos.logback:logback-classic:$logbackVersion")

    // Jackson Java Time
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310")

    // Exposed
    implementation("org.jetbrains.exposed:exposed-core:$exposedVersion")
    implementation("org.jetbrains.exposed:exposed-dao:$exposedVersion")
    implementation("org.jetbrains.exposed:exposed-jdbc:$exposedVersion")
    implementation("org.jetbrains.exposed:exposed-java-time:$exposedVersion")

    // PostgreSQL
    implementation("org.postgresql:postgresql:$postgresqlVersion")

    // Connection Pool
    implementation("com.zaxxer:HikariCP:$hikariCpVersion")

    // DI
    implementation("io.insert-koin:koin-ktor:$koinVersion")
    implementation("io.insert-koin:koin-logger-slf4j:$koinVersion")

    // PASETO
    implementation("dev.paseto:jpaseto-api:$jpasetoVersion")
    implementation("dev.paseto:jpaseto-impl:$jpasetoVersion")
    implementation("dev.paseto:jpaseto-jackson:$jpasetoVersion")

    // ULID
    implementation("com.github.f4b6a3:ulid-creator:$ulidVersion")

    // MinIO
    implementation("io.minio:minio:$minioVersion")

    // Jakarta Mail
    implementation("com.sun.mail:jakarta.mail:$jakartaMailVersion")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}
