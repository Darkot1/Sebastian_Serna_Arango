import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class consultas {
    Scanner scanner = new Scanner(System.in);

    public void consultasArrayslist(){

        /*Un ArrayList en Java es una clase de la colección del framework de Java que proporciona una implementación redimensionable de la interfaz List. A diferencia de los arrays tradicionales en Java, los ArrayLists pueden cambiar de tamaño dinámicamente cuando se añaden o eliminan elementos. 
         
        ********************Características principales de un ArrayList*******************

        Redimensionable: Su tamaño se ajusta automáticamente a medida que se añaden o eliminan elementos.
        Orden: Mantiene el orden de inserción de los elementos.
        Acceso por índice: Permite acceder a los elementos mediante índices.
        Duplicados: Permite elementos duplicados.
        Nulls: Permite elementos null.

        ******************Métodos comunes de ArrayList************************
        1.add(E e): Añade el elemento especificado al final de la lista.
        2.add(int index, E element): Inserta el elemento especificado en la posición especificada.
        3.get(int index): Retorna el elemento en la posición especificada.
        4.set(int index, E element): Reemplaza el elemento en la posición especificada con el elemento especificado.
        5.remove(int index): Elimina el elemento en la posición especificada.
        6.size(): Retorna el número de elementos en la lista.
        7.isEmpty(): Retorna true si la lista no contiene elementos.
        8.contains(Object o): Retorna true si la lista contiene el elemento especificado.
        9.clear(): Elimina todos los elementos de la lista

        Ejemplos de uso con diferentes tipos de datos
        */

        //ArraysList de string

        System.out.println("************************ARRAYLIST DE STRING************************");
        //Crear el arraylist llamado fruits

        ArrayList<String> fruits = new ArrayList<>();

        //Agregar elementos al arraylist
        fruits.add("Manzana");
        fruits.add("Banano");
        fruits.add("Mango");

        //Imprimir el arraylist 
        System.out.println("Frutas" + fruits);

        //Obtener un solo elemento
        String firstFruit = fruits.get(0);
        System.out.println(firstFruit);

        //Modificar un elemento
        fruits.set(1, "Pera(modificada)");
        System.out.println("la fruta se modifico a: "+ fruits);

        //Eliminar un elemento
        fruits.remove(2);
        System.out.println("Frutas despues de eliminar elemento: " + fruits);

        // Tamaño del ArrayList
        int size = fruits.size();
        System.out.println("Tamaño de la lista: " + size);

        System.out.println("************************ARRAYLIST DE INTEGER************************");
        
         // Crear un ArrayList de Integers
         ArrayList<Integer> numbers = new ArrayList<>();
        
         // Añadir elementos
         numbers.add(10);
         numbers.add(20);
         numbers.add(30);
         
         // Imprimir el ArrayList
         System.out.println("Numeros: " + numbers);
         
         // Obtener un elemento
         int firstNumber = numbers.get(0);
         System.out.println("Primero numero: " + firstNumber);
         
         // Modificar un elemento
         numbers.set(1, 25);
         System.out.println("Numeros despues de modificacion: " + numbers);
         
         // Eliminar un elemento
         numbers.remove(2);
         System.out.println("Numeros despues de eliminar: " + numbers);
         
         // Tamaño del ArrayList
         int size2 = numbers.size();
         System.out.println("Tamaño del arraylist numbers: " + size2);


        System.out.println("************************ARRAYLIST DE OBJECTOS************************");

        // Crear un ArrayList de Objects
        ArrayList<Object> mixedList = new ArrayList<>();
        
        // Añadir elementos de diferentes tipos
        mixedList.add("HOLA");
        mixedList.add(123);
        mixedList.add(45.67);
        mixedList.add(true);
        
        // Imprimir el ArrayList
        System.out.println("Lista: " + mixedList);
        
        // Obtener y mostrar cada elemento
        int count = 0;
        for (Object obj : mixedList) {
            count++;
            System.out.println("Elemento "+count+": " + obj);
        }
    }

    public void consultasMap(){

        /*Un Map en Java es una interfaz del framework de colecciones que representa una estructura de datos de pares clave-valor, donde cada clave es única y se asocia con exactamente un valor. Los Map no mantienen un orden específico de sus elementos y se implementan comúnmente mediante las clases HashMap, TreeMap, y LinkedHashMap
         
        **************Características principales de un Map*****************

        1:Pares clave-valor: Cada entrada en un Map es un par clave-valor.
        2:Claves únicas: No puede haber claves duplicadas en un Map.
        3:Acceso rápido: Los valores se pueden obtener rápidamente mediante sus claves.
        4:Orden: Dependiendo de la implementación, el orden de los elementos puede no estar garantizado (HashMap), estar ordenado por la clave (TreeMap) o mantener el orden de inserción (LinkedHashMap).
        
        ******************Métodos comunes de Map***************

        1:put(K key, V value): Añade una asociación clave-valor al mapa.
        2:get(Object key): Retorna el valor al cual está asignada la clave especificada.
        3:remove(Object key): Elimina la asociación para la clave especificada.
        4:size(): Retorna el número de asociaciones clave-valor en el mapa.
        5:isEmpty(): Retorna true si el mapa no contiene asociaciones clave-valor.
        6:containsKey(Object key): Retorna true si el mapa contiene una asociación para la clave especificada.
        7:containsValue(Object value): Retorna true si el mapa contiene una o más claves para el valor especificado.
        8:clear(): Elimina todas las asociaciones del mapa.
        9:keySet(): Retorna un conjunto de todas las claves contenidas en el mapa.
        10:values(): Retorna una colección de todos los valores contenidos en el mapa.
        11:entrySet(): Retorna un conjunto de todas las asociaciones clave-valor contenidas en el mapa.
        Ejemplos de uso con diferentes tipos de datos

        */
        System.out.println("********************HASMAP DE STRING A STRING************************");
         // Crear un HashMap de String a String
        Map<String, String> countries = new HashMap<>();
        
        // Añadir elementos
        countries.put("USA", "Washington D.C.");
        countries.put("France", "Paris");
        countries.put("Japan", "Tokyo");
        
        // Obtener el tamaño del mapa
        System.out.println("Tamaño: " + countries.size());
        
        // Comprobar si el mapa contiene una clave
        boolean containsUSA = countries.containsKey("USA");
        System.out.println("USA contiene: " + containsUSA);
        
        // Comprobar si el mapa contiene un valor
        boolean containsParis = countries.containsValue("Paris");
        System.out.println("Paris contiene: " + containsParis);
        
        // Eliminar un elemento
        countries.remove("Japan");
        System.out.println("Ciudades despues de eliminar: " + countries);
        
        // Limpiar el mapa
        countries.clear();
        System.out.println("Ciudades despues de limpiar: " + countries);

        System.out.println("******************HASHMAP STRING Y INTEGER*******************");

         // Crear un HashMap de Integer a String
         Map<Integer, String> students = new HashMap<>();
        
         // Añadir elementos
         students.put(1, "Andrea");
         students.put(2, "Juan");
         students.put(3, "Mario");
         
         // Imprimir el HashMap
         System.out.println("Estudiantes: " + students);
         
         // Obtener un valor
         String student1 = students.get(1);
         System.out.println("estudiante 1: " + student1);
         
         // Modificar un valor
         students.put(2, "Maria");
         System.out.println("Estudiantes despues de la modificacion: " + students);
         
         // Eliminar un elemento
         students.remove(3);
         System.out.println("Estudiantes despues de eliminar: " + students);
         
         // Tamaño del HashMap
         int size = students.size();
         System.out.println("Tamaño del mapa: " + size);

        System.out.println("*****************HASHMAP DE STRING A OBJETOS****************");

         // Crear un HashMap de String a Object
         Map<String, Object> mixedMap = new HashMap<>();
        
         // Añadir elementos de diferentes tipos
         mixedMap.put("Nombre", "Nicolas");
         mixedMap.put("Años", 30);
         mixedMap.put("Salario", 50000.75);
         mixedMap.put("EstaCasado", true);
         
         // Imprimir el HashMap
         System.out.println("Map mezclado: " + mixedMap);
         
         // Obtener y mostrar cada valor
         for (Map.Entry<String, Object> entry : mixedMap.entrySet()) {
             System.out.println("Llave: " + entry.getKey() + ", Valor: " + entry.getValue());
            }

    }
    public void consultasOPP(){
        System.out.println("**************POO O OPP*******************");
        
        /*El paradigma de la programación orientada a objetos (POO) se basa en cuatro pilares fundamentales: encapsulamiento, abstracción, herencia y polimorfismo. Estos pilares proporcionan un marco para diseñar y desarrollar software modular, reutilizable y mantenible. */

        System.out.println("******************Encapsulamiento******************");

        /*El encapsulamiento es el proceso de agrupar datos (atributos) y métodos (funciones) que operan sobre esos datos en una sola unidad o clase. Además, restringe el acceso directo a algunos de los componentes de un objeto, lo que permite ocultar la representación interna del objeto y proteger su integridad.

        *****************Beneficios del encapsulamiento:*****************************

        Protección de datos: Los datos se mantienen seguros y no pueden ser modificados directamente desde fuera de la clase.
        Modularidad: Facilita la división del programa en partes independientes que pueden desarrollarse, probarse y mantener por separado.
        Flexibilidad: Permite modificar la implementación interna de una clase sin afectar a otras partes del programa que utilizan la clase. */

        persona persona = new persona(null, 0);
        persona.getName();


        System.out.println("*****************************Abstracción**********************");

        /*La abstracción es el proceso de simplificar sistemas complejos mediante la reducción y ocultación de detalles innecesarios, exponiendo solo las funcionalidades esenciales. Esto se logra definiendo clases y objetos que representan conceptos o entidades del mundo real, destacando sus características relevantes y omitiendo las irrelevantes.

        ***********************Beneficios de la abstracción:*******************************

        Simplificación: Reduce la complejidad del software, permitiendo a los desarrolladores concentrarse en el comportamiento de alto nivel.
        Reusabilidad: Facilita la creación de componentes reutilizables y genéricos. */

        Dog animal = new Dog();// Método heredado
        animal.makeSound(); // Método de la subclase

        
        System.out.println("****************Herencia*******************************");

        /*La herencia es un mecanismo mediante el cual una clase (subclase) puede heredar campos y métodos de otra clase (superclase). Esto promueve la reutilización del código y establece una relación jerárquica entre clases.

        ********************************Beneficios de la herencia:************************************

        Reutilización del código: Permite utilizar y extender el comportamiento de clases existentes.
        Mantenimiento: Facilita el mantenimiento del software, ya que las modificaciones en la superclase se propagan a las subclases. */


        System.out.println("****************POLIMORFISMO************************");


        /*El polimorfismo permite que un objeto de una clase se comporte como si fuera de otra clase, generalmente a través de la herencia. En otras palabras, los métodos pueden tomar muchas formas, permitiendo a una clase derivada utilizar métodos de la clase base de maneras específicas o redefinidas.

        ***************************************Beneficios del polimorfismo:*******************************

        Flexibilidad y extensibilidad: Facilita la extensión del código y permite la implementación de métodos específicos en las subclases.
        Intercambiabilidad: Los objetos pueden ser tratados de manera uniforme, permitiendo el uso de técnicas de programación más genéricas. */

        animal myDog = new Dog();
        animal myCat = new Cat();

        myDog.makeSound();
        myCat.makeSound();


    }

}
