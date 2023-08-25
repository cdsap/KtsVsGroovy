       plugins {
          id ("java-library")
          id ("maven-publish")
          id ("jacoco")
          id ("org.sonarqube") version "4.3.0.3225"
          id("awesome.kotlin.plugin")
       }
          dependencies {
             
implementation(project(":layer_3:module_3_190"))
implementation(project(":layer_3:module_3_200"))
implementation(project(":layer_3:module_3_154"))
implementation(project(":layer_3:module_3_161"))
implementation(project(":layer_3:module_3_224"))
implementation(project(":layer_3:module_3_236"))
implementation(project(":layer_3:module_3_191"))
implementation(project(":layer_3:module_3_165"))
implementation(project(":layer_3:module_3_197"))
implementation(project(":layer_3:module_3_211"))
implementation(project(":layer_3:module_3_209"))
          }
