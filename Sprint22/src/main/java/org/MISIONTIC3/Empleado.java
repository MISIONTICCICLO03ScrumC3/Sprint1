package org.MISIONTIC3;

public class Empleado {
    private String nombre;
    private String email;
    private  String empresaPertenece;
    private String rolEmpleado; /*Operativo o administrador*/

    public Empleado(String nombre, String email, String empresaPertenece, String rolEmpleado) {
        this.nombre = nombre;
        this.email = email;
        this.empresaPertenece = empresaPertenece;
        this.rolEmpleado = rolEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpresaPertenece() {
        return empresaPertenece;
    }

    public void setEmpresaPertenece(String empresaPertenece) {
        this.empresaPertenece = empresaPertenece;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }


}
