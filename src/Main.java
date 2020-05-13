import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int escolaridade, experiencia, ptsescola=0, ptsexp=0;
		char viajar, motorista;
		
		System.out.println("Qual sua escolaridade?");
		System.out.println("1) Ensino Fundamental");
		System.out.println("2) Ensino Médio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) Pós-graduação");
		System.out.println("Digite uma opção: ");
		escolaridade = sc.nextInt();
		System.out.println("Você tem quantos anos de experiência profissional?");
		experiencia = sc.nextInt();
		System.out.println("Você tem disponibilidade para viajar (S/N)?");
		viajar = sc.next().charAt(0);
		System.out.println("Você tem habilitação de motorista (S/N)?");
		motorista = sc.next().charAt(0);
		
		if (escolaridade == 1) {
			ptsescola = 10;
		}
		else if (escolaridade == 2) {
			ptsescola = 20;
		}
		else if (escolaridade == 3) {
			ptsescola = 30;
		}
		else {
			ptsescola = 40;
		}
		
		
		if (experiencia == 0) {
			ptsexp = 0;
		}
		else if (experiencia < 2) {
			ptsexp = 10;
		}
		else if (experiencia > 2 && experiencia < 5 ) {
			ptsexp = 20;
		}
		else {
			ptsexp = 40;
		}
		
		System.out.println("");
		System.out.println("Pontos por escolaridade: " + ptsescola);
		System.out.println("Pontos por experiência: " + ptsexp);
		System.out.println("");
		
		if (escolaridade < 2) {
			System.out.println("Infelizmente seu perfil não atende a empresa");
		}
		else {
			System.out.println("Você está habilitado para o(s) seguinte(s) cargo(s): ");
			if ((escolaridade >= 2) && (Character.toLowerCase(motorista) == 's')) {
				System.out.println("ASSISTENTE");
			}
			else if ((escolaridade >= 3) && (experiencia > 2)) {
				System.out.println("GERENTE");
			}
			if ((experiencia >= 5) && (escolaridade >= 3) && (Character.toLowerCase(viajar) == 's')) {
				System.out.println("ANALISTA");
			}
		}
		
		sc.close();
	}

}
