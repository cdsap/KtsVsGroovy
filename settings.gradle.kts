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
include (":layer_1:module_1_15")
include (":layer_1:module_1_16")
include (":layer_1:module_1_17")
include (":layer_1:module_1_18")
include (":layer_1:module_1_19")
include (":layer_1:module_1_20")
include (":layer_1:module_1_21")
include (":layer_1:module_1_22")
include (":layer_1:module_1_23")
include (":layer_1:module_1_24")
include (":layer_1:module_1_25")
include (":layer_1:module_1_26")
include (":layer_1:module_1_27")
include (":layer_1:module_1_28")
include (":layer_1:module_1_29")
include (":layer_1:module_1_30")
include (":layer_1:module_1_31")
include (":layer_1:module_1_32")
include (":layer_1:module_1_33")
include (":layer_1:module_1_34")
include (":layer_1:module_1_35")
include (":layer_1:module_1_36")
include (":layer_2:module_2_37")
include (":layer_3:module_3_38")
include (":layer_3:module_3_39")
include (":layer_3:module_3_40")
include (":layer_3:module_3_41")
include (":layer_3:module_3_42")
include (":layer_3:module_3_43")
include (":layer_3:module_3_44")
include (":layer_3:module_3_45")
include (":layer_3:module_3_46")
include (":layer_3:module_3_47")
include (":layer_3:module_3_48")
include (":layer_3:module_3_49")
include (":layer_3:module_3_50")
include (":layer_3:module_3_51")
include (":layer_3:module_3_52")
include (":layer_3:module_3_53")
include (":layer_3:module_3_54")
include (":layer_3:module_3_55")
include (":layer_3:module_3_56")
include (":layer_3:module_3_57")
include (":layer_3:module_3_58")
include (":layer_3:module_3_59")
include (":layer_4:module_4_60")
include (":layer_4:module_4_61")
include (":layer_4:module_4_62")
include (":layer_4:module_4_63")
include (":layer_4:module_4_64")
include (":layer_4:module_4_65")
include (":layer_4:module_4_66")
include (":layer_4:module_4_67")
include (":layer_4:module_4_68")
include (":layer_4:module_4_69")
include (":layer_4:module_4_70")
include (":layer_4:module_4_71")
include (":layer_4:module_4_72")
include (":layer_4:module_4_73")
include (":layer_4:module_4_74")
include (":layer_4:module_4_75")
include (":layer_4:module_4_76")
include (":layer_4:module_4_77")
include (":layer_4:module_4_78")
include (":layer_4:module_4_79")
include (":layer_4:module_4_80")
include (":layer_4:module_4_81")
include (":layer_5:module_5_82")