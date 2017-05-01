package model_tableDB;




public class Livre {
    private final String LIV_ISBN;
    private long ediId;
    private long tvaId;
    private long proId;
    private String ouvNom;
    private int livEdition;
    private String livDateEdition;
    private String livResume;
    private float livPrix;
    private int livStock;
    private String livImage;
    private String livSousTitre;
    private long livStatut;
    private String livChampLibre;
    
    public Livre(String LIV_ISBN) {
        this.LIV_ISBN = LIV_ISBN;
    }
    
    public String getLIV_ISBN() {
        return this.LIV_ISBN;
    }
    
    public long getEdiId() {
        return ediId;
    }
    
    public void setEdiId(long ediId) {
        this.ediId = ediId;
    }
    
    public long getTvaId() {
        return tvaId;
    }
    
    public void setTvaId(long tvaId) {
        this.tvaId = tvaId;
    }
    
    public long getProId() {
        return proId;
    }
    
    public void setProId(long proId) {
        this.proId = proId;
    }
    
    public String getOuvNom() {
        return ouvNom;
    }
    
    public void setOuvNom(String ouvNom) {
        this.ouvNom = ouvNom;
    }
    
    public int getLivEdition() {
        return livEdition;
    }
    
    public void setLivEdition(int livEdition) {
        this.livEdition = livEdition;
    }
    
    public String getLivDateEdition() {
        return livDateEdition;
    }
    
    public void setLivDateEdition(String livDateEdition) {
        this.livDateEdition = livDateEdition;
    }
    
    public String getLivResume() {
        return livResume;
    }
    
    public void setLivResume(String livResume) {
        this.livResume = livResume;
    }
    
    public float getLivPrix() {
        return livPrix;
    }
    
    public void setLivPrix(float livPrix) {
        this.livPrix = livPrix;
    }
    
    public int getLivStock() {
        return livStock;
    }
    
    public void setLivStock(int livStock) {
        this.livStock = livStock;
    }
    
    public String getLivImage() {
        return livImage;
    }
    
    public void setLivImage(String livImage) {
        this.livImage = livImage;
    }
    
    public String getLivSousTitre() {
        return livSousTitre;
    }
    
    public void setLivSousTitre(String livSousTitre) {
        this.livSousTitre = livSousTitre;
    }
    
    public long getLivStatut() {
        return livStatut;
    }
    
    public void setLivStatut(long livStatut) {
        this.livStatut = livStatut;
    }
    
    public String getLivChampLibre() {
        return livChampLibre;
    }
    
    public void setLivChampLibre(String livChampLibre) {
        this.livChampLibre = livChampLibre;
    }
    
    
    
    
    
    
    
    
    
}