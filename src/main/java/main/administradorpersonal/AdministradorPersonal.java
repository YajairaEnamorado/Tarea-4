/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.administradorpersonal;

/**
 *
 * @author YAJAIRA MICHEL ENAMORADO 
 */
import java.util.ArrayList;
import java.util.List;

public class AdministradorPersonal {
    private List<Trabajador> plantillaTrabajadores;

    public AdministradorPersonal() {
        this.plantillaTrabajadores = new ArrayList<>();
    }

    public void incorporarTrabajador(Trabajador trabajador) {
        plantillaTrabajadores.add(trabajador);
    }

    public void listarTrabajadores() {
        for (Trabajador trabajador : plantillaTrabajadores) {
            trabajador.imprimirInformacion();
            System.out.println("--------------------");
        }
    }

    public static void main(String[] args) {
        AdministradorPersonal admin = new AdministradorPersonal();
    
        admin.incorporarTrabajador(new Trabajador("Jose", 34, 2550));
        admin.incorporarTrabajador(new Trabajador("Mara", 27, 4000));
        admin.incorporarTrabajador(new Trabajador("Fernando", 35, 3000));
     
        admin.listarTrabajadores();
    }
}
