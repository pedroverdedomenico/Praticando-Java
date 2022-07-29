package facade;

import subsistema1.CmsService;
import subsistema2.Cep;

public class Facade {

	public void migrarCliente(String nome, String cep) {
		String cidade = Cep.getInstancia().recuperacaoCidade(cep);
		String estado = Cep.getInstancia().recuperacaoEstado(cep);
		
		CmsService.gravarCliente(nome, cep, estado, cidade);
	}
}
