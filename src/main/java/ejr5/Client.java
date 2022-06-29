package ejr5;

public class Client {
    public static void main(String[] args) {
        ICelular samsung=new Samsung();
        samsung=new MemoriaExterna(samsung);
        samsung = new MemoriaAlmacenamiento(samsung);
        samsung = new VidrioTemplado(samsung);
        samsung = new Carcasa(samsung);

        ICelular apple = new Apple();
        apple = new MemoriaExterna(apple);
        apple = new MemoriaAlmacenamiento(apple);

        ICelular xiaomi = new Xiaomi();
        xiaomi = new Carcasa(xiaomi);
        xiaomi = new VidrioTemplado(xiaomi);

        System.out.println(samsung.anadir());
        System.out.println();
        System.out.println(apple.anadir());
        System.out.println();
        System.out.println(xiaomi.anadir());
    }
}
