       plugins {
          id ("java-library")
          id ("maven-publish")
          id ("jacoco")
          id ("org.sonarqube") version "4.3.0.3225"
          id("awesome.kotlin.plugin")
       }
          dependencies {
             
implementation(project(":layer_3:module_3_46"))
implementation(project(":layer_3:module_3_44"))
implementation(project(":layer_3:module_3_39"))
implementation(project(":layer_3:module_3_56"))
          }
