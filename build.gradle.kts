import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.41"
    java
    application
}

group = "com.icelabz.kata"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
//    the following is required and was added recently to run unit test via junit
//    see article here
    testImplementation("org.jetbrains.kotlin:kotlin-test-common:1.3.41")
    testImplementation("org.jetbrains.kotlin:kotlin-test-annotations-common")
//    https://junit.org/junit5/docs/current/user-guide/#running-tests-build-gradle-engines-configure
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.5.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.5.1")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

// when this is enabled: https://junit.org/junit5/docs/current/user-guide/#running-tests-build-gradle-engines-configure
// then the test tasks works
tasks.withType<Test>{
//    you can add the following filter if you want
//    filter{
//        includeTestsMatching("*")
//    }
    useJUnitPlatform()
}