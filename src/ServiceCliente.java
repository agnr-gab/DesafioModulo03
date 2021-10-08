import java.util.ArrayList;
import java.util.List;

public class ServiceCliente {
    //cadastrar clientes
    //verificar clientes cadastrados
    //listar clientes cadastrados
    private static List<Cliente> listaClientes = new ArrayList<>();

    public static Cliente cadastrarCliente(String nome, String cpf, String email) {
        Cliente cliente = new Cliente(nome, cpf, email);
        listaClientes.add(cliente);
        return cliente;
    }
}
