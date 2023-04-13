package view;

import javax.swing.JOptionPane;

import controller.ConverteController;

public class Principal {

	public static void main(String[] args) {
		ConverteController converte = new ConverteController();
		int n = 0;
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero ate 1000 para ser convertido em binario"));
		
		while(n > 1000) {
			n = Integer.parseInt(JOptionPane.showInputDialog("O numero deve ser ate 1000, favor escrever novamente"));
		}
		String mostra = converte.decToBin(n);
		System.out.println(mostra);
		
	}

}
