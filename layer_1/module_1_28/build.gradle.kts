       plugins {
          id ("java-library")
          id ("maven-publish")
          id ("jacoco")
          id ("org.sonarqube") version "4.3.0.3225"
          id("awesome.kotlin.plugin")
       }
          dependencies {
             
implementation(project(":layer_0:module_0_14"))
implementation(project(":layer_0:module_0_9"))
implementation(project(":layer_0:module_0_3"))
implementation(project(":layer_0:module_0_7"))
implementation(project(":layer_0:module_0_6"))
implementation(project(":layer_0:module_0_8"))
implementation(project(":layer_0:module_0_13"))
implementation(project(":layer_0:module_0_10"))
implementation(project(":layer_0:module_0_1"))
implementation(project(":layer_0:module_0_2"))
implementation(project(":layer_0:module_0_5"))
implementation(project(":layer_0:module_0_11"))
implementation(project(":layer_0:module_0_12"))
          }
