    public class PracticaPotencial {

    public static void main(String[] args) {
        System.out.println(factorial(5,2));
    }

    public static int Numero_elevado(int x, int z) {

        int resultado = 1;

        for (int i = 1; i <= z; i++) {

            resultado = resultado * x;

        }

        return resultado;

    }
}
