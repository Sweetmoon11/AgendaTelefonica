Proyecto: Agenda Telefónica en Java

Este proyecto es un simulador de una agenda de contactos desarrollado como parte de mi aprendizaje en el Diplomado de Java. El objetivo principal fue poner en práctica la gestión de arreglos de objetos y la lógica de búsqueda en memoria.
🛠️ Funcionalidades

El sistema permite realizar las siguientes operaciones:

    Registrar Contactos: Almacena un objeto de tipo Contacto en un vector con capacidad para 10 registros.

    Listar Agenda: Recorre el vector y muestra todos los contactos almacenados, omitiendo los espacios vacíos.

    Buscar por Nombre: Permite encontrar el número telefónico de una persona específica (búsqueda insensible a mayúsculas/minúsculas).

    Consultar Disponibilidad: Informa cuántos espacios libres quedan en la agenda antes de que se llene.

🧠 Conceptos de Programación Aplicados

Para este ejercicio, implementé los siguientes pilares de la Programación Orientada a Objetos:

    Encapsulamiento: Uso de atributos privados con sus respectivos Getters y Setters.

    Arreglos de Objetos: Manejo de un vector de tipo Contacto[] para la persistencia temporal de datos.

    Ciclos For-Each: Implementación de bucles mejorados para un código más limpio y legible.

    Manejo de Nulos: Validación de posiciones vacías en el arreglo para evitar errores de ejecución (NullPointerException).

📂 Estructura del Código

El proyecto está organizado bajo el paquete agenda (o el nombre que hayas elegido):

    Contacto.java: Clase modelo con los atributos nombre y numero.

    Agenda.java: Clase que contiene la lógica de negocio y el vector de contactos.

    Principal.java: Clase encargada de ejecutar y demostrar el funcionamiento del sistema.
