       plugins {
          id ("java-library")
          id ("maven-publish")
          id ("jacoco")
          id ("org.sonarqube") version "4.3.0.3225"
          id("awesome.kotlin.plugin")
       }
          dependencies {
             
implementation(project(":layer_0:module_0_60"))
implementation(project(":layer_0:module_0_26"))
implementation(project(":layer_0:module_0_65"))
implementation(project(":layer_0:module_0_76"))
implementation(project(":layer_0:module_0_10"))
implementation(project(":layer_0:module_0_18"))
implementation(project(":layer_0:module_0_59"))
implementation(project(":layer_0:module_0_44"))
implementation(project(":layer_0:module_0_90"))
implementation(project(":layer_0:module_0_13"))
          }
