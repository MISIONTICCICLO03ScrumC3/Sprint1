package com.Sprint3.Sprint3.service;

import com.Sprint3.Sprint3.model.Usuario;
import com.Sprint3.Sprint3.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public List<Usuario> verUsuario(){
        List<Usuario> usuarios=new ArrayList<Usuario>();
        usuarios.addAll(usuarioRepository.findAll());
        return usuarios;
    }
    public void eliminarUsuario(Long id){
        usuarioRepository.deleteById(id);
    }
    public void crearyActualizarUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
    }
}
