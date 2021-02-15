
dependencyResolutionManagement.repositories.gradlePluginPortal()

pluginManagement {
    includeBuild("../sciJava-catalogs")
}

plugins { id("sciJava.catalogs") }

rootProject.name = "build-logic"

include("commons")
//includeBuild("../sciJava-catalogs")