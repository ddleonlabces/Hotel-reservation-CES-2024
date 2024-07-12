@echo off
REM Comprueba que se ha pasado un parámetro
if "%1"=="" (
    echo Debes proporcionar el nombre de la rama.
    exit /b 1
)

REM Guarda el nombre de la rama en una variable
set BRANCH_NAME=%1

REM Cambia a la nueva rama
git checkout -b %BRANCH_NAME%

REM Obtén la fecha y hora actuales
for /f "tokens=1-5 delims=/: " %%d in ("%date% %time%") do (
    set YEAR=%%d
    set MONTH=%%e
    set DAY=%%f
    set HOUR=%%g
    set MINUTE=%%h
)

REM Crea el archivo test.txt con la fecha y hora
echo Contenido de prueba - Fecha: %YEAR%/%MONTH%/%DAY% %HOUR%:%MINUTE% > test.txt

REM Añade el archivo al índice
git add test.txt

REM Confirma los cambios
git commit -m "Agregar archivo test.txt con contenido de prueba y fecha y hora"

REM Envía la nueva rama al repositorio remoto
REM git push origin %BRANCH_NAME%

REM Lista las ramas disponibles 
git branch

