# Juju Reto

Este pryecto contiene la solucion al reto de automatizacion web de JUJU que consta de 4 escenarios

## Requisitos Previos

Asegúrate de tener instalados los siguientes requisitos previos antes de comenzar:

- Java (jdk)
- Gradle
- IDE de su preferencia (Intellij,eclipse,etc)
- Git

## Instalación

1. Clona el repositorio:
   git clone https://github.com/AndresAutoDev/JujuReto.git

## Uso
Para la ejecucion de los diversos test automatizados se deben utilizar los siguientes tags:

- @Regresion : Ejecuta una regresion completa de todos los test automatizados
- @CataloRegresion :  Ejecuta todos los test automatizados del flujo de Catalogo
- @Catalog : Ejecuta unicamente el test que visualiza la seccion de catalogo
- @Products : Ejecuta unicamente el test que visualiza los productos destacados
- @LoguinRegresion : Ejecuta todos los test automatizados del flujo de loguin
- @HappyPathLoguin : Ejecuta unicamente el test del loguin exitoso
- @UnHappyPathLoguin : Ejecuta unicamente el test del loguin fallido
