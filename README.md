# Asset Lending System & State Control (Java)

Este repositorio contiene un módulo de backend interactivo desarrollado en **Java**, diseñado para gestionar el inventario, el estado de disponibilidad y los flujos de préstamos de activos (en este caso modelado mediante un sistema de bibliotecas). El proyecto aplica de forma rigurosa las reglas de la **Programación Orientada a Objetos (POO)** para asegurar un control estricto de estados e impedir transacciones incongruentes en el inventario.

## 🚀 Características y Capacidades Técnicas

* **Modelado de Entidades Relacionales:** Diseño de clases cohesivas (como `Libro`, `Prestamo`) encapsulando atributos específicos como títulos, autores, códigos únicos e indicadores de stock.
* **Máquina de Estados de Disponibilidad:** Lógica transaccional encapsulada para operaciones de préstamo (`prestar()`) y devolución (`devolver()`), controlando que el número de ejemplares prestados nunca supere al stock disponible.
* **Encapsulamiento y Mutabilidad Controlada:** Protección absoluta de las propiedades de los objetos mediante modificadores de acceso privados, obligando a que cualquier cambio en el stock pase por filtros de validación de negocio.
* **Contadores de Transacciones:** Métodos integrados para llevar el registro acumulativo de operaciones procesadas con éxito por cada activo del sistema.

## 🛠️ Stack Tecnológico

* **Lenguaje Principal:** Java (JDK 8 / 11 / 17 o superior)
* **Paradigma:** Programación Orientada a Objetos (POO)
* **Estructuras de Almacenamiento:** ArrayList.
* **Entorno de Desarrollo:** VS Code.

## ⚙️ Principios de Ingeniería y Solución de Problemas

El núcleo de este software se diseñó resolviendo los problemas lógicos clásicos asociados a la persistencia temporal y la consistencia de inventarios:

1. **Prevención de Estados Inválidos:** Se cancelan y validan en el servidor las peticiones de préstamo si el contador de ejemplares disponibles es igual a cero, devolviendo alertas controladas y previniendo valores negativos de inventario.
2. **Cohesión Funcional:** La clase encargada de representar el activo contiene la responsabilidad matemática de alterar sus propios contadores, cumpliendo con el principio de que los datos y los métodos que los manipulan deben residir juntos.
3. **Modularidad Desacoplada:** Toda la lógica de negocio y cálculo está completamente aislada de la capa de entrada/salida de datos de la consola, dejando el backend preparado para integrarse a futuro con una base de datos relacional y una API REST (Spring Boot).

## 🔧 Configuración y Ejecución Local

Para compilar, clonar y poner a prueba este sistema transaccional localmente, sigue estos pasos:

1. **Clonar el repositorio:**
   ```bash
   git clone [https://github.com/longaresf/asset-lending-system-java.git](https://github.com/longaresf/asset-lending-system-java.git)
   ```
2. Ingresar al directorio de trabajo:
  Bash
  cd asset-lending-system-java

3. Compilación de Clases (Línea de comandos):
  Compila todos los archivos de origen de Java:

  Bash
  javac *.java

4. Ejecución del Programa:
  Inicia la clase principal que contiene la ejecución de pruebas por consola:

  Bash
  java Main
(Nota: Si tu clase raíz con el método public static void main se llama de otra forma, sustituye Main por su nombre exacto).

✒️ Autor

    Francisco Longares - Desarrollador Backend Java - longaresf
