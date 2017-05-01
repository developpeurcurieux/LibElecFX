package model_tableDB;




public class Employe {
    private final long EMP_ID;
    private String empMdp;
    private String empNom;
    private String empPrenom;
    private String empDateEntree;
    private String empDateSortie;
    private String empEmail;
    private int empGrade;
    private long empStatut;
    private String empChampLibre;
    
    public Employe(long EMP_ID) {
        this.EMP_ID = EMP_ID;
    }
    
    public long getEMP_ID() {
        return this.EMP_ID;
    }
    
    public String getEmpMdp() {
        return empMdp;
    }
    
    public void setEmpMdp(String empMdp) {
        this.empMdp = empMdp;
    }
    
    public String getEmpNom() {
        return empNom;
    }
    
    public void setEmpNom(String empNom) {
        this.empNom = empNom;
    }
    
    public String getEmpPrenom() {
        return empPrenom;
    }
    
    public void setEmpPrenom(String empPrenom) {
        this.empPrenom = empPrenom;
    }
    
    public String getEmpDateEntree() {
        return empDateEntree;
    }
    
    public void setEmpDateEntree(String empDateEntree) {
        this.empDateEntree = empDateEntree;
    }
    
    public String getEmpDateSortie() {
        return empDateSortie;
    }
    
    public void setEmpDateSortie(String empDateSortie) {
        this.empDateSortie = empDateSortie;
    }
    
    public String getEmpEmail() {
        return empEmail;
    }
    
    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }
    
    public int getEmpGrade() {
        return empGrade;
    }
    
    public void setEmpGrade(int empGrade) {
        this.empGrade = empGrade;
    }
    
    public long getEmpStatut() {
        return empStatut;
    }
    
    public void setEmpStatut(long empStatut) {
        this.empStatut = empStatut;
    }
    
    public String getEmpChampLibre() {
        return empChampLibre;
    }
    
    public void setEmpChampLibre(String empChampLibre) {
        this.empChampLibre = empChampLibre;
    }
    
    
    
}