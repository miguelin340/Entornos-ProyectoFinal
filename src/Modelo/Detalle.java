package Modelo;

/**
 * La clase Detalle representa el detalle de una transacción de venta,
 * incluyendo
 * el identificador del detalle, el identificador del producto, la cantidad, el
 * precio
 * y el identificador de la venta.
 * 
 * 
 * Esta clase proporciona métodos para obtener y establecer los atributos de un
 * detalle de venta. También incluye un constructor por defecto y un constructor
 * parametrizado para facilitar la creación de instancias de Detalle.
 * Ejemplo de uso:
 * 
 * 
 * {@code
 * Detalle detalle = new Detalle(1, 100, 2, 50.0, 1);
 * int id = detalle.getId();
 * int cantidad = detalle.getCantidad();
 * detalle.setPrecio(45.0);
 * }
 * @version 1.0
 * @since 2024-06-06
 */
public class Detalle {
    private int id;
    private int id_pro;
    private int cantidad;
    private double precio;
    private int id_venta;

    /**
     * Crea una nueva instancia de Detalle con valores predeterminados.
     */
    public Detalle() {

    }

    /**
     * Crea una nueva instancia de Detalle con los valores especificados.
     * 
     * @param id       el identificador único del detalle
     * @param id_pro   el identificador del producto
     * @param cantidad la cantidad de productos
     * @param precio   el precio del producto
     * @param id_venta el identificador de la venta
     */
    public Detalle(int id, int id_pro, int cantidad, double precio, int id_venta) {
        this.id = id;
        this.id_pro = id_pro;
        this.cantidad = cantidad;
        this.precio = precio;
        this.id_venta = id_venta;
    }

    /**
     * Obtiene el identificador del detalle.
     * 
     * @return el identificador del detalle
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador del detalle.
     * 
     * @param id el nuevo identificador del detalle
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el identificador del producto.
     * 
     * @return el identificador del producto
     */
    public int getId_pro() {
        return id_pro;
    }

    /**
     * Establece el identificador del producto.
     * 
     * @param id_pro el nuevo identificador del producto
     */
    public void setId_pro(int id_pro) {
        this.id_pro = id_pro;
    }

    /**
     * Obtiene la cantidad de productos.
     * 
     * @return la cantidad de productos
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad de productos.
     * 
     * @param cantidad la nueva cantidad de productos
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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

    /**
     * Obtiene el identificador de la venta.
     * 
     * @return el identificador de la venta
     */
    public int getId_venta() {
        return id_venta;
    }

    /**
     * Establece el identificador de la venta.
     * 
     * @param id_venta el nuevo identificador de la venta
     */
    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }
}
