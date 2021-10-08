public class Venda {
    private Cliente cliente;
    private Vendedor vendedor;
    private double valor;
    private String data;

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
        retorno.append("___Cliente___ " + super.toString());
        retorno.append("___Funcionário Responsável___" + super.toString());
        retorno.append("Valor da venda: R$" + valor + " reais");
        retorno.append("Data de registro: R$" + data);
        return retorno.toString();
    }
}
