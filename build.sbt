name := "sfa"

version := "1.0"

scalaVersion := "2.10.0"
 

 
libraryDependencies += "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test"



libraryDependencies += "org.apache.derby" % "derby" % "10.9.1.0"

testOptions in Test += Tests.Argument("-o")

 
 


 

 
 

 
