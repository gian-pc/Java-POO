package poo;

public class UsoVehiculo {
    public static void main(String[] args) {

        Vehiculos coche = new Vehiculos(4);
        Vehiculos motocicleta = new Vehiculos(2);

        coche.setColor("Rojo");

        System.out.println("El coche tiene "+coche.getRueas() + " ruedas y es de color " + coche.getColor()); // El vehículo tiene 4 ruedas y es de color Rojo.
        System.out.println("La motocicleta tiene "+motocicleta.getRueas() + " ruedas y es de color " + motocicleta.getColor()); // La motocicleta tiene 2 ruedas y es de color Sin color.
    }
}
