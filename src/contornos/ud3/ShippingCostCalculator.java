//<<<<<<< HEAD:src/contornosdesenvolvemento/ud3/ShippingCostCalculator.java
//package contornosdesenvolvemento.ud3;
//=======
package contornos.ud3;
//>>>>>>> 700ec07c82d8975f05daffd19f59fbe6921fef27:src/contornos/ud3/ShippingCostCalculator.java

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShippingCostCalculator {
        public static double calculateShipping(double amount, boolean expressDelivery) {


            if (amount < 0)
                throw new IllegalArgumentException("O importe non pode ser negativo");

            if (amount >= 100)
                return 0.0;



            double shippingCost = expressDelivery ? 10.0 : 5.0;
            if (expressDelivery = false) {
                shippingCost = 5.0;
            }
            if (expressDelivery = true) {
                shippingCost = 10.0;
            }


            if (amount < 20) {
                shippingCost += 2.0;
            }

            return shippingCost;

        }

        @Test
    public void testCalculateShipping() {
            try {
                double amount =1000.0;
                boolean expressDelivery = false;
                System.out.println(calculateShipping(amount, expressDelivery));
            }
            catch (Exception e) {
            }
        }

    }


