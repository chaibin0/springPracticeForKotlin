import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.7.4" apply false
    id("io.spring.dependency-management") version "1.0.14.RELEASE" apply false
    kotlin("jvm") version "1.6.21" apply false
    kotlin("plugin.spring") version "1.6.21" apply false
    kotlin("plugin.jpa") version "1.6.21" apply false
    kotlin("kapt") version "1.6.21" apply false
}

subprojects {

    apply(plugin = "org.jetbrains.kotlin.jvm")

    group = "com.example.chaibin"
    version = "0.0.1-SNAPSHOT"

    repositories {
        mavenCentral()
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "17"
        }
    }
}
