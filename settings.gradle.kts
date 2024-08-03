pluginManagement {
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://artifactregistry://us-west2-maven.pkg.dev/gmp-artifacts/transportation")
        }
    }
}
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://artifactregistry://us-west2-maven.pkg.dev/gmp-artifacts/transportation")
        }
    }
}

rootProject.name = "third-task"
include(":app")
