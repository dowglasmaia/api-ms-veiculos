package org.com.maia.veiculos.services;

import org.com.maia.veiculos.domain.Veiculo;
import org.com.maia.veiculos.repository.VeiculoRepository;
import org.com.maia.veiculos.services.factory.CRUDFactoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeiculoServiceImpl extends CRUDFactoryImpl<Veiculo, String> implements  VeiculoService {

    @Autowired
    public VeiculoServiceImpl(VeiculoRepository veiculoRepository) {
        super(veiculoRepository);
    }
}
