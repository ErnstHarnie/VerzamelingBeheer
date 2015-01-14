/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import BLL.Categorie;
import DAL.NewHibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Ernst
 */
public class CategorieService {

    public static Categorie CategorieOpslaan(Categorie categorie) {
        try {
            Session session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.saveOrUpdate(categorie);
            session.getTransaction().commit();
            session.close();
            return categorie;
        } catch (Exception ex) {
            return null;
        }
    }

    public static boolean CategorieVerwijderen(int Id) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            Query q = session.createQuery("from Categorie categorie where categorie.id=" + Id);
            Categorie categorie = (Categorie) q.uniqueResult();
            session.beginTransaction();
            session.delete(categorie);
            session.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            return false;
        } finally {
            session.close();
        }

    }



public static Categorie GetCategorie(int Id) {
    try {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("from Categorie categorie where categorie.id = " + Id);
        return (Categorie) q.uniqueResult();
    }
    catch (Exception ex)
    {
        return null;
    }
    }

    public static List<Categorie> GetAllCategories() {
        try {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("from Categorie");
        return q.list();
        }
        catch (Exception ex)
        {
           return null; 
        }
    }
}
