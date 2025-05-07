<<<<<<< HEAD:src/contornosdesenvolvemento/ud3/BonusAssigner.java
package contornosdesenvolvemento.ud3;
=======
package contornos.ud3;
>>>>>>> 700ec07c82d8975f05daffd19f59fbe6921fef27:src/contornos/ud3/BonusAssigner.java

import org.junit.Test;

public class BonusAssigner {
    public static String assignBonus(int employeeNumber, int months, boolean isExecutive) {
        if (employeeNumber < 1 || employeeNumber > 999) {
            throw new IllegalArgumentException("Número de empregado non válido");
        }

        boolean hasSeniority = months >= 12;

        if (isExecutive && hasSeniority) return "P1";
        if (!isExecutive && hasSeniority) return "P2";
        if (isExecutive && !hasSeniority) return "P3";
        return "P4";
    }

    @Test
    public void testAssignBonus() {
        assignBonus(1, 12, true);
        assignBonus(1, 12, false);
        assignBonus(1, 12, true);
        assignBonus(1, 12, false);
        System.out.println(assignBonus(1, 12, true));
    }
}