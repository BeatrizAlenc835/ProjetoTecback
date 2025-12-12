package br.fam.si.techback.controller;

import br.fam.si.techback.dto.metodo.MetodoPagamentoCreateDTO;
import br.fam.si.techback.dto.metodo.MetodoPagamentoResponseDTO;
import br.fam.si.techback.service.MetodoPagamentoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/metodos-pagamento")
public class MetodoPagamentoController {

    private final MetodoPagamentoService service;

    public MetodoPagamentoController(MetodoPagamentoService service) {
        this.service = service;
    }

    @PostMapping
    public MetodoPagamentoResponseDTO criar(@Valid @RequestBody MetodoPagamentoCreateDTO dto) {
        return service.criar(dto);
    }

    @GetMapping("/usuario/{usuarioId}")
    public List<MetodoPagamentoResponseDTO> listarPorUsuario(@PathVariable UUID usuarioId) {
        return service.listarPorUsuario(usuarioId);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable UUID id) {
        service.deletar(id);
    }
}
