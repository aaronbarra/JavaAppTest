import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.After;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static org.junit.Assert.*;


public class Test
{

    private final ByteArrayOutputStream mensaje = new ByteArrayOutputStream();

    @BeforeMethod
    public void setUpStreams() {
        System.setOut(new PrintStream(mensaje));
    }

    @org.testng.annotations.Test
    public void testAppConstructor() {
        try {
            new App();
        } catch (Exception e) {
            fail("Construccion fallida. Por favor, revisar el codigo.");
        }
    }

    @org.testng.annotations.Test
    public void testAppMain()
    {
        App.main(null);
        String esperado = "Hola Aaron. Si ves este mensaje, ha salido todo bien";
        try {
            assertEquals(esperado + System.getProperty("line.separator"), mensaje.toString());
        } catch (AssertionError e) {
            fail("El mensaje obtenido no coincide con el esperado");
        }
    }

    @AfterMethod
    public void cleanStreams() {
        System.setOut(null);
    }

}
