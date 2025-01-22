package ud3.apuntes;

public class CuentaCorriente {
    String dni;
    String titular;
    private double saldo;
    private Gestor gestor;
    private static String banco;

    public CuentaCorriente(String dni, String titular, double saldo) {
        this.dni = dni;
        this.titular = titular;
        this.saldo = saldo < 0 ? 0 : saldo;
    }

    CuentaCorriente(String dni, String titular) {
        this(dni, titular, 0);
    }
    
    public CuentaCorriente(String dni, double saldo) {
        this(dni, null, saldo);
    }


    public static String getBanco() {
        return banco;
    }
    public static void setBanco(String banco) {
        CuentaCorriente.banco = banco;
    }


    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }


    public boolean sacarDinero(double importe) {
        if (saldo >= importe)  {
            saldo -= importe;
            return true;
        } else {
            return false;
        }
    }

    public void ingresarDinero(double importe) {
        saldo += importe;
    }


   public void mostrar(){
        System.out.println("CUENTA CORRIENTE: ");
        System.out.println("- Titular: " + titular + " (DNI = " + dni + ")");
        System.out.println("- Saldo: " + saldo + " euros");
      /*    if (gestor != null){
            System.out.println("-");
            gestor.mostrar();}*/
    }    


    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente("555555555Z", "Pepe", 1000);
        CuentaCorriente cc2 = new CuentaCorriente("333333333R", "María", 2000);

        CuentaCorriente.setBanco("Abanca");

        System.out.println(CuentaCorriente.getBanco());
        cc.mostrar();
        cc2.mostrar();

        Gestor gestor = new Gestor("Gestoría Pepe", "986868686");
        cc.gestor = gestor;
        System.out.println(cc.gestor.nombre + " (" + cc.gestor.telefono + ")");
    }

}
