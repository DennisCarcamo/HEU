package heu;

public class Paramedicos {
    private String nombreParamedico;
    private int edad;
    private String ID;
    private Ranking rank;
    private String complejoHospitalario;

    public Paramedicos() {
    }

    public Paramedicos(String nombreParamedico, int edad, String ID, Ranking rank, String complejoHospitalario) {
        this.nombreParamedico = nombreParamedico;
        this.edad = edad;
        this.ID = ID;
        this.rank = rank;
        this.complejoHospitalario = complejoHospitalario;
    }

    public String getNombreParamedico() {
        return nombreParamedico;
    }

    public void setNombreParamedico(String nombreParamedico) {
        this.nombreParamedico = nombreParamedico;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Ranking getRank() {
        return rank;
    }

    public void setRank(Ranking rank) {
        this.rank = rank;
    }

    public String getComplejoHospitalario() {
        return complejoHospitalario;
    }

    public void setComplejoHospitalario(String complejoHospitalario) {
        this.complejoHospitalario = complejoHospitalario;
    }

    @Override
    public String toString() {
        return nombreParamedico + ", ranking=" + rank;
    }
    
    
    
}
