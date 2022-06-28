/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;

/**
 *
 * @author humbucker
 */
public final class ProductoDAO extends DAO {

    public void guardarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("debe indicar producto");

            }
            String sql = "INSERT INTO Producto (codigo, nombre, precio, codigoFabricante)"
                    + "VALUES ( '" + producto.getCodigo() + "' , ' " + producto.getNombre()
                    + "' , '" + producto.getPrecio() + " ' , ' " + producto.getCodigoFabricante() + "');";
            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Producto> listarProductos() throws Exception {
        try {
            String sql = "SELECT nombre, clave FROM producto ";

            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getInt(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);


            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    public Producto buscarProductoPorNombre(String nombre) throws Exception {
        try {
            String sql = "SELECT * FROM Producto" + "WHERE nombre = '" + nombre + "'";

            consultarBase(sql);

            Producto producto = null;

            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getInt(3));
                producto.setCodigoFabricante(resultado.getInt(4));

            }
            desconectarBase();
            return producto;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }

    }
}
