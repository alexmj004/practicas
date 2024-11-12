package com.clientes.controllers;

import com.clientes.models.Cliente;
import com.clientes.services.IRepositorioCliente;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController

// Para indicar que si quieren acceder a clientes, tienen que añadir dicha sección a la URL.
@RequestMapping("/Clientes")

//


//
public class ClienteController {
    private IRepositorioCliente repositorioCliente;
    ClienteController(IRepositorioCliente _repositorioCliente){
        repositorioCliente = _repositorioCliente;
    }


//    Mapeos con get:
    @GetMapping
    public ArrayList<Cliente> dameTodos(){
        return repositorioCliente.getAll();
    }

//    Como tenemos que pasar un parámetro lo indicamos en el getMapping
    @GetMapping("{id}")
    public Cliente Get(@PathVariable int id){
        return repositorioCliente.getById(id);
    }

//    Mapeos con post.
    @PostMapping()
    public Cliente Post(@RequestBody Cliente cliente){
        repositorioCliente.add(cliente);
        return cliente;
    }

//    Mapeos con delete.
    @DeleteMapping("{id}")
    public void borrar(@PathVariable int id){
        repositorioCliente.delete(id);
    }
}
