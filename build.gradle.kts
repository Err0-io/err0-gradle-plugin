plugins {
	`java-gradle-plugin`
	`maven-publish`
	id("com.gradle.plugin-publish") version "1.1.0"
}

group = "io.err0"
version = "1.0.0"

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

pluginBundle {
	website = "https://github.com/Err0-io/err0-gradle-plugin"
	vcsUrl = "https://github.com/Err0-io/err0-gradle-plugin.git"
	tags = listOf("observability")
}

gradlePlugin {

	plugins {
		create("err0Plugin") {
			id = "io.err0.err0-gradle-plugin"
			displayName = "Gradle plugin for err0"
			description = "A plugin to enable err0agent to be run with gradle commands"
			implementationClass = "io.err0.gradle.Err0Plugin"
		}
	}
}