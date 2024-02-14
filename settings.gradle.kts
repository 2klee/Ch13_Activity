pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Ch13_Activity"
include(":app")
include(":ch13_activity")
include(":ch14_receiver")
include(":contactsex")
include(":gallayex")
include(":ch16_provider")
