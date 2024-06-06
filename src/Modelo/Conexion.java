package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * La clase Conexion proporciona métodos para establecer una conexión con una
 * base de datos MySQL.
 * 
 * 
 * Esta clase utiliza el controlador JDBC para conectarse a una base de datos
 * específica y
 * devuelve un objeto Connection que se puede utilizar para interactuar con la
 * base de datos.
 * 
 * 
 * 
 * Ejemplo de uso:
 * 
 * 
 * {@code
 * Conexion conexion = new Conexion();
 * Connection con = conexion.getConnection();
 * if (con != null) {
 *     // Operaciones con la base de datos
 * }
 * }
 * 
 * 
 * 
 * @version 1.0
 * @since 2024-06-06
 */
public class Conexion {

    private Connection con;

    /**
     * Establece una conexión con la base de datos MySQL especificada.
     * 
     * 
     * Este método intenta conectarse a una base de datos MySQL ubicada en
     * "localhost" en el puerto 3306,
     * con el nombre de la base de datos "cafeteria" y usando las credenciales
     * "root" para el usuario
     * y la contraseña.
     * 
     * 
     * @return un objeto {@link Connection} que representa la conexión establecida,
     *         o {@code null} si no se pudo establecer la conexión.
     */
    public Connection getConnection() {
        try {
            String myBD = "jdbc:mysql://localhost:3306/cafeteria";
            con = DriverManager.getConnection(myBD, "root", "root");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }
}
