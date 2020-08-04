package banco;

public class Poupanca extends Conta{
	
	public void renderJuros() {
		this.saldo = this.saldo + (this.saldo * 0.02);
	}

}
