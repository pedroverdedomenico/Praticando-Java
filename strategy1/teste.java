package strategy1;

public class teste {

	public static void main(String[] args) {
		Comportamento defensivo = new Comportamentodefensivo();
		Comportamento normal = new Comportamentonormal();
		Comportamento agressivo = new Comportamentoagressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		
	}

}
