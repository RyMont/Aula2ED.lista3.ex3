package view;

import javax.swing.JOptionPane;

import controller.InversaoController;

public class Principal {
	public static void main(String[] args) {
		InversaoController ic = new InversaoController();
		
		String str = JOptionPane.showInputDialog("Digite a string: ");
		String strInvertida = ic.inverteString(str, (str.length()));
		
		System.out.println("A string invertida fica:");
		System.out.print(strInvertida);
	}
}
