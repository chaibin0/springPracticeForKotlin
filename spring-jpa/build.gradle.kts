plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    kotlin("plugin.spring")
    kotlin("plugin.jpa")
    kotlin("kapt")
}

allOpen {
    annotation("javax.persistence.Entity")
    annotation("javax.persistence.Embeddable")
    annotation("javax.persistence.MappedSuperclass")
}

noArg {
    annotation("javax.persistence.Entity")
    annotation("javax.persistence.Embeddable")
    annotation("javax.persistence.MappedSuperclass")
}


java.sourceCompatibility = JavaVersion.VERSION_17

tasks.withType<Test> {
    useJUnitPlatform()
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

dependencies {

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("mysql:mysql-connector-java:8.0.30")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")

    testImplementation("org.springframework.boot:spring-boot-starter-test"){
        exclude(module = "mockito-core")
    }
    testImplementation("io.mockk:mockk:1.13.1")
    testImplementation("com.ninja-squad:springmockk:3.1.1")
    testImplementation("com.h2database:h2")
    testImplementation("io.kotest.extensions:kotest-extensions-spring:1.1.2")

    testImplementation("io.kotest:kotest-assertions-core-jvm:5.5.0")
    testImplementation("io.kotest:kotest-runner-junit5:5.5.0")
}
