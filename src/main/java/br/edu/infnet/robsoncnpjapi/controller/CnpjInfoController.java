package br.edu.infnet.robsoncnpjapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.robsoncnpjapi.model.domain.CnpjOutput;
import br.edu.infnet.robsoncnpjapi.model.service.CnpjInfoService;

@RestController
@RequestMapping("/api/cnpj")
public class CnpjInfoController {
	
	private final CnpjInfoService cnpjInfoService;
	
	public CnpjInfoController(CnpjInfoService cnpjInfoService) {
		this.cnpjInfoService = cnpjInfoService;
	}
	
	@GetMapping(value = "/{cnpj}")
	public ResponseEntity<CnpjOutput> buscarCnpjInfo(@PathVariable String cnpj){
		
		CnpjOutput cnpjOutput = cnpjInfoService.buscarCnpjInfo(cnpj);
		
		return ResponseEntity.ok(cnpjOutput);
	}
	
}
