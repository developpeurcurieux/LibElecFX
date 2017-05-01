package model_tableDB;




public class FraisDePort {
    private final long FRA_ID;
    private float fraPrix;
    
    public FraisDePort(long FRA_ID) {
        this.FRA_ID = FRA_ID;
    }
    
    public long getFRA_ID() {
        return this.FRA_ID;
    }
    public float getFraPrix() {
        return fraPrix;
    }
    
    public void setFraPrix(float fraPrix) {
        this.fraPrix = fraPrix;
    }
    
}
