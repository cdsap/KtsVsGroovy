       plugins {
          id ("java-library")
          id ("maven-publish")
          id ("jacoco")
          id ("org.sonarqube") version "4.3.0.3225"
          id("awesome.kotlin.plugin")
       }
          dependencies {
             
implementation(project(":layer_0:module_0_33"))
implementation(project(":layer_0:module_0_25"))
implementation(project(":layer_0:module_0_36"))
implementation(project(":layer_0:module_0_31"))
implementation(project(":layer_0:module_0_51"))
implementation(project(":layer_0:module_0_1"))
implementation(project(":layer_0:module_0_23"))
implementation(project(":layer_0:module_0_20"))
          }
