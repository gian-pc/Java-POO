package poo;

public class Vehiculos {

    // Atributos
    private int ruedas;
    private String color;
    private int largo;
    private int ancho;
    private int peso;

    // Constructor
    public Vehiculos(int ruedas) {
        this.ruedas = ruedas;
        color = "Sin color";
        largo = 2;
        ancho = 1;
        peso = 2;
    }

    // Métodos setter
    public void setColor(String color) {
        this.color = color;
    }

    // Método getter
    public String getColor() {
        return color;

    }

    public int getRueas() {
        return ruedas;
    }
}
