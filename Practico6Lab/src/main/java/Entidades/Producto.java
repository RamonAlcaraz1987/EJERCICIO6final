/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Entidades.Rubro;

/**
 *
 * @author emanu
 */
public class Producto implements Comparable<Producto>{
    private int codigo;
    private String descripcion;
    private Double precio;
    private Rubro rubro;
    private int stock;

    public Producto() {
    }


    
    public Producto(int codigo, String descripcion, Double precio, Rubro rubro, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.rubro = rubro;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Rubro getRubro() {
        return rubro;
    }

    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    

    
        
        
  


    @Override
    public String toString() {
        return codigo +" "+ descripcion;
    }

    
     @Override
    public int compareTo(Producto t) {
         
          //0-->iguales
        //1-->mayor
        //-1-->menor
        if(this.codigo==t.codigo){
            
            return 0;
            
        }else if(this.codigo >t.codigo){
        
            return 1;
        }else {
        
            return -1;
        }
    }
      
}
