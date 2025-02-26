package ud5.clasesejercicios.E0804;

import java.util.Arrays;

public class E0804 {
    public abstract class Instrumento {
        
        enum Nota {DO, RE, MI, FA, SOL, LA, SI}
        Nota[] melodia;

            
            public Instrumento() {
            }

      /*public abstract class Instrumento {

        }
         */  
        
        public void add(Nota nota) {
            melodia = Arrays.copyOf(melodia, melodia.length +1);
            melodia[melodia.length - 1] = nota;
        }

        public void copiarMelodia(Instrumento instrumento) {

        }
        
        public abstract void interpretar();

        /*public static void main(String[] args) {
            Piano piano = new Piano();
            piano.add(Nota.DO);
            piano.add(Nota.FA);
            piano.add(Nota.SOL);
            piano.interpretar();
        }*/
    }



}
