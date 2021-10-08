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

    public static void verificarClienteCadastro(String email, String cpf) throws Exception {
        for (Cliente referenciaCliente : listaClientes) {
            verificarEmailCliente(referenciaCliente.getEmail(), email);
            verificarCpfCliente(referenciaCliente.getCpf(), cpf);
        }
    }

    private static void verificarEmailCliente(String referencia, String email) throws Exception {
        if (referencia.equalsIgnoreCase(email))
            throw new Exception("Esse email já foi cadastrado! Tente novamente!");
    }

    private static void verificarCpfCliente(String referencia, String cpf) throws Exception {
        if (referencia.equalsIgnoreCase(cpf))
            throw new Exception("Esse CPF já foi cadastrado! Tente novamente!");
    }

    public static void verificarCpfCadastrado(String cpf) throws Exception {
        for (Cliente referenciaCliente : listaClientes) {
            if (!referenciaCliente.getCpf().equalsIgnoreCase(cpf))
                throw new Exception("Esse CPF não está cadastrado! Tente novamente!");
        }
    }
}
