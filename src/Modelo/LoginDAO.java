package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * La clase LoginDAO proporciona métodos para interactuar con la base de datos
 * relacionada con los usuarios. Permite realizar operaciones de autenticación,
 * registro y listado de usuarios.
 * 
 * <p>
 * Esta clase utiliza una conexión a la base de datos proporcionada por la clase
 * {@link Conexion} y utiliza SQL para realizar las operaciones.
 * </p>
 * 
 * @version 1.0
 * @since 2024-06-06
 */
public class LoginDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();

    /**
     * Autentica un usuario dado su correo y contraseña.
     * 
     * @param correo el correo del usuario
     * @param pass   la contraseña del usuario
     * @return un objeto {@link login} que contiene la información del usuario si se
     *         encuentra,
     *         de lo contrario, devuelve un objeto vacío.
     */
    public login log(String correo, String pass) {
        login l = new login();
        String sql = "SELECT * FROM usuarios WHERE correo = ? AND pass = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, correo);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            if (rs.next()) {
                l.setId(rs.getInt("id"));
                l.setNombre(rs.getString("nombre"));
                l.setCorreo(rs.getString("correo"));
                l.setPass(rs.getString("pass"));
                l.setRol(rs.getString("rol"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return l;
    }

    /**
     * Registra un nuevo usuario en la base de datos.
     * 
     * @param reg el objeto {@link login} que contiene la información del nuevo
     *            usuario
     * @return true si el usuario fue registrado exitosamente, false en caso
     *         contrario
     */
    public boolean Registrar(login reg) {
        String sql = "INSERT INTO usuarios (nombre, correo, pass, rol) VALUES (?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, reg.getNombre());
            ps.setString(2, reg.getCorreo());
            ps.setString(3, reg.getPass());
            ps.setString(4, reg.getRol());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }

    /**
     * Lista todos los usuarios de la base de datos.
     * 
     * @return una lista de objetos {@link  login} que contienen la información de
     *         cada usuario
     */
    public List<login> ListarUsuarios() {
        List<login> Lista = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                login lg = new login();
                lg.setId(rs.getInt("id"));
                lg.setNombre(rs.getString("nombre"));
                lg.setCorreo(rs.getString("correo"));
                lg.setRol(rs.getString("rol"));
                Lista.add(lg);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return Lista;
    }
}
