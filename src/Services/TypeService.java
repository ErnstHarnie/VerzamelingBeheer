/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import BLL.VerzamelingsType;
import DAL.NewHibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Ernst
 */
public class TypeService {
       
    public static VerzamelingsType TypeOpslaan(VerzamelingsType type)
    {
        try {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(type);
        session.getTransaction().commit();
        session.close();
        return type;
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    public static boolean TypeVerwijderen(int Id)
    {
         Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
        Query q = session.createQuery("from VerzamelingsType type where type.id="+Id);
        VerzamelingsType type = (VerzamelingsType)q.uniqueResult();
        session.beginTransaction();
        session.delete(type);
        session.getTransaction().commit();
        return true;
        }
        catch (Exception ex)
        {
            return false;
        }
        finally
        {
        session.close();
        }
    }
    
        public static VerzamelingsType GetType(int Id)
        {
            try {
            Session session = NewHibernateUtil.getSessionFactory().openSession();
            Query q = session.createQuery("from VerzamelingsType type where type.id="+Id);
            return (VerzamelingsType)q.uniqueResult();
            }
            catch (Exception ex)
            {
                return null;
            }
        }
        
        
                
    public static List<VerzamelingsType> GetAllTypes()
    {
        try {
        Session session = 
              NewHibernateUtil.getSessionFactory().openSession();
         Query q = session.createQuery("from VerzamelingsType");
         return q.list();
        }
        catch (Exception ex)
        {
            return null;
        }
    }
    
}
