package com.clientes.services;

import com.clientes.models.Cliente;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
// Indicamos que esta clase es un repositorio que se va a inyectar.
@Repository
public class FakeRepositorio implements IRepositorioCliente{

    ArrayList<Cliente> lista = new ArrayList<>();
    FakeRepositorio(){
        lista.add(new Cliente(1,"Pepe","pepe@gmail.com"));
        lista.add(new Cliente(2,"Juan","juan@gmail.com"));
        lista.add(new Cliente(3,"Luis","luis@gmail.com"));
        lista.add(new Cliente(4,"Ana","ana@gmail.com"));
        lista.add(new Cliente(5,"Raquel","raquel@gmail.com"));
    }
    @Override
    public Cliente getById(int id) {
        return lista.stream().findFirst(x->x.getId() == id).
                stream().findFirst().
                orElse(null);
                ;
    }

    @Override
    public ArrayList<Cliente> getAll() {
        return lista;
    }

    @Override
    public void add(Cliente cliente) {
        lista.add(cliente);
    }

    @Override
    public void delete(int id) {
        lista.remove(id);
    }
}
