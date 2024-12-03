package ud3.apuntes;

public class EjemploClaseExternaCuentaCorriente {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente("555555555Z", "Pepe", 1000);
        CuentaCorriente cc2 = new CuentaCorriente("333333333R", "María", 2000);

        CuentaCorriente.setBanco("Abanca");

        System.out.println(CuentaCorriente.getBanco());
        cc.mostrar();
        cc2.mostrar();

        Gestor gestor = new Gestor("Gestoría Pepe", "986868686");
        cc.setGestor(gestor);
        cc2.setGestor(gestor);
    }

}

