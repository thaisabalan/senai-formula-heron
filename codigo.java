import java.util.Scanner;
import java.io.IOException;

//

class Console {
  
    public static void clear(String... arg) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}

class CalculoIF {
	public static void main(String args[]) throws IOException, InterruptedException{  
   
			Scanner lerTeclado = new Scanner(System.in);       
			Console console = new Console();    
		
    		int x, y, z, perimetro, rp;
			String tipo = "Isosceles";
			String tipo2 = "todos os lados possuem a mesma medida";
			double area;
			int continuar;  
			
			System.out.print("Digite o lado um do seu triangulo \n");
			x = lerTeclado.nextInt();
			
			System.out.print("Digite o lado dois do seu triangulo \n");
			y = lerTeclado.nextInt();
			
			System.out.print("Digite o lado tres do seu triangulo \n");
			z = lerTeclado.nextInt();
			
			if ( x < 1 || y < 1 || z < 1 ) {
				System.out.print("ERROR!!! Por favor insira uma medida maior que zero");
				System.exit(0);
			}
			
			if (x == y && y == z && z == x) {
				
				tipo = "Equilatero";
				
			}
				
			
			if (x != y && y != z && z != x) {
				
				tipo = "Escaleno";
				
			}
			
			if ( tipo == "Isosceles" ) {
				
			}
				
			// calculo da area
			
			perimetro = (x + y + z) / 2;
			rp = perimetro * (perimetro - x) * (perimetro - y) * (perimetro - z);
			area = Math.sqrt(rp);
				
			// descubra a maior area
			
			if ( tipo == "Escaleno" ) {
				if ( x > y && x > z ) {
					tipo2 = "o primeiro lado e o maior";
				}
				if ( y > x && y > z ) {
					tipo2 = "o segundo lado e o maior ";
				}
				if ( z > x && z > y ) {
					tipo2 = "o terceiro lado e o maior";
				}
			}
			
			if ( tipo == "Isosceles") {
				if ( x == y ) {
					if ( x > z ) {
					tipo2 = "seus dois lados sao iguais, sendo o primeiro e o segundo maiores";
					}
				}
				if ( y == z ) {
					if ( y > x ) {
					tipo2 = "seus dois lados sao iguais, sendo o segundo e o terceiro maiores";
					}
				}
				if ( z == x ) {
					if ( z > y ) {
					tipo2 = "seus dois lados sao iguais, sendo o primeiro e o terceiro maiores";
					}
				}
				if ( x > y && x > z ) {
					tipo2 = "seus dois lados sao iguais, sendo o primeiro lado e o maior";
				}
				if ( y > x && y > z ) {
					tipo2 = "seus dois lados sao iguais, sendo o segundo lado e o maior ";
				}
				if ( z > x && z > y ) {
					tipo2 = "seus dois lados sao iguais, sendo o terceiro lado e o maior";
				}
			}
			
			System.out.print("Seu triangulo e " + tipo + ", sua area e de " + area + " m e " + tipo2 + " :) \n\n");

			System.out.printf("Deseja inserir outro triangulo? ( 1 - Para sim | 2 - para nao)\n");
			continuar = lerTeclado.nextInt();
    
	
				if(continuar == 1){
					main(null);
				}
    
			console.clear();
			System.exit(0);			

		
	}

}
