       plugins {
          id ("java-library")
          id ("maven-publish")
          id ("jacoco")
          id ("org.sonarqube") version "4.3.0.3225"
          id("awesome.kotlin.plugin")
       }
          dependencies {
             
implementation(project(":layer_3:module_3_28"))
implementation(project(":layer_3:module_3_35"))
implementation(project(":layer_3:module_3_39"))
implementation(project(":layer_3:module_3_27"))
implementation(project(":layer_3:module_3_37"))
implementation(project(":layer_3:module_3_29"))
implementation(project(":layer_3:module_3_26"))
implementation(project(":layer_3:module_3_36"))
implementation(project(":layer_3:module_3_30"))
implementation(project(":layer_3:module_3_31"))
          }
