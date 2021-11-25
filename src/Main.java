
public class Main {

	public static void main(String[] args) {
		Cliente kleyton = new Cliente();
		kleyton.setNome("Kleyton");
		
		Conta cc = new ContaCorrente(kleyton);
		Conta poupanca = new ContaPoupanca(kleyton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
