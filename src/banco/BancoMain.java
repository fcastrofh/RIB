package banco;

public class BancoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
		cliente.setCpf("07548448465");
		cliente.setNome("Flavio Luciano de Castro Filho");
		
		Cliente cliente2 = new Cliente();
		cliente2.setCpf("08965646578");
		cliente2.setNome("José Francisco da Silva");
		
		Conta conta = new Conta();
		conta.setCliente(cliente);
		conta.setNumero(58);
		conta.setSaldo(360);
		
		Conta conta2 = new Conta();
		conta2.setCliente(cliente2);
		conta2.setNumero(42);
		conta2.setSaldo(360);
		
		conta.debitar(35);
		System.out.println("conta: " + conta.getSaldo());
		
		conta.creditar(15);
		System.out.println("conta: " + conta.getSaldo());
		
		conta.transferir(70, conta2);
		System.out.println("conta: " + conta.getSaldo());
		
		System.out.println("conta 2: " + conta2.getSaldo());
	}

}
