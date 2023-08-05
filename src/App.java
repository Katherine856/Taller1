import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        // Ejercicio 1

        // System.out.println("Ingrese el primer numero entero");
        // int num1 = scanner.nextInt();
        // System.out.println("Ingrese el segundo numero entero");
        // int num2 = scanner.nextInt();
        // System.out.println("La suma es: " + (num1 + num2));
        // System.out.println("La resta es: " + (num1 - num2));
        // System.out.println("La multiplicacion es: " + (num1 * num2));
        // System.out.println("La division es: " + ((double)num1 / num2));

        //Ejercicio 2

        // System.out.println("Ingrese un numero entero");
        // int num = scanner.nextInt();
        // if ( num%2  == 0 ){
        //     System.out.println("Es par");
        // }else{
        //     System.out.println("Es impar");
        // }

        //Ejercicio 3

        // System.out.println("Ingrese el radio");
        // double radio = scanner.nextDouble();
        // double area = 2*Math.PI*radio;
        // double perimetro = Math.PI*Math.pow(radio, 2);
        // System.out.println("El area es: " + area + " El perimetro: " + perimetro);

        //Ejercicio 4

        // System.out.println("Ingrese la edad");
        // int edad = scanner.nextInt();
        // if (edad >= 18) {
        //     System.out.println("Es mayor");
        // }else{
        //     System.out.println("Es menor");
        // }

        //Ejercicio 5

        // System.out.println("Ingrese el primer numero");
        // double num1 = scanner.nextDouble();
        // System.out.println("Ingrese el segundo numero");
        // double num2 = scanner.nextDouble();
        // if (num1>num2) {
        //     System.out.println("El numero " + num1 + " es mayor");
        // }else{
        //     if (num2>num1) {
        //         System.out.println("El numero " + num2 + " es mayor");
        //     }else{
        //         System.out.println("Son iguales");
        //     }
        // }

        // Ejercicio 6

        // System.out.println("Ingrese el numero");
        // double num = scanner.nextDouble();
        // if (num>0) {
        //     System.out.println("El numero es positivo");
        // }else{
        //     if (num<0) {
        //         System.out.println("El numero es negativo");
        //     }else{
        //         System.out.println("El numero es cero");
        //     }
        // }

        //Ejercicio 7

        // System.out.println("Ingrese el numero");
        // int num = scanner.nextInt();
        // for (int i=0; i<10; i++){
        //     System.out.println(" " + num + " * " + (i+1) + " = " + (num*(i+1)));
        // }

        //Ejercicio 8

        // int num = (int)(Math.random()*(100-1+1))+1;
        // int numIngresado = 0;
        // do{
        //     System.out.println("Ingrese un numero");
        //     numIngresado = scanner.nextInt();
        //     if (num>numIngresado) {
        //         System.out.println("El numero es mayor");
        //     }
        //     if (num<numIngresado){
        //         System.out.println("El numero es menor");
        //     }
        // }while(num != numIngresado);
        // System.out.println("GANASTE");

        //Ejercicio 9

        // System.out.println("Ingrese el numero");
        // int num = scanner.nextInt();
        // int factorial = 1;
        // for (int i=0; i<num; i++){
        //     factorial = (i+1) * factorial;
        // }
        // System.out.println("El factorial es: " + factorial);

        // Ejercicio 10

        // System.out.println("Ingrese el numero");
        // int num = scanner.nextInt();
        // int fibonacci = 0;
        // int anterior = 0;
        // int nuevo = 1;
        // for (int i=0; i<=num-1; i++){
        //     fibonacci = anterior + nuevo;
        //     anterior = nuevo;
        //     nuevo = fibonacci;
        // System.out.println(fibonacci);
        // }

        //Ejercicio 11  

        // System.out.println("Ingrese la primera longitud");
        // double l1 = scanner.nextDouble();
        // System.out.println("Ingrese la segunda longitud");
        // double l2 = scanner.nextDouble();
        // System.out.println("Ingrese la tercera longitud");
        // double l3 = scanner.nextDouble();
        // double s = (l1+l2+l3)/2;
        // double area = Math.sqrt(s*(s-l1)*(s-l2)*(s-l3));
        // System.out.println("El area es: " + area);


        //Ejercicio 12

        // System.out.println("Ingrese el numero");
        // int num = scanner.nextInt();
        // int divisor = 0;
        // for (int i = 0; i < num; i++){
        //     if (num % (i+1) == 0){
        //         divisor++;
        //     }
        // }
        // if(divisor!=2){
        //     System.out.println("No es primo");
        // }else{
        //     System.out.println("Es primo");
        // }

        //Ejercicio 13

        // System.out.println("Ingrese el numero");
        // double num = scanner.nextDouble();
        // System.out.printf("Numero: %.3f", num );

        //Ejercicio 14

        // System.out.println("Ingrese el numero");
        // int num = scanner.nextInt();
        // int perfecto = 0;
        // for (int i = 0; i < num-1; i++){
        //     if (num % (i+1) == 0){
        //         perfecto = perfecto + (i+1);
        //     }
        // }
        // if (perfecto != num){
        //     System.out.println("No es perfecto");
        // }else{
        //     System.out.println("Es perfecto");
        // }

        //Ejercicio 15

        // System.out.println("Ingrese el numero");
        // int num = scanner.nextInt();
        // int aux = num, digito, inverso = 0;
        // while (aux!=0){
        //     digito = aux % 10;
        //     inverso = inverso * 10 + digito;
        //     aux = aux / 10;
        // }
        // if(num == inverso){
        //     System.out.println("Es capicua");
        // }else{
        //     System.out.println("No es capicua");
        // }

        //Ejercicio 16

        // System.out.println("Ingrese el numero");
        // int num = scanner.nextInt();  
        // int anterior = 0, nuevo = 1;
        // System.out.println(anterior);
        // System.out.println(nuevo);
        // while(nuevo + anterior < num){
        //     int temp = anterior;
        //     anterior = nuevo;
        //     nuevo += temp;
        //     System.out.println(nuevo);
        // }

        //Ejercicio 17

        // System.out.println("Ingrese el numero");
        // int num1 = scanner.nextInt();
        // int num2 = scanner.nextInt();
        // for(int i = num1; i < num2; i++){
        //     boolean tieneDivisores = false;
        //     for(int j=2; j < i/2; j++){
        //         if(i%j == 0){
        //             tieneDivisores = true;
        //             break;
        //         }
        //     }
        //     if(tieneDivisores){
        //         System.out.println(i);
        //     }
        // }

        //Ejercicio 18

        // int longitud = 8, inicio = 48, tope = 122;
        // String contrasena = "";
        // float random = 0;
        // for (int i=0; i < longitud; i++){
        //     if(i == 0 || i == 3 || i == 7){
        //         inicio = 65;
        //         tope = 90;
        //         random = (float) Math.random()*(tope - inicio) + inicio;
        //     }
        //     if(i == 1 || i == 6){
        //         inicio = 97;
        //         tope = 122;
        //         random = (float) Math.random()*(tope - inicio) + inicio;
        //     }
        //     if(i == 2 || i == 4 || i == 5){
        //         inicio = 48;
        //         tope = 57;
        //         random = (float) Math.random()*(tope - inicio) + inicio;
        //     }
        //     char caracter = (char) random;
        //     float temp = (float) Math.random()*(contrasena.length());
        //     int pos = (int) temp;
        //     contrasena = contrasena.substring(0, pos) + caracter + contrasena.substring(pos);
        // }
        // System.out.println("Contraseña: " + contrasena);

        //Ejercicio 19

        // System.out.println("Ingrese su nombre");
        // String nombre = scanner.nextLine(), nombreMayuscula, nombreMinuscula;
        // System.out.println("Nombre: " + nombre);
        // nombreMayuscula = nombre.toUpperCase();
        // nombreMinuscula = nombre.toLowerCase();
        // System.out.println("Mayúsculas: " + nombreMayuscula);
        // System.out.println("Minúsculas: " + nombreMinuscula);
        
        //Ejercicio 20
        
        // System.out.println("Ingrese una cadena");
        // String cadena = scanner.nextLine(), salida = "";
        // for (int i = cadena.length() - 1; i >= 0; i--){
        //     salida+=cadena.charAt(i);
        // }
        // System.out.println(salida);
        
        //Ejercicio 21
        
        // System.out.println("Ingrese una cadena");
        // String cadena = scanner.nextLine();
        // System.out.println("Ingrese un caracter");
        // String temp = scanner.next();
        // char caracter = temp.toLowerCase().charAt(0);
        // int contador = 0;
        // for (int i = 0; i < cadena.length(); i++) {
        //     if (cadena.toLowerCase().charAt(i) == caracter){
        //         contador++;
        //     }
        // }
        // System.out.println("El caracter está "+contador+" veces en la cadena");

        //Ejercicio 22

        // System.out.println("Ingrese una cadena");
        // String cadena = scanner.nextLine(), salida = "";
        // for (int i = cadena.length() - 1; i >= 0; i--){
        //     salida+=cadena.charAt(i);
        // }
        // if(salida.equals(cadena)){
        //     System.out.println("La cadena es un palíndromo");
        // }else{
        //     System.out.println("La cadena NO es un palíndromo");
        // }

        //Ejercicio 23

        // System.out.println("Ingrese una frase");
        // String cadena = scanner.nextLine();
        // int palabras = 0;
        // for (int i = cadena.length() - 1; i >= 0; i--){
        //     if (cadena.charAt(i) == ' '){
        //         palabras++;
        //     }
        // }
        // System.out.println("La cadena tiene "+(palabras + 1)+" palabras");
        
        //Ejercicio 24
        
        // System.out.println("Ingrese una cadena");
        // String cadena = scanner.nextLine();
        // System.out.println("Ingrese un caracter a buscar");
        // String temp = scanner.next();
        // char buscar = temp.charAt(0);
        // System.out.println("Ingrese un caracter a reemplazar");
        // temp = scanner.next();
        // char reemplazar = temp.charAt(0);
        // for (int i = cadena.length() - 1; i >= 0; i--){
        //     if (cadena.toLowerCase().charAt(i) == buscar){
        //         cadena = cadena.substring(0, i) + reemplazar + cadena.substring(i + 1);
        //     }
        // }
        // System.out.println(cadena);

        //Ejercicio 25

        // System.out.println("Ingrese una cadena");
        // String cadena = scanner.nextLine();
        // ArrayList<String> cadenas = new ArrayList<String>();
        // int ultimoEspacio = 0;
        // for (int i = 0; i < cadena.length(); i++){
        //     if (cadena.charAt(i) == ' '){
        //         cadenas.add(cadena.substring(ultimoEspacio, i));
        //         ultimoEspacio = i + 1;
        //     }
        // }
        // cadenas.add(cadena.substring(ultimoEspacio));
        // for(String cad: cadenas){
        //     System.out.println(cad);
        // }

        //Ejercicio 26

        // System.out.println("Ingrese una cadena");
        // String cadena = scanner.nextLine();
        // int espacios = 0;
        // for (int i = cadena.length() - 1; i >= 0; i--){
        //     if (cadena.charAt(i) == ' '){
        //         espacios++;
        //     }
        // }
        // System.out.println("Hay " +(cadena.length()-espacios) +" caracteres");

        //Ejercicio 27

        // System.out.println("Ingrese una cadena");
        // String cadena = scanner.nextLine();
        // String[] cadenas = cadena.split(" ");
        // Arrays.sort(cadenas);
        // for(String cad: cadenas){
        //     System.out.println(cad);
        // }
            
        //Ejercicio 28
        
        // System.out.println("Ingrese la cantidad de números");
        // int cant = scanner.nextInt();
        // int[] arr = new int[cant];
        // int total = 0;
        // for(int i = 0; i < cant; i++){
        //     float temp = (float) Math.random()*10 + 1;
        //     arr[i] = (int) temp;
        //     total += arr[i];
        // }
        // System.out.println("El arreglo es:");
        // for(int num: arr){
        //     System.out.print(num + " ");
        // }
        // System.out.println("");
        // System.out.println("La suma es: " + total);

        //Ejercicio 29

        // System.out.println("Ingrese la cantidad de números");
        // int cant = scanner.nextInt();
        // int[] arr = new int[cant];
        // int mayor = 0;
        // for(int i = 0; i < cant; i++){
        //     float temp = (float) Math.random()*50 + 1;
        //     arr[i] = (int) temp;
        //     if(arr[i] > mayor){
        //         mayor = arr[i];
        //     }
        // }
        // System.out.println("El arreglo es:");
        // for(int num: arr){
        //     System.out.print(num + " ");
        // }
        // System.out.println("");
        // System.out.println("El mayor es: " + mayor);


        //Ejercicio 30

        // System.out.println("Ingrese la cantidad de números");
        // int cant = scanner.nextInt();
        // int[] arr = new int[cant];
        // ArrayList<Integer> noRepetidos = new ArrayList<Integer>();
        // for(int i = 0; i < cant; i++){
        //     float temp = (float) Math.random()*5 + 1;
        //     arr[i] = (int) temp;
        // }
        // System.out.println("El arreglo es:");
        // for(int num: arr){
        //     System.out.print(num + " ");
        // }
        // System.out.println("");
        // for(int i = 0; i < arr.length; i++){
        //     boolean estaRepetida = false;
        //     for(int j = 0; j < arr.length; j++){
        //         if(i != j){
        //             if(arr[i] == arr[j]){
        //                 estaRepetida = true;
        //                 break;
        //             }
        //         }
        //     }
        //     if(!estaRepetida){
        //         noRepetidos.add(arr[i]);
        //     }
        // }
        // System.out.println("No se repiten los números:");
        // for(int num: noRepetidos){
        //     System.out.print(num + " ");
        // }

        //Ejercicio 31

        // System.out.println("Ingrese la cantidad de números");
        // int cant = scanner.nextInt();
        // int[] arr = new int[cant];
        // for(int i = 0; i < cant; i++){
        //     float temp = (float) Math.random()*15 + 1;
        //     arr[i] = (int) temp;
        // }
        // System.out.println("El arreglo es:");
        // for(int num: arr){
        //     System.out.print(num + " ");
        // }
        // System.out.println("");
        // int temporal = 0;
        // for(int i = 0; i < arr.length-1; i++){
        //     for(int j = 0; j < arr.length-1; j++){
        //         if(arr[j] > arr[j+1]){
        //             temporal = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temporal;
        //         }
        //     }
        // }
        // System.out.println("El arreglo ordenado es:");
        // for(int num: arr){
        //     System.out.print(num + " ");
        // }

        //Ejercicio 32

        // System.out.println("Ingrese la cantidad de números");
        // int cant = scanner.nextInt();
        // int[] arr = new int[cant];
        // System.out.println("Ingrese el numero a buscar");
        // int buscar = scanner.nextInt();
        // int encontrado = -1;
        // for(int i = 0; i < cant; i++){
        //     float temp = (float) Math.random()*10 + 1;
        //     arr[i] = (int) temp;
        //     if(arr[i] == buscar){
        //         encontrado = i;
        //     }
        // }
        // System.out.println("El arreglo es:");
        // for(int num: arr){
        //     System.out.print(num + " ");
        // }
        // System.out.println("");
        // if(encontrado == -1){
        //     System.out.println("La posicion es: " + encontrado);
        // }else{
        //     System.out.println("No se encontro");
        // }

        //Ejercicio 33

        // System.out.println("Ingrese la cantidad de números");
        // int cant = scanner.nextInt();
        // int[] arr = new int[cant];
        // ArrayList<Integer> contados = new ArrayList<Integer>();
        // for(int i = 0; i < cant; i++){
        //     float temp = (float) Math.random()*10 + 1;
        //     arr[i] = (int) temp;
        // }
        // System.out.println("El arreglo es:");
        // for(int num: arr){
        //     System.out.print(num + " ");
        // }
        // System.out.println("");
        // for(int i = 0; i < arr.length; i++){
        //     int cantidad = 1;
        //     if(!contados.contains(arr[i])){
        //         contados.add(arr[i]);
        //         for(int j = 0; j < arr.length; j++){
        //             if(i != j){
        //                 if(arr[i] == arr[j]){
        //                     cantidad++;
        //                 }
        //             }
        //         }
        //         System.out.println("El numero " + arr[i] + " esta " + cantidad);
        //     }
        // }
        
        //Ejercicio 34

        // System.out.println("Ingrese la cantidad de números");
        // int cant = scanner.nextInt();
        // int[] arr = new int[cant];
        // System.out.println("Ingrese la cantidad de posiciones a rotar (positivo hacia la derecha, negativo hacia la izquierda)");
        // int rotar = scanner.nextInt();
        // for(int i = 0; i < cant; i++){
        //     float temp = (float) Math.random()*10 + 1;
        //     arr[i] = (int) temp;
        // }
        // System.out.println("El arreglo es:");
        // for(int num: arr){
        //     System.out.print(num + " ");
        // }
        // System.out.println("");
        // int direccion = 0;
        // if(rotar < 0) direccion = -1;
        // if(rotar > 0) direccion = 1;
        // int temp = 0;
        // for(int i = 0; i < Math.abs(rotar); i++){
        //     if(direccion == -1){
        //         for(int j = 0; j < arr.length - 1; j++){
        //             temp = arr[j + 1];
        //             arr[j + 1] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }else{
        //         for(int j = arr.length - 1; j >= 1; j--){
        //             temp = arr[j - 1];
        //             arr[j - 1] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }
        // System.out.println("El nuevo arreglo es:");
        // for(int num: arr){
        //     System.out.print(num + " ");
        // }

        //Ejercicio 35

        // int[][] arr = new int[10][10];
        // for(int i = 0; i < 10; i++) {
        //     for(int j = 0; j < 10; j++) {
        //         arr[i][j] = (i+1)*(j+1);
        //         System.out.print(arr[i][j] + "\t");
        //     }
        //     System.out.println("");
        // }
        
    }
}
