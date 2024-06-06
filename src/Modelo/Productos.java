package Modelo;

/**
 * La clase Productos representa un producto en el sistema, con su respectiva
 * información
 * como el identificador, código, nombre, proveedor, stock y precio.
 * 
 * @version 1.0
 * @since 2024-06-06
 */
public class Productos {
    private int id;
    private String codigo;
    private String nombre;
    private int proveedor;
    private String proveedorPro;
    private int stock;
    private double precio;

    /**
     * Crea una nueva instancia de Productos con valores predeterminados.
     */
    public Productos() {

    }

    /**
     * Crea una nueva instancia de Productos con los valores especificados.
     * 
     * @param id           el identificador del producto
     * @param codigo       el código del producto
     * @param nombre       el nombre del producto
     * @param proveedor    el identificador del proveedor del producto
     * @param proveedorPro el nombre del proveedor del producto
     * @param stock        el stock disponible del producto
     * @param precio       el precio del producto
     */
    public Productos(int id, String codigo, String nombre, int proveedor, String proveedorPro, int stock,
            double precio) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.proveedorPro = proveedorPro;
        this.stock = stock;
        this.precio = precio;
    }

    /**
     * Obtiene el identificador del producto.
     * 
     * @return el identificador del producto
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador del producto.
     * 
     * @param id el nuevo identificador del producto
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el código del producto.
     * 
     * @return el código del producto
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Establece el código del producto.
     * 
     * @param codigo el nuevo código del producto
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene el nombre del producto.
     * 
     * @return el nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto.
     * 
     * @param nombre el nuevo nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el identificador del proveedor del producto.
     * 
     * @return el identificador del proveedor del producto
     */
    public int getProveedor() {
        return proveedor;
    }

    /**
     * Establece el identificador del proveedor del producto.
     * 
     * @param proveedor el nuevo identificador del proveedor del producto
     */
    public void setProveedor(int proveedor) {
        this.proveedor = proveedor;
    }

    /**
     * Obtiene el nombre del proveedor del producto.
     * 
     * @return el nombre del proveedor del producto
     */
    public String getProveedorPro() {
        return proveedorPro;
    }

    /**
     * Establece el nombre del proveedor del producto.
     * 
     * @param proveedorPro el nuevo nombre del proveedor del producto
     */
    public void setProveedorPro(String proveedorPro) {
        this.proveedorPro = proveedorPro;
    }

    /**
     * Obtiene el stock disponible del producto.
     * 
     * @return el stock disponible del producto
     */
    public int getStock() {
        return stock;
    }

    /**
     * Establece el stock disponible del producto.
     * 
     * @param stock el nuevo stock disponible del producto
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Obtiene el precio del producto.
     * 
     * @return el precio del producto
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto.
     * 
     * @param precio el nuevo precio del producto
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
