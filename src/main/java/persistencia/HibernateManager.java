package persistencia;

import org.hibernate.Session;

import biblioteca.Llibres;

public class HibernateManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Llibres libro = new Llibres();
        libro.setEditoria("Edito");
        libro.setNomLlibre("HLibrito");
        session.save(libro);
        session.getTransaction().commit();
        HibernateUtil.getSessionFactory().close();
        System.out.println("Base de datos actualizada");
	}

}
