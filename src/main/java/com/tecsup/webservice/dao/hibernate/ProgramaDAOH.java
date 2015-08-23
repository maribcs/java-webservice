/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.webservice.dao.hibernate;

/**
 *
 * @author alumno
 */
import com.tecsup.webservice.dao.ProgramaDAO;
import com.tecsup.webservice.model.Programa;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository("programaDAO")
public class ProgramaDAOH extends BaseHibernateDAO implements ProgramaDAO{
    
    @Override
    public List<Programa> list() {
        Criteria criteria = this.getSession().createCriteria(Programa.class);
        return criteria.list();
    }
    @Override
    public Programa get(Long t) {
        Criteria criteria= this.getSession().createCriteria(Programa.class);
        criteria.add(Restrictions.eq("id", t));
        return (Programa) criteria.uniqueResult();
    }
    @Override
    public void save(Programa t) {
        this.getSession().save(t);
    }
    @Override
    public void update(Programa t) {
        this.getSession().merge(t);
    }
    @Override
    public void delete(Programa t) {
        this.getSession().delete(t);
    }
    
}
