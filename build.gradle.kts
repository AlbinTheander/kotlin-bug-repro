plugins {
    kotlin("multiplatform") version "1.9.24"
}

group = "com.ant.bugrepro"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}


kotlin {
    js {
        nodejs {}
        binaries.library()
    }

    sourceSets {
        commonTest.dependencies {
            implementation(kotlin("test"))
        }
    }
}