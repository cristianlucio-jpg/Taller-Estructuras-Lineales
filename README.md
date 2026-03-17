# Taller de Estructuras Lineales - Arreglos, Arraylist y Matrices

# Datos del Estudiante
-**Nombre:** Cristian Alexis Lucio Narvaez
-**Asignatura:** Estructuras de Datos Lineales
-**Profesor:** Manuel Arturo Melo Legarda

## Descripcion del Taller 
Este repositorio contiene la solucion completa al taller de **Estructuras de Datos Lineales** con ejercicios de Arreglos, Arraylist y Matrices.

## Estructura del Proyecto
Taller-Estructuras-Lineales/
│
├── src/
│   ├── arreglos/
│   │   ├── DiezPrimos.java
│   │   ├── CienPrimerosPares.java
│   │   ├── FactorialArreglo.java
│   │   ├── MinMaxArreglo.java.java
│   │   └── InvertirNumerosArreglo.java
│   │
│   ├── arraylist/
│   │   ├── ArrayListNumeros.java
│   │   ├── Ejercicio7.java
│   │   ├── Ejercicio8.java
│   │   ├── Ejercicio9.java
│   │   └── Ejercicio10.java
│   │
│   └── matrices/
│       ├── Ejercicio11.java
│       ├── Ejercicio12.java
│       ├── Ejercicio13.java
│       ├── Ejercicio14.java
│       └── Ejercicio15.java
│
├── README.md     
└── .gitignore

## Ejercicio 1: DiezPrimos
- **Class:** `DiezPrimos.java` 
- **Descripcion:**
Este programa genera 10 numeros aleatorios entre 1 y 100, los almacena en un arreglo unidimensional y determina cuales de esos numeros son primos.
-**¿Que hace el programa?**
1.Genera 10 numeros aleatorios.
2.Muestra todos los numeros generados.
3. Identifica y muestra los numeros primos.

### Ejercicio 2: CienPrimerosPares
- **Clase:** `CienPrimerosPares.java`
- **Descripcion del programa:**
    Este programa genera los primeros 100 numeros pares (2, 4, 6, ..., 200), los almacena en un arreglo unidimensional y los muestra en diferentes formatos segun lo solicita el el taller.

### **¿Que hace el programa?**
    1. Genera los primeros 100 numeros pares mediante una formula matematica.
    2. Almacena los numeros en un arreglo de 100 posiciones.
    3.Muestra los numeros en una sola linea separados por comas.
    4.Muestra los numeros en 10 lineas (10 numeros por linea) indicando el numero de linea.

### Ejercicio 3: FactorialArreglo

- **Clase:** `FactorialArreglo.java`
- **Descripcion del programa:**
Este programa solicita al usuario la cantidad de numeros a generar, crea un arreglo con numeros aleatorios entre 0 y 20, calcula el factorial de cada uno y almacena los resultados en un segundo arreglo. Finalmente, muestra ambos arreglos en consola.

### **¿Que hace el programa?**
1. pregunta al usuario  cuantos numeros desea generar.
2. Genera aleatoriamente esa cantidad de numeros de numeros entre 0 y 20.
3. Calcula el factorial de cada numero generado.
4. Almacena los factoriales en un arreglo separado.
5. Muestra el arreglo de numeros originales.
6. Muestra el arreglo de factoriales calculados.

### Ejercicio 4: MinMaxArreglo
- **Class:** `MinMaxArreglo.java`
- **Descripcion del programa:**
    Genera 25 numeros aleatorios entre -50 y 50, los almacena en un arreglo unidimensional, y encuentra el valor minimo y maximo del arreglo.

### **¿Que hace el programa?**
1. Genera 25 numeros aleatorios entre -50 y 50 (inclusion).
2. Almacena los numeros en un arreglo de 25 posiciones.
3. Encuentra el numero menor del arreglo.
4. Encuentra el numero mayor del arreglo 
5. Muestra el arreglo completo en formato de cuadricula 5*5.
6. Muestra los resultados (menor y mayor).

### Ejercicio 5: InvertirNumerosArreglo
- **Class:** `InvertirNumerosArreglo.java`
- **Descripcion del programa:**
Genera 20 numeeros aleatorios entre 1 y 999, invierte el orden de cada numero y guarda los resultados en un segundo arreglo. Muestra ambos arreglos.

### **¿Que hace el programa?**
1. Genera 20 numeros aleatorios entre 1 y 999.
2. Almacena los numeros en un arreglo original.
3. Invierte cada numero usando un algoritmo matematico.
4. Guarda los numeros invertidos en un segundo arreglo.
5. Muestra ambos arreglos en consola.


### Ejercicio 6: ArraylistNumeros
- **Clase:** `ArrayListNumeros.java` (en paquete `arraylist`)
- **Descripcion del programa:**
Genera numeros aleatorios entre -10 y 10, los almacena en un arrayList hasta que hasta que aparece el numero 10 (que no se incluye). Luego muestra los numeros generados, su suma y su media aritmetica.

### **¿Que hace el programa?**
1. Genera numeros aleatorios entre -10 y 10.
2. Almacena los números en un ArrayList hasta que aparece el numero 10.
3. Excluye el numero 10 de la lista (solo es condicion de parada).
4. Muestra todos los numero generados.
5. Calcula y muestra la suma total.
6. Calcula y muestra la media con 2 decimales.

### Ejercicio 7: ArrayListPares
- **Class:** `ArrayListPares.java` (en paquete `arraylist`)
- **Descripcion del programa:**
Inicializa un ArrayList con los primeros 20 numeros pares(2, 4, 6, ...,40) y permite insertar y eliminar numeros manteniendo el orden ascendente.

### **¿Que hace el programa?**
1. Inicializa un ArrayList con los primeros 20 numeros pares en orden ascendente.
2. Muestra el ArrayList original.
3. Solicita un numero al usuario y lo inserta en la posicion correcta(manteniendo el orden).
4. Muestra el ArrayList despues de la insercion.
5. Solicita un numero al usuario y lo elimina del ArrayList.
6. Muestra el ArrayList despues de la eliminacion.

### Ejercicio 8: FrecuenciaNumerosArrayList 
- **Clase:** `FrecuenciaNumerosArrayList.java` (en paquete `arraylist`)
- **Descripcion del programa:**
Genera 100 numeros aleatorios entre 1 y 20, los almacena en un ArrayList, cuenta la frecuencia de cada numero,  muestra una tabla con las frecuencias e identifica el numero mas repetido.

### **Que hace el programa?**
1. Genera 100 numeros aleatorios entre 1 y 20.
2. Almacena los numeros en un ArrayList.
3. Cuenta cuantas veces aparece cada numero del 1 al 20.
4. Muestra una tabla con cada numero y su frecuencia de aparicion.
5. Identifica el numero que se repite con mayor frecuencia 