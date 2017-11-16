package creas;

import delegacia.*;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

public class CreasDAO {
    
    private Session sessao;
    private Transaction transacao;
    
    public void salvar(Creas creas) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.save(creas);
        transacao.commit();
        sessao.clear();
    }

    public void deletar(Creas creas) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.delete(creas);
        transacao.commit();
        sessao.clear();
    }

    public void atualizar(Creas creas) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.update(creas);
        transacao.commit();
        sessao.clear();
    }

    public List<Creas> listarCreas() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<Creas> creas = sessao.createCriteria(Creas.class).list();
        sessao.close();
        return creas;
    }

    public Creas pesquisarCreasPorID(int id) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Creas creas = (Creas) sessao.createCriteria(Creas.class).add(Restrictions.eq("idCreas", id)).uniqueResult();
        sessao.close();
        return creas;
    }
    
}
