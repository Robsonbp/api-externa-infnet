package br.edu.infnet.robsoncnpjapi.model.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.robsoncnpjapi.model.domain.CnpjInfo;

@FeignClient(name = "brasilapi", url = "{$api.brasilapi.url}")
public interface BrasilApiFeignClient {
	
	@GetMapping("cnpj/v1/{cnpj}/")
	CnpjInfo findByCnpj(@PathVariable String cnpj);
		
	
}
