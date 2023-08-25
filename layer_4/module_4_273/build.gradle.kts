       plugins {
          id ("java-library")
          id ("maven-publish")
          id ("jacoco")
          id ("org.sonarqube") version "4.3.0.3225"
          id("awesome.kotlin.plugin")
       }
          dependencies {
             
implementation(project(":layer_3:module_3_159"))
implementation(project(":layer_3:module_3_240"))
implementation(project(":layer_3:module_3_154"))
implementation(project(":layer_3:module_3_199"))
implementation(project(":layer_3:module_3_189"))
implementation(project(":layer_3:module_3_243"))
implementation(project(":layer_3:module_3_215"))
          }
