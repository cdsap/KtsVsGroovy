       plugins {
          id ("java-library")
          id ("maven-publish")
          id ("jacoco")
          id ("org.sonarqube") version "4.3.0.3225"
          id("awesome.kotlin.plugin")
       }
          dependencies {
             
implementation(project(":layer_3:module_3_38"))
implementation(project(":layer_3:module_3_42"))
implementation(project(":layer_3:module_3_47"))
implementation(project(":layer_3:module_3_55"))
implementation(project(":layer_3:module_3_59"))
implementation(project(":layer_3:module_3_57"))
implementation(project(":layer_3:module_3_56"))
          }
