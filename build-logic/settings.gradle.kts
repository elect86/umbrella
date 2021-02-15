dependencyResolutionManagement.repositories.gradlePluginPortal()

pluginManagement {

    includeBuild("../sciJava-catalogs")

//    resolutionStrategy {
//        eachPlugin {
//            if (requested.id.id == "sciJava.catalogs")
//                useModule("com.github.elect86:sciJava-catalogs:4df6e8b9")
//        }
//    }
//    repositories {
//        gradlePluginPortal()
//        maven("https://jitpack.io")
//    }
}

plugins { id("sciJava.catalogs") }

rootProject.name = "build-logic"

include("commons")
//includeBuild("../sciJava-catalogs")