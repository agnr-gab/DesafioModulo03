import java.util.Scanner;

public class Sistema {

    private static Scanner leitorDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menu() {
        System.out.println("\n\t\t|____Sistema de Registro de Vendas____|");
        System.out.println("\t\t\t____Escolha a opção desejada____");
        System.out.println("\t\n[1] para -cadastrar- CLIENTES");
        System.out.println("\t\n[2] para -cadastrar- VENDEDORES");
        System.out.println("\t\n[3] para _listar_ todas VENDAS já cadastradas");
        System.out.println("\t\n[4] para _listar_ todes VENDEDORES já cadastrades");
        System.out.println("\t\n[5] para _listar_ todes CLIENTES já cadastrades");
        System.out.println("\t\n[6] para *FINALIZAR* sistema");
    }

    public static Vendedor cadastrarVendedor() {
        System.out.println("\n\t\t\t____Cadastro vendedor____");
        String nome = leitorDados("\n\tDigite o nome: ").nextLine();
        String cpf = leitorDados("\tDigite o CPF: ").nextLine();
        String email = leitorDados("\tDigite o e-mail: ").nextLine();
        System.out.println("\n\tCadastro vendedor feito com sucesso!!!");
        return ServiceVendedor.cadastrarVendedor(nome, cpf, email);
    }

    public static Cliente cadastrarCliente() {
        System.out.println("\n\t\t\t____Cadastro cliente____");
        String nome = leitorDados("\n\tDigite o nome: ").nextLine();
        String cpf = leitorDados("\tDigite o CPF: ").nextLine();
        String email = leitorDados("\tDigite o e-mail: ").nextLine();
        System.out.println("\n\tCadastro do cliente feito com sucesso!!!");
        return ServiceCliente.cadastrarCliente(nome, cpf, email);
    }

    public static Venda cadastrarVenda() throws Exception {

        System.out.println("\n\t\t\t____Cadastro vendas____");

        String cpfCliente = leitorDados("\tDigite o cpf do cliente: ").nextLine();
        //Verificar.validarCpfRepetido(cpfCliente);
        String cpfVendedor = leitorDados("\tDigite o cpf do vendedor: ").nextLine();
       // ServiceVendedor.validarCpfRepetido(cpfVendedor);

        double valor = leitorDados("\n\tDigite o valor a ser pago: ").nextDouble();
        String data = leitorDados("\tDigite a data de registro da venda: ").nextLine();
        System.out.println("\n\tCadastro da venda feito com sucesso!!!");

        return ServiceVenda.cadastrarVenda(valor, data);
    }
}
