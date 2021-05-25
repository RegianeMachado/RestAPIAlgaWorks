package com.algaworks.algalog.controller;

import com.algaworks.algalog.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar() {
        Cliente cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("Regi");
        cliente1.setEmail("regi.sabbath@gmail.com");
        cliente1.setTelefone("909080808");

        Cliente cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("Lien");
        cliente2.setEmail("lien.sabbath@gmail.com");
        cliente2.setTelefone("909080808");

        return Arrays.asList(cliente1, cliente2);
    }
}
