package banco;

public class Conta {

	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void creditar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void debitar(double valor) {
		this.saldo = this.saldo - valor;
	}
	
	public void transferir(double valor, Conta conta) {
		debitar(valor);
		conta.creditar(valor);
	}
}
