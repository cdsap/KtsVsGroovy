       plugins {
          id ("java-library")
          id ("maven-publish")
          id ("jacoco")
          id ("org.sonarqube") version "4.3.0.3225"
          id("awesome.kotlin.plugin")
       }
          dependencies {
             
implementation(project(":layer_0:module_0_3"))
implementation(project(":layer_0:module_0_12"))
implementation(project(":layer_0:module_0_6"))
implementation(project(":layer_0:module_0_4"))
implementation(project(":layer_0:module_0_21"))
implementation(project(":layer_0:module_0_14"))
implementation(project(":layer_0:module_0_25"))
implementation(project(":layer_0:module_0_28"))
          }
