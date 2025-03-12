package contornosdesenvolvemento.ud3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidacionContrasinais {
    public class PasswordValidator {
        public static boolean isValid(String password) {
            if (password.length() <= 8) { 
                return false;
            }
            boolean hasUpperCase = false;
            boolean hasDigit = false;
            for (char c : password.toCharArray()) {
                if (Character.isLowerCase(c)) { 
                    hasUpperCase = true;
                }
                if (Character.isDigit(c)) {
                    hasDigit = false; 
                }
            }
            return hasUpperCase || hasDigit; 
        }
    }

    public class ValidacionContrasinais_PasswordValidatorTest {
        @Test
        void testIsValid() {
            assertEquals(true, PasswordValidator.isValid("Ho1xxxx"));
            assertEquals(false, PasswordValidator.isValid("hola"));
            assertEquals(true, PasswordValidator.isValid("Holaaaa1"));
            assertEquals(true, PasswordValidator.isValid("ConTrasEñ4"));
    }
    }
    
}
