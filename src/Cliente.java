public class Cliente extends Pessoa {
    public Cliente(String nome, String cpf, String email) {
        super(nome, cpf, email);
    }

    public Cliente() {
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append(super.toString());
        return retorno.toString();
    }
}