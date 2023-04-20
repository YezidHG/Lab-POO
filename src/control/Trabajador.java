/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author INGESIS
 */
public class Trabajador {
    private String nombreTrabajador;
    private String apellidoTrabajador;
    private int edadTrabajador;
    private int salarioTrabajador;
    private int diasTrabajados;
    //-------------------------------
    //----------------------------Constructores
    public Trabajador(){
        
    }
    public Trabajador(String nombre, String apellido, int salario){
        this.nombreTrabajador=nombre;
        this.apellidoTrabajador=apellido;
        this.salarioTrabajador=salario;
    }

    public Trabajador(String nombre, String apellido, int salario, int dias){
        this.nombreTrabajador=nombre;
        this.apellidoTrabajador=apellido;
        this.salarioTrabajador=salario;
        this.diasTrabajados=dias;
    }
    //-----------------------------------
    //--------------------get y set

    public void setNombreTrabajador(String nombreTrabajador) {
        this.nombreTrabajador = nombreTrabajador;
    }

    public void setApellidoTrabajador(String apellidoTrabajador) {
        this.apellidoTrabajador = apellidoTrabajador;
    }

    public void setEdadTrabajador(int edadTrabajador) {
        this.edadTrabajador = edadTrabajador;
    }

    public void setSalarioTrabajador(int salarioTrabajador) {
        this.salarioTrabajador = salarioTrabajador;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public String getNombreTrabajador() {
        return nombreTrabajador;
    }

    public String getApellidoTrabajador() {
        return apellidoTrabajador;
    }

    public int getEdadTrabajador() {
        return edadTrabajador;
    }

    public int getSalarioTrabajador() {
        return salarioTrabajador;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }
    public double calcularNomina(){
        double valorDia=getSalarioTrabajador()/30;
        double totalPagar=valorDia*getDiasTrabajados();
        double valorNomina = totalPagar*1.2;
        return valorNomina;
    }
    
}
