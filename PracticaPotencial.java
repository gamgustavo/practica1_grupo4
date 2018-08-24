    public class PracticaPotencial {

    public static void main(String[] args) {
        System.out.println(Numero_elevado(5,2));
        System.out.println(Raiz(40));
        System.out.println(Numero_elevado_cubo(5));
        System.out.println(Raiz(60));
    }

    public static int Numero_elevado(int x, int z) {

        int resultado = 1;

        for (int i = 1; i <= z; i++) {

            resultado = resultado * x;

        }

        return resultado;

    }
        
        
        
        public static int Raiz (int numeroUno) {
int resultado = (int )Math.sqrt(numeroUno) ;
return resultado ; }

    
    
    
    public static int Numero_elevado_cubo(int x) {

        int resultado = 1;

        for (int i = 1; i <= 3; i++) {

            resultado = resultado * x;

        }
        
        
        
        public static int RaizCubica (int numeroUno) {
int resultado = (int )Math.cbrt(numeroUno) ;
return resultado ; }
        
        

        return resultado;

}
    
    
    
    
    
    
    
    
    }
