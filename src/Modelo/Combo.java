package Modelo;


public class Combo {
    private int id;
    private String nombre;

    /**
     * Crea un nuevo combo con el identificador y nombre especificados.
     * 
     * @param id     el identificador único del combo
     * @param nombre el nombre del combo
     */
    public Combo(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    /**
     * Obtiene el identificador del combo.
     * 
     * @return el identificador del combo
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador del combo.
     * 
     * @param id el nuevo identificador del combo
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del combo.
     * 
     * @return el nombre del combo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del combo.
     * 
     * @param nombre el nuevo nombre del combo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve una representación en cadena del nombre del combo.
     * 
     * @return el nombre del combo
     */
    @Override
    public String toString() {
        return this.getNombre();
    }
}
