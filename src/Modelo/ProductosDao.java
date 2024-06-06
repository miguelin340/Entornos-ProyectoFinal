
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * La clase ProductosDao proporciona métodos para interactuar con la base de datos relacionada
 * con los productos. Permite realizar operaciones como registrar, listar, eliminar, modificar
 * y buscar productos.
 * 
 * @version 1.0
 * @since 2024-06-06
 */
public class ProductosDao {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    /**
     * Registra un nuevo producto en la base de datos.
     * 
     * @param pro el objeto {@link Productos} que contiene la información del nuevo producto
     * @return true si el producto fue registrado exitosamente, false en caso contrario
     */
    public boolean RegistrarProductos(Productos pro) {
        String sql = "INSERT INTO productos (codigo, nombre, proveedor, stock, precio) VALUES (?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getCodigo());
            ps.setString(2, pro.getNombre());
            ps.setInt(3, pro.getProveedor());
            ps.setInt(4, pro.getStock());
            ps.setDouble(5, pro.getPrecio());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    /**
     * Obtiene una lista de todos los productos en la base de datos, incluyendo información
     * del proveedor de cada producto.
     * 
     * @return una lista de objetos {@link Productos} que contienen la información de cada producto
     */
    public List<Productos> ListarProductos() {
        List<Productos> Listapro = new ArrayList<>();
        String sql = "SELECT pr.id AS id_proveedor, pr.nombre AS nombre_proveedor, p.* FROM proveedor pr INNER JOIN productos p ON pr.id = p.proveedor ORDER BY p.id DESC";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {               
                Productos pro = new Productos();
                pro.setId(rs.getInt("id"));
                pro.setCodigo(rs.getString("codigo"));
                pro.setNombre(rs.getString("nombre"));
                pro.setProveedor(rs.getInt("id_proveedor"));
                pro.setProveedorPro(rs.getString("nombre_proveedor"));
                pro.setStock(rs.getInt("stock"));
                pro.setPrecio(rs.getDouble("precio"));
                Listapro.add(pro);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return Listapro;
    }
    
    /**
     * Elimina un producto de la base de datos dado su identificador.
     * 
     * @param id el identificador del producto a eliminar
     * @return true si el producto fue eliminado exitosamente, false en caso contrario
     */
    public boolean EliminarProductos(int id) {
        String sql = "DELETE FROM productos WHERE id = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }
    
    /**
     * Modifica la información de un producto en la base de datos.
     * 
     * @param pro el objeto {@link Productos} que contiene la información actualizada del producto
     * @return true si la modificación fue exitosa, false en caso contrario
     */
    public boolean ModificarProductos(Productos pro) {
        String sql = "UPDATE productos SET codigo=?, nombre=?, proveedor=?, stock=?, precio=? WHERE id=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getCodigo());
            ps.setString(2, pro.getNombre());
            ps.setInt(3, pro.getProveedor());
            ps.setInt(4, pro.getStock());
            ps.setDouble(5, pro.getPrecio());
            ps.setInt(6, pro.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    
    /**
     * Busca un producto en la base de datos dado su código.
     * 
     * @param cod el código del producto a buscar
     * @return un objeto {@link Productos} que contiene la información del producto encontrado, o un objeto vacío si no se encuentra
     */
    public Productos BuscarPro(String cod) {
        Productos producto = new Productos();
        String sql = "SELECT * FROM productos WHERE codigo = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cod);
            rs = ps.executeQuery();
            if (rs.next()) {
                producto.setId(rs.getInt("id"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("stock"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return producto;
    }
    
    /**
     * Busca un producto en la base de datos dado su identificador.
     * 
     * @param id el identificador del producto a buscar
     * @return un objeto {@link Productos} que contiene la información del producto encontrado, o un objeto vacío si no se encuentra
     */
    public Productos BuscarId(int id) {
        Productos pro = new Productos();
        String sql = "SELECT pr.id AS id_proveedor, pr.nombre AS nombre_proveedor, p.* FROM proveedor pr INNER JOIN productos p ON p.proveedor = pr.id WHERE p.id = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                pro.setId(rs.getInt("id"));
                pro.setCodigo(rs.getString("codigo"));
                pro.setNombre(rs.getString("nombre"));
                pro.setProveedor(rs.getInt("proveedor"));
                pro.setProveedorPro(rs.getString("nombre_proveedor"));
                pro.setStock(rs.getInt("stock"));
                pro.setPrecio(rs.getDouble("precio"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return pro;
    }
    
    /**
     * Busca un proveedor en la base de datos dado su nombre.
     * 
     * @param nombre el nombre del proveedor a buscar
     * @return un objeto {@link Proveedor} que contiene la información del proveedor encontrado, o un objeto vacío si no se encuentra
     */
    public Proveedor BuscarProveedor(String nombre){
        Proveedor pr = new Proveedor();
        String sql = "SELECT * FROM proveedor WHERE nombre = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            if (rs.next()) {
                pr.setId(rs.getInt("id"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return pr;
    }
    public Config BuscarDatos(){
        Config conf = new Config();
        String sql = "SELECT * FROM config";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                conf.setId(rs.getInt("id"));
                conf.setRuc(rs.getString("ruc"));
                conf.setNombre(rs.getString("nombre"));
                conf.setTelefono(rs.getString("telefono"));
                conf.setDireccion(rs.getString("direccion"));
                conf.setMensaje(rs.getString("mensaje"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return conf;
    }
    
    public boolean ModificarDatos(Config conf){
       String sql = "UPDATE config SET ruc=?, nombre=?, telefono=?, direccion=?, mensaje=? WHERE id=?";
       try {
           ps = con.prepareStatement(sql);
           ps.setString(1, conf.getRuc());
           ps.setString(2, conf.getNombre());
           ps.setString(3, conf.getTelefono());
           ps.setString(4, conf.getDireccion());
           ps.setString(5, conf.getMensaje());
           ps.setInt(6, conf.getId());
           ps.execute();
           return true;
       } catch (SQLException e) {
           System.out.println(e.toString());
           return false;
       }finally{
           try {
               con.close();
           } catch (SQLException e) {
               System.out.println(e.toString());
           }
       }
   }
}
