package com.example.acs.helper;

import com.example.acs.model.PassaDados;


import java.util.List;

public interface InterDAO {

    public boolean salvar(PassaDados passaDados);
    public boolean editar(PassaDados passaDados);
    public boolean deletar(PassaDados passaDados);
    public List<PassaDados> listar();

}
