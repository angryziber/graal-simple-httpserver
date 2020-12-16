plugins {
   kotlin("jvm") version "1.4.21"
   id("com.palantir.graal") version "0.7.2"
}

repositories {
   jcenter()
}

dependencies {
   implementation(kotlin("stdlib"))
}

graal {
   graalVersion("20.3.0")
   mainClass("HttpServerKt")
   outputName("httpserv-kt")
   option("--enable-http")
}
