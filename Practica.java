public class Practica {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    
    
    
    double Multiplica(double var1,double var2)
	{
		double multi;
		multi=var1*var2;
		return multi;
	}

	double Divide(double var1,double var2)
	{
		
		if(var2!=0){
		double div;
		div=var1/var2;
		return div;
		}else{
		return 0;
		}		
		
		
	}
    
    
}
