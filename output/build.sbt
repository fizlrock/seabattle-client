lazy val root = (project in file(".")).
  settings(
    organization := "dev.fizlrock",
    name := "seabattle-client",
    version := "2",
    scalaVersion := "2.11.4",
    scalacOptions ++= Seq("-feature"),
    javacOptions in compile ++= Seq("-Xlint:deprecation"),
    publishArtifact in (Compile, packageDoc) := false,
    resolvers += Resolver.mavenLocal,
    libraryDependencies ++= Seq(
      "com.squareup.retrofit2" % "retrofit" % "2.11.0" % "compile",
      "com.squareup.retrofit2" % "converter-scalars" % "2.11.0" % "compile",
      "com.squareup.retrofit2" % "converter-gson" % "2.11.0" % "compile",
      "io.swagger" % "swagger-annotations" % "1.5.21" % "compile",
      "org.apache.oltu.oauth2" % "org.apache.oltu.oauth2.client" % "1.0.1" % "compile",
      "io.gsonfire" % "gson-fire" % "1.9.0" % "compile",
      "jakarta.annotation" % "jakarta.annotation-api" % "1.3.5" % "compile",
      "org.junit.jupiter" % "junit-jupiter-api" % "5.10.3" % "test",
      "com.novocode" % "junit-interface" % "0.11" % "test"
    )
  )
