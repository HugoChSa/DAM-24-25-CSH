package ud4.ejercicios;
    


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class MatricesTriangulares {
    public static Boolean esTriangular(int[][] t) {
            return esTriangular(t);
            
        // TODO: Implementa la función
        }
        // 1. Matriz triangular superior
        @Test
        public void testMatrizTriangularSuperior() {
        int[][] matrizTriangularSuperior = {
        {1, 2, 3},
        {0, 4, 5},
        {0, 0, 6}
        };
        assertTrue(esTriangular(matrizTriangularSuperior));
        }

        // 2. Matriz triangular inferior
        @Test
        public void testMatrizTriangularInferior() {
        int[][] matrizTriangularInferior = {
        {1, 0, 0},
        {4, 5, 0},
        {7, 8, 9}
        };
        assertTrue(esTriangular(matrizTriangularInferior));
        }
    
        // 3. Matriz no triangular (con elementos fuera de la diagonal)
        @Test
        public void testMatrizNoTriangular() {
        int[][] matrizNoTriangular = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
        };
        assertFalse(esTriangular(matrizNoTriangular));
        }
        // 4. Matriz de tamaño 1x1 (triangular trivial)
        @Test
        public void testMatriz1x1() {
        int[][] matriz1x1 = {
        {1}
        };
        assertTrue(esTriangular(matriz1x1));
        }

        // 5. Matriz vacía => false
        @Test
        public void testMatrizVacia() {
        int[][] matrizVacia = {};
        assertFalse(esTriangular(matrizVacia));
        }
        // 6. Matriz con valores nulos (null) = false
        @Test
        public void testMatrizNula() {
        int[][] matrizNula = null;
        assertFalse(esTriangular(matrizNula));
        }
        // 7. Matriz rectangular (no cuadrada)
        @Test
        public void testMatrizRectangular() {
        int[][] matrizRectangular = {
        {1, 2},
        {3, 4},
        {5, 6}
        };
        assertFalse(esTriangular(matrizRectangular));
        }
        // 8. Matriz triangular superior con elementos cero en la diagonal
        @Test
        public void testMatrizTriangularSuperiorCero() {
        int[][] matrizTriangularSuperiorCero = {
        {0, 2, 3},
        {0, 0, 5},
        {0, 0, 0}
        };
        assertTrue(esTriangular(matrizTriangularSuperiorCero));
        }
        // 9. Matriz triangular inferior con elementos cero en la diagonal
        @Test
        public void testMatrizTriangularInferiorCero() {
        int[][] matrizTriangularInferiorCero = {
        {0, 0, 0},
        {4, 0, 0},
        {7, 8, 0}
        };
        assertTrue(esTriangular(matrizTriangularInferiorCero));
        }
        // 10. Matriz triangular superior con valores fuera de la diagonal principal
        @Test
        public void testMatrizIncorrecta() {
        int[][] matrizIncorrecta = {
        {1, 0, 3},
        {0, 2, 0},
        {0, 0, 4}
        };
        assertFalse(esTriangular(matrizIncorrecta));
        }    
}
