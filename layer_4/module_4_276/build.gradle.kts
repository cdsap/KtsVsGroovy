       plugins {
          id ("java-library")
          id ("maven-publish")
          id ("jacoco")
          id ("org.sonarqube") version "4.3.0.3225"
          id("awesome.kotlin.plugin")
       }
          dependencies {
             
implementation(project(":layer_3:module_3_224"))
implementation(project(":layer_3:module_3_228"))
implementation(project(":layer_3:module_3_175"))
implementation(project(":layer_3:module_3_180"))
implementation(project(":layer_3:module_3_239"))
implementation(project(":layer_3:module_3_182"))
implementation(project(":layer_3:module_3_231"))
implementation(project(":layer_3:module_3_171"))
          }
