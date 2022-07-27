package aulas;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDeEleições {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("-----URNA-----");
		System.out.println(" (5) Lula Molusco");
		System.out.println(" (6) Bolso Nelson");
		System.out.println(" (7) Cilouca Gomes");
		System.out.println("-----URNA-----");

		int voto = sc.nextInt();
		int votosLulaMolusco = 0;
		int votosBolsoNelson = 0;
		int votosCiloucaGomes = 0;
		int votosTotal = 0;
		while (voto >= 0) {
			if (voto == 5) {
				votosLulaMolusco++;
				System.out.println("Seu voto foi registrado para o candidato Lula Molusco!");
			} else if (voto == 6) {
				votosBolsoNelson++;
				System.out.println("Seu voto foi registrado para o candidato Bolso Nelson!");
			} else if (voto == 7) {
				votosCiloucaGomes++;
				System.out.println("Seu voto foi registrado para o candidato Cilouca Gomes!");
			} else {
				System.out.println("Canditado incorreto, vote novamente: ");
			}

			if (voto == 5 || voto == 6 || voto == 7) {
				votosTotal++;
			}

			System.out.println("Vote Novamente");
			System.out.println(" (-2) Para sair do Programa");
			voto = sc.nextInt();

		}

		System.out.println("-----RESULTADO-----");
		System.out.println("Total = " + votosTotal + " = 100% ");
		double Tentáculo = (100 * votosLulaMolusco) / votosTotal;
		System.out.println("Lula Molusco = " + Tentáculo + "%");
		double Gado = (100 * votosBolsoNelson) / votosTotal;
		System.out.println("Bolso Nelson = " + Gado + "%");
		double Café = (100 * votosCiloucaGomes) / votosTotal;
		System.out.println("Cilouca Gomes = " + Café + "%");
		System.out.println("-----RESULTADO-----");
		sc.close();
	}

}
