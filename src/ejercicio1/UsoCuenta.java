package ejercicio1;

public class UsoCuenta {
    public static void main(String[] args) {

        CuentaCorriente cuenta1 = new CuentaCorriente("Juan", 1500);
        CuentaCorriente cuenta2 = new CuentaCorriente("Maria", 2500);

      

        CuentaCorriente.Transferencia(cuenta1, cuenta2, 200);

        System.out.println(cuenta1.getDatosCuenta()); // Nombre del titular: Juan, Numero de cuenta: 1234567890123456, Saldo: 1300.0
        System.out.println("--------------------");
        System.out.println(cuenta2.getDatosCuenta()); // Nombre del titular: Maria, Numero de cuenta: 2876380638165511, Saldo: 2700.0
    }

}
