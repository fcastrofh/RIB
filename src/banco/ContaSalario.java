package banco;

public class ContaSalario extends Conta{

	@Override
	public void debitar(double valor) {
		this.saldo = this.saldo - (valor + (valor * 0.02));
	}
}
