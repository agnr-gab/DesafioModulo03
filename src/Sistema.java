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
        System.out.println("\t\n[7] para =pesquisar= COMPRAS realizadas");
        System.out.println("\t\n[8] para =pesquisar= VENDAS realizadas");
        System.out.println("\t\n[9] para *FINALIZAR* sistema");
    }

    public static Cliente cadastrarCliente() throws Exception {
        System.out.println("\n\t\t\t____Cadastro cliente____");
        String nome = leitorDados("\n\tDigite o nome: ").nextLine();
        String cpf = leitorDados("\tDigite o CPF: ").nextLine();
        String email = leitorDados("\tDigite o e-mail: ").nextLine();

        return ServiceCliente.cadastrarCliente(nome, cpf, email);
    }

    public static Vendedor cadastrarVendedor() throws Exception {
        System.out.println("\n\t\t\t____Cadastro vendedor____");
        String nome = leitorDados("\n\tDigite o nome: ").nextLine();
        String cpf = leitorDados("\tDigite o CPF: ").nextLine();
        String email = leitorDados("\tDigite o e-mail: ").nextLine();

        return ServiceVendedor.cadastrarVendedor(nome, cpf, email);
    }

    public static Venda cadastrarVenda() throws Exception {

        System.out.println("\n\t\t\t____Cadastro vendas____");
        String cliente = leitorDados("\tDigite o cpf do cliente: ").nextLine();
        String vendedor = leitorDados("\tDigite o cpf do vendedor: ").nextLine();
        double valor = leitorDados("\n\tDigite o valor a ser pago: ").nextDouble();
        String data = leitorDados("\tDigite a data de registro da venda: ").nextLine();

        return ServiceVenda.cadastrarVenda(cliente, vendedor, valor, data);
    }

    public static List<Venda> consultarCompras() throws Exception {
        System.out.println("\n\t\t\t____Consulta de Compras Realizadas____");
        String cpf = leitorDados("\tDigite o CPF do cliente:").nextLine();
        ServiceCliente.verificarCpfClienteCadastrado(cpf);
        List<Venda> listaCompras = ServiceVenda.consultarCompras(cpf);
        return listaCompras;
    }

    public static List<Venda> consultarVendas() throws Exception {
        System.out.println("\n\t\t\t____Consulta de Vendas Realizadas____");
        String email = leitorDados("\tDigite o e-mail do vendedor:").nextLine();
        ServiceVendedor.validarEmailArroba(email);
        ServiceVendedor.verificarEmailVendedorCadastrado(email);
        List<Venda> listaCompras = ServiceVenda.consultarVendas(email);
        return listaCompras;
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
                ServiceVendedor.listarVendedores();

            } else if (entradaUsuario == 6) {
                ServiceCliente.listarClientes();

            } else if (entradaUsuario == 7) {
                consultarCompras();

            } else if (entradaUsuario == 8) {
                consultarVendas();

            } else if (entradaUsuario == 9) {
                loop = false;
                System.out.println("\n\t\t\t____Sistema finalizado____ \n\t\t\t\t____Volte sempre____");

            } else {
                System.out.println("***\tA opção digitada é inválida. Verifique e tente novamente!***");
            }
        }
        return loop;
    }
}