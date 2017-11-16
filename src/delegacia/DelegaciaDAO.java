package delegacia;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

public class DelegaciaDAO {
    
    private Session sessao;
    private Transaction transacao;
    
    public void salvar(Delegacia delegacia) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.save(delegacia);
        transacao.commit();
        sessao.clear();
    }

    public void deletar(Delegacia delegacia) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.delete(delegacia);
        transacao.commit();
        sessao.clear();
    }

    public void atualizar(Delegacia delegacia) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.update(delegacia);
        transacao.commit();
        sessao.clear();
    }

    public List<Delegacia> listarDelegacia() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<Delegacia> delegacias = sessao.createCriteria(Delegacia.class).list();
        sessao.close();
        return delegacias;
    }

    public Delegacia pesquisarDelegaciaPorID(int id) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Delegacia delegacia = (Delegacia) sessao.createCriteria(Delegacia.class).add(Restrictions.eq("idDelegacia", id)).uniqueResult();
        sessao.close();
        return delegacia;
    }
    
}
