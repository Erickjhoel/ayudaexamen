/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author flotante
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Crear menu
        System.out.println("Introduce una opción:");
        System.out.println("Opcion 1.");
        System.out.println("Opción 2.");
        System.out.println("Opción 3.");
        System.out.println("Opcion 4.");
        System.out.println("Opción 5.");
        System.out.println("Opción 6.");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                ejercicio1(sc);
                break;
            case 2:
                ejercicio2(sc);
                break;
            case 3:
                ejercicio3(sc);
                break;
            case 4:
                ejercicio4(sc);
                break;
            case 5:
                ejercicio5(sc);
                break;
            case 6:
                ejercicio6(sc);
                break;
        }
    }

    public static void ejercicio1(Scanner sc) {
        //Se tienen dos arrays de 10 posiciones, uno con números y otro con las veces de cada posición, crea el array resultante.
        //declarar variables
        int indice = 0;
        int suma = 0;
        //Crear arrays
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] veces = {1, 2, 1, 2, 1, 2, 1, 2, 1, 2};
        //sumar las repeticiones para ver lo que mide el array y crear el nuevo array
        for (int i = 0; i < veces.length; i++) {
            suma += veces[i];
        }
        //declarar array final, los numeros y sus repeticiones
        int[] tabla = new int[suma];
        //recorrrer los array repitiendo si hay que repetir y giuardar en uno nuevo
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < veces[i]; j++) {
                tabla[indice] = numeros[i];
                indice++;
            }
        }
        //mostramos la tabla resultante
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("La tabla queda así: " + tabla[i]);
        }
    }

    public static void ejercicio2(Scanner sc) {
        //Crea un array de 15 espacios, pide 10 números, recorridos de dos en dos, guarda su suma en la siguiente posición, desplazando el resto del array para cada suma.

        //declarar variables
        int suma;
        int posicion = 2;
        //crear array
        int[] tabla = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0, 0, 0};
        //recorrer array       
        for (int i = 0; i < tabla.length; i++) {
            //sumar de dos en dos
            suma = tabla[i] + tabla[i + 1];
            //desplazamos una posicion el array
            for (int j = 13; j >= posicion; j--) {
                tabla[j + 1] = tabla[j];
            }
            posicion += 3;
            //insertamos el resultado en dos indices mas a lante de donde empezamos
            tabla[i + 2] = suma;
            //aumentamos el indice para empezar a sumar de nuevo desde la posicion 3
            i += 2;
        }
        //mostrar la tabla
        System.out.println("La tabla que así");
        for (int i = 0; i < tabla.length; i++) {
            System.out.print(tabla[i] + "-");
        }
        System.out.println("");
    }

    public static void ejercicio3(Scanner sc) {
        //Se tienen una barajas de 40 cartas, barajadas, guardar en un array la posición de las primeras cartas de cada valor.

        //declarar variables
        int posicion = 0;
        boolean comprobar = false;
        //inicializa un array de 40 cartas
        int[] mazo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] tabla = new int[10];
        //barajea los mazos
        barajarArray(mazo);
        //recorrrer array buscando las cartas del 1 al 10
        for (int i = 1; i <= 10; i++) {
            //recorrer el array buscando la 1ª posición de cada carta y paramos cuando la encuentre
            for (int j = 0; j < mazo.length && !comprobar; j++) {
                if (mazo[j] == i) {
                    tabla[i - 1] = j;

                    comprobar = true;
                }
            }
            comprobar = false;
        }

        //forma 2
        int encontrado = 0;
        for (int j = 0; j < mazo.length && encontrado < 10; j++) {
            if (tabla[mazo[j] - 1] == 0) {
                tabla[mazo[j] - 1] = j + 1;
                encontrado++;
            }
        }

        //mostrar las posiciones de las 10 cartas
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("El número " + (i + 1) + " está en la posición: " + tabla[i]);
        }
    }

    public static void ejercicio4(Scanner sc) {
        //Se tienen 3 arrays ordenados, crea otro con la unión de los tres, al final seguirá ordenado

        //declarar variables
        int indiceNumeros1 = 0;
        int indiceNumeros2 = 0;
        int indiceNumeros3 = 0;
        //Crear arrays
        int[] tabla1 = {1, 3, 5, 7, 9};
        int[] tabla2 = {2, 6, 12, 14, 15};
        int[] tabla3 = {4, 8, 10, 11, 13};
        int[] tablaFinal = new int[tabla1.length + tabla2.length + tabla3.length];

        //meter los tres array en uno nuevo de forma creciente
        for (int i = 0; i < tablaFinal.length; i++) {
            // se comprueba esto antes para evitar el 
            //indexOutOfBounds
            //cuando a una tabla aun le quedan numeros
            if ((indiceNumeros2 == 5) && (indiceNumeros3 == 5)) {
                tablaFinal[i] = tabla1[indiceNumeros1];
                indiceNumeros1++;
            } else if ((indiceNumeros1 == 5) && (indiceNumeros3 == 5)) {
                tablaFinal[i] = tabla2[indiceNumeros2];
                indiceNumeros2++;
            } else if ((indiceNumeros1 == 5) && (indiceNumeros2 == 5)) {
                tablaFinal[i] = tabla3[indiceNumeros3];
                indiceNumeros3++;
                //cuando 2 tablas le quedan numeros
            } else if ((indiceNumeros1 < 5) && (indiceNumeros2 < 5) && (indiceNumeros3 == 5)) {
                if (tabla1[indiceNumeros1] < tabla2[indiceNumeros2]) {
                    tablaFinal[i] = tabla1[indiceNumeros1];
                    indiceNumeros1++;
                } else if (tabla2[indiceNumeros2] < tabla1[indiceNumeros1]) {
                    tablaFinal[i] = tabla2[indiceNumeros2];
                    indiceNumeros2++;
                }
            } else if ((indiceNumeros1 < 5) && (indiceNumeros3 < 5) && (indiceNumeros2 == 5)) {
                if (tabla1[indiceNumeros1] < tabla3[indiceNumeros3]) {
                    tablaFinal[i] = tabla1[indiceNumeros1];
                    indiceNumeros1++;
                } else if (tabla3[indiceNumeros3] < tabla1[indiceNumeros1]) {
                    tablaFinal[i] = tabla3[indiceNumeros3];
                    indiceNumeros3++;
                }
            } else if ((indiceNumeros2 < 5) && (indiceNumeros3 < 5) && (indiceNumeros1 == 5)) {
                if (tabla2[indiceNumeros2] < tabla3[indiceNumeros3]) {
                    tablaFinal[i] = tabla2[indiceNumeros2];
                    indiceNumeros2++;
                } else if (tabla3[indiceNumeros3] < tabla2[indiceNumeros2]) {
                    tablaFinal[i] = tabla3[indiceNumeros3];
                    indiceNumeros3++;
                }
                //cuando las 3 tablas tienen numeros
            } else {
                if (tabla1[indiceNumeros1] < tabla2[indiceNumeros2] && tabla1[indiceNumeros1] < tabla3[indiceNumeros3]) {
                    tablaFinal[i] = tabla1[indiceNumeros1];
                    indiceNumeros1++;
                } else if (tabla2[indiceNumeros2] < tabla1[indiceNumeros1] && tabla2[indiceNumeros2] < tabla3[indiceNumeros3]) {
                    tablaFinal[i] = tabla2[indiceNumeros2];
                    indiceNumeros2++;
                } else if (tabla3[indiceNumeros3] < tabla1[indiceNumeros1] && tabla3[indiceNumeros3] < tabla2[indiceNumeros2]) {
                    tablaFinal[i] = tabla3[indiceNumeros3];
                    indiceNumeros3++;
                }
            }
        }
        //imprimir el resultado
        System.out.println("Los numeros ordenados son;");
        for (int i = 0; i < 15; i++) {
            System.out.println(tablaFinal[i]);
        }
    }

    public static void ejercicio5(Scanner sc) {
        //Se tiene una baraja de 40 cartas, barajadas, guardar en un array la posición de las últimas cartas de cada valor, 

        //declarar variables
        int posicion = 0;
        boolean comprobar = false;
        //inicializa un array de 40 cartas
        int[] mazo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] tabla = new int[10];
        //barajea los mazos
        barajarArray(mazo);
        //recorrrer array buscando las cartas del 1 al 10
        for (int i = 1; i <= 10; i++) {
            //recorrer la baraja desde la ultima carta a la primera y paramos cuando encuentre en este casa la ultima posicion
            for (int j = mazo.length - 1; j >= 0 && !comprobar; j--) {
                if (mazo[j] == i) {
                    tabla[posicion] = j;
                    posicion++;
                    comprobar = true;
                }
            }
            comprobar = false;
        }
        //mostrar las posiciones de las 10 cartas
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("El número " + (i + 1) + " su última posición es: " + tabla[i]);
        }
    }

    public static void ejercicio6(Scanner sc) {
        //Se tiene un array con 10 números, otro con longitud 9.
        //Pide los 10 numeros y las 9 operaciones, en el segundo array, valor 1 suma, 2 resta, 3 multiplica, 4 divide, en caso de Error indica que la operación nos e puede hacer. Recorre el primer array realizando la primera operación, el resto son el resultado acumulado operado con el siguiente número del array
        //Ej {1,2,3,4,5,6,7,8,9,10} y {1,3,3,1,2,2,1,1,2} el resultado sería 1+2*3*4+5-6-7+8+9-10 

        //declarar variables
        int resultadofinal;
        int indice = 0;
        //Crear arrays
        int[] tabla = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] operaciones = {1, 3, 3, 1, 2, 2, 1, 1, 2};
        //recorrer array tabla y el de operaciones segun el numero que haga una cosa
        resultadofinal = tabla[0];
        boolean error = false;
        for (int i = 1; i < tabla.length && !error; i++) {
            switch (operaciones[indice]) {
                case 1:
                    resultadofinal += tabla[i];
                    indice++;
                    break;
                case 2:
                    resultadofinal -= tabla[i];
                    indice++;
                    break;
                case 3:
                    resultadofinal *= tabla[i];
                    indice++;
                    break;
                case 4:
                    if (tabla[i] != 0) {
                        resultadofinal /= tabla[i];
                    } else {
                        error = true;
                    }
                    indice++;
                    break;
                default:
                    break;
            }
        }
        //imprimir el resultado final
        if (error) {
            System.out.println("divide by 0");
        } else {
            System.out.println("El resultado es: " + resultadofinal);
        }
    }

    public static void barajarArray(int[] array) {
        Random generadorNumerosAleatorios = new Random();
        int posicion;
        int posicion2;
        int swap;

        for (int i = 0; i < 20; i++) {
            posicion = generadorNumerosAleatorios.nextInt(array.length);
            posicion2 = generadorNumerosAleatorios.nextInt(array.length);
            swap = array[posicion];
            array[posicion] = array[posicion2];
            array[posicion2] = swap;
        }
    }
}
