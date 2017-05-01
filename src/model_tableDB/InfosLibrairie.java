package model_tableDB;


public class InfosLibrairie {
    private final long INF_ID;
    private String infNom;
    private long infSiret;
    private int infNumVoie;
    private String infNomVoie;
    private String infNomVoieSuite;
    private String infCp;
    private String infVille;
    private String infPays;
    
    public InfosLibrairie(long INF_ID) {
        this.INF_ID = INF_ID;
    }
    
    public long getINF_ID() {
        return this.INF_ID;
    }
    
    public String getInfNom() {
        return infNom;
    }
    
    public void setInfNom(String infNom) {
        this.infNom = infNom;
    }
    
    public long getInfSiret() {
        return infSiret;
    }
    
    public void setInfSiret(long infSiret) {
        this.infSiret = infSiret;
    }
    
    public int getInfNumVoie() {
        return infNumVoie;
    }
    
    public void setInfNumVoie(int infNumVoie) {
        this.infNumVoie = infNumVoie;
    }
    
    public String getInfNomVoie() {
        return infNomVoie;
    }
    
    public void setInfNomVoie(String infNomVoie) {
        this.infNomVoie = infNomVoie;
    }
    
    public String getInfNomVoieSuite() {
        return infNomVoieSuite;
    }
    
    public void setInfNomVoieSuite(String infNomVoieSuite) {
        this.infNomVoieSuite = infNomVoieSuite;
    }
    
    public String getInfCp() {
        return infCp;
    }
    
    public void setInfCp(String infCp) {
        this.infCp = infCp;
    }
    
    public String getInfVille() {
        return infVille;
    }
    
    public void setInfVille(String infVille) {
        this.infVille = infVille;
    }
    
    public String getInfPays() {
        return infPays;
    }
    
    public void setInfPays(String infPays) {
        this.infPays = infPays;
    }
    
    
    
    
    
}