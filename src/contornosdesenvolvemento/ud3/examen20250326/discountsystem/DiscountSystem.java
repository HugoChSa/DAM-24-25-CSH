package contornosdesenvolvemento.ud3.examen20250326.discountsystem;
//Hugo Chan Saball - DAM1-Contornos de Desenvolvemento 2024-25
//Examen 26/03/2025
public class DiscountSystem {
    public static double applyDiscount(double amount, boolean isLoyalCustomer) {
        if (amount <= 0) {
            throw new IllegalArgumentException("O importe non pode ser negativo nin pode ser de 0");
        }

        double discount = 0.0;

        if (amount >= 50 && amount <= 100) {
            discount = 0.05;
        } else if (amount > 100) {
            discount = 0.10;
        }

        if (isLoyalCustomer && amount >= 200) {
            discount -= 0.05;
        }

        double finalAmount = amount - (amount * discount);
        return finalAmount;
    }
}
