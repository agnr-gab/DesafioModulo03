public class Vendedor extends Pessoa {
    public Vendedor(String nome, String cpf, String email) {
        super(nome, cpf, email);
    }

    public Vendedor() {
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append(super.toString());
        return retorno.toString();
    }
}
