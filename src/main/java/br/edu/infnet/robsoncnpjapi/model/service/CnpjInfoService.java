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
	
	public CnpjOutput buscarCnpjInfo(String cpnj) {
		//Não pode ser nulo
		//Tratar string para tirar pontos,hifens e barras
		//Validar se tem 14 dígitos
		
		//Buscar informações no BrasilAPI
		CnpjInfo cnpjInfo =  brasilApiFeignClient.findByCnpj(cpnj);
			//Validações de resposta
		
		CnpjOutput cnpjOutput = new CnpjOutput();
		cnpjOutput.setCnpj(cnpjInfo.getCnpj());
		cnpjOutput.setDescricaoSituacaoCadastral(cnpjInfo.getDescricaoSituacaoCadastral());
		
		return cnpjOutput;
	}

}
