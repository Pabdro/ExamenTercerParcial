package ejr4;

import java.util.ArrayList;
import java.util.List;

public class Servidor1 implements IServidor{
    private String name;
    private List<User>listUsuario = new ArrayList<>();

    public Servidor1(String name) {
        this.name = name;
    }


    @Override
    public void registrar(User usuario) {
        listUsuario.add(usuario);
    }

    @Override
    public void login(User usuario) {
        System.out.println("el servidor 1 esta logueando");
        listUsuario.add(usuario);
    }
}