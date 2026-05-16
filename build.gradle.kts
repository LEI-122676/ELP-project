plugins {
    kotlin("jvm") version "2.3.10"
    antlr
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.0")
    
    // ANTLR
    implementation("org.antlr:antlr4-runtime:4.13.2")
    antlr("org.antlr:antlr4:4.13.2")
}

sourceSets {
    main {
        java {
            srcDir("src/main/Javardair")
            srcDir("src/main/JSON")
        }
        kotlin {
            srcDir("src/main/kotlin")
        }
    }
}

kotlin {
    jvmToolchain(25)
}

tasks {
    generateGrammarSource {
        maxHeapSize = "128m"
    }
    
    test {
        useJUnitPlatform()
    }
}