       plugins {
          id ("java-library")
          id ("maven-publish")
          id ("jacoco")
          id ("org.sonarqube") version "4.3.0.3225"
          id("awesome.kotlin.plugin")
       }
          dependencies {
             
implementation(project(":layer_2:module_2_149"))
implementation(project(":layer_2:module_2_153"))
implementation(project(":layer_2:module_2_148"))
          }
