package DAO.ConnectionFactory;

import MODEL.Tusuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TusuarioDAO {

    public boolean login(Tusuario usu) {
        String sql = "SELECT * FROM usuariobda3 WHERE usuario = ? AND senha = ?";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, usu.getUsuario());
            ps.setString(2, usu.getSenha());

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
