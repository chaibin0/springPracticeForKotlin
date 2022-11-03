plugins {
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
    testImplementation("io.kotest:kotest-assertions-core-jvm:5.5.0")
    testImplementation("io.kotest:kotest-runner-junit5:5.5.0")
    testImplementation("io.mockk:mockk:1.13.1")
}
