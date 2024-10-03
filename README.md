# Laboratorio 3: Construcción Automática de Proyectos

## Objetivo
Configurar y usar una herramienta de construcción automática de software en un proyecto personal, en el marco del curso de Ingeniería de Software I.

## Descripción
Este proyecto es una aplicación local en Java 17 que utiliza Maven como herramienta de construcción. Se ha inicializado un repositorio Git para el control de versiones y se han realizado los primeros commits.

## Contenido del Proyecto
- **Modelo de Construcción**: El archivo `pom.xml` es el modelo de construcción para el proyecto, que incluye:
  - **Información del Proyecto**:
    - Nombre: `mitocode-mod1-poo`
    - Versión: `1.0-SNAPSHOT`
    - Tipo de archivo: Configuración de Maven
  - **Opciones de Compilación**:
    - Compilador: Maven
    - Versión: 17 para `source` y `target`
    - Codificación de fuente: `UTF-8`
  - **Gestión de Dependencias**:
    - Biblioteca: `lombok`
    - Versión: `1.18.30`
    - Alcance: `provided`

- **Código Fuente**: Implementación del proyecto en Java.

## Herramienta de Construcción Utilizada
- **Maven**: Utilizado para la construcción y gestión de dependencias.