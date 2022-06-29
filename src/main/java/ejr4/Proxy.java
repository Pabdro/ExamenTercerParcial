package ejr4;

import java.util.ArrayList;
import java.util.List;

public class Proxy implements IServidor{

    private List<User> listUsuario = new ArrayList<>();
    private IServidor servidor1;
    private IServidor servidor2;


    public Proxy() {
        servidor1 = new Servidor1("Servidor1");
        servidor2 = new Servidor2("Servidor2");
    }

    @Override
    public void registrar(User usuario) {
        listUsuario.add(usuario);
    }

    @Override
    public void login(User usuario) {
        for(User usuario1: listUsuario){
            if(usuario1.getNombre().equals(usuario.getNombre())){
                if(usuario1.getNumero() == usuario.getNumero()){
                    if(esPrimo(usuario.getNumero())){
                        servidor1.login(usuario);
                        break;
                    }else{
                        servidor2.login(usuario);
                        break;
                    }
                }
            }
        }

    }

    public boolean esPrimo(int numero) {
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            if (numero % x == 0)
                return false;
        }
        return true;
    }
}