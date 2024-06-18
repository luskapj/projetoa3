package MODEL;


import DAO.ConnectionFactory.CadastrousuarioDAO;
import DAO.ConnectionFactory.ConsutausuarioDAO;
import DAO.ConnectionFactory.TusuarioDAO;

/**
 *
 * @author lucas
 */
public class Tusuario {

    private String usuario;
    private String senha;
    private String nome;
    private String tel;
    private String ender;
    private String email;

    public Tusuario(String usuario, String senha, String nome, String tel, String ender, String email) {
        this.usuario = usuario;
        this.senha = senha;
        this.nome = nome;
        this.tel = tel;
        this.ender = ender;
        this.email = email;
    }

    public Tusuario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean Cadastrar() {
        CadastrousuarioDAO cadastroDAO = new CadastrousuarioDAO();
        return cadastroDAO.cadastro(this);
    }

    public boolean logar() {
        TusuarioDAO usuDAO = new TusuarioDAO();
        return usuDAO.login(this);
    }

    /**
     * @return the cpf
     */
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return the end
     */
    public String getEnder() {
        return ender;
    }

    /**
     * @param ender the end to set
     */
    public void setEnder(String ender) {
        this.ender = ender;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public Tusuario consultanome() {
        ConsutausuarioDAO consultanomDAO = new ConsutausuarioDAO();
        return consultanomDAO.consultanome(this.getUsuario());
    }

    public String toString() {
        return getUsuario(); //To change body of generated methods, choose Tools | Templates.
    }
}
