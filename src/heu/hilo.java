package heu;

import javax.swing.JOptionPane;

public class hilo implements Runnable {

    private double tiempo;
    private Paramedicos medico1;
    private Paramedicos medico2;
    private Paramedicos medico3;
    private Ambulancia ambulancia;
    private ComplejosHospitalarios hospital;

    public hilo() {
    }

    public hilo(double tiempo, Paramedicos medico1, Paramedicos medico2, Paramedicos medico3, Ambulancia ambulancia, ComplejosHospitalarios hospital) {
        this.tiempo = tiempo;
        this.medico1 = medico1;
        this.medico2 = medico2;
        this.medico3 = medico3;
        this.ambulancia = ambulancia;
        this.hospital = hospital;
    }

    @Override
    public void run() {
        JOptionPane.showMessageDialog(null, "Iniciando la emergencia");
        try {
            Thread.sleep((long) tiempo*10000);
        } catch (Exception e) {
        }
        JOptionPane.showMessageDialog(null, "Finalizado");
        hospital.getAmbulancias().add(ambulancia);
        hospital.getParamedicos().add(medico1);
        hospital.getParamedicos().add(medico2);
        hospital.getParamedicos().add(medico3);

    }

}
