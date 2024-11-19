class CuentaBancaria {
    protected double dinero;

    public CuentaBancaria(double dineroInicial) {
        this.dinero = dineroInicial;
    }

    public void depositar(double monto) {

        dinero += monto;

    }

    public void retirar(double monto) {

        dinero -= monto;

    }

    public double consultardinero() {
        return dinero;
    }
}

