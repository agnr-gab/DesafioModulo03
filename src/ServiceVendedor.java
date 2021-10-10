import java.util.ArrayList;
import java.util.List;

public class ServiceVendedor implements Verificar {
    //cadastrar vendedores
    //verificar vendedores cadastrados
    //listar vendedores cadastrados

    private static List<Vendedor> listaVendedores = new ArrayList<>();

    public static Vendedor cadastrarVendedor(String nome, String cpf, String email) throws Exception {
        validarEmailArroba(email);
        validarEmailRepetido(email);
        validarCpfRepetido(cpf);
        Vendedor vendedor = new Vendedor(nome, cpf, email);
        listaVendedores.add(vendedor);

        System.out.println("\n\tCadastro vendedor feito com sucesso!!!");
        return vendedor;
    }

    public static Vendedor verificarCpfVendedorCadastrado(String cpf) throws Exception {
        for (Vendedor referenciaVendedor : listaVendedores) {
            if (referenciaVendedor.getCpf().equals(cpf))
                return referenciaVendedor;
        }
        throw new Exception("Esse CPF não está cadastrado! Faça o cadastro primeiramente!");
    }

    public static Vendedor verificarEmailVendedorCadastrado(String email) throws Exception {
        for (Vendedor referenciaVendedor : listaVendedores) {
            if (referenciaVendedor.getEmail().equalsIgnoreCase(email))
                return referenciaVendedor;
        }
        throw new Exception("Esse E-mail não está cadastrado! Faça o cadastro primeiramente!");
    }

    public static void validarEmailArroba(String email) throws Exception {
        if (!email.contains("@")) {
            throw new Exception("O Email digitado não é válido. Tente novamente!");
        }
    }

    public static void validarEmailRepetido(String email) throws Exception {
        for (Vendedor referenciaVendedor : listaVendedores) {
            if (referenciaVendedor.getEmail().equalsIgnoreCase(email)) {
                throw new Exception("Esse e-mail já foi cadastrado! Tente novamente!");
            }
        }
    }

    public static void validarCpfRepetido(String cpf) throws Exception {
        for (Vendedor referenciaVendedor : listaVendedores) {
            if (referenciaVendedor.getCpf().equals(cpf))
                throw new Exception("Esse CPF já foi cadastrado! Tente novamente!");
        }
    }

    public static void listarVendedores() {
        System.out.println("\n\t\t\t____Vendedores cadastrados____");
        for (Vendedor referenciaVendedor : listaVendedores) {
            System.out.println(referenciaVendedor);
        }
    }
}



