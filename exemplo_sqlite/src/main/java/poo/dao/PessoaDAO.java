package poo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import poo.model.Pessoa;

public class PessoaDAO {
    
    private static final SessionFactory sessionFactory;

    static{
        try{
            Configuration configuration = new Configuration().configure();
            sessionFactory = configuration.buildSessionFactory();
        }catch(Exception e){
            throw new ExceptionInInitializerError();
        }
    }
    
    public void close(){
        sessionFactory.close();
    }

    public void cadastrarPessoa(Pessoa p){
        Transaction transaction = null;

        try(Session session = sessionFactory.openSession()){
            transaction= session.beginTransaction();
            session.save(p);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Pessoa getPessoaById(Long id){
        try(Session session = sessionFactory.openSession()){
            return session.get(Pessoa.class, id);
        } 
    }

    public void atualizarPessoa(Pessoa p){
        Transaction transaction = null;

        try(Session session = sessionFactory.openSession()){
            transaction= session.beginTransaction();
            session.update(p);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void deletarPessoa(Pessoa p){
        Transaction transaction = null;

        try(Session session = sessionFactory.openSession()){
            transaction= session.beginTransaction();
            session.delete(p);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
