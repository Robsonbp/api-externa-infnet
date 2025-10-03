package br.edu.infnet.robsoncnpjapi.model.service;

import org.springframework.stereotype.Service;

import br.edu.infnet.robsoncnpjapi.model.clients.BrasilApiFeignClient;
import br.edu.infnet.robsoncnpjapi.model.domain.CnpjInfo;
import br.edu.infnet.robsoncnpjapi.model.domain.CnpjOutput;

@Service
public class CnpjInfoService {
	
	private final BrasilApiFeignClient brasilApiFeignClient;
	
	public CnpjInfoService(BrasilApiFeignClient brasilApiFeignClient) {
		this.brasilApiFeignClient = brasilApiFeignClient;
	}
	
	public CnpjOutput buscarCnpjInfo(String cnpj) {
		//Não pode ser nulo
		if (cnpj == null) {
			throw new IllegalArgumentException("CNPJ não pode ser nulo");
		}
		
		//Tratar string para tirar pontos,hifens e barras
		String cnpjTratado = cnpj.replace(".", "").replace("-", "").replace("/", "");
		
		//Validar se tem 14 dígitos
		if (!cnpjTratado.matches("^\\d{14}$")) {
			throw new IllegalArgumentException("CNPJ não é válido");
		}
		
		//Buscar informações no BrasilAPI
		CnpjInfo cnpjInfo =  brasilApiFeignClient.findByCnpj(cnpj);
			//Validações de resposta
		
		CnpjOutput cnpjOutput = new CnpjOutput();
		cnpjOutput.setCnpj(cnpjInfo.getCnpj());
		cnpjOutput.setDescricaoSituacaoCadastral(cnpjInfo.getDescricaoSituacaoCadastral());
		
		return cnpjOutput;
	}

}
