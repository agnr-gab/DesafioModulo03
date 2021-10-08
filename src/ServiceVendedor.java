import java.util.ArrayList;
import java.util.List;

public class ServiceVendedor {
    //cadastrar vendedores
    //verificar vendedores cadastrados
    //listar vendedores cadastrados

    private static List<Vendedor> listaVendedores = new ArrayList<>();

    public static Vendedor cadastrarVendedor(String nome, String cpf, String email) {
        Vendedor vendedor = new Vendedor(nome, cpf, email);
        listaVendedores.add(vendedor);
        return vendedor;
    }

}
