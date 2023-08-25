       plugins {
          id ("java-library")
          id ("maven-publish")
          id ("jacoco")
          id ("org.sonarqube") version "4.3.0.3225"
          id("awesome.kotlin.plugin")
       }
          dependencies {
             
implementation(project(":layer_0:module_0_41"))
implementation(project(":layer_0:module_0_17"))
implementation(project(":layer_0:module_0_10"))
implementation(project(":layer_0:module_0_24"))
implementation(project(":layer_0:module_0_25"))
implementation(project(":layer_0:module_0_12"))
implementation(project(":layer_0:module_0_36"))
implementation(project(":layer_0:module_0_43"))
implementation(project(":layer_0:module_0_31"))
implementation(project(":layer_0:module_0_21"))
          }
