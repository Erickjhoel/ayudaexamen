package daw2017;

import java.util.Scanner;

public class Practica2HojaEjercicios {

    public static void main(String[] args) {

        //**Menu**
        System.out.println("**************");
        System.out.println("**PRACTICA 2**");
        System.out.println("**************\n");
        System.out.println("Elige ejercicio: ");
        System.out.println("1. Escribir valores comprendidos entre dos numeros. ");
        System.out.println("2. Escribe los 20 primeros multiplos de 5. ");
        System.out.println("3. Escribe la media de los 15 primeros valores suministrados por teclado.");
        System.out.println("4. Halla media de 'n' valores suministrados por teclado. ");
        System.out.println("5. Convierte a minutos una hora dada por teclado en horas, minutos y segundos. ");
        System.out.println("6. Convierte en horas, minutos y segundos una cantidad  ");
        System.out.println("7. Escribe el mayor y el menor de 10 numeros suministrados pro teclado.  ");
        System.out.println("8. Calcula el factorial de un numero. ");
        System.out.println("9. Ordena de mayor a menor 3 numeros ");
        System.out.println("10. Saca por pantalla en letra una nota dada en numeros. ");
        System.out.println("11. Saca por pantalla la calificacion através de una nota numerica. ");
        System.out.println("12. Halla nota media de 'n' alumnos y el numero de aprobados y suspensos. ");
        System.out.println("13. Imprime los numeros primos entre 1 y 'n'. ");
        System.out.println("0. Salir. ");

        //Opciones
        Scanner s = new Scanner(System.in);
        int opc = s.nextInt();

        switch (opc) {
            case 1:
                ejercicio1(s);
                break;
            case 2:
                ejercicio2(s);
                break;
            case 3:
                ejercicio3(s);
                break;
            case 4:
                ejercicio4(s);
                break;
            case 5:
                ejercicio5(s);
                break;
            case 6:
                ejercicio6(s);
                break;
            case 7:
                ejercicio7(s);
                break;
            case 8:
                ejercicio8(s);
                break;
            case 9:
                ejercicio9(s);
                break;
            case 10:
                ejercicio10(s);
                break;
            case 11:
                ejercicio11(s);
                break;
            case 12:
                ejercicio12(s);
                break;
            case 13:
                ejercicio13(s);
                break;
            case 0:
                System.out.println("Hasta pronto.");
                break;

        }

    }

    //**METODOS**
    
    
//**************************************************************
    public static void ejercicio1(Scanner s) {

        System.out.println("\nEjercicio 1. \nEste ejercicio va a escribir los valores comprendidos entre dos numeos dados");

        int inf;
        int sup;

        System.out.println("Escribe el numero inferior");
        inf = s.nextInt();
        System.out.println("Escribe el numero superior");
        sup = s.nextInt();

        System.out.println("Los numeros comprendidos entre " + inf + " y " + sup + " son:");
        for (int i = inf + 1; inf < sup - 1; inf++) {
            System.out.print(inf + 1 + "-");
        }

    }
    
//**************************************************************
    public static void ejercicio2(Scanner s) {

        System.out.println("\nEjercicio 2. \nEste ejercicio va a escribir los 20 primeros multiplos de 5");

        int resul;
        for (int i = 1; i <= 20; i++) {
            resul = 5 * i;
            System.out.print(resul + "-");
        }

    }
//**************************************************************

    public static void ejercicio3(Scanner s) {
        System.out.println("\nEjercicio 3. \nEste programa va a realizar la media de los 15 primeros valoress suministrados.");

        double suma, media;
        double num = 0;

        for (int i = 0; i < 15; i++) {
            System.out.println("Introducir un numero.");
            suma = s.nextDouble();
            num += suma;
        }
        media = num / 15;
        System.out.println("La media resultante es; " + media);

    }
//**************************************************************

    public static void ejercicio4(Scanner s) {

        System.out.println("\nEjercicio 4. \nEste programa va a realizar la media de 'n' valores suministrados por teclado.");

        double suma, media;
        double num = 0;
        int max;

        System.out.println("Introduzca el numero de valores de los que desea realizar la media:");
        max = s.nextInt();

        for (int i = 0; i < max; i++) {
            System.out.println("Introducir un numero.");
            suma = s.nextInt();
            num += suma;
        }
        media = num / max;
        System.out.println("La media resultante es; " + media);

    }
//**************************************************************

    public static void ejercicio5(Scanner s) {
        System.out.println("\nEjercicio 5. \nEste programa va a convertir a minutos una hora dada por el usuario.");

        double hora, minutos, segundos;
        double mintot = 0;
        System.out.println("Tiene que indicar la hora que desea convertir, formato 24H");

        do {
            System.out.println("Introduzca una hora valida, entre 0-24H");
            hora = s.nextInt();

        } while (hora > 24 || hora < 0);
        do {
            System.out.println("Introduzca los minutos, entre 0-59");
            minutos = s.nextInt();

        } while (minutos > 59 || minutos < 0);

        do {
            System.out.println("Introduzca los segundos, entre 0-59");
            segundos = s.nextInt();

        } while (segundos > 59 || segundos < 0);

        hora = hora * 60;
        segundos = segundos / 60;
        mintot = hora + minutos + segundos;

        System.out.println("los minutos totales de: " + hora / 60 + " hora/s, " + minutos + "minutos y " + segundos * 60 + " segundos, son: " + mintot + " minutos");

    }
//**************************************************************

