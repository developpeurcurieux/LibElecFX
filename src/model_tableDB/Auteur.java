package model_tableDB;




public class Auteur {
    private final long AUT_ID;
    private String autNom;
    private String autPrenom;
    private String autDateNaissance;
    private int autGenre;
    private String autBio;    
            
    public Auteur(long AUT_ID) {
     this.AUT_ID = AUT_ID;
    }

    public long getAUT_ID() {
     return this.AUT_ID;   
    }
    public String getAutNom() {
        return autNom;
    }

    public void setAutNom(String autNom) {
        this.autNom = autNom;
    }

    public String getAutPrenom() {
        return autPrenom;
    }

    public void setAutPrenom(String autPrenom) {
        this.autPrenom = autPrenom;
    }

    public String getAutDateNaissance() {
        return autDateNaissance;
    }

    public void setAutDateNaissance(String autDateNaissance) {
        this.autDateNaissance = autDateNaissance;
    }

    public int getAutGenre() {
        return autGenre;
    }

    public void setAutGenre(int autGenre) {
        this.autGenre = autGenre;
    }

    public String getAutBio() {
        return autBio;
    }

    public void setAutBio(String autBio) {
        this.autBio = autBio;
    }

}