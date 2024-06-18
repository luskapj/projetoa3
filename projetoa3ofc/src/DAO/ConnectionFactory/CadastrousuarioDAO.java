/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO.ConnectionFactory;

import MODEL.Tusuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class CadastrousuarioDAO {

    public boolean cadastro(Tusuario cadastro) {
        String sql = "INSERT INTO usuariobda3 (usuario, senha, nome, tel, ender, email) VALUES(?,?,?,?,?,?)";

        try (Connection conexao = new ConnectionFactory().obtemConexao(); PreparedStatement ps = conexao.prepareStatement(sql)) {

            
            ps.setString(1, cadastro.getUsuario());
            ps.setString(2, cadastro.getSenha());
            ps.setString(3, cadastro.getNome());
            ps.setString(4, cadastro.getTel());
            ps.setString(5, cadastro.getEnder());
            ps.setString(6, cadastro.getEmail());

            // Executa a inserção no banco de dados
            ps.execute();

            return true;
        } catch (SQLException ex) {
            ex.printStackTrace(); 
            return false;
        }
    }

}
