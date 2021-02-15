plugins {
    java
//    id("com.example.jacoco")
}

group = "umbrella"

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
//    implementation(platform("com.example.platform:product-platform"))
//
//    testImplementation(platform("com.example.platform:test-platform"))
//    testImplementation("org.junit.jupiter:junit-jupiter-api")
//    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.test {
    useJUnitPlatform()
}
