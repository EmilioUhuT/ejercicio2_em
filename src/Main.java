
public class Main {

	public static void main(String[] args) {
		// Contador recursivo
		contador(1);
	}
	
	public static void contador(int n) {
		/*El número 1 no es considerado primo	
		Por esa razon puse este if demás, pero facilmente puede borrarse/comentarse 
		y el resultado en consola solo dira que es primo, sin afectar el funcionamiento*/
		if(n == 1) {
			System.out.println(n + " no es primo");
			n++;
			contador(n);
		}
		//
		if(n <= 1000) {
			if(n % 2 == 0) {
				System.out.println(n + " es par");
			}
			else {
				if(n % 5 == 0){
					System.out.println(n + " número ordinal");
				}
				else {
				System.out.println(n + " es primo");
				}
			}
			
			n++;
			contador(n);
		}
	}

}
