package Modelo;

/**
 * La clase Venta representa una venta realizada en el sistema.
 * Contiene información sobre el cliente, vendedor, total y fecha de la venta.
 */
public class Venta {
    private int id; // Identificador de la venta
    private int cliente; // Identificador del cliente asociado a la venta
    private String nombre_cli; // Nombre del cliente asociado a la venta
    private String vendedor; // Nombre del vendedor que realizó la venta
    private double total; // Total de la venta
    private String fecha; // Fecha de la venta

    /**
     * Constructor por defecto de la clase Venta.
     */
    public Venta() {

    }

    /**
     * Constructor de la clase Venta que inicializa todos los atributos.
     *
     * @param id         el identificador de la venta
     * @param cliente    el identificador del cliente asociado a la venta
     * @param nombre_cli el nombre del cliente asociado a la venta
     * @param vendedor   el nombre del vendedor que realizó la venta
     * @param total      el total de la venta
     * @param fecha      la fecha de la venta
     */
    public Venta(int id, int cliente, String nombre_cli, String vendedor, double total, String fecha) {
        this.id = id;
        this.cliente = cliente;
        this.nombre_cli = nombre_cli;
        this.vendedor = vendedor;
        this.total = total;
        this.fecha = fecha;
    }

    // Métodos getters y setters

    /**
     * Obtiene el identificador de la venta.
     *
     * @return el identificador de la venta
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador de la venta.
     *
     * @param id el identificador de la venta
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el identificador del cliente asociado a la venta.
     *
     * @return el identificador del cliente asociado a la venta
     */
    public int getCliente() {
        return cliente;
    }

    /**
     * Establece el identificador del cliente asociado a la venta.
     *
     * @param cliente el identificador del cliente asociado a la venta
     */
    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    /**
     * Obtiene el nombre del cliente asociado a la venta.
     *
     * @return el nombre del cliente asociado a la venta
     */
    public String getNombre_cli() {
        return nombre_cli;
    }

    /**
     * Establece el nombre del cliente asociado a la venta.
     *
     * @param nombre_cli el nombre del cliente asociado a la venta
     */
    public void setNombre_cli(String nombre_cli) {
        this.nombre_cli = nombre_cli;
    }

    /**
     * Obtiene el nombre del vendedor que realizó la venta.
     *
     * @return el nombre del vendedor que realizó la venta
     */
    public String getVendedor() {
        return vendedor;
    }

    /**
     * Establece el nombre del vendedor que realizó la venta.
     *
     * @param vendedor el nombre del vendedor que realizó la venta
     */
    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    /**
     * Obtiene el total de la venta.
     *
     * @return el total de la venta
     */
    public double getTotal() {
        return total;
    }

    /**
     * Establece el total de la venta.
     *
     * @param total el total de la venta
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * Obtiene la fecha de la venta.
     *
     * @return la fecha de la venta
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha de la venta.
     *
     * @param fecha la fecha de la venta
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
