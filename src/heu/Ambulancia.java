package heu;

public class Ambulancia {
    private String numeroPlaca;
    private int year;
    private int velocidad;
    private String complejoHospitalario;

    public Ambulancia() {
    }

    public Ambulancia(String numeroPlaca, int year, int velocidad, String complejoHospitalario) {
        this.numeroPlaca = numeroPlaca;
        this.year = year;
        this.velocidad = velocidad;
        this.complejoHospitalario = complejoHospitalario;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getComplejoHospitalario() {
        return complejoHospitalario;
    }

    public void setComplejoHospitalario(String complejoHospitalario) {
        this.complejoHospitalario = complejoHospitalario;
    }

    @Override
    public String toString() {
        return numeroPlaca;
    }
    
    
    
}
