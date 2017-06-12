/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jualsepatu;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

/**
 *
 * @author Amar Maruf
 */
public class Querysepatu {
     public void Add(Object object) {
        
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("jualsepatuPU");
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin();
        try {
                em.persist(object);
                em.getTransaction().commit();
        } catch (Exception e) {
                e.printStackTrace();
                em.getTransaction().rollback();
        } finally {
                em.close();
        }
    }
    
  public void update(long a,String b,String c){
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("jualsepatuPU");
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin();
        em.createQuery("UPDATE tablesepatu e SET e.nama=?1,e.nohp=?2 WHERE e.id=?3",tablesepatu.class).setParameter(1, b).setParameter(2, c).setParameter(3, a).executeUpdate();       
        em.getTransaction().commit();
  }
  
  public void hapus(long id){
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("jualsepatuPU");
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin();
        int hapusyu=em.createQuery("DELETE FROM tablesepatu e WHERE e.id=:par").setParameter("par", id).executeUpdate();
        em.getTransaction().commit();
      
        
  }
  public void Show() {
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("jualsepatuPU");
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT e FROM tablesepatu e");
        List<tablesepatu> result = query.getResultList();
        for (tablesepatu e : result) {
                 System.out.println("ID AGEN :"+ e.getId()+ "\n NAMA :" + e.getNamapembeli()+ "\n NO HP :" +e.getNohp()+ "\n ALAMAT :" +e.getAlamatpembeli()+ "\n MEREK :"+e.getMereksepatu()+"\n JENIS :"+e.getJenis());
        }
    }
}


    

