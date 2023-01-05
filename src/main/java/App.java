public class App
{

    private final String mensaje = "Hola Aaron. Si ves este mensaje, ha salido nuevamente bien";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return mensaje;
    }

}
