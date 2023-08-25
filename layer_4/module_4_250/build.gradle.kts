       plugins {
          id ("java-library")
          id ("maven-publish")
          id ("jacoco")
          id ("org.sonarqube") version "4.3.0.3225"
          id("awesome.kotlin.plugin")
       }
          dependencies {
             
implementation(project(":layer_3:module_3_243"))
implementation(project(":layer_3:module_3_239"))
implementation(project(":layer_3:module_3_159"))
implementation(project(":layer_3:module_3_234"))
implementation(project(":layer_3:module_3_212"))
implementation(project(":layer_3:module_3_241"))
implementation(project(":layer_3:module_3_173"))
implementation(project(":layer_3:module_3_200"))
          }
