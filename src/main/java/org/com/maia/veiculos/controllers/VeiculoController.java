package org.com.maia.veiculos.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.com.maia.veiculos.domain.Veiculo;
import org.com.maia.veiculos.domain.dto.VeiculoDTO;
import org.com.maia.veiculos.services.VeiculoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("api/v1/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @Autowired
    private ModelMapper modelMapper;


    @PostMapping
    public ResponseEntity<Void> createVeiculo(@Valid @RequestBody VeiculoDTO obj) throws JsonProcessingException {
        Veiculo veiculo = veiculoService.save( modelMapper.map(obj, Veiculo.class) );
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(veiculo.getUUID()).toUri();
        return ResponseEntity.created(uri).build();
    }



}
