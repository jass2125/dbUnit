package edu.ifpb.pp.entidades;

import edu.ifpb.pp.infraestrutura.GenericDAO;
import static java.lang.Boolean.TRUE;

import org.junit.After;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @version 1.0
 * @author Ricardo Job
 */
public class EditoraRepositoryTest {

    private GenericDAO<Editora> repository;
    private Editora editora;

    @Before
    public void setUp() throws Exception {
        repository = mock(GenericDAO.class);
        editora = new Editora("Anderson Souza", "jair_anderson_bs@hotmail.com", "fgjg");
//        new DBUnitHelper().cleanInsert("/tabelas/editora.xml");
//        new DBUnitHelper().cleanInsert("/tabelas/livro.xml");
//        repository = new GenericRepository<>(Editora.class);
    }

    @Test
    public void testFind() {

        when(repository.find(0)).thenReturn(editora);
        
        Editora ed = repository.find(0);
        
        
//        assertNull(ed);
        
        assertSame(ed, editora);

//        Editora editora = repository.find(3);
//        assertNotNull(editora);
//        assertEquals("Chespirito", editora.getNome());
    }

    @Test
    public void testInsert() {
        when(repository.save(editora)).thenReturn(TRUE);
        repository.save(editora);
        
        
        assertTrue(true);
        
        
        
        
        
//        Editora e = new Editora("Aula de Práticas", "chave@gmail.com", "chave.com");
//        e.setEndereco(new Endereco("Cidade", "rua", "d", "12"));
//        Livro livro = new Livro("L1", "11", 26.5, "2014", e, Livro.Origem.Nacional);
//        e.addPublicacao(livro);
//
//        repository.save(e);
//
//        Editora editora = repository.find(e.getId());
//        assertNotNull(editora);
//        assertFalse("Chaves".equals(editora.getNome()));
//        assertEquals("Aula de Práticas", editora.getNome());
    }

    @Test
    public void deveListarTodosOsTiposDaNotificacao() throws Exception {
        when(repository.tamanho()).thenReturn(20);
        int size = repository.tamanho();
        assertSame(size, 20);
//        assertTrue(repository.tamanho() == 1);
    }

    @After
    public void tearDown() throws Exception {
//        new DBUnitHelper().deleteAll("/tabelas/livro.xml");
//        new DBUnitHelper().deleteAll("/tabelas/editora.xml");
    }
}
