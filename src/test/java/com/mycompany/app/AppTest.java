package com.mycompany.app;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;


public class AppTest
{

    private final ByteArrayOutputStream mensaje = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(mensaje));
    }

    @Test
    public void testAppConstructor() {
        try {
            new App();
        } catch (Exception e) {
            fail("Construccion fallida. Por favor, revisar el codigo.");
        }
    }

    @Test
    public void testAppMain()
    {
        App.main(null);
        try {
            String esperado = "Hola Aaron. Si ves este mensaje, significa que la prueba ha sido exitosa";
            assertEquals(esperado + System.getProperty("line.separator"), mensaje.toString());
        } catch (AssertionError e) {
            fail("El mensaje obtenido no coincide con el esperado");
        }
    }

    @After
    public void cleanStreams() {
        System.setOut(null);
    }

}
