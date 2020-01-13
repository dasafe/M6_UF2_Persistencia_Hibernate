package persistencia;

import java.util.Scanner;

import org.hibernate.Session;

import biblioteca.Llibres;

public class HibernateManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		System.out.println("Crearemos, modificaremos y eliminaremos un libro.");
		Llibres libro = new Llibres();
		System.out.println("Editorial del libro:");
		String editorial = reader.nextLine();
		System.out.println("Nombre del libro:");
		String nombre = reader.nextLine();
		libro.setEditoria(editorial);
		libro.setNomLlibre(nombre);
		session.save(libro);
		session.getTransaction().commit();
		System.out.println("Libro creado.");
		
		session.beginTransaction();
		System.out.println("\nAhora modificamos el nombre del libro.");
		System.out.println("Nuevo nombre del libro:");
		nombre = reader.nextLine();
		libro.setNomLlibre(nombre);
		session.update(libro);
		session.getTransaction().commit();
		
		session.beginTransaction();
		System.out.println("\nAhora eliminamos el libro.");
		session.remove(libro);
		session.getTransaction().commit();
		System.out.println("Libro eliminado.");
		
		HibernateUtil.getSessionFactory().close();
		System.out.println("Base de datos actualizada");
	}

}
