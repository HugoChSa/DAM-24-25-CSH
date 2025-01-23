package ud3;

import ud3.apuntes.CuentaCorriente;
import ud3.apuntes.Fecha;
import ud3.apuntes.Persona;

public class EjemploClasesExternas {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Persona p = new Persona("Pepe");
        @SuppressWarnings("unused")
        CuentaCorriente cc = new CuentaCorriente("55555555Z", -45);
        @SuppressWarnings("unused")
        Fecha f = new Fecha();

        /*
        System.out.println(cc.dni);   // NO visible
        System.out.println(cc.nombre);
        System.out.println(cc.saldo); // NO visible
         */
    }
}
