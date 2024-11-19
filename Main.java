public class Main {
    public static void main(String[] args) {
    
        CuentaBancaria cuentaBancaria = new CuentaBancaria(1000);
        cuentaBancaria.depositar(500);
        cuentaBancaria.retirar(300);
        System.out.println("Saldo cuenta bancaria: " + cuentaBancaria.consultardinero());

        
        CuentaBancaria cuentaAhorros = new CuentaAhorros(2000, 5); // 5% de interés
        cuentaAhorros.depositar(500);
        cuentaAhorros.retirar(1000);
        System.out.println("Saldo cuenta ahorros antes de intereses: " + cuentaAhorros.consultardinero());

      
        ((CuentaAhorros) cuentaAhorros).aplicarInteres();
        System.out.println("Saldo cuenta ahorros después de intereses: " + cuentaAhorros.consultardinero());
    }
}