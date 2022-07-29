package subsistema2;

public class Cep {
	private static Cep instancia = new Cep();
	
	private Cep() {
		super();
	}
	
	public static Cep getInstancia() {
		return instancia;
	}
	
	public String recuperacaoCidade(String cep) {
		return "Leblon";
	}

	public String recuperacaoEstado(String cep) {
		return "RJ";
	}
}
