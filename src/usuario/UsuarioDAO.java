
package usuario;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

public class UsuarioDAO {
    
    private Session sessao;
    private Transaction transacao;
    
    public void salvar(Usuario usuario) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.save(usuario);
        transacao.commit();
        sessao.clear();
    }

    public void deletar(Usuario usuario) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.delete(usuario);
        transacao.commit();
        sessao.clear();
    }

    public void atualizar(Usuario usuario) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.update(usuario);
        transacao.commit();
        sessao.clear();
    }

    public List<Usuario> listarUsuarios() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<Usuario> usuarios = sessao.createCriteria(Usuario.class).list();
        sessao.close();
        return usuarios;
    }

    public Usuario pesquisarUsuarioPorID(int id) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Usuario usuario = (Usuario) sessao.createCriteria(Usuario.class).add(Restrictions.eq("id", id)).uniqueResult();
        sessao.close();
        return usuario;
    }
    
    public Usuario autenticar(String login, String senha) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Usuario usuario = (Usuario) sessao.createCriteria(Usuario.class).add(Restrictions.eq("login", login)).add(Restrictions.eq("senha", senha)).uniqueResult();
        sessao.close();
        return usuario;
    }
    
}
