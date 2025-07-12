# CAE-X

## Descripción

CAE-X (Control de Actividades Estudiantiles) es un sistema de gestión académica desarrollado con OpenXava. Permite registrar actividades académicas y extracurriculares, administrar usuarios y generar reportes en PDF.

## Tecnologías

* Java 8+
* OpenXava
* MySQL
* iText PDF

## Estructura principal

* Módulo de usuarios con roles ADMIN, OPERADOR y ESTUDIANTE
* Registro y gestión de actividades con validación
* Generación de reportes con filtros por periodo

## Instalación

1. Clonar el repositorio.
2. Configurar `persistence.xml` con tus credenciales de MySQL.
3. Ejecutar script SQL para crear la base de datos `caex`.
4. Importar en OpenXava Studio o Eclipse.
5. Iniciar el servidor embebido.

## Credenciales de prueba

* admin/admin (ADMIN)
* operador/operador (OPERADOR)
* estudiante/estudiante (ESTUDIANTE)

## Resultados de pruebas

Se ejecutaron 15 casos de prueba con 100% de éxito. Ver informe `tests/Informe_Pruebas_CAE_X.pdf`.

## Licencia

Proyecto académico bajo licencia MIT.

## Contacto

Para soporte o mejoras: \[Tu Correo].
