/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.ConnectionFactory;

import MODEL.Tusuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author lucas
 */
public class ConsutausuarioDAO {

    public Tusuario consultanome(String consulta) {

        String sql = "SELECT * FROM usuariobda3 WHERE usuario = ?";
        try (Connection conexao = new ConnectionFactory().obtemConexao(); PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, consulta);
            

            // Executa a consulta no banco de dados
            ResultSet rs = ps.executeQuery();

            // Verifica se o usuário foi encontrado
            if (rs.next()) {
                String nome = rs.getString("nome");
                String senha = rs.getString("senha");
                String usuario = rs.getString("usuario");
                String end = rs.getString("ender");
                String tel = rs.getString("tel");
                String email = rs.getString("email");
                return new Tusuario(usuario, senha, nome, tel, end, email);

            }
            {
                return null;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;  // Retorna falso em caso de erro
        }
    }
}
