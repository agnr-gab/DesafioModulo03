public class Main {

    public static void main(String[] args) throws Exception {

        boolean loop = true;

        while (loop) {

            try {
                Sistema.cadastrarVendedor();
                //loop = Sistema.executar();
                System.out.println();

            } catch (Exception erro) {
                System.out.println(erro.getMessage());

            }
        }

    }
}
