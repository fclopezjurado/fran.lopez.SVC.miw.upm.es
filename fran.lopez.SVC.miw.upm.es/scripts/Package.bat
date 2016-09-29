@echo off
set workspace=C:\Users\franlopez\Documents\M ster\Asignaturas\1.- Ingenier¡a Web. Visi¢n General (IWVG)\Pr cticas\2.- Control de Versiones\workspace\fran.lopez.SVC.miw.upm.es
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_92
set M2_HOME=C:\Program Files\apache-maven-3.3.9
set PATH=%PATH%;%JAVA_HOME%\bin;%M2_HOME%\bin
echo -----------------------------------------
echo . (C) MIW
echo -----------------------------------------
echo .
echo Workspace --- %workspace%
echo .
cd %workspace%
:: -ff, --fail-fast. Stop at first failure in command execution
echo ============ mvn -ff clean test (profile: develop) =========================================================================
echo .
call mvn -ff clean test 
if errorLevel 1 goto errorDevelop1
echo .
echo ============ call mvn -ff clean validate -Denvironment.type=preproduction (profile: preproduction) ================
echo .
call mvn -ff clean validate -Denvironment.type=preproduction
if errorLevel 1 goto errorDevelop2
echo .
echo ============ call mvn -ff compile test -Denvironment.type=preproduction (profile: preproduction) ================
echo .
call mvn -ff compile test -Denvironment.type=preproduction
if errorLevel 1 goto errorDevelop3
echo .
echo ============ call mvn -ff package -Denvironment.type=preproduction (profile: preproduction) ================
echo .
call mvn -ff package -Denvironment.type=preproduction
if errorLevel 1 goto errorDevelop4
pause
exit

:errorDevelop1
:errorDevelop2
:errorDevelop3
:errorDevelop4
echo .
echo ########  ERRORES...
pause