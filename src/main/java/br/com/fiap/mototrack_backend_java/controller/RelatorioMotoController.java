package br.com.fiap.mototrack_backend_java.controller;

import br.com.fiap.mototrack_backend_java.service.RelatorioMotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/relatorio-moto")
public class RelatorioMotoController {

    @Autowired
    private RelatorioMotoService relatorioMotoService;

    @GetMapping("/{id}")
    public ResponseEntity<String> gerarRelatorioPorId(@PathVariable Long id) {
        String json = relatorioMotoService.gerarRelatorioMotos(id);
        return ResponseEntity.ok(json);
    }
}