    public static void ejercicio6(Scanner s) {
        System.out.println("\nEjercicio 6. \nEste programa va a convertir a hora minutos segundos una cantidad de segundos.");
        int total, hora = 0, min, seg, dia;
        System.out.println("Introduzca los segundos totales.");
        total = s.nextInt();

        seg = total % 60; //segundos

        min = total / 60;//minutos

        while (min >= 60) {
            hora++;
            min -= 60;

        }

        System.out.println(total + " segundos equivalen a: " + hora + " hora/s," + min + " minutos y " + seg + " segundos.");

    }
//**************************************************************

    public static void ejercicio7(Scanner s) {
        System.out.println("\nEjercicio 7. \nEste programa va a concluir cual es el numero mayor y el menor de los 10 introdicidos.");

        int num, max, min;

        System.out.println("Introduce un numero entero: ");
        num = s.nextInt();

        max = num;
        min = num;
        for (int i = 0; i < 9; i++) {
            System.out.println("Introduce otro entero: ");
            num = s.nextInt();

            if (num > max) {
                max = num;

            } else if (num < min) {
                min = num;
            }
        }
        System.out.println("El numero mas grande es: " + max);
        System.out.println("El numero mas pequeño es: " + min);

    }
//**************************************************************

    public static void ejercicio8(Scanner s) {
        System.out.println("\nEjercicio 8. \nEste programa va a calcular el factorial de un numero suministrado por teclado.");
        int num, fact = 1;
        System.out.println("Escriba el numero del que desea hallar el factorial: ");
        num = s.nextInt();
        for (int i = 1; i <= num; i++) {

            fact = fact * i;

        }
        System.out.println(fact);

    }
//**************************************************************

    public static void ejercicio9(Scanner s) {
        System.out.println("\nEjercicio 9. \nEste programa va a ordenar 3 numeros de menos a mayor");

        int a, b, c, max, med, min;

        System.out.println("Ingreseº numero");
        a = s.nextInt();
        System.out.println("Ingreseº numero");
        b = s.nextInt();
        System.out.println("ingreseº numeero");
        c = s.nextInt();

        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }

        if (a < b && a < c) {
            min = a;
        } else if (b < a && b < c) {
            min = b;
        } else {
            min = c;
        }
        med = (a + b + c) - (max + min);

        System.out.println("El orden seria: " + max + "-" + med + "-" + min);
    }
//**************************************************************

    public static void ejercicio10(Scanner s) {
        System.out.println("\nEjercicio 10. \nEste programa va mostrar con letra una nota dada en numero");
        int nota;
        do{
        System.out.println("Introducir una nota comprendidad entre 0 y 10");
        nota = s.nextInt();
        }while(nota>10||nota<0);
        
        
        switch (nota) {
            case 1:
                System.out.println("Su nota es: UNO");
                break;
            case 2:
                System.out.println("Su nota es: DOS");
                break;
            case 3:
                System.out.println("Su nota es: TRES");
                break;
            case 4:
                System.out.println("Su nota es: CUATRO");
                break;
            case 5:
                System.out.println("Su nota es: CINCO");
                break;
            case 6:
                System.out.println("Su nota es: SEIS");
                break;
            case 7:
                System.out.println("Su nota es: SIETE");
                break;
            case 8:
                System.out.println("Su nota es: OCHO");
                break;
            case 9:
                System.out.println("Su nota es: NUEVE");
                break;
            case 10:
                System.out.println("Su nota es: DIEZ");
                break;
            default:
                System.out.println("Nota no valida");
        }

    }
//***************************************************************

    public static void ejercicio11(Scanner s) {
        System.out.println("\nEjercicio 11. \nEste programa va a mostrar la calificacion obtenida introduciendo una nota numerica. ");
        System.out.println("ESCRIBIR NOTA");
        double nota = s.nextDouble();

        if (nota >= 0.0 && nota <= 4.9) {
            System.out.println("Insuficiente (<5)");
        } else if (nota>= 5.0 &&nota<=5.9) {
            System.out.println("Suficiente (5)");
        } else if (nota >= 6.0 &&nota<=6.9) {
            System.out.println("Bien (6)");
        } else if (nota >= 7.0 && nota <= 8.9) {
            System.out.println("Notable (7-8)");
        } else if (nota >=9.0 && nota <= 10.0) {
            System.out.println("Sobresaliente (9-10)");
        } else {
            System.out.println("Nota no valida, vuelva a escribir una nota valida.");
        }

    }
//***************************************************************

    public static void ejercicio12(Scanner s) {
        System.out.println("\nEjercicio 12. \nEste ejercicio va a calcular la media de 'n' alumnos introducidos por teclado y mostrar el numero de aprobados o suspensos. ");

        int alum;
        System.out.println("Escribe el numero de alumnos en clase");
        alum = s.nextInt();
        double nota, media, suma=0;
        int apr = 0, sus = 0;
        for (int i = 0; i < alum; i++) {
            System.out.println("Introduce una nota");
            nota = s.nextDouble();
            suma = suma + nota;
            if (nota >= 5) {
                apr++;
            } else {
                sus++;
            }
        }
        media = suma / alum;
        System.out.println("La nota media de "+alum+" alumnos es: " + media);
        System.out.println("El numero de aprobados es: " + apr + " y de suspensos: " + sus);

    }
//***************************************************************

    public static void ejercicio13(Scanner s) {

        System.out.println("\nEjercicio 13. \nEste programa va a mostrar los numeros primos entre 1 y 'n':");
        int num;
        boolean primo;

        System.out.println("Escribe el limite: ");
        num = s.nextInt();

        for (int i = 1; i < num + 1; i++) {
            primo = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    primo = false;
                }

            }
            if (primo) {
                System.out.print(i + "-");
            }
        }
    }

}
