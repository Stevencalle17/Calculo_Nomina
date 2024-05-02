package com.example;
import java.util.Scanner;
public class Main {
    private static int salarioBase;
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su salario: ");
        salarioBase = scanner.nextInt();
        System.out.print("Ingrese horas trabajadas: ");
        int horaTrabajadas = scanner.nextInt();
        System.out.print("Ingrese horas extras: ");
        int horasExtra = scanner.nextInt();
        double auxilioTransporte = 162000;
        double totalExtras = horasExtra * 0.25;



        // Cálculo de la nómina
        double salarioDevengado = calcularSalarioDevengado(horaTrabajadas, horasExtra);
        double deducciones = calcularDeducciones(salarioDevengado, auxilioTransporte);
        double salarioNeto = salarioDevengado - deducciones;

        // Impresión de la nómina
       
        System.out.println("Horas extras: " + totalExtras);
        System.out.println("Auxilio transporte: $" + auxilioTransporte);
        System.out.println("Salario devengado: $" + salarioDevengado);
        System.out.println("Deducciones: $" + deducciones);
        System.out.println("Salario neto: $" + salarioNeto);
    }



    // Método para calcular el salario devengado
    public static double calcularSalarioDevengado( int horaTrabajadas, int horasExtra) {
        // Implementar solución
        int valorHora = (salarioBase / horaTrabajadas);
        return 0;
    }

    // Método para calcular las deducciones
    public static double calcularDeducciones(double salarioDevengado, double auxilioTransporte) {
        // Implementar solución
        
        return 0;
    }
}   