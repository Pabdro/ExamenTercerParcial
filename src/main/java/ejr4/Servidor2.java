package ejr4;

import java.util.ArrayList;
import java.util.List;

public class Servidor2 implements IServidor{
    private String name;
    private List<User>listUsuarios = new ArrayList<>();

    public Servidor2(String name) {
        this.name = name;
    }

    @Override
    public void registrar(User usuario) {

    }

    @Override
    public void login(User usuario) {
        System.out.println("el servidor 2 esta logeando");
        listUsuarios.add(usuario);
    }
}