plugins {
    kotlin("jvm") version "2.3.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.antlr:antlr4:4.13.2")
}

sourceSets {
    main {
        java {
            srcDir("src/main/Javardair")
            srcDir("src/main/JSON")


        }
    }
}

kotlin {
    jvmToolchain(25)
}

tasks.test {
    useJUnitPlatform()
}