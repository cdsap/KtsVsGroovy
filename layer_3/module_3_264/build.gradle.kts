       plugins {
          id ("java-library")
          id ("maven-publish")
          id ("jacoco")
          id ("org.sonarqube") version "4.3.0.3225"
          id("awesome.kotlin.plugin")
       }
          dependencies {
             
implementation(project(":layer_2:module_2_249"))
implementation(project(":layer_2:module_2_252"))
implementation(project(":layer_2:module_2_251"))
          }