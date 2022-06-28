/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.entidades;


import tienda.persistencia.ProductoDAO;

/**
 *
 * @author humbucker
 */
public class Productoservices {

    private final ProductoDAO dao;

    public Productoservices() {
        this.dao = new ProductoDAO();
    }

   
    public void crearProducto(int codigo, String nombre, double precio, int codigoFabricante) throws Exception {

        try {
            
   

            //Creamos el usuario
            Producto producto = new Producto();
            producto.setCodigo(codigo);
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(codigoFabricante);
            dao.guardarProducto(producto);
        } catch (Exception e) {
            throw e;
        }
    }

    
}
    

