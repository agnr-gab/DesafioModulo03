public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Gabrielle Nascimento","215.976.380-21", "meuEmail@email.com");
        Vendedor vendendor = new Vendedor("Stéfany Farias", "365.263.850-60","mariana@marina.com");
        Venda venda = new Venda(cliente,vendendor, 1580,"08/10/2021");
        System.out.println(venda);
    }
}
