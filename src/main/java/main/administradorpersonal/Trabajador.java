/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.administradorpersonal;

/**
 *
 * @author YAJAIRA MICHEL ENAMORADO 
 */
public class Trabajador {
    private String nombreCompleto;
    private int años;
    private double remuneracion;

    public Trabajador(String nombreCompleto, int años, double remuneracion) {
        this.nombreCompleto = nombreCompleto;
        this.años = años;
        this.remuneracion = remuneracion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombreCompleto);
        System.out.println("Edad: " + años);
        System.out.println("Salario: " + remuneracion);
    }
}
