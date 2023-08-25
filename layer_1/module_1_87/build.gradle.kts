       plugins {
          id ("java-library")
          id ("maven-publish")
          id ("jacoco")
          id ("org.sonarqube") version "4.3.0.3225"
          id("awesome.kotlin.plugin")
       }
          dependencies {
             
implementation(project(":layer_0:module_0_49"))
implementation(project(":layer_0:module_0_43"))
implementation(project(":layer_0:module_0_32"))
implementation(project(":layer_0:module_0_13"))
implementation(project(":layer_0:module_0_47"))
implementation(project(":layer_0:module_0_7"))
implementation(project(":layer_0:module_0_15"))
implementation(project(":layer_0:module_0_22"))
implementation(project(":layer_0:module_0_33"))
          }
