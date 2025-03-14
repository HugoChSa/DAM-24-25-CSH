package ud5.inmobiliaria.ud5.inmobiliaria;

public class ListarYOrdenarInmuebles {
    public void main(String[] args) {
        Inmueble piso1 = new Piso("Calle Curtidoira", 100, 3, 2, 5);
        piso1.setPrecioAlquiler(500);
        piso1.setPrecioVenta(200000);


        // Crea otros dos pisos
        Inmueble piso2 = new Piso("Praza Maior", 80, 2, 2, 3);
        piso2.setPrecioAlquiler(400);
        Inmueble piso3 = new Piso("Calle Rosalía de Castro", 140, 4, 2, 2);
        piso3.setPrecioVenta(250000);


        // Crea una casa de 250m2 construídos, 3000m2 de terreno, 4 habitaciones y 3
        //baños en la dirección “Carretera de Marín”.
        Inmueble casa1 = new Casa("Carretera de Marín", 250, 4, 3, 3000);
        casa1.setPrecioAlquiler(800);
        casa1.setPrecioVenta(350000);


        // Crea otra casa
        Inmueble casa2 = new Casa("Lapaman", 150, 3, 2, 1000);
        casa2.setPrecioVenta(400000);

        // Imprimir Inmueble: Piso, Casa
        System.out.println(piso1);
        System.out.println(casa1);
        System.out.println("");


        // Mostrar Detalle Inmueble: Piso, Casa
        System.out.println(piso1.detalle());
        System.out.println("");
        System.out.println(piso2.detalle());
        System.out.println("");
        System.out.println(casa2.detalle());


    }


    public class Inmueble {

        public String[] detalle() {
            return detalle();
            //throw new IllegalArgumentException("Ha habido un rerror con los detalles");
        }
        private String nombre;
        private int precioAlquiler;
        private int precioVenta;

        public void setPrecioVenta(int i) {
            precioVenta = i;
            setPrecioVenta(precioVenta);
        }

        public void setPrecioAlquiler(int i) {
            precioAlquiler = i;
            setPrecioAlquiler(precioAlquiler);
        }
    }

    public class Piso extends Inmueble {
        private int precioAlquiler;
        private int precioVenta;

        public Piso(String Localizacion, int mCuadrados, int numHabitaciones, int numBaños, int Terreno) {
            super();
        }
    }

    public class Casa extends Inmueble {
        private int precioAlquiler;
        private int precioVenta;

        public Casa(String Localizacion, int mCuadrados, int numHabitaciones, int numBaños, int Planta) {
            super();




        }

        public void mostrarInmuebles(int t) {
            System.out.println("TODOS LOS INMUEBLES:");
            System.out.printf("Inmueble en " );
           // System.out.println("Inmueble en " + " m2, " + int mCuadrados + " hab " );
        }
    }






}

