package br.com.alura.leilao.dao;

import br.com.alura.leilao.model.Usuario;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;

public class UsuarioDaoTest {

    private UsuarioDao dao;

    private EntityManager em;

    @Test
    void testeBuscaUsuarioPeloUsername() {
        this.dao = new UsuarioDao(em);
        Usuario usuario = this.dao.buscarPorUsername("fulano");
        Assert.assertNotNull(usuario);
    }
}
