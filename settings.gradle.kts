pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("com.gradle.common-custom-user-data-gradle-plugin") version "1.8.1"
    id("com.gradle.enterprise") version "3.13.4"
}
gradleEnterprise {
    server = "http://ge.solutions-team.gradle.com"
    allowUntrustedServer = true
    buildScan {
        publishAlways()
    }
}
rootProject.name="project"
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}


include (":layer_0:module_0_1")
include (":layer_0:module_0_2")
include (":layer_0:module_0_3")
include (":layer_0:module_0_4")
include (":layer_0:module_0_5")
include (":layer_0:module_0_6")
include (":layer_0:module_0_7")
include (":layer_0:module_0_8")
include (":layer_0:module_0_9")
include (":layer_0:module_0_10")
include (":layer_0:module_0_11")
include (":layer_0:module_0_12")
include (":layer_0:module_0_13")
include (":layer_0:module_0_14")
include (":layer_0:module_0_15")
include (":layer_0:module_0_16")
include (":layer_0:module_0_17")
include (":layer_0:module_0_18")
include (":layer_0:module_0_19")
include (":layer_0:module_0_20")
include (":layer_0:module_0_21")
include (":layer_0:module_0_22")
include (":layer_0:module_0_23")
include (":layer_0:module_0_24")
include (":layer_0:module_0_25")
include (":layer_0:module_0_26")
include (":layer_0:module_0_27")
include (":layer_0:module_0_28")
include (":layer_0:module_0_29")
include (":layer_0:module_0_30")
include (":layer_0:module_0_31")
include (":layer_0:module_0_32")
include (":layer_0:module_0_33")
include (":layer_0:module_0_34")
include (":layer_0:module_0_35")
include (":layer_0:module_0_36")
include (":layer_0:module_0_37")
include (":layer_0:module_0_38")
include (":layer_0:module_0_39")
include (":layer_0:module_0_40")
include (":layer_0:module_0_41")
include (":layer_0:module_0_42")
include (":layer_0:module_0_43")
include (":layer_0:module_0_44")
include (":layer_0:module_0_45")
include (":layer_0:module_0_46")
include (":layer_0:module_0_47")
include (":layer_0:module_0_48")
include (":layer_0:module_0_49")
include (":layer_0:module_0_50")
include (":layer_1:module_1_51")