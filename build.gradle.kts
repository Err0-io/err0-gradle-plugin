plugins {
	`java-gradle-plugin`
	`maven-publish`
}

group = "io.err0"
version = "1.0-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_1_8
	targetCompatibility = JavaVersion.VERSION_1_8
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("com.squareup.okhttp3:okhttp:4.10.0")
	implementation("com.google.code.gson:gson:2.8.7")
}

gradlePlugin {
	plugins {
		create("err0Plugin") {
			id = "io.err0.err0-gradle-plugin"
			implementationClass = "io.err0.gradle.Err0Plugin"
		}
	}
}