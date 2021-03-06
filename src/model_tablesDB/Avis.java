package model_tablesDB;


public class Avis {
    private final long AVIS_ID; // like PK
    private long cliId;
    private int staType;
    private int aviNote;
    private String aviCommentaire;
    private String aviIp;
    private String aviChampLibre;
    
    
    public Avis(long AVIS_ID) {
    this.AVIS_ID = AVIS_ID;
    }

    public Avis(long AVIS_ID, long cliId, int staType, int aviNote, String aviCommentaire, String aviIp, String aviChampLibre) {
        this.AVIS_ID = AVIS_ID;
        this.cliId = cliId;
        this.staType = staType;
        this.aviNote = aviNote;
        this.aviCommentaire = aviCommentaire;
        this.aviIp = aviIp;
        this.aviChampLibre = aviChampLibre;
    }

    public long getAviId() {
        return AVIS_ID;
    }

   

    public long getCliId() {
        return cliId;
    }

    public void setCliId(long cliId) {
        this.cliId = cliId;
    }

    public int getStaType() {
        return staType;
    }

    public void setStaType(int staType) {
        this.staType = staType;
    }

    public int getAviNote() {
        return aviNote;
    }

    public void setAviNote(int aviNote) {
        this.aviNote = aviNote;
    }

    public String getAviCommentaire() {
        return aviCommentaire;
    }

    public void setAviCommentaire(String aviCommentaire) {
        this.aviCommentaire = aviCommentaire;
    }

    public String getAviIp() {
        return aviIp;
    }

    public void setAviIp(String aviIp) {
        this.aviIp = aviIp;
    }

    public String getAviChampLibre() {
        return aviChampLibre;
    }

    public void setAviChampLibre(String aviChampLibre) {
        this.aviChampLibre = aviChampLibre;
    }
    
    
    
}
