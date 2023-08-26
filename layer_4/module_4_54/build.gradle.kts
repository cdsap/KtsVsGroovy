       plugins {
          id ("java-library")
          id ("maven-publish")
          id ("jacoco")
          id ("org.sonarqube") version "4.3.0.3225"
          id("awesome.kotlin.plugin")
       }
          dependencies {
             
implementation(project(":layer_3:module_3_28"))
implementation(project(":layer_3:module_3_33"))
implementation(project(":layer_3:module_3_37"))
implementation(project(":layer_3:module_3_26"))
implementation(project(":layer_3:module_3_31"))
implementation(project(":layer_3:module_3_40"))
implementation(project(":layer_3:module_3_39"))
implementation(project(":layer_3:module_3_32"))
          }
