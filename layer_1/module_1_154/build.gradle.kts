       plugins {
          id ("java-library")
          id ("maven-publish")
          id ("jacoco")
          id ("org.sonarqube") version "4.3.0.3225"
          id("awesome.kotlin.plugin")
       }
          dependencies {
             
implementation(project(":layer_0:module_0_17"))
implementation(project(":layer_0:module_0_10"))
implementation(project(":layer_0:module_0_6"))
implementation(project(":layer_0:module_0_70"))
implementation(project(":layer_0:module_0_47"))
implementation(project(":layer_0:module_0_75"))
implementation(project(":layer_0:module_0_86"))
          }
