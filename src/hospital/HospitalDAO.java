package hospital;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import usuario.Usuario;
import util.HibernateUtil;

public class HospitalDAO {
    
    private Session sessao;
    private Transaction transacao;
    
    public void salvar(Hospital hospital) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.save(hospital);
        transacao.commit();
        sessao.clear();
    }

    public void deletar(Hospital hospital) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.delete(hospital);
        transacao.commit();
        sessao.clear();
    }

    public void atualizar(Hospital hospital) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.update(hospital);
        transacao.commit();
        sessao.clear();
    }

    public List<Hospital> listarHospital() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<Hospital> hospital = sessao.createCriteria(Hospital.class).list();
        sessao.close();
        return hospital;
    }

    public Hospital pesquisarHospitalPorID(int id) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Hospital hospital = (Hospital) sessao.createCriteria(Hospital.class).add(Restrictions.eq("idHospital", id)).uniqueResult();
        sessao.close();
        return hospital;
    }
    
}
