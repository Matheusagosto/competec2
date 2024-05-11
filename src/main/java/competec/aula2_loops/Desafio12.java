package competec.aula2_loops;

import java.util.Scanner;

public class Desafio12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String senha = "eu"; // esta é a senha correta
		String tentativa = "";

		System.out.println("digite a senha:") ;

	

		while (senha.equals(tentativa) == false) {
			
			tentativa = scanner.next();

			if (senha.equals(tentativa)) {
				System.out.println("Acesso permitido");

			} else {
				System.out.println("Senha Inválida");
				System.out.println("tente novamente");
			}

		}
		// faça o loop que lê as tentativas de senhas e verifica se elas estão corretas.
		
	}
}
