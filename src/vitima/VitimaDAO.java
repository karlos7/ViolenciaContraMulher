
package vitima;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

public class VitimaDAO {
    
    private Session sessao;
    private Transaction transacao;

    public void salvar(Vitima vitima) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.save(vitima);
        transacao.commit();
        sessao.clear();
    }

    public void deletar(Vitima vitima) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.delete(vitima);
        transacao.commit();
        sessao.clear();
    }

    public void atualizar(Vitima vitima) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.update(vitima);
        transacao.commit();
        sessao.clear();
    }

    public List<Vitima> listarVitimas() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<Vitima> vitimas = sessao.createCriteria(Vitima.class).list();
        sessao.close();
        return vitimas;
    }

    public Vitima pesquisarVitimaPorID(int id) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Vitima vitima = (Vitima) sessao.createCriteria(Vitima.class).add(Restrictions.eq("idVitima", id)).uniqueResult();
        sessao.close();
        return vitima;
    }
    
}
