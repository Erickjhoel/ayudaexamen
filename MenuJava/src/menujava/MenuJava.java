/*
1. Leer 5 números y mostrarlos en el mismo orden introducido. 
2. Leer 5 números y mostrarlos en orden inverso al introducido. 
3. Leer 5 números por teclado y a continuación realizar la media de los números positivos, la media de los negativos y contar el número de ceros. 
4. Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo, el penúltimo, el tercero, etc. 
5. Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la forma: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc. 
6. Leer los datos correspondiente a dos tablas de 12 elementos numéricos, y mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc. 
7. Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos si los números están ordenados de forma creciente, decreciente, o si están desordenados. 
8. Diseñar una aplicación que declare una tabla de 10 elementos enteros. Leer mediante el teclado 8 números. Después se debe pedir un número y una posición, insertarlo en la posición indicada, desplazando los que estén detrás. 
9. Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace una posición hacia abajo (el último pasa a ser el primero).
10. Ídem, desplazar N posiciones (N es introducido por el usuario). 
11. Leer 5 elementos numéricos que se introducirán ordenados de forma creciente. Éstos los guardaremos en una tabla de tamaño 10. Leer un número N, e insertarlo en el lugar adecuado para que la tabla continúe ordenada. 
12. Leer por teclado una tabla de 10 elementos numéricos enteros y leer una posición (entre 0 y 9). Eliminar el elemento situado en la posición dada sin dejar huecos. 
13. Leer 10 enteros. Guardar en otra tabla los elementos pares de la primera, y a continuación los elementos impares. Realizar dos versiones: una trabajando con los valores y otra trabajando con los índices. 
14. Leer dos series de 10 enteros, que estarán ordenados crecientemente. Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados. 
15. Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla. Se debe mostrar la posición en que se encuentra. Si no está, indicarlo con un mensaje. 
16. Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo. Cada grupo (o clase) está compuesto por 5 alumnos. Se pide leer las notas del primer, segundo y tercer trimestre de un grupo. Debemos mostrar al final: la nota media del grupo en cada trimestre, y la media del alumno que se encuentra en la posición N (N se lee por teclado). 
17. con dos barajas de 10 cartas, barajéalas, vete sacando una carta de cada mazo, y cuenta los puntos para sacar el mazo ganador.
 */
package menujava;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Yo(creo)
 */
