package model_tablesDB;


public class Destinataire {
    private long DES_ID;
    private long cliId;
    private String desNom;
    private String desPrenom;
    private String desEmail;
    private String desTel;
    private int desStatut;
    
    public Destinataire(long DES_ID) {
        this.DES_ID = DES_ID;
    }

    public Destinataire(long DES_ID, long cliId, String desNom, String desPrenom, String desEmail, String desTel, int desStatut) {
        this.DES_ID = DES_ID;
        this.cliId = cliId;
        this.desNom = desNom;
        this.desPrenom = desPrenom;
        this.desEmail = desEmail;
        this.desTel = desTel;
        this.desStatut = desStatut;
    }

    public long getDesId() {
        return DES_ID;
    }

   

    public long getCliId() {
        return cliId;
    }

    public void setCliId(long cliId) {
        this.cliId = cliId;
    }

    public String getDesNom() {
        return desNom;
    }

    public void setDesNom(String desNom) {
        this.desNom = desNom;
    }

    public String getDesPrenom() {
        return desPrenom;
    }

    public void setDesPrenom(String desPrenom) {
        this.desPrenom = desPrenom;
    }

    public String getDesEmail() {
        return desEmail;
    }

    public void setDesEmail(String desEmail) {
        this.desEmail = desEmail;
    }

    public String getDesTel() {
        return desTel;
    }

    public void setDesTel(String desTel) {
        this.desTel = desTel;
    }

    public int getDesStatut() {
        return desStatut;
    }

    public void setDesStatut(int desStatut) {
        this.desStatut = desStatut;
    }
    
}
