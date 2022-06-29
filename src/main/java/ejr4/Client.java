package ejr4;

public class Client {
    public static void main(String[] args){
        IServidor proxy = new Proxy();
        User user=new User("Richard", 1);
        User user2=new User("Miguel", 2);
        User user3=new User("Joseph", 3);
        User user4=new User("Gabriel", 4);

        proxy.registrar(user);
        proxy.registrar(user2);
        proxy.registrar(user3);
        proxy.registrar(user4);

        proxy.login(user);
        user.showInfo();
        proxy.login(user2);
        user2.showInfo();
        proxy.login(user3);
        user3.showInfo();
        proxy.login(user4);
        user4.showInfo();

    }
}