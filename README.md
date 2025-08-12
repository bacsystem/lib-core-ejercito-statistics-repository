# lib-core-ejercito-statistics-repository

Módulo Java que implementa la **capa de persistencia** para la gestión y consulta de estadísticas en el sistema *
*Ejército**.  
Proporciona repositorios optimizados para lectura y escritura de datos estadísticos, con soporte para consultas
personalizadas y acceso reactivo.

## 📋 Características

- Implementación de repositorios bajo principios de **Clean Architecture** y **DDD**.
- Soporte para **consultas reactivas** con Spring Data.
- Operaciones CRUD optimizadas para grandes volúmenes de datos.
- Integración transparente con la capa de servicio.
- Mapeo de entidades con **JPA** (según configuración).

## 🛠 Requisitos

- **Java**: 11+
- **Maven**: 3.9.4
- Dependencias principales:
    - `spring-boot-starter-data-jpa`
    - `spring-boot-starter-validation`
    - `spring-boot-autoconfigure`
    - `org.projectlombok`
    - Driver de base de datos correspondiente (PostgreSQL/MySQL/Oracle)

## 📦 Instalación

```bash
mvn clean install
```

### Maven

```xml

<dependency>
    <groupId>pe.mil.ejercito.lib</groupId>
    <artifactId>lib-core-ejercito-statistics-repository</artifactId>
    <version>1.0.0</version>
</dependency>
```
