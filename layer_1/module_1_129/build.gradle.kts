       plugins {
          id ("java-library")
          id ("maven-publish")
          id ("jacoco")
          id ("org.sonarqube") version "4.3.0.3225"
          id("awesome.kotlin.plugin")
       }
          dependencies {
             
implementation(project(":layer_0:module_0_35"))
implementation(project(":layer_0:module_0_51"))
implementation(project(":layer_0:module_0_28"))
implementation(project(":layer_0:module_0_52"))
implementation(project(":layer_0:module_0_1"))
implementation(project(":layer_0:module_0_54"))
implementation(project(":layer_0:module_0_46"))
implementation(project(":layer_0:module_0_12"))
implementation(project(":layer_0:module_0_33"))
implementation(project(":layer_0:module_0_34"))
implementation(project(":layer_0:module_0_2"))
          }
