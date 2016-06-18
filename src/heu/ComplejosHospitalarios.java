package heu;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class ComplejosHospitalarios {
    private String nombreComlejo;
    private String direccion;
    private int maxParamedicos;
    private int maxAmbulancias;
    private Ranking rank;
    private PriorityQueue<Paramedicos> paramedicos=new PriorityQueue();
    private ArrayList<Ambulancia> ambulancias= new ArrayList();

    public ComplejosHospitalarios() {
    }

    public ComplejosHospitalarios(String NombreComlejo, String Direccion, int MaxParamedicos, int MaxAmbulancias, Ranking Rank) {
        this.nombreComlejo = NombreComlejo;
        this.direccion = Direccion;
        this.maxParamedicos = MaxParamedicos;
        this.maxAmbulancias = MaxAmbulancias;
        this.rank = Rank;
    }

    public String getNombreComlejo() {
        return nombreComlejo;
    }

    public void setNombreComlejo(String NombreComlejo) {
        this.nombreComlejo = NombreComlejo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String Direccion) {
        this.direccion = Direccion;
    }

    public int getMaxParamedicos() {
        return maxParamedicos;
    }

    public void setMaxParamedicos(int MaxParamedicos) {
        this.maxParamedicos = MaxParamedicos;
    }

    public int getMaxAmbulancias() {
        return maxAmbulancias;
    }

    public void setMaxAmbulancias(int MaxAmbulancias) {
        this.maxAmbulancias = MaxAmbulancias;
    }

    public Ranking getRank() {
        return rank;
    }

    public void setRank(Ranking Rank) {
        this.rank = Rank;
    }

    public PriorityQueue<Paramedicos> getParamedicos() {
        return paramedicos;
    }

    public void setParamedicos(PriorityQueue<Paramedicos> paramedicos) {
        this.paramedicos = paramedicos;
    }

    public ArrayList<Ambulancia> getAmbulancias() {
        return ambulancias;
    }

    public void setAmbulancias(ArrayList<Ambulancia> ambulancias) {
        this.ambulancias = ambulancias;
    }

    @Override
    public String toString() {
        return  nombreComlejo;
    }  
}
