import javax.swing.JOptionPane;

public class CalculoDeImc {
	public static void main (String[] args) {
		
		// Arrecadando informações
		JOptionPane.showMessageDialog(null, "Vamos calcular seu IMC, (Indice de massa corporal).");
		String altura = JOptionPane.showInputDialog("Digite sua Altura");
		String peso = 	JOptionPane.showInputDialog("Digite seu peso");
		
		// Convertendo String para float
		double altura2 	= Double.parseDouble(altura);
		double peso2 	= Double.parseDouble(peso);
		
		// Calculando IMC
		double imc = peso2 / (altura2 * altura2);
		
		// Apresentando resultado
		if (imc < 16) 			JOptionPane.showMessageDialog(null, "Magreza grave");
		else if (imc < 17) 		JOptionPane.showMessageDialog(null, "Magreza moderada");
		else if (imc < 18.5)	JOptionPane.showMessageDialog(null, "Magreza leve");
		else if (imc < 25)		JOptionPane.showMessageDialog(null, "Saudavel");
		else if (imc < 30)		JOptionPane.showMessageDialog(null, "Sobrepeso");
		else if (imc < 35)		JOptionPane.showMessageDialog(null, "Obesidade Grau 1");
		else if (imc < 40)		JOptionPane.showMessageDialog(null, "Obesidade Grau 2 (Severa)");
		else if (imc >= 40)		JOptionPane.showMessageDialog(null, "Obesidade Grau 3 (Mórbida)");
	}
}
