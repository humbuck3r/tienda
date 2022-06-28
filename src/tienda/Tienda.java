/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda;

import tienda.entidades.Productoservices;



/**
 *
 * @author humbucker
 */
public class Tienda {

   

    

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        Productoservices productoService = new Productoservices();
        
        try {
            productoService.crearProducto(5, "prueba", 010, 90);
            productoService.crearProducto(5, "seba", 55, 4);
        } catch (Exception e) {
            System.out.println("error");
            
        }
        
        
        
    }
    
}
