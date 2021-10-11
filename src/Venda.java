public class Venda extends Pessoa {
    private Cliente cliente;
    private Vendedor vendedor;
    private double valor;
    private String data;

    public Venda(double valor, String data) {
        this.valor = valor;
        this.data = data;
    }

    public Venda(Cliente cliente, Vendedor vendedor, double valor, String data) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.valor = valor;
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n\t\t\t|___Cliente___| \n" + cliente);
        retorno.append("\n\t\t|___Funcionário Responsável___|\n" + vendedor);
        retorno.append("\nValor da venda: R$" + valor + " reais");
        retorno.append("\tData de registro: " + data);
        return retorno.toString();
    }
}
