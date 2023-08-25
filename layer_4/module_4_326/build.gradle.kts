       plugins {
          id ("java-library")
          id ("maven-publish")
          id ("jacoco")
          id ("org.sonarqube") version "4.3.0.3225"
          id("awesome.kotlin.plugin")
       }
          dependencies {
             
implementation(project(":layer_3:module_3_161"))
implementation(project(":layer_3:module_3_199"))
implementation(project(":layer_3:module_3_206"))
implementation(project(":layer_3:module_3_201"))
implementation(project(":layer_3:module_3_164"))
implementation(project(":layer_3:module_3_204"))
implementation(project(":layer_3:module_3_175"))
implementation(project(":layer_3:module_3_218"))
          }
