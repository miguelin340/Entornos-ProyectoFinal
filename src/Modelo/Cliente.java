
package Modelo;
/**
 * La clase Cliente representa un cliente con atributos básicos como id, dni,
 * nombre, teléfono y dirección.
 */
public class Cliente {
    private int id;
    private String dni;
    private String nombre;
    private String telefono;
    private String direccion;

    /**
     * Constructor por defecto.
     */
    public Cliente() {
    }

    /**
     * Constructor que inicializa un cliente con los valores dados.
     *
     * @param id        el ID del cliente
     * @param dni       el DNI del cliente
     * @param nombre    el nombre del cliente
     * @param telefono  el teléfono del cliente
     * @param direccion la dirección del cliente
     */
    public Cliente(int id, String dni, String nombre, String telefono, String direccion) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    /**
     * Obtiene el ID del cliente.
     *
     * @return el ID del cliente
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el ID del cliente.
     *
     * @param id el ID del cliente
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el DNI del cliente.
     *
     * @return el DNI del cliente
     */
    public String getDni() {
        return dni;
    }

    /**
     * Establece el DNI del cliente.
     *
     * @param dni el DNI del cliente
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return el nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     *
     * @param nombre el nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el teléfono del cliente.
     *
     * @return el teléfono del cliente
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el teléfono del cliente.
     *
     * @param telefono el teléfono del cliente
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene la dirección del cliente.
     *
     * @return la dirección del cliente
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del cliente.
     *
     * @param direccion la dirección del cliente
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}