/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nando
 */
public class TDAMedicamento {
    private String nombre, descripcion, tipo, presentacion;
    
    public TDAMedicamento(String Nombre,String Descripcion,String Tipo,String Presentacion){
        this.nombre=Nombre;
        this.descripcion=Descripcion;
        this.tipo=Tipo;
        this.presentacion=Presentacion;   
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setPresentacion(String presentacion){
        this.presentacion=presentacion;
    }
    
    public String getPresentacion(){
        return presentacion;
    }
}
