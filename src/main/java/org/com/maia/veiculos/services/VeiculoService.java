package org.com.maia.veiculos.services;

import org.com.maia.veiculos.domain.Veiculo;
import org.com.maia.veiculos.services.factory.CRUDFactory;
import org.springframework.stereotype.Service;

@Service
public interface VeiculoService extends CRUDFactory<Veiculo, String>  {

}
