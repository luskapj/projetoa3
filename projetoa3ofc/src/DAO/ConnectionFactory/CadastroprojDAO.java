package DAO.ConnectionFactory;

import MODEL.Bdproj;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class CadastroprojDAO {

    public boolean cadastroproj(Bdproj cadastroproj) {
        String sql = "INSERT INTO bdproj (idproj, nomeproj, donoproj, dataproj, ods, descproj) VALUES(?, ?,?,?,?,?)";

        try (Connection conexao = new ConnectionFactory().obtemConexao(); PreparedStatement ps = conexao.prepareStatement(sql)) {

            
            ps.setInt(1, cadastroproj.getIdproj());
            ps.setString(2, cadastroproj.getNomeproj());
            ps.setString(3 , cadastroproj.getDonoproj());
            ps.setString(4, cadastroproj.getOds());
            ps.setString(5, cadastroproj.getDataproj());
            ps.setString(6, cadastroproj.getDescproj());

            // Executa a inserção no banco de dados
            ps.execute();

            return true;
        } catch (SQLException ex) {
            ex.printStackTrace(); 
            return false;
        }
    }

}
