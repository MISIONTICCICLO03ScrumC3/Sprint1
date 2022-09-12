package com.Sprint3.Sprint3.controller;


import com.Sprint3.Sprint3.model.Usuario;
import com.Sprint3.Sprint3.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/usuario")
    private List<Usuario> verUsuario(){
        return usuarioService.verUsuario();
    }
    @PostMapping("/usuario")
    private void crearUsuario(@RequestBody Usuario usuario){
        usuarioService.crearyActualizarUsuario(usuario);
    }
    @DeleteMapping("/usuario/{id}")
    private  void eliminarUsuario(@PathVariable("id") Long id){
        usuarioService.eliminarUsuario(id);
    }
    @PutMapping("/usuario")
    private void editarUsuario(@RequestBody Usuario usuario){
        usuarioService.crearyActualizarUsuario(usuario);
    }
}
