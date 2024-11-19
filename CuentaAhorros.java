 class CuentaAhorros extends CuentaBancaria {
        private double tasaInteres;
    
        public CuentaAhorros(double dineroInicial, double tasaInteres) {
            super(dineroInicial);
            this.tasaInteres = tasaInteres;
        }
    
        // Método para calcular intereses
        public void aplicarInteres() {
            dinero += dinero * (tasaInteres / 100);
        }
    }

