package ud4.ejerciciosud04entregas.ejercicios20250206;

public class RecorridoRobot {
    public static void main(String[] args) {
        String[] mapa = {
                "   Z       ",
                " *         ",
                "  *   *    ",
                "           ",
                " A         "
        };

        System.out.println(recorridoRobot(mapa, "AALARAARAA"));
        System.out.println(recorridoRobot(mapa, "RAALAAAALA"));
        System.out.println(recorridoRobot(mapa, "ARALA"));
        System.out.println(recorridoRobot(mapa, "LAA"));
    }

        static boolean recorridoRobot(String[] mapa, String instrucciones){
            int orientacion= 0;
            int filaRobot = 0, columnRobot = 0;

            for (int i = 0; i < mapa.length; i++) {
                if (mapa[i].indexOf('A') != -1){
                    filaRobot = i;
                    columnRobot = mapa[i].indexOf('A');
                }
            }

            for (int i = 0; i < instrucciones.length(); i++) {
                switch (instrucciones.charAt(i)) {
                    case 'A':
                        switch (orientacion) {
                            case 0:
                                if (filaRobot == 0)
                                    return false;
                                filaRobot--; break;

                            case 1: if (columnRobot == mapa[0].length() - 1)
                                    return false;
                                columnRobot++; break;
                            case 2: if (filaRobot == mapa.length - 1)
                                    return false;
                                filaRobot++; break;
                            case 3: if (columnRobot == 0)
                                    return false;
                                columnRobot--; break;
                        }

                        if (mapa[filaRobot].charAt(columnRobot) == '*')
                            return false;
                        break;
                    case 'R': orientacion = orientacion == 3 ? 0 : orientacion + 1; break;
                    case 'L': orientacion = orientacion == 3 ? 0 : orientacion - 1; break;
                }
            }

            if (mapa[filaRobot].charAt(columnRobot) == 'Z')
                return true;
            else
                return false;
        }
}
