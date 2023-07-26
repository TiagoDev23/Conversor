import javax.swing.JOptionPane;

public class Moedas extends MenuPrincipal{
	
	double converssao = 0;
	
	public void chamaInput() {
		//EXIBE A JANELA DE INPUT.
	while(!getEntradaValida()) {
	setInput(JOptionPane.showInputDialog(null, "Insira um valor"));
	
	//VERIFICA SE O USUARIO PRESSIONOU "CANCELAR" OU FECHOU A JANELA.
	if(getInput() == null) {
		System.out.println("Operacao cancelada pelo usuario.");
		System.exit(0);
	}
	
	//TENTA CONVERTER O VALOR PARA UM NUMERO
	try {
		numero = Double.parseDouble(getInput());
		setEntradaValida(true);
	}catch(NumberFormatException ex) {
		// SE OUVER ERRO, A ENTRADA NAO E VALIDA
		JOptionPane.showInputDialog(null, "Insira um valor numerico valido!",
				"Erro de entrada", JOptionPane.ERROR_MESSAGE);
	}
	
	//APOS A VALIDACAO, O VALOR NUMERICO E GUARDADO NA VARIAVEL NUMERO;
	System.out.println("Numero digitado: " + this.numero);
		
	}
	} 
	
	public double escolha() {
		//CRIACAO DO VETOR QUE ARMAZENARA AS INFORMACOES
		Object[] opcoes = {"De reais a Dolares", "De reais a Euros", "De Reais a Libras", "De Reais a Yenes",
				"De Reais a Won Coreano", "De Dolares a Reais", "De Euros a Reais", "De Libras a Reais"};
		
		String escolha = (String) JOptionPane.showInputDialog(null,"Escolha um item", "OpÃ§ao",
	            JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
		if(escolha == "De Reais a Dolares") {
			double converssao = (numero / 4.79);//REAIS >> DOLARES
			JOptionPane.showMessageDialog(null, "Reais " + converssao + " Convertido para Dolares");
		} else if(escolha == "De Reais a Euros") {
			double converssao = (numero / 5.37);//REAIS >> EUROS
			JOptionPane.showMessageDialog(null, "Reais " + converssao + " Convertido para Euro");
		} else if(escolha == "De Reais a Libras") {
			double converssao = (numero / 6.33);//REAIS >> LIBRAS
			JOptionPane.showMessageDialog(null, + converssao + " Convertido para Libras");
		} else if(escolha == "De Reais a Yenes") {
			double converssao = (numero / 0.035);//REAIS >> YENES
			JOptionPane.showMessageDialog(null, + converssao + " Convertido para Yenes");
		} else if(escolha == "De Reais a Won Coreano") {
			double converssao = (numero / 0.0038);//REAIS >> WON COREANO
			JOptionPane.showMessageDialog(null, + converssao + " Convertido para Won Coreano");
		} else if(escolha == "De Dolares a Reais") {
			double converssao = (numero / 0.21);//DOLARES >> REAIS
			JOptionPane.showMessageDialog(null, + converssao + " Convertido de Dolares para Reais");
		} else if(escolha == "De Euros a Reais") {
			double converssao = (numero / 0.19);//EUROS >> REAIS
			JOptionPane.showMessageDialog(null, + converssao + " Convertido de Euro para Reais");
		} else if(escolha == "De Libras a Reais") {
			double converssao = (numero / 0.15);//LIBRAS >> REAIS
			JOptionPane.showMessageDialog(null, + converssao + " Convertido de Libras para Reais");
		} 
		int menu = JOptionPane.showConfirmDialog(null, "Para continuar aperte 'Sim' para finalizar aperte 'Não' ?", escolha, JOptionPane.YES_NO_CANCEL_OPTION);
			if(menu == JOptionPane.YES_OPTION) {
				chamaInput();
				escolha();
			} else if(menu == JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(null, "Programa Finalizado");

			} else if(menu == JOptionPane.CANCEL_OPTION) {
				JOptionPane.showMessageDialog(null, "Programa Finalizado");
			}
			
		return converssao;
	}

}
