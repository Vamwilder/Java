
public class ContaVerificar {

	public static void main(String[] args) {
		// Iniciando a classe conta
		Conta conta = new Conta();
		
		// Define Saldo inicial
		conta.setSaldo(932.99);
		
		// Deposito
		conta.depositar(369.99);
		
		// Verifica o saldo
		conta.verificaSaldo();
	}

}
