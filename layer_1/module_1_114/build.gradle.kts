       plugins {
          id ("java-library")
          id ("maven-publish")
          id ("jacoco")
          id ("org.sonarqube") version "4.3.0.3225"
          id("awesome.kotlin.plugin")
       }
          dependencies {
             
implementation(project(":layer_0:module_0_55"))
implementation(project(":layer_0:module_0_16"))
implementation(project(":layer_0:module_0_34"))
implementation(project(":layer_0:module_0_49"))
implementation(project(":layer_0:module_0_18"))
implementation(project(":layer_0:module_0_32"))
implementation(project(":layer_0:module_0_9"))
implementation(project(":layer_0:module_0_33"))
          }
