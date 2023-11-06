package com.funciones;

public class Funciones
{
    public static void main(String[] args)
    {
        int a = 5;
        int b = 6;
        Operacion op = (num1, num2) -> num1+num2;
        int sum = Calcular(a, b, op);
        System.out.println("La suma es: " + sum);
        linea(30);
        op = (num1, num2) -> num1-num2;
        int res = Calcular(a, b, op);
        System.out.println("La resta es: " + res);
        linea(30);
        op = (num1, num2) -> num1*num2;
        int prod = Calcular(a, b, op);
        System.out.println("El producto es: " + prod);
        linea(30);
        op = (num1, num2) -> num1/num2;
        int div = Calcular(a, b, op);
        System.out.println("La division es: " + div);
        linea(30);
        op = (num1, num2) -> num1+num2;
        int prom = Calcular(a, b, op);
        System.out.println("La division es: " + prom);
        linea(30);
        
    }
    
    @FunctionalInterface
    public interface Operacion
    {
        int operar(int a, int b);
    }
    
    static int Calcular(int a, int b, Operacion op)
    {
        return op.operar(a, b);
    }
    
    static void linea(int vueltas)
    {
        for(int i=0; i<vueltas; i++)
            System.out.print("*");
        System.out.println("");
    }
}

