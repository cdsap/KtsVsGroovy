       plugins {
          id ("java-library")
          id ("maven-publish")
          id ("jacoco")
          id ("org.sonarqube") version "4.3.0.3225"
          id("awesome.kotlin.plugin")
       }
          dependencies {
             
implementation(project(":layer_0:module_0_8"))
implementation(project(":layer_0:module_0_95"))
implementation(project(":layer_0:module_0_73"))
implementation(project(":layer_0:module_0_56"))
implementation(project(":layer_0:module_0_71"))
implementation(project(":layer_0:module_0_72"))
implementation(project(":layer_0:module_0_11"))
implementation(project(":layer_0:module_0_29"))
implementation(project(":layer_0:module_0_87"))
implementation(project(":layer_0:module_0_92"))
implementation(project(":layer_0:module_0_89"))
implementation(project(":layer_0:module_0_64"))
implementation(project(":layer_0:module_0_84"))
implementation(project(":layer_0:module_0_36"))
          }
