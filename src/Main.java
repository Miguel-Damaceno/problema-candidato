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
		System.out.println("2) Ensino M�dio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) P�s-gradua��o");
		System.out.println("Digite uma op��o: ");
		escolaridade = sc.nextInt();
		System.out.println("Voc� tem quantos anos de experi�ncia profissional?");
		experiencia = sc.nextInt();
		System.out.println("Voc� tem disponibilidade para viajar (S/N)?");
		viajar = sc.next().charAt(0);
		System.out.println("Voc� tem habilita��o de motorista (S/N)?");
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
		System.out.println("Pontos por experi�ncia: " + ptsexp);
		System.out.println("");
		
		if (escolaridade < 2) {
			System.out.println("Infelizmente seu perfil n�o atende a empresa");
		}
		else {
			System.out.println("Voc� est� habilitado para o(s) seguinte(s) cargo(s): ");
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
