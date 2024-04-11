package org.paciente;

public class Principal {
    public static void main(String[] args) {

        Paciente p1 = new Paciente(74, 1.73);
        Paciente p2 = new Paciente(85, 1.59);
        Paciente p3 = new Paciente(130, 2.00);

        System.out.println("Paciente 1:");
        System.out.println("IMC: " + p1.calcularIMC());
        System.out.println("Diagnóstico: " + p1.diagnostico());
        System.out.println();

        System.out.println("Paciente 2:");
        System.out.println("IMC: " + p2.calcularIMC());
        System.out.println("Diagnóstico: " + p2.diagnostico());
        System.out.println();

        System.out.println("Paciente 3:");
        System.out.println("IMC: " + p3.calcularIMC());
        System.out.println("Diagnóstico: " + p3.diagnostico());
    }
}