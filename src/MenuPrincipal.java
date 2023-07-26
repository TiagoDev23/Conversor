import javax.swing.JOptionPane;

public abstract class MenuPrincipal{
	
	private String input;
	protected double numero = 0.0;
	private boolean entradaValida = false;
	
	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}

	public boolean getEntradaValida() {
		return entradaValida;
	}

	public void setEntradaValida(boolean entradaValida) {
		this.entradaValida = entradaValida;
	}

	public abstract void chamaInput();
	
	public abstract double escolha();
	
	
	
}