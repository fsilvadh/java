package br.com.minhaempresa.repository;

import br.com.minhaempresa.domain.Cliente;

import javax.persistence.EntityManager;

public class ClienteRepository {

    private EntityManager entityManager = Conexao.getConexao();

    public Cliente buscarCliente(int id) {
        return  entityManager.find(Cliente.class, id);
    }
}
