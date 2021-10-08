import java.util.List;
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
        System.out.println("\t\n[3] para -cadastrar- VENDAS");
        System.out.println("\t\n[4] para _listar_ todas VENDAS já cadastradas");
        System.out.println("\t\n[5] para _listar_ todes VENDEDORES já cadastrades");
        System.out.println("\t\n[6] para _listar_ todes CLIENTES já cadastrades");
        System.out.println("\t\n[7] para *FINALIZAR* sistema");
    }

    public static Cliente cadastrarCliente() throws Exception {
        System.out.println("\n\t\t\t____Cadastro cliente____");
        String nome = leitorDados("\n\tDigite o nome: ").nextLine();
        String cpf = leitorDados("\tDigite o CPF: ").nextLine();
        String email = leitorDados("\tDigite o e-mail: ").nextLine();
        System.out.println("\n\tCadastro do cliente feito com sucesso!!!");

        return ServiceCliente.cadastrarCliente(nome, cpf, email);
    }

    public static Vendedor cadastrarVendedor() throws Exception{
        System.out.println("\n\t\t\t____Cadastro vendedor____");
        String nome = leitorDados("\n\tDigite o nome: ").nextLine();
        String cpf = leitorDados("\tDigite o CPF: ").nextLine();
        String email = leitorDados("\tDigite o e-mail: ").nextLine();

        return ServiceVendedor.cadastrarVendedor(nome, cpf, email);
    }

    public static Venda cadastrarVenda() throws Exception {

        System.out.println("\n\t\t\t____Cadastro vendas____");
        String cpfCliente = leitorDados("\tDigite o cpf do cliente: ").nextLine();
        String cpfVendedor = leitorDados("\tDigite o cpf do vendedor: ").nextLine();
        double valor = leitorDados("\n\tDigite o valor a ser pago: ").nextDouble();
        String data = leitorDados("\tDigite a data de registro da venda: ").nextLine();
        System.out.println("\n\tCadastro da venda feito com sucesso!!!");

        return ServiceVenda.cadastrarVenda(valor, data);
    }

    public static boolean executar() throws Exception {

        boolean loop = true;

        while (loop) {
            menu();
            int entradaUsuario = leitorDados("\n\tEscolha a opção desejada").nextInt();
            if (entradaUsuario == 1) {
                Cliente cliente = cadastrarCliente();

            } else if (entradaUsuario == 2) {
                Vendedor vendedor = cadastrarVendedor();

            } else if (entradaUsuario == 3) {
                Venda venda = cadastrarVenda();

            } else if (entradaUsuario == 4) {
                ServiceVenda.listarVendas();

            } else if (entradaUsuario == 5) {
                ServiceCliente.listarClientes();

            } else if (entradaUsuario == 6) {
                Venda venda = cadastrarVenda();

            } else if (entradaUsuario == 7) {
                loop = false;
                System.out.println("\n\t\t\t____Sistema finalizado____! \t\t\nVolte sempre!");

            } else {
                System.out.println("***\tA opção digitada é inválida. Verifique e tente novamente!***");
            }
        }
        return loop;
    }
}