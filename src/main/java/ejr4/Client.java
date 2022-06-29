package ejr4;

public class Client {
    public static void main(String[] args){
        IServidor proxy = new Proxy();
        proxy.registrar(new Usuario("Richard", 1));
        proxy.registrar(new Usuario("Miguel", 2));
        proxy.registrar(new Usuario("Joseph", 3));
        proxy.registrar(new Usuario("Ariane", 4));

        proxy.login(new Usuario("Richard", 1));
        proxy.login(new Usuario("Miguel", 2));
        proxy.login(new Usuario("Joseph", 3));
        proxy.login(new Usuario("Ariane", 4));

    }
}