# Proyecto Java - Múltiples Módulos

Este repositorio contiene diversos proyectos en Java organizados en módulos independientes. Cada módulo representa una aplicación o conjunto de ejercicios diseñados para practicar diferentes conceptos de programación en Java.

## Estructura del Proyecto

El proyecto está organizado en los siguientes módulos:

### **Ejercicio 1: Gestión de Estudiantes con List**

- Proyecto para gestionar estudiantes mediante una lista (`List`).
- Permite agregar, eliminar y buscar estudiantes dentro de una colección.
- Implementa el uso de estructuras de datos dinámicas en Java.
- Ubicación: `java-main/Ejercicio 1 Gestión de Estudiantes con List/`
- Archivo principal: `src/main/java/com/ejercicios/Main.java`
- **Clases principales:**
  - `Estudiante.java`: Clase que modela a un estudiante con atributos como nombre, edad y calificación.
  - `GestorEstudiantes.java`: Clase que gestiona la lista de estudiantes.
  - `Main.java`: Punto de entrada de la aplicación.

### **Cafetería**

- Proyecto que simula la gestión de una cafetería.
- Permite registrar pedidos, gestionar inventario y calcular totales de compra.
- Usa clases y objetos para modelar productos y ventas.
- Ubicación: `java-main/cafeteria/`
- Archivo principal: `src/main/java/cafeteriacom/example/Main.java`
- **Clases principales:**
  - `Producto.java`: Define los atributos de un producto en la cafetería.
  - `Pedido.java`: Representa un pedido con varios productos.
  - `Cafeteria.java`: Controla el flujo general de la cafetería.

### **Registro de Notas con Map**

- Manejo de estudiantes y notas utilizando un `Map`.
- Permite almacenar las calificaciones de los estudiantes y realizar consultas por nombre.
- Demuestra el uso de estructuras de datos asociativas en Java.
- Ubicación: `java-main/registro_de_notas_con_map/`
- Archivo principal: `src/main/java/com/ejercicio2/Main.java`
- **Clases principales:**
  - `NotasEstudiante.java`: Define la estructura de almacenamiento de notas.
  - `GestorNotas.java`: Implementa métodos para agregar y consultar notas.
  - `Main.java`: Ejecuta la lógica del programa.

### **Trabajo de Java - Talleres**

- Diferentes ejercicios de programación organizados por casos.
- Incluye problemas de lógica, manipulación de datos y estructuras de control.
- Ubicación: `java-main/trabajo-de-java-main/`
- Archivos principales: `src/main/java/trabajo/com/CaseX.java` (varios casos)
- **Casos de estudio:**
  - `Case1.java`: Implementación de un sistema de facturación.
  - `Case2.java`: Algoritmo de ordenamiento y búsqueda.
  - `Case3.java`: Validación de datos de entrada y manejo de excepciones.

### **Pruebas y Ejercicios en Java**

- Conjunto de archivos Java para probar diversas funcionalidades y conceptos.
- Incluye ejemplos de programación orientada a objetos, colecciones y más.
- Ubicación: `java-main/pruebas/demo/`
- Contiene archivos como:
  - `Clases.java`: Ejemplo de clases y objetos.
  - `Person.java`: Implementación de herencia y polimorfismo.
  - `Ejercicio.java`: Prácticas de estructuras condicionales y bucles.

## Requisitos

Para ejecutar los proyectos, asegúrate de tener instalado:

- [Java JDK 8 o superior](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Apache Maven](https://maven.apache.org/download.cgi)
- Un entorno de desarrollo como [IntelliJ IDEA](https://www.jetbrains.com/idea/) o [Eclipse](https://www.eclipse.org/)

## Cómo ejecutar

Cada módulo puede ejecutarse de manera independiente utilizando Maven:

```sh
cd java-main/nombre-del-modulo
mvn clean install
mvn exec:java -Dexec.mainClass="ruta.al.paquete.Main"
```

##

