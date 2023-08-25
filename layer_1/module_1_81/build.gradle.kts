       plugins {
          id ("java-library")
          id ("maven-publish")
          id ("jacoco")
          id ("org.sonarqube") version "4.3.0.3225"
          id("awesome.kotlin.plugin")
       }
          dependencies {
             
implementation(project(":layer_0:module_0_55"))
implementation(project(":layer_0:module_0_41"))
implementation(project(":layer_0:module_0_10"))
implementation(project(":layer_0:module_0_22"))
implementation(project(":layer_0:module_0_45"))
implementation(project(":layer_0:module_0_26"))
implementation(project(":layer_0:module_0_27"))
implementation(project(":layer_0:module_0_43"))
          }
