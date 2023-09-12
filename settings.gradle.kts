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
include (":layer_0:module_0_51")
include (":layer_0:module_0_52")
include (":layer_0:module_0_53")
include (":layer_0:module_0_54")
include (":layer_0:module_0_55")
include (":layer_0:module_0_56")
include (":layer_0:module_0_57")
include (":layer_0:module_0_58")
include (":layer_0:module_0_59")
include (":layer_0:module_0_60")
include (":layer_0:module_0_61")
include (":layer_0:module_0_62")
include (":layer_0:module_0_63")
include (":layer_0:module_0_64")
include (":layer_0:module_0_65")
include (":layer_0:module_0_66")
include (":layer_0:module_0_67")
include (":layer_0:module_0_68")
include (":layer_0:module_0_69")
include (":layer_0:module_0_70")
include (":layer_0:module_0_71")
include (":layer_0:module_0_72")
include (":layer_0:module_0_73")
include (":layer_0:module_0_74")
include (":layer_0:module_0_75")
include (":layer_0:module_0_76")
include (":layer_0:module_0_77")
include (":layer_0:module_0_78")
include (":layer_0:module_0_79")
include (":layer_0:module_0_80")
include (":layer_0:module_0_81")
include (":layer_0:module_0_82")
include (":layer_0:module_0_83")
include (":layer_0:module_0_84")
include (":layer_0:module_0_85")
include (":layer_0:module_0_86")
include (":layer_0:module_0_87")
include (":layer_0:module_0_88")
include (":layer_0:module_0_89")
include (":layer_0:module_0_90")
include (":layer_0:module_0_91")
include (":layer_0:module_0_92")
include (":layer_0:module_0_93")
include (":layer_0:module_0_94")
include (":layer_0:module_0_95")
include (":layer_0:module_0_96")
include (":layer_0:module_0_97")
include (":layer_0:module_0_98")
include (":layer_0:module_0_99")
include (":layer_0:module_0_100")
include (":layer_0:module_0_101")
include (":layer_0:module_0_102")
include (":layer_0:module_0_103")
include (":layer_0:module_0_104")
include (":layer_0:module_0_105")
include (":layer_0:module_0_106")
include (":layer_0:module_0_107")
include (":layer_0:module_0_108")
include (":layer_0:module_0_109")
include (":layer_0:module_0_110")
include (":layer_0:module_0_111")
include (":layer_0:module_0_112")
include (":layer_0:module_0_113")
include (":layer_0:module_0_114")
include (":layer_0:module_0_115")
include (":layer_0:module_0_116")
include (":layer_0:module_0_117")
include (":layer_0:module_0_118")
include (":layer_0:module_0_119")
include (":layer_0:module_0_120")
include (":layer_0:module_0_121")
include (":layer_0:module_0_122")
include (":layer_0:module_0_123")
include (":layer_0:module_0_124")
include (":layer_0:module_0_125")
include (":layer_0:module_0_126")
include (":layer_0:module_0_127")
include (":layer_0:module_0_128")
include (":layer_0:module_0_129")
include (":layer_0:module_0_130")
include (":layer_0:module_0_131")
include (":layer_0:module_0_132")
include (":layer_0:module_0_133")
include (":layer_0:module_0_134")
include (":layer_0:module_0_135")
include (":layer_0:module_0_136")
include (":layer_0:module_0_137")
include (":layer_0:module_0_138")
include (":layer_0:module_0_139")
include (":layer_0:module_0_140")
include (":layer_0:module_0_141")
include (":layer_0:module_0_142")
include (":layer_0:module_0_143")
include (":layer_0:module_0_144")
include (":layer_0:module_0_145")
include (":layer_0:module_0_146")
include (":layer_0:module_0_147")
include (":layer_0:module_0_148")
include (":layer_0:module_0_149")
include (":layer_0:module_0_150")
include (":layer_0:module_0_151")
include (":layer_0:module_0_152")
include (":layer_0:module_0_153")
include (":layer_0:module_0_154")
include (":layer_0:module_0_155")
include (":layer_0:module_0_156")
include (":layer_0:module_0_157")
include (":layer_0:module_0_158")
include (":layer_0:module_0_159")
include (":layer_0:module_0_160")
include (":layer_0:module_0_161")
include (":layer_0:module_0_162")
include (":layer_0:module_0_163")
include (":layer_0:module_0_164")
include (":layer_0:module_0_165")
include (":layer_0:module_0_166")
include (":layer_0:module_0_167")
include (":layer_0:module_0_168")
include (":layer_1:module_1_169")