package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    private ConexionDB(){}

    private static final String URL_DB = "jdbc:mysql://localhost:3306/comicion";
    private static final String USER = "root";
    private static final String PASSWORD = System.getenv("miPASSWORD");

    public static Connection obtenerConexion() throws SQLException {
        try {
            // Cargar el driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("No se encontró el driver JDBC", e);
        }
        return DriverManager.getConnection(URL_DB, USER, PASSWORD);
    }

    //Prueba de conexion
//        public static void main(String[] args) {
//            try {
//                Connection con = ConexionDB.obtenerConexion();
//                if(con != null){
//                    System.out.println("Conexion exitosa");
//                }
//            } catch (SQLException e) {
//                System.out.println(e.getMessage());
//            }
//        }

}
