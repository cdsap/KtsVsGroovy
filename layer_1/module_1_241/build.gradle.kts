       plugins {
          id ("java-library")
          id ("maven-publish")
          id ("jacoco")
          id ("org.sonarqube") version "4.3.0.3225"
          id("awesome.kotlin.plugin")
       }
          dependencies {
             
implementation(project(":layer_0:module_0_13"))
implementation(project(":layer_0:module_0_81"))
implementation(project(":layer_0:module_0_23"))
implementation(project(":layer_0:module_0_47"))
implementation(project(":layer_0:module_0_1"))
implementation(project(":layer_0:module_0_6"))
implementation(project(":layer_0:module_0_2"))
implementation(project(":layer_0:module_0_36"))
implementation(project(":layer_0:module_0_7"))
          }
