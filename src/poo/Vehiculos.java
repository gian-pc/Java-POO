package poo;

public class Vehiculos {

    // Atributos
    private int ruedas;
    private String color;
    private int largo;
    private int ancho;
    private int peso;

    // Constructor
    public Vehiculos() {
        ruedas = 4;
        color = "Sin color";
        largo = 2;
        ancho = 1;
        peso = 2;
    }

    // Métodos setter
    public void setColor() {
        color = "Azul";
    }

    // Método getter
    public String getColor() {
        return color;

    }
}
