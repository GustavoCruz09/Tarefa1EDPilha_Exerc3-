package controller;

import daCruz.Gustavo.pilhaint.Pilha;

public class ConverteController {

	public ConverteController() {
		// TODO Auto-generated constructor stub
	}
	
	public String decToBin(int decimal) {
		Pilha p = new Pilha();
		String retorna = "";
		int tamanho = 0;
		
		while(decimal / 2 != 0) {
			if(decimal % 2 == 0) {
				p.Push(0);
			} else {
				p.Push(1);
			}
			decimal /= 2;
		}
		p.Push(decimal);
		tamanho = p.Size();
		
		for(int i = 0; i < tamanho; i++) {
			try {
				int top = p.Top();
				retorna += (top);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				p.Pop();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return retorna;
	}
}
