package ejercicio1;

public class CuentaCorriente {

    // atributos
    private double saldo;
    private String nombreTitular;
    private long numeroCuenta;

    // constructor
    public CuentaCorriente(String nombreTitular, double saldo) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        this.numeroCuenta = (long) (Math.random() * 10000000000000000L);

    }

    // metodos set
    public void setIngresar(double cantidad) {
        if(cantidad < 0) System.out.println("No se puede ingresar una cantidad negativa");
         
        saldo += cantidad;
    }

    public void setRetirar(double cantidad) {
        saldo -= cantidad;
    }

    // metodos get
    public String getSaldo(){
        return "El saldo de la cuenta es: " + saldo;
    }

    public String getDatosCuenta(){
        return "Nombre del titular: " + nombreTitular + "\nNumero de cuenta: " + numeroCuenta + "\nSaldo: " + saldo;
    }

    // Transferir dinero
    public static void Transferencia(CuentaCorriente origen, CuentaCorriente destino, double cantidad) {
        origen.setRetirar(cantidad);
        destino.setIngresar(cantidad);
    }

}
