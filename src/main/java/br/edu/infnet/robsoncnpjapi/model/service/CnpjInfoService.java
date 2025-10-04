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
		if (cnpj == null) {
			throw new IllegalArgumentException("CNPJ não pode ser nulo");
		}
		
		String cnpjTratado = cnpj.replace(".", "").replace("-", "");
		
		//Validar se tem 14 dígitos
		if (!cnpjTratado.matches("^\\d{14}$")) {
			throw new IllegalArgumentException("CNPJ não é válido");
		}
		
		CnpjInfo cnpjInfo =  brasilApiFeignClient.findByCnpj(cnpjTratado);
		//Validações de resposta
		
		//logradouro, numero - bairro, municipio/uf - cep
		String enderecoCompleto = String.format(
				"%s, %s - %s - %s/%s - %s",
				cnpjInfo.getLogradouro(), cnpjInfo.getNumero(), cnpjInfo.getBairro(), cnpjInfo.getMunicipio(), cnpjInfo.getUf(), cnpjInfo.getCep()
		);
		
		CnpjOutput cnpjOutput = new CnpjOutput();
		cnpjOutput.setCnpj(cnpjInfo.getCnpj());
		cnpjOutput.setRazaoSocial(cnpjInfo.getRazaoSocial());
		cnpjOutput.setNomeFantasia(cnpjInfo.getNomeFantasia());
		cnpjOutput.setDescricaoSituacaoCadastral(cnpjInfo.getDescricaoSituacaoCadastral());
		cnpjOutput.setEnderecoCompleto(enderecoCompleto);
		
		return cnpjOutput;
	}

}
