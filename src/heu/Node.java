package heu;

import java.util.ArrayList;

public class Node {

    private Object value;
    private int ID;
    private ArrayList aristas = new ArrayList();

    public Node(Object value) {
        this.value = value;
    }

    public Node(Object value, int id) {
        this.value = value;
        this.ID = id;
    }

    public Node() {
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList getAristas() {
        return aristas;
    }

    public void setAristas(ArrayList relations) {
        this.aristas = relations;
    }

    @Override
    public String toString() {
        return value+"";
    }

}