public class MenuJava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elije el numero de ejercicio del 1 al 17, los enunciados son:\n"
                + "1. Leer 5 números y mostrarlos en el mismo orden introducido. \n"
                + "2. Leer 5 números y mostrarlos en orden inverso al introducido. \n"
                + "3. Leer 5 números por teclado y a continuación realizar la media de los números positivos, la media de los negativos y contar el número de ceros. \n"
                + "4. Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo, el penúltimo, el tercero, etc. \n"
                + "5. Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la forma: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc. \n"
                + "6. Leer los datos correspondiente a dos tablas de 12 elementos numéricos, y mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc. \n"
                + "7. Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos si los números están ordenados de forma creciente, decreciente, o si están desordenados. \n"
                + "8. Diseñar una aplicación que declare una tabla de 10 elementos enteros. Leer mediante el teclado 8 números. Después se debe pedir un número y una posición, insertarlo en la posición indicada, desplazando los que estén detrás. \n"
                + "9. Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace una posición hacia abajo (el último pasa a ser el primero).\n"
                + "10. Ídem, desplazar N posiciones (N es introducido por el usuario). \n"
                + "11. Leer 5 elementos numéricos que se introducirán ordenados de forma creciente. Éstos los guardaremos en una tabla de tamaño 10. Leer un número N, e insertarlo en el lugar adecuado para que la tabla continúe ordenada. \n"
                + "12. Leer por teclado una tabla de 10 elementos numéricos enteros y leer una posición (entre 0 y 9). Eliminar el elemento situado en la posición dada sin dejar huecos. \n"
                + "13. Leer 10 enteros. Guardar en otra tabla los elementos pares de la primera, y a continuación los elementos impares. Realizar dos versiones: una trabajando con los valores y otra trabajando con los índices. \n"
                + "14. Leer dos series de 10 enteros, que estarán ordenados crecientemente. Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados. \n"
                + "15. Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla. Se debe mostrar la posición en que se encuentra. Si no está, indicarlo con un mensaje. \n"
                + "16. Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo. Cada grupo (o clase) está compuesto por 5 alumnos. Se pide leer las notas del primer, segundo y tercer trimestre de un grupo. Debemos mostrar al final: la nota media del grupo en cada trimestre, y la media del alumno que se encuentra en la posición N (N se lee por teclado). \n"
                + "17. con dos barajas de 10 cartas, barajéalas, vete sacando una carta de cada mazo, y cuenta los puntos para sacar el mazo ganador.");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                ejercicio1y2(sc);
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
            case 7:
                ejercicio7(sc);
                break;
            case 8:
                ejercicio8(sc);
                break;
            case 9:
                ejercicio9(sc);
                break;
            case 10:
                ejercicio10(sc);
                break;
            case 11:
                ejercicio11(sc);
                break;
            case 12:
                ejercicio12(sc);
                break;
            case 13:
                ejercicio13(sc);
                break;
            case 14:
                ejercicio14(sc);
                break;
            case 15:
                ejercicio15(sc);
                break;
            case 16:
                ejercicio16(sc);
                break;
            case 17:
                ejercicio17(sc);
                break;
            default:
                System.out.println("opcion no valida");
        }
    }

    public static void ejercicio1y2(Scanner sc) {
        System.out.println("Has elegido el 1: Leer 5 números y mostrarlos en el mismo orden introducido.");
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el numero " + (i + 1));
            array[i] = sc.nextInt();
        }
        recorrer(array);
        System.out.println("los numeros que has escrito son:");        
    }
    public static void ejercicio3(Scanner sc) {
        System.out.println("Has elegido el 3: Leer 5 números por teclado y a continuación realizar la media de los números positivos, la media de los negativos y contar el número de ceros. ");
        int npos = 0;
        int nneg = 0;
        int ceros = 0;
        int mediapos = 0;
        int medianeg = 0;
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el numero " + (i + 1));
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                npos++;
                mediapos = mediapos + numeros[i];
            } else if (numeros[i] < 0) {
                nneg++;
                medianeg = medianeg + numeros[i];
            } else if (numeros[i] == 0) {
                ceros++;
            }
        }
        if (npos > 0) {
            System.out.println("La media de los positivos es " + (mediapos / npos));
        } else {
            System.out.println("No hay numeros positivos para hacer media");
        }
        if (nneg > 0) {
            System.out.println("La media de los numeros negativos es " + (medianeg / nneg));
        } else {
            System.out.println("No hay numeros negativos para hacer media");
        }
        System.out.println("El numero de ceros escritos es " + ceros);
    }
    public static void ejercicio4(Scanner sc) {
        System.out.println("Has elegido el 4: Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo, el penúltimo, el tercero, etc. ");
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el numero " + (i + 1));
            numeros[i] = sc.nextInt();
        }
        for (int i = 0, j = numeros.length - 1; i < 5; i++, j--) {
            System.out.println(numeros[i]);
            System.out.println(numeros[j]);
        }
    }
    public static void ejercicio5(Scanner sc) {
        System.out.println("Has elegido el 5: Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la forma: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc. ");
        int[] numeros1 = new int[10];
        int[] numeros2 = new int[10];
        int[] numerosMezcla = new int[20];
        for (int i = 0; i < numeros1.length; i++) {
            System.out.println("Introduce el numero " + (i + 1) + " de la primera tabla");
            numeros1[i] =sc.nextInt();
        }
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println("Introduce el numero " + (i + 1) + " de la segunda tabla");
            numeros2[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros1.length; i++) {
            numerosMezcla[i * 2] = numeros1[i];
            numerosMezcla[i * 2 + 1] = numeros2[i];
        }
        for (int i = 0; i < numerosMezcla.length; i++) {
            System.out.println(numerosMezcla[i]);
        }
    }
    public static void ejercicio6(Scanner sc) {
        System.out.println("Has elegido el 6: Leer los datos correspondiente a dos tablas de 12 elementos numéricos, y mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc. ");
        int[] numeros1 = new int[12];
        int[] numeros2 = new int[12];
        int[] numerosMezcla = new int[24];

        for (int i = 0; i < numeros1.length; i++) {
            System.out.println("Introduce el numero " + (i + 1) + " de la primera tabla");
            numeros1[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println("Introduce el numero " + (i + 1) + " de la segunda tabla");
            numeros2[i] = sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                numerosMezcla[2 * i * 3 + j] = numeros1[i * 3 + j];
            }
            for (int j = 0; j < 3; j++) {
                numerosMezcla[2 * i * 3 + j + 3] = numeros2[i * 3 + j];
            }
        }
        for (int i = 0; i < numerosMezcla.length; i++) {
            System.out.println(numerosMezcla[i]);
        }
    }
    public static void ejercicio7(Scanner sc) {
        System.out.println("Has elegido el 7: Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos si los números están ordenados de forma creciente, decreciente, o si están desordenados. ");
        int[] numeros = new int[10];
        boolean creciente = true;
        boolean decreciente = true;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el numero " + (i + 1));
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] < numeros[i + 1]) {
                decreciente = false;
            } else if (numeros[i] > numeros[i + 1]) {
                creciente = false;
            }
        }
        if (creciente) {
            System.out.println("Estan ordenados crecientemente");
        } else if (decreciente) {
            System.out.println("Estan ordenados decrecientemente");
        } else if (!decreciente && !creciente) {
            System.out.println("Estan desordenados");
        }
    }
    public static void ejercicio8(Scanner sc) {
        System.out.println("Has elegido el 8: Diseñar una aplicación que declare una tabla de 10 elementos enteros. Leer mediante el teclado 8 números. Después se debe pedir un número y una posición, insertarlo en la posición indicada, desplazando los que estén detrás. ");
        int[] numeros = new int[10];
        for (int i = 0; i < 8; i++) {
            System.out.println("Introduce el numero " + (i + 1));
            numeros[i] = sc.nextInt();
        }
        System.out.println("introduce la posicion donde vas a meter tu numero");
        int n = sc.nextInt();
        System.out.println("ahora introduce la posicion donde quieres meter ese numero");
        int p = sc.nextInt();
        for (int i = 7; i >= p; i--) {
            numeros[i + 1] = numeros[i];
        }
        numeros[p] = n;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
    public static void ejercicio9(Scanner sc) {
        System.out.println("Has elegido el 9: Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace una posición hacia abajo (el último pasa a ser el primero).");
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el numero " + (i + 1));
            numeros[i] = sc.nextInt();
        }
        desplazar(numeros);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
    public static void ejercicio10(Scanner sc) {
        System.out.println("Has elegido el 10: Ídem, desplazar N posiciones (N es introducido por el usuario). ");
        int[] numeros1 = new int[10];
        for (int i = 0; i < numeros1.length; i++) {
            System.out.println("Introduce el numero " + (i + 1));
            numeros1[i] = sc.nextInt();
        }
        desplazarn(numeros1);
        for (int i = 0; i < numeros1.length; i++) {
            System.out.println(numeros1[i]);
        }
    }
    public static void ejercicio11(Scanner sc) {
        System.out.println("Has elegido el 11: Leer 5 elementos numéricos que se introducirán ordenados de forma creciente. Éstos los guardaremos en una tabla de tamaño 10. Leer un número N, e insertarlo en el lugar adecuado para que la tabla continúe ordenada. ");
        int[] numeros = new int[10];
        int entra;
        int sale;
        boolean comprobar = true;
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce el numero " + (i + 1));
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            if ((numeros[i] == numeros[(i + 1)])
                    || (numeros[i] > numeros[(i + 1)])) {
                comprobar = false;
            }
        }
        if (!comprobar) {
            System.out.println("Tienes que poner los numeros en orden ascendente, ahora a rehacer todo.");
        } else {
            System.out.println("introduzca el numero nuevo a colocar");
            int n = sc.nextInt();
            entra = n;
            if (numeros[4] < n) {
                numeros[5] = n;
            } else {
                int posicion;
                for (posicion = 0; posicion < 5
                        && n < numeros[posicion]; posicion++) {
                }
                entra = n;
                for (int i = posicion; i < 5; i++) {
                    sale = numeros[i];
                    numeros[i] = entra;
                    entra = sale;
                }
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
    public static void ejercicio12(Scanner sc) {
        System.out.println("Has elegido el 12: Leer por teclado una tabla de 10 elementos numéricos enteros y leer una posición (entre 0 y 9). Eliminar el elemento situado en la posición dada sin dejar huecos. ");
        int[] numeros = new int[10];
        int entra;
        int sale;
        int pos;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el numero " + (i + 1));
            numeros[i] = sc.nextInt();
        }
        System.out.println("introduce la posicion a borrar (0-9)");
        pos = sc.nextInt();
        for (int i = pos; i < numeros.length - 1; i++) {
            numeros[i] = numeros[i + 1];
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
    public static void ejercicio13(Scanner sc) {
        System.out.println("Has elegido el 13: Leer 10 enteros. Guardar en otra tabla los elementos pares de la primera, y a continuación los elementos impares. Realizar dos versiones: una trabajando con los valores y otra trabajando con los índices. ");
        int[] numeros = new int[10];
        int numpar = 0;
        int numimpar = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el numero " + (i + 1));
            numeros[i] = sc.nextInt();
            if ((numeros[i] % 2) == 0) {
                numpar++;
            } else {
                numimpar++;
            }
        }
        int[] pares = new int[numpar];
        int[] impares = new int[numimpar];
        int indicePar = 0;
        int indiceImpar = 0;
        System.out.println("Si lo quieres con valores, apriete 1, si lo quieres con indices, apriete 2, si quieres que no te funcione, apriete otra cosa");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                for (int i = 0; i < numeros.length; i++) {
                    if ((numeros[i] % 2) == 0) {
                        pares[indicePar] = numeros[i];
                        indicePar++;
                    } else {
                        impares[indiceImpar] = numeros[i];
                        indiceImpar++;
                    }
                }
                System.out.println("los numeros pares son:");
                for (int i = 0; i < pares.length; i++) {
                    System.out.println(pares[i]);
                }
                System.out.println("y los impares son:");
                for (int i = 0; i < impares.length; i++) {
                    System.out.println(impares[i]);
                }
                break;
            case 2:
                for (int i = 0; i < 10; i++) {
                    if ((numeros[i] % 2) == 0) {
                        pares[indicePar] = i;
                        indicePar++;
                    } else {
                        impares[indiceImpar] = i;
                        indiceImpar++;
                    }
                }
                System.out.println("los numeros pares son:");
                for (int i = 0; i < numpar; i++) {
                    System.out.println(numeros[pares[i]]);
                }
                System.out.println("y los impares son:");
                for (int i = 0; i < numimpar; i++) {
                    System.out.println(numeros[impares[i]]);
                }
                break;
            default:
                System.out.println("Pues no funciona");
                break;
        }
    }
    public static void ejercicio14(Scanner sc) {
        System.out.println("Has elegido el 14: 14. Leer dos series de 10 enteros, que estarán ordenados crecientemente. Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados. ");
        int[] numeros1 = new int[10];
        int[] numeros2 = new int[10];
        int[] numfinal = new int[20];
        int indiceNumeros1 = 0;
        int indiceNumeros2 = 0;
        boolean comprobar = true;
        for (int i = 0; i < numeros1.length; i++) {
            System.out.println("Introduce el numero " + (i + 1));
            numeros1[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println("Introduce el numero " + (i + 1));
            numeros2[i] = sc.nextInt();
        }
        // esto comprueba que etsa ordeadnro
        for (int i = 0; i < 9; i++) {
            if (numeros1[i] == numeros1[(i + 1)]) {
                comprobar = false;
            } else if (numeros1[i] > numeros1[(i + 1)]) {
                comprobar = false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (numeros2[i] == numeros2[(i + 1)]) {
                comprobar = false;
            } else if (numeros2[i] > numeros2[(i + 1)]) {
                comprobar = false;
            }
        }
        if (!comprobar) {
            System.out.println("Alguna de las dos listas no esta en orden ascendente, a rehacer todo.");
        } else {
            for (int i = 0; i < 20; i++) {
                // se comprueba esto antes para evitar el 
                //indexOutOfBounds
                if ((indiceNumeros2 > 9)) {
                    numfinal[i]
                            = numeros1[indiceNumeros1];
                    indiceNumeros1++;
                } else if ((indiceNumeros1 > 9)) {
                    numfinal[i]
                            = numeros2[indiceNumeros2];
                    indiceNumeros2++;
                } else if (numeros1[indiceNumeros1]
                        < numeros2[indiceNumeros2]) {
                    numfinal[i]
                            = numeros1[indiceNumeros1];
                    indiceNumeros1++;
                } else {
                    numfinal[i] = numeros2[indiceNumeros2];
                    indiceNumeros2++;
                }
            }
        }
        System.out.println("los numeros ordenados son;");
        for (int i = 0; i < 20; i++) {
            System.out.println(numfinal[i]);
        }
    }
    public static void ejercicio15(Scanner sc) {
        System.out.println("Has elegido el 15: Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla. Se debe mostrar la posición en que se encuentra. Si no está, indicarlo con un mensaje. ");
        int[] numeros = new int[10];
        int busqueda;
        int posicion = 20;
        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el numero " + (i + 1));
            numeros[i] = sc.nextInt();
        }
        System.out.println("introduce el numero a buscar");
        busqueda = sc.nextInt();
        int i;
        for (i = 0; i < numeros.length
                && busqueda > numeros[i]; i++) {
        }
        if (i < numeros.length && busqueda == numeros[i]) {
            posicion = i;
            encontrado = true;
        }
        if (encontrado) {
            System.out.println("tu numero se encuenctra en la posicion " + posicion);
        } else {
            System.out.println("el numero que has buscado no estaba en la array");
        }
    }
    public static void ejercicio16(Scanner sc) {
        System.out.println("Has elegido el 16: Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo. Cada grupo (o clase) está compuesto por 5 alumnos. Se pide leer las notas del primer, segundo y tercer trimestre de un grupo. Debemos mostrar al final: la nota media del grupo en cada trimestre, y la media del alumno que se encuentra en la posición N (N se lee por teclado). ");
        int[] primer = new int[5];
        int[] segund = new int[5];
        int[] tercer = new int[5];
        int primedia = 0;
        int segmedia = 0;
        int termedia = 0;
        int n;
        int medialumno;
        for (int i = 0; i < primer.length; i++) {
            System.out.println("Introduce la nota del primer trimestre del alumno" + (i + 1));
            primer[i] = sc.nextInt();
            primedia = primedia + primer[i];
        }
        for (int i = 0; i < segund.length; i++) {
            System.out.println("Introduce la nota del segundo trimestre del alumno " + (i + 1));
            segund[i] = sc.nextInt();
            segmedia = segmedia + segund[i];
        }
        for (int i = 0; i < tercer.length; i++) {
            System.out.println("Introduce la nota del tercer trimestre del alumno" + (i + 1));
            tercer[i] = sc.nextInt();
            termedia = termedia + tercer[i];
        }
        System.out.println("la media del primer trimestre es " + (primedia / 5) + ", la del segundo trimestre es " + (segmedia / 5) + " y la del tercer trimestre es " + (termedia / 5));
        System.out.println("ahora elige el numero de alumno para el que quieras sacar la nota");
        n = sc.nextInt();
        n--;
        medialumno = primer[n] + segund[n] + tercer[n];
        System.out.println("la media del zoquete que has elegido es " + (medialumno / 3));
    }

    public static void ejercicio17(Scanner sc) {
        System.out.println("Has elegido el 17: con dos barajas de 10 cartas, barajéalas, vete sacando una carta de cada mazo, y cuenta los puntos para sacar el mazo ganador.");
        int[] mazo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] mazo2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Random generadorNumerosAleatorios = new Random();
        int posicion;
        int posicion2;
        int swap;
        int punto1 = 0;
        int punto2 = 0;
        barajarArray(mazo);
        barajarArray(mazo2);
        for (int i = 0; i < mazo.length; i++) {
            System.out.println("El jugador 1 saca " + mazo[i] + " y el jugador 2 saca " + mazo2[i]);
            if (mazo[i] < mazo2[i]) {
                punto2++;
            } else if (mazo2[i] < mazo[i]) {
                punto1++;
            }
            System.out.println("El jugador 1 lleva " + punto1 + " puntos y el jugador 2 lleva " + punto2 + " puntos");
        }
    }
    public static void barajarArray(int[] array) {
        Random generadorNumerosAleatorios = new Random();
        int posicion;
        int posicion2;
        int swap;
        for (int i = 0; i < 400; i++) {
            posicion = generadorNumerosAleatorios.nextInt(array.length);
            posicion2 = generadorNumerosAleatorios.nextInt(array.length);
            swap = array[posicion];
            array[posicion] = array[posicion2];
            array[posicion2] = swap;
        }
    }
    public static void recorrer(int[] array) {
         int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("recorrer pa'lante=1, pa'tras=2");
        a = sc.nextInt();
        if (a == 1) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
        else{
            for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
        }
    }

    public static void desplazar(int[] numeros) {
        for (int i = 0, sale = 0, entra = numeros[9];
                i < numeros.length; i++) {
            sale = numeros[i];
            numeros[i] = entra;
            entra = sale;
        }
    }
    public static void desplazarn(int[] numeros1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el numero de saltos");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0, sale = 0, entra = numeros1[9]; j < numeros1.length; j++) {
                sale = numeros1[j];
                numeros1[j] = entra;
                entra = sale;
            }
        }
    }
}
