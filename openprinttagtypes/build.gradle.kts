plugins {
    kotlin("jvm")
    `java-library`
    `maven-publish`
}

repositories {
    mavenCentral()
}

group = "cool.nfc.openprinttag"
version = "0.1.0"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
    withSourcesJar()
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "17"
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            artifactId = "openprinttagtypes"
        }
    }
}
