package org.MISIONTIC3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String nombre="";
        String email="";
        String empresaPertenece="";
        String rolEmpleado=""; /*Operativo o administrador*/
        nombre= JOptionPane.showInputDialog("Digite nombre del empleado");
        email=JOptionPane.showInputDialog("Digite correo del empleado");
        empresaPertenece=JOptionPane.showInputDialog("Digite la empresa a la que pertenece");
        rolEmpleado=JOptionPane.showInputDialog("Digite el rol del empleado (Operativo ó administrador");
        Empleado empleado=new Empleado(nombre, email, empresaPertenece, rolEmpleado);

        empleado.setNombre(nombre);
        empleado.setEmail(email);
        empleado.setEmpresaPertenece(empresaPertenece);
        empleado.setRolEmpleado(rolEmpleado);

        System.out.println("Nombre: "+nombre);
        System.out.println("Email: "+email);
        System.out.println("Pertenece a: "+empresaPertenece);
        System.out.println("Rol: "+rolEmpleado);

        String nombreEmpresa="";
        String direccion="";
        String telefono="";
        int NIT=0;
        nombreEmpresa=JOptionPane.showInputDialog("Digite nombre de la empresa");
        direccion=JOptionPane.showInputDialog("Digite direccion de la empresa");
        telefono=JOptionPane.showInputDialog("Digie telefono de la empresa");
        NIT=Integer.parseInt(JOptionPane.showInputDialog("Digite el NIT de la empresa"));

        Empresa empresa=new Empresa(nombreEmpresa,direccion,telefono,NIT);

        empresa.setNombreEmpresa(nombreEmpresa);
        empresa.setDireccion(direccion);
        empresa.setNIT(NIT);
        empresa.setTelefono(telefono);

        System.out.println("Nombre Empresa: "+nombreEmpresa);
        System.out.println("Dirección: "+direccion);
        System.out.println("NIT: "+NIT);
        System.out.println("Telefono: "+telefono);

        float montoMovimiento=0;
        String conceptoMovimiento="";

        montoMovimiento=Float.parseFloat(JOptionPane.showInputDialog("Digite el valor del monto (0,000)"));
        conceptoMovimiento=JOptionPane.showInputDialog("Digite el concepto del movimiento");
        movimientoDinero movimientoDinero=new movimientoDinero(montoMovimiento, conceptoMovimiento);
        movimientoDinero.setMontoMovimiento(montoMovimiento);
        movimientoDinero.setConceptoMovimiento(conceptoMovimiento);

        System.out.println("Valor del monto: "+montoMovimiento);
        System.out.println("Concepto del movimiento: "+conceptoMovimiento);



    }
}