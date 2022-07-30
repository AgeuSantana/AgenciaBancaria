package Programa;

public class AgenciaBancaria {
	
	static Scanner input = new Scanner(System.in);
	static arrayList<Conta> contasBancarias;
	
	public static void main(String[] args)  {
		contasBancarias = new ArraysList<conta>();
		operaoes();
		}
	
	public static void operacoes() {
		
	System.out.println("---------------------------------------------------------------------");
	System.out.println("------------------Bem vindos a nossa Agencia-------------------------");
	System.out.println("---------------------------------------------------------------------");
	System.out.println("****** Selecione uma operação que deseja realizar *************------");
	System.out.println("---------------------------------------------------------------------");
	System.out.println("|      Operação 1 - Criar conta      |");
	System.out.println("|      Operação 2 - Depositar        |");
	System.out.println("|      Operação 3 - Sacar            |");
	System.out.println("|      Operação 4 - Transferir       |");
	System.out.println("|      Operação 5 - Listar           |");
	System.out.println("|      Operação 6 - Sair             |");
	
	int operacao = input.nextInt();
	
	switch(operacao) {
	case 1:
		criarConta();
		break;
	case 2:
		depositar();
		break;
	case 3:
		sacar();
		break;
	case 4:
		transferir();
		break;
	case 5:
		listar();
		break;
	case 6:
		System.out.println("Obrigado por usar nossa agencia");
		System.exit(0);
		
	default:
		System.out.println("Opção ivalida");
		operacoes();
		break;
		
		
		
	}
	

	}

}
