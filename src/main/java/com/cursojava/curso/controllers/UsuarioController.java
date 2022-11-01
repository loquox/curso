package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long  id ) {
        Usuario usuario= new Usuario();
        usuario.setId(id);
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("LucasMoy@hotmail.com");
        usuario.setTelefono("343434");
        return usuario;

        }

    @RequestMapping(value = "usuario ")
    public Usuario editar() {
        Usuario usuario= new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("LucasMoy@hotmail.com");
        usuario.setTelefono("343434");
        return usuario;

    }

    @RequestMapping(value = "usuario")
    public Usuario eliminar() {
        Usuario usuario= new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("LucasMoy@hotmail.com");
        usuario.setTelefono("343434");
        return usuario;

    }

    @RequestMapping(value = "usuario")
    public Usuario buscar() {
        Usuario usuario= new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("LucasMoy@hotmail.com");
        usuario.setTelefono("343434");
        return usuario;

    }




}
