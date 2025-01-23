package ud3.ejerciciosclases;

/* EP0711. Escribe la clase MarcaPagina, que ayuda a llevar el control de la lectura de un
libro. Deberá disponer de métodos para incrementar la página leída, para obtener
información de la última página que se ha leído y para comenzar desde el principio una
nueva lectura del mismo libro. */

public class MarcaPagina {
    int pagina;
    //String libro;
    
    public void incrementarPagina(){
        pagina++;
    }
    
    public int getPagina(){
        return pagina;
    }

    public void reiniciarLibro() {
        pagina = 0;
    }
    public void irAPagina (int pagina) {
        if (pagina >= 0)
            this.pagina = pagina;
    }

    public static void main(String[] args) {

        MarcaPagina mp = new MarcaPagina();
        //MarcaPagina mp2 = new MarcaPagina();


        System.out.println(mp.getPagina());
    
        mp.incrementarPagina();
        mp.incrementarPagina();

        System.out.println(mp.getPagina());

        mp.reiniciarLibro();

        System.out.println(mp.getPagina());
    }

}
