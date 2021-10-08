public interface Verificar {

    public abstract void validarEmailArroba(String email) throws Exception;
    public abstract void validarEmailRepetido(String email) throws Exception;
    public abstract void validarCpfRepetido(String cpf) throws Exception;

}
