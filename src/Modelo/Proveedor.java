package Modelo;

/**
 * La clase Proveedor representa un proveedor de productos.
 * Contiene información como el identificador, el RUC, el nombre,
 * el teléfono y la dirección del proveedor.
 * 
 * @version 1.0
 * @since 2024-06-06
 */
public class Proveedor {
    private int id;
    private String ruc;
    private String nombre;
    private String telefono;
    private String direccion;

    /**
     * Constructor por defecto de la clase Proveedor.
     */
    public Proveedor() {

    }

    /**
     * Constructor con parámetros de la clase Proveedor.
     * 
     * @param id        el identificador del proveedor
     * @param ruc       el RUC del proveedor
     * @param nombre    el nombre del proveedor
     * @param telefono  el teléfono del proveedor
     * @param direccion la dirección del proveedor
     */
    public Proveedor(int id, String ruc, String nombre, String telefono, String direccion) {
        this.id = id;
        this.ruc = ruc;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    /**
     * Obtiene el identificador del proveedor.
     * 
     * @return el identificador del proveedor
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador del proveedor.
     * 
     * @param id el identificador del proveedor a establecer
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el RUC del proveedor.
     * 
     * @return el RUC del proveedor
     */
    public String getRuc() {
        return ruc;
    }

    /**
     * Establece el RUC del proveedor.
     * 
     * @param ruc el RUC del proveedor a establecer
     */
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    /**
     * Obtiene el nombre del proveedor.
     * 
     * @return el nombre del proveedor
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del proveedor.
     * 
     * @param nombre el nombre del proveedor a establecer
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el teléfono del proveedor.
     * 
     * @return el teléfono del proveedor
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el teléfono del proveedor.
     * 
     * @param telefono el teléfono del proveedor a establecer
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene la dirección del proveedor.
     * 
     * @return la dirección del proveedor
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del proveedor.
     * 
     * @param direccion la dirección del proveedor a establecer
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
