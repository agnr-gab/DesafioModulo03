import java.util.ArrayList;
import java.util.List;

public class ServiceCliente {
    //cadastrar clientes
    //verificar clientes cadastrados
    //listar clientes cadastrados
    private static List<Cliente> listaClientes = new ArrayList<>();

    public static void validarEmailArroba(String email) throws Exception {
        if (!email.contains("@")) {
            throw new Exception("O Email digitado não é válido. Tente novamente!");
        }
    }

    public static void verificarEmailClienteExistente(String email) throws Exception {
        for (Cliente referenciaCliente : listaClientes) {
            if (referenciaCliente.getEmail().equalsIgnoreCase(email)) {
                throw new Exception("Esse email já foi cadastrado! Tente novamente!");
            }
        }
    }

    public static void verificarCpfClienteExistente(String cpf) throws Exception {
        for (Cliente referenciaCliente : listaClientes) {
            if (referenciaCliente.getCpf().equalsIgnoreCase(cpf)) {
                throw new Exception("Esse CPF já foi cadastrado! Tente novamente!");
            }
        }

    }

    public static void verificarCpfClienteCadastrado(String cpf) throws Exception {
        for (Cliente referenciaCliente : listaClientes) {
            if (!referenciaCliente.getCpf().equals(cpf))
                throw new Exception("Esse CPF não está cadastrado! Faça o cadastro primeiramente!");
        }
    }

    public static Cliente cadastrarCliente(String nome, String cpf, String email) throws Exception {
        Cliente cliente = new Cliente(nome, cpf, email);
        listaClientes.add(cliente);
        validarEmailArroba(email);
        verificarEmailClienteExistente(email);
        verificarCpfClienteExistente(cpf);
        System.out.println("\n\tCadastro cliente feito com sucesso!!!");
        return cliente;
    }

    public static void listarClientes() {

        System.out.println("\n\t\t\t____Vendas realizadas____");
        for (int i = 0; i < listaClientes.size(); i++) {
            System.out.println(i);

        }
    }
}
