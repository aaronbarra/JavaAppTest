package com.mycompany.app;

public class App
{

    private final String mensaje = "Hola Aaron. Si ves este mensaje, significa que la prueba ha sido exitosa";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return mensaje;
    }

}
