       plugins {
          id ("java-library")
          id ("maven-publish")
          id ("jacoco")
          id ("org.sonarqube") version "4.3.0.3225"
          id("awesome.kotlin.plugin")
       }
          dependencies {
             
implementation(project(":layer_0:module_0_24"))
implementation(project(":layer_0:module_0_9"))
implementation(project(":layer_0:module_0_45"))
implementation(project(":layer_0:module_0_33"))
implementation(project(":layer_0:module_0_5"))
implementation(project(":layer_0:module_0_36"))
implementation(project(":layer_0:module_0_8"))
implementation(project(":layer_0:module_0_41"))
implementation(project(":layer_0:module_0_17"))
          }
