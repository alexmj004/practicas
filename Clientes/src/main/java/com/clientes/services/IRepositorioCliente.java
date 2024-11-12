package com.clientes.services;

import com.clientes.models.Cliente;

import java.util.ArrayList;

public interface IRepositorioCliente {
    Cliente getById(int id);
    ArrayList<Cliente> getAll();
    void add(Cliente cliente);
    void delete(int id);
}
