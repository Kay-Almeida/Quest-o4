package controller;

public class FatorialController {
	public FatorialController() {
		super();
	}

	public int fatorial(int n) {
		// condição de parada dada por conta do fatorial duplo que não vai ser =0 em
		// algum momento, mas sim <0
		if (n < 0) {
			return 1;
		} else {
			// a função se chamando e diminuindo 2 de n porque é a diferença de um numero
			// impar para outro
			return n * fatorial(n - 2);
		}
	}

}
