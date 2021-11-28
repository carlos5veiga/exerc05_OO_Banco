package entities;

public class Account {
	private int number;
	private String name;
	private double saldo;
	
	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public Account(int number, String name, double valorInicial) {
		this.number = number;
		this.name = name;
		deposito(valorInicial);
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valor) {
		saldo = saldo + valor;
	}
	
	public void saque(double valor) {
		saldo = saldo - valor - 5.00;
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f%n", saldo);
	}
	
}
