package contornos.ud3.examen20250326.emailvalidator;
//Hugo Chan Saball - DAM1-Contornos de Desenvolvemento 2024-25
//Examen 26/03/2025


public class EmailValidator {
    public static boolean isValid(String email) {
        if (email == null || !email.contains("@")) {
            return false;
        }
        String[] parts = email.split("@");
        if (parts.length != 2 || parts[0].isEmpty()) {
            return false;
        }
        return parts[1].contains(".");
    }
}
