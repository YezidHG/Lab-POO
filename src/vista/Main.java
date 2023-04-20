/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import control.Trabajador;
import java.util.Scanner;
/**
 *
 * @author INGESIS
 */
public class Main {
    
    
    public void trabajadorToStrings(Trabajador trabaja){
        System.out.println("Nombre: "+trabaja.getNombreTrabajador()
        +"\n Apellido :"+trabaja.getApellidoTrabajador()
        +"\n Edad :"+trabaja.getEdadTrabajador()
        +"\n Salario :"+trabaja.getSalarioTrabajador()
        +"\n Nomina :"+trabaja.calcularNomina());
    }
    
    public static void main(String[] args) {
        Main mn = new Main();
        Trabajador trabajador = new Trabajador("Juanito", "Perez", 2000000,21);
        trabajador.setEdadTrabajador(23);
        Trabajador trabajador2 = new Trabajador();
        
        System.out.println("El valor de la nomina de "+trabajador.getNombreTrabajador()+" es :"+trabajador.calcularNomina());
        
        trabajador2.setNombreTrabajador("Maria");
        trabajador2.setApellidoTrabajador("Castro");
        trabajador2.setSalarioTrabajador(3000000);
        trabajador2.setDiasTrabajados(12);
        trabajador2.setEdadTrabajador(23);
        
        System.out.println("El valor de la nomina de "+trabajador2.getNombreTrabajador()+" es : "+trabajador2.calcularNomina());
        System.out.println(trabajador.calcularNomina());
        mn.trabajadorToStrings(trabajador);
    }
}
