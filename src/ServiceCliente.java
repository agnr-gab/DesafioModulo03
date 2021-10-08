import java.util.ArrayList;
import java.util.List;

public class ServiceCliente implements Verificar {
    //cadastrar clientes
    //verificar clientes cadastrados
    //listar clientes cadastrados
    private static List<Cliente> listaClientes = new ArrayList<>();

    public static Cliente cadastrarCliente(String nome, String cpf, String email) {
        Cliente cliente = new Cliente(nome, cpf, email);
        listaClientes.add(cliente);
        return cliente;
    }

   /* public static void verificarClienteCadastro(String email, String cpf) throws Exception {
        for (Cliente referenciaCliente : listaClientes) {
            verificarEmailClienteExistente(referenciaCliente.getEmail(), email);
            verificarCpfClienteExistente(referenciaCliente.getCpf(), cpf);
        }
    }

    private static void verificarEmailClienteExistente(String referencia, String email) throws Exception {
        if (referencia.equalsIgnoreCase(email))
            throw new Exception("Esse email já foi cadastrado! Tente novamente!");
    }

    private static void verificarCpfClienteExistente(String referencia, String cpf) throws Exception {
        if (referencia.equalsIgnoreCase(cpf))
            throw new Exception("Esse CPF já foi cadastrado! Tente novamente!");
    }

    public static void verificarCpfClienteCadastrado(String cpf) throws Exception {
        for (Cliente referenciaCliente : listaClientes) {
            if (!referenciaCliente.getCpf().equals(cpf))
                throw new Exception("Esse CPF não está cadastrado! Faça o cadastro primeiramente!");
        }
    }

    @Override
    public void validarEmailArroba(String email) throws Exception {
        if (!email.contains("@")) {
            throw new Exception("O Email digitado não é válido. Tente novamente!");
        }
    }*/
   @Override
   public static void validarEmailRepetido(String email) throws Exception {
       for (Cliente referenciaCliente : listaClientes) {
           if (referenciaCliente.getEmail().equalsIgnoreCase(email))
               throw new Exception("Esse CPF já foi cadastrado! Tente novamente!");
       }
   }

    @Override
    public static void validarCpfRepetido(String cpf) throws Exception {
        for (Cliente referenciaCliente : listaClientes) {
            if (referenciaCliente.getCpf().equalsIgnoreCase(cpf))
                throw new Exception("Esse CPF já foi cadastrado! Tente novamente!");
        }
    }

}
