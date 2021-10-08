import java.util.ArrayList;
import java.util.List;

public class ServiceVendedor implements Verificar {
    //cadastrar vendedores
    //verificar vendedores cadastrados
    //listar vendedores cadastrados

    private static List<Vendedor> listaVendedores = new ArrayList<>();

    public static Vendedor cadastrarVendedor(String nome, String cpf, String email) {
        Vendedor vendedor = new Vendedor(nome, cpf, email);
        listaVendedores.add(vendedor);
        return vendedor;
    }

    public static void verificarCpfVendedorCadastrado(String cpf) throws Exception {
        for (Vendedor referenciaVendedor : listaVendedores) {
            if (!referenciaVendedor.getCpf().equals(cpf))
                throw new Exception("Esse CPF não está cadastrado! Faça o cadastro primeiramente!");
        }
    }
}
