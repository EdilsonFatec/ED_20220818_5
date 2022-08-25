package controller;

public class Controller {

	public Controller() {
		super();
	}
	public int Fibonacci(int qtde) {
		int soma=0;
		
		if  (qtde==1) {
			return 1;
		}
		else {
			if  (qtde==2) {
				soma = Fibonacci(qtde - 1);
			}
			else {
				soma = Fibonacci(qtde - 1) + Fibonacci(qtde - 2);
			}
		}
	 return soma;
	}
}
