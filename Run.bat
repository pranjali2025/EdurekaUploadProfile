set projectLocation=C:\Users\pranj\eclipse-workspace\Edureka
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\Jars\*
java org.testng.TestNG %projectLocation%\testng.xml
pause