/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.libro_poo;

import java.util.Scanner;

/**
 *
 * @author fco
 */
public class Libro_POO {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String titulo, autor;
        int cantidadLibros, prestados, devueltos;

        Libro libro1 = new Libro(3, "El Arte de Amar", "Erick Fromm", 2, 1);


        System.out.println("Favor indique Cantidad de Libros");
        cantidadLibros = entrada.nextInt();
        
        System.out.println("Favor indique título");
        titulo = entrada.nextLine();
        
        System.out.println("Favor indique autor");
        autor = entrada.nextLine();
        
        System.out.println("Favor indicar número de libros prestados");
        prestados = entrada.nextInt();

        System.out.println("Favor indicar número de libros devueltos");
        devueltos = entrada.nextInt();
        
        Libro libro2 = new Libro();
        
        libro2.setCantidadLibros(cantidadLibros);
        libro2.setTitulo(titulo);
        libro2.setAutor(autor);
        libro2.setPrestados(prestados);
        libro2.setDevueltos(devueltos);

                boolean prestado = true;
        do {
            try {
                prestado = libro1.prestamo(prestados,cantidadLibros);
                if (prestado) {
                    libro1.setPrestados(prestados);
                    System.out.println("Se ha prestado el libro:  " + libro1.getTitulo());
                } else if (prestado == false) {
                    System.out.println("El libro titulado: "+titulo+", sin ejemplares para préstamo");
                }
            } catch (Exception e) {
                System.out.println("UPS ALGO SALIO MAL");
            }
        } while (prestado == false);

        
                boolean devuelto = true;
        do {
            try {
                devuelto = libro1.devolucion(prestados);
                if (devuelto) {
                    libro1.setDevueltos(devueltos);
                    System.out.println("Se ha devuelto el libro: " + libro1.getTitulo()+", la cantidad de "+devueltos+", ejemplares");
                } else if (devuelto == false) {
    System.out.println("El libro titulado: "+titulo+", sin ejemplares para devolver");
                }
            } catch (Exception e) {
                System.out.println("UPS ALGO SALIO MAL");
            }
        } while (devuelto == false);
        
        System.out.println(libro1);
        System.out.println(libro2);


    }
}
