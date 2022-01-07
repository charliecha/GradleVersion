import com.ncorti.kotlin.gradle.template.plugin.*

plugins {
    java
    id("com.ncorti.kotlin.gradle.template.plugin")
}

templateExampleConfig {
    message.set("Just trying this gradle plugin..., hi ->  " + EXTENSION_NAME + junit)
}

dependencies {
//    implementation(EXTENSION_NAME)
    testImplementation(junit)
}
