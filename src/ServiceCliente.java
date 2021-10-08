import java.util.ArrayList;
import java.util.List;

public class ServiceCliente {
    //cadastrar clientes
    //verificar clientes cadastrados
    //listar clientes cadastrados
    private static List<Cliente> listaClientes = new ArrayList<>();

    public static Cliente cadastrarCliente(String nome, String cpf, String email) throws Exception {
        Cliente cliente = new Cliente(nome, cpf, email);
        listaClientes.add(cliente);
        validarEmailArroba(email);
        verificarEmailClienteExistente(email);
        verificarCpfClienteExistente(cpf);
        System.out.println("\n\tCadastro cliente feito com sucesso!!!");
        return cliente;
    }

   /* public static void verificarClienteCadastrado(String email, String cpf) throws Exception {
        for (Cliente referenciaCliente : listaClientes) {
            validarEmailArroba(email);
            verificarEmailClienteExistente(referenciaCliente.getEmail(), email);
            verificarCpfClienteExistente(referenciaCliente.getCpf(), cpf);
        }
    }*/

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
   /* public void validarEmailArroba(String email) throws Exception {
        if (!email.contains("@")) {
            throw new Exception("O Email digitado não é válido. Tente novamente!");
        }
    }

    public static void validarEmailRepetido(String email) throws Exception {
        for (Cliente referenciaCliente : listaClientes) {
            if (referenciaCliente.getEmail().equalsIgnoreCase(email)) {
                throw new Exception("Esse e-mail já foi cadastrado! Tente novamente!");
            } else {
                throw new Exception("E-mail não encontrado! Cadastre primeiramente!");
            }
        }
    }

    public static void validarCpfRepetido(String cpf) throws Exception {
        for (Cliente referenciaCliente : listaClientes) {
            if (referenciaCliente.getCpf().equalsIgnoreCase(cpf))
                throw new Exception("Esse CPF já foi cadastrado! Tente novamente!");
        }
    }*/

}
