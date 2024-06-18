package MODEL;

import DAO.ConnectionFactory.CadastroprojDAO;

public class Bdproj {

    private int idproj;
    private String nomeproj;
    private String donoproj;
    private String dataproj;
    private String ods;
    private String descproj;

    public Bdproj(int idproj, String nomeproj, String donoproj, String dataproj, String ods, String descproj) {
        this.idproj = idproj;
        this.nomeproj = nomeproj;
        this.donoproj = donoproj;
        this.dataproj = dataproj;
        this.ods = ods;
        this.descproj = descproj;

    }

    public Bdproj() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean Cadastrarproj() {
        CadastroprojDAO cadastropDAO = new CadastroprojDAO();
        return cadastropDAO.cadastroproj(this);
    }

    public int getIdproj() {
        return idproj;
    }

    public void setIdproj(int idproj) {
        this.idproj = idproj;
    }

    public String getNomeproj() {
        return nomeproj;
    }

    public void setNomeproj(String nomeproj) {
        this.nomeproj = nomeproj;
    }

    /**
     * @return the donoproj
     */
    public String getDonoproj() {
        return donoproj;
    }

    /**
     * @param donoproj the donoproj to set
     */
    public void setDonoproj(String donoproj) {
        this.donoproj = donoproj;
    }

    /**
     * @return the dataproj
     */
    public String getDataproj() {
        return dataproj;
    }

    /**
     * @param dataproj the dataproj to set
     */
    public void setDataproj(String dataproj) {
        this.dataproj = dataproj;
    }

    /**
     * @return the ods
     */
    public String getOds() {
        return ods;
    }

    /**
     * @param ods the ods to set
     */
    public void setOds(String ods) {
        this.ods = ods;
    }

    /**
     * @return the descproj
     */
    public String getDescproj() {
        return descproj;
    }

    /**
     * @param descproj the descproj to set
     */
    public void setDescproj(String descproj) {
        this.descproj = descproj;
    }

     @Override
    public String toString() {
        return this.getNomeproj(); // Retorna o nome do projeto para exibir no JComboBox
    }
}
