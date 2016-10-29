/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 *
 * @author fernando
 */
@DatabaseTable(tableName = "empleados")
public class Empleado {
    
    @DatabaseField(id = true)
            private Integer idEmpleado;
    @DatabaseField
            private String nombre;
    @DatabaseField
            private String apellido;
    
    public Empleado(String nombre, String apellido){
    
        this.nombre = nombre;
        this.apellido = apellido;
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
    
    
    
    Empleado() {
    
    }
    
}
