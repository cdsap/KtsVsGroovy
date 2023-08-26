       plugins {
          id ("java-library")
          id ("maven-publish")
          id ("jacoco")
          id ("org.sonarqube") version "4.3.0.3225"
          id("awesome.kotlin.plugin")
       }
          dependencies {
             
implementation(project(":layer_3:module_3_319"))
implementation(project(":layer_3:module_3_356"))
implementation(project(":layer_3:module_3_353"))
implementation(project(":layer_3:module_3_373"))
implementation(project(":layer_3:module_3_270"))
implementation(project(":layer_3:module_3_342"))
implementation(project(":layer_3:module_3_346"))
implementation(project(":layer_3:module_3_372"))
implementation(project(":layer_3:module_3_359"))
          }
