
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class probarConexion
{

    public static void main(String[] args) {
        probarConexion();
    }

    public static void probarConexion() {
        try (Connection conn = Database.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM materias")) {

            if (rs.next()) {
                int total = rs.getInt(1);
                System.out.println("Materias en la base de datos: " + total);
            }

        } catch (Exception e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
    }
}
