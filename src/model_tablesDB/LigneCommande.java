package model_tablesDB;


public class LigneCommande {
    private long LIG_ID;
    private long comId;
    private String isbn;
    private long aviId;
    private int ligQuantiteCommandee;
    private float ligPrix;
    private float ligTva;
    private float ligReduction;

    
    public LigneCommande(long LIG_ID) {
         this.LIG_ID = LIG_ID;
    }
    
    
    public LigneCommande(long LIG_ID, long comId, String isbn, long aviId, int ligQuantiteCommandee, float ligPrix, float ligTva, float ligReduction) {
        this.LIG_ID = LIG_ID;
        this.comId = comId;
        this.isbn = isbn;
        this.aviId = aviId;
        this.ligQuantiteCommandee = ligQuantiteCommandee;
        this.ligPrix = ligPrix;
        this.ligTva = ligTva;
        this.ligReduction = ligReduction;
    }

    public long getLigId() {
        return LIG_ID;
    }

    

    public long getComId() {
        return comId;
    }

    public void setComId(long comId) {
        this.comId = comId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public long getAviId() {
        return aviId;
    }

    public void setAviId(long aviId) {
        this.aviId = aviId;
    }

    public int getLigQuantiteCommandee() {
        return ligQuantiteCommandee;
    }

    public void setLigQuantiteCommandee(int ligQuantiteCommandee) {
        this.ligQuantiteCommandee = ligQuantiteCommandee;
    }

    public float getLigPrix() {
        return ligPrix;
    }

    public void setLigPrix(float ligPrix) {
        this.ligPrix = ligPrix;
    }

    public float getLigTva() {
        return ligTva;
    }

    public void setLigTva(float ligTva) {
        this.ligTva = ligTva;
    }

    public float getLigReduction() {
        return ligReduction;
    }

    public void setLigReduction(float ligReduction) {
        this.ligReduction = ligReduction;
    }
    
    
    
    
    
    
}
