package Modelo;

/**
 * La clase Config representa la configuración de una entidad, incluyendo su
 * identificador, RUC, nombre, teléfono, dirección y mensaje.
 * 
 * 
 * Esta clase proporciona métodos para obtener y establecer los atributos de
 * configuración de la entidad. También incluye un constructor por defecto y un
 * constructor parametrizado para facilitar la creación de instancias de Config.
 * 
 * 
 * 
 * Ejemplo de uso:
 * 
 * 
 * {@code
 * Config config = new Config(1, "1234567890", "Mi Empresa", "555-5555", "Calle Falsa 123", "Bienvenidos a Mi Empresa");
 * int id = config.getId();
 * String nombre = config.getNombre();
 * config.setTelefono("555-5556");
 * }
 * 
 * 
 * 
 * @version 1.0
 * @since 2024-06-06
 */
public class Config {
    private int id;
    private String ruc;
    private String nombre;
    private String telefono;
    private String direccion;
    private String mensaje;

    /**
     * Crea una nueva instancia de Config con valores predeterminados.
     */
    public Config() {

    }

    /**
     * Crea una nueva instancia de Config con los valores especificados.
     * 
     * @param id        el identificador único de la configuración
     * @param ruc       el RUC (Registro Único de Contribuyentes) de la entidad
     * @param nombre    el nombre de la entidad
     * @param telefono  el teléfono de contacto de la entidad
     * @param direccion la dirección de la entidad
     * @param mensaje   un mensaje asociado con la entidad
     */
    public Config(int id, String ruc, String nombre, String telefono, String direccion, String mensaje) {
        this.id = id;
        this.ruc = ruc;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.mensaje = mensaje;
    }

    /**
     * Obtiene el identificador de la configuración.
     * 
     * @return el identificador de la configuración
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador de la configuración.
     * 
     * @param id el nuevo identificador de la configuración
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el RUC de la entidad.
     * 
     * @return el RUC de la entidad
     */
    public String getRuc() {
        return ruc;
    }

    /**
     * Establece el RUC de la entidad.
     * 
     * @param ruc el nuevo RUC de la entidad
     */
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    /**
     * Obtiene el nombre de la entidad.
     * 
     * @return el nombre de la entidad
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la entidad.
     * 
     * @param nombre el nuevo nombre de la entidad
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el teléfono de contacto de la entidad.
     * 
     * @return el teléfono de contacto de la entidad
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el teléfono de contacto de la entidad.
     * 
     * @param telefono el nuevo teléfono de contacto de la entidad
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene la dirección de la entidad.
     * 
     * @return la dirección de la entidad
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección de la entidad.
     * 
     * @param direccion la nueva dirección de la entidad
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene el mensaje asociado con la entidad.
     * 
     * @return el mensaje asociado con la entidad
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Establece el mensaje asociado con la entidad.
     * 
     * @param mensaje el nuevo mensaje asociado con la entidad
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
