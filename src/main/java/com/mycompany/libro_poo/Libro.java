/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libro_poo;

/**
 *
 * @author fco
 */
public class Libro {

    private int cantidadLibros;
    private String titulo;
    private String autor;
    private int prestados;
    private int devueltos;

    public Libro() {
    }

    public Libro(int cantidadLibros, String titulo, String autor, int prestados, int devueltos) {
        this.cantidadLibros = cantidadLibros;
        this.titulo = titulo;
        this.autor = autor;
        this.prestados = prestados;
        this.devueltos = devueltos;
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public void setCantidadLibros(int cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }
    
    public int getDevueltos() {
        return devueltos;
    }

    public void setDevueltos(int devueltos) {
        this.devueltos = devueltos;
    }
    
    public boolean prestamo(int prestados, int cantidadLibros) {
        boolean prestado = true;
        
        if (prestados < cantidadLibros){
            prestados++;
        }else{
            prestado = false;
        }
        return prestado;
    }
    
    public boolean devolucion(int prestados){
        boolean devuelto = true;
        if(prestados == 0) {
            devuelto = false;
        } else {
            prestados--;
        }
        return devuelto;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "El Libro {" + titulo +", fue creado por el Autor " + autor + ", cantidad de libros: " + cantidadLibros + ", Prestados: "+prestados;

    }

}
