       plugins {
          id ("java-library")
          id ("maven-publish")
          id ("jacoco")
          id ("org.sonarqube") version "4.3.0.3225"
          id("awesome.kotlin.plugin")
       }
          dependencies {
             
implementation(project(":layer_0:module_0_11"))
implementation(project(":layer_0:module_0_10"))
implementation(project(":layer_0:module_0_8"))
          }