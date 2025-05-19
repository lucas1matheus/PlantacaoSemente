import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    // 30.000 pilulas - 1 arvore
		Scanner scanner = new Scanner(System.in);
		Semente s = new Semente();
		Compra c = new Compra();

		//Parametro p = new Parametro();

        int opcao;
        
        do {
            System.out.println("1 - Pilulas para sementes");
            System.out.println("2 - Plantar Semente");
            System.out.println("3 - Comprar Semente");
            System.out.println("4 - Gerar Relatorio");
            opcao = scanner.nextInt(); 
            scanner.nextLine();
            
            if (opcao == 1) {
                System.out.print("Numero de pilulas: ");
                int scan = scanner.nextInt();
                scanner.nextLine();
                s.adicionarPilula(scan);
            } else if (opcao == 2) {
                System.out.print("Numero de sementes para plantar: ");
                int scan = scanner.nextInt();
                scanner.nextLine();
                s.plantarSemente(scan);
            } else if (opcao == 3) {
                System.out.print("Valor da sementes: ");
                int scan = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Quantas sementes deseja comprar: ");
                int scan2 = scanner.nextInt();
                scanner.nextLine();
                c.comprarSemente(scan, scan2, s);
            } else if (opcao == 4) {
                
            } else if (opcao == 0) {
                System.out.println("Tchau");
            } else {
                System.out.println("Opcap Invalida");
            }
        } while (opcao != 0);

        scanner.close();
	}
}
