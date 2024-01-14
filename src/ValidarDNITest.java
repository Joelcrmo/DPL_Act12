import static org.junit.jupiter.api.Assertions.*;


    public class ValidarDNITest {
        @org.junit.jupiter.api.Test
        void testValidarDNILongitudIncorrecta() {
            assertFalse(ValidarDNI.validarDNI("422715122"));
        }

        @org.junit.jupiter.api.Test
        void testValidarDNINumeroIncorrecto() {
            assertFalse(ValidarDNI.validarDNI("123456728"));
        }

        @org.junit.jupiter.api.Test
        void testValidarDNILetraIncorrecta() {
            assertFalse(ValidarDNI.validarDNI("123456786"));
        }

        @org.junit.jupiter.api.Test
        void testValidarDNIValido() {
            assertTrue(ValidarDNI.validarDNI("12345678Z"));
        }
    }
