import java.util.ArrayList;
import java.util.List;

public class ServiceVenda {
    //cadastrar as vendas
    //listar as vendas
    public static List<Venda> listaVendas = new ArrayList<>();

    public static Venda cadastrarVenda(String cpfCliente, String cpfVendedor, double valor, String data) throws Exception{
        Cliente cliente = ServiceCliente.verificarCpfClienteCadastrado(cpfCliente);
        Vendedor vendedor = ServiceVendedor.verificarCpfVendedorCadastrado(cpfVendedor);

        Venda venda = new Venda(cliente, vendedor,valor, data);
        listaVendas.add(venda);
        System.out.println("\n\tCadastro da venda feito com sucesso!!!");
        return venda;
    }

    public static void listarVendas() {
        System.out.println("\n\t\t\t____Vendas realizadas____");
        for (Venda referenciaVenda : listaVendas) {
            System.out.println(referenciaVenda);
        }
    }
}
