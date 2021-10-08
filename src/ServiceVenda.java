import java.util.ArrayList;
import java.util.List;

public class ServiceVenda {
    //cadastrar as vendas
    //listar as vendas
    private static List<Venda> listaVendas = new ArrayList<>();

    public static Venda cadastrarVenda(Cliente cliente, Vendedor vendedor, double valor, String data) {
        Venda venda = new Venda(cliente, vendedor, valor, data);
        listaVendas.add(venda);
        return venda;

    }
}
