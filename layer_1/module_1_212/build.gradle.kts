       plugins {
          id ("java-library")
          id ("maven-publish")
          id ("jacoco")
          id ("org.sonarqube") version "4.3.0.3225"
          id("awesome.kotlin.plugin")
       }
          dependencies {
             
implementation(project(":layer_0:module_0_68"))
implementation(project(":layer_0:module_0_74"))
implementation(project(":layer_0:module_0_94"))
implementation(project(":layer_0:module_0_26"))
implementation(project(":layer_0:module_0_18"))
implementation(project(":layer_0:module_0_77"))
implementation(project(":layer_0:module_0_21"))
implementation(project(":layer_0:module_0_2"))
          }
