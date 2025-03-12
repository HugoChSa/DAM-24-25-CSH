package ud5.rol;

import ud5.rol.Monstruos.Monstruo.TipoMonstruo;
import ud5.rol.Personaje.Raza;

public class Monstruos {
    public class  Monstruo {
        public enum TipoMonstruo {Orco, Troll, Aranha, Dragon}
    
        int ataqueMonstruo;
        int defensaMonstruo;
        int velocidadMonstruo;
        int puntosVidaMonstruo; 
        
       /*
            if (TipoMonstruo = Orco) {
            ataqueMonstruo = random(30, 80);
            defensaMonstruo = random(30, 50);
            velocidadMonstruo = random(30, 60);
            puntosVidaMonstruo = random(30, 100);
            }

        if (TipoMonstruo = Troll) {
            ataqueMonstruo = random(60, 120);
            defensaMonstruo = random(50, 70);
            velocidadMonstruo = random(20, 40);
            puntosVidaMonstruo = random(100, 200);
            }

        if (TipoMonstruo = Aranha) {
            ataqueMonstruo = random(10, 50);
            defensaMonstruo = random(20, 40);
            velocidadMonstruo = random(40, 70);
            puntosVidaMonstruo = random(30, 80);
            }

        if (TipoMonstruo = Dragon) {
            ataqueMonstruo = random(100, 200);
            defensaMonstruo = random(60, 100);
            velocidadMonstruo = random(80, 120);
            puntosVidaMonstruo = random(120, 250);
            }

                }
            
    public Monstruos(TipoMonstruo tipoMonstruo, int ataqueMonstruo, int defensaMonstruo, int velocidadMonstruo, int puntosVidaMonstruo) {
        this(tipoMonstruo, ataqueMonstruo, defensaMonstruo, velocidadMonstruo, puntosVidaMonstruo);
    }
        public Monstruos (TipoMonstruo tipoMonstruo) {
        this(tipoMonstruo, random(1, 100), random(1, 100), random(1, 100), 0);
            }
                private static int random(int i, int j) {
                    // TODO Auto-generated method stub
                    throw new UnsupportedOperationException("Unimplemented method 'random'");
                }
            
    */
    }

}

