package es.altair.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import es.altair.bean.Usuario;
import es.altair.util.SessionProvider;

public class UsuarioDAOImpHibernate implements UsuarioDAO {

	private String pass = "Libros123$%";

	public Usuario comprobarUsuario(String email, String pass) {
		System.out.println("Entramos en UsuarioIMPL");
		Usuario usu = null;

		// SessionFactory sf = new Configuration().configure().buildSessionFactory();
		// Session sesion = sf.openSession();

		Session sesion = SessionProvider.getSession();
		System.out.println("creamos la sesion");
		try {
			sesion.beginTransaction();

			usu = (Usuario) sesion
					.createQuery(
							"SELECT u FROM Usuario u WHERE email=:e " + "AND pass=AES_ENCRYPT(:p, :passphrase)")
					.setParameter("e", email).setParameter("p", pass).setParameter("passphrase", pass)
					.uniqueResult();
			System.out.println(usu);
			sesion.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			sesion.close();
			// sf.close();
		}

		return usu;
	}

	public int insertar(Usuario usu) {
		int filas = 0;

		Session sesion = SessionProvider.getSession();
		try {
			sesion.beginTransaction();

			filas = sesion
					.createSQLQuery("INSERT INTO usuarios (email, pass, nombre, email, tipo)"
							+ "values (:l, AES_ENCRYPT(:p, :pass), :n, :e, :t)")
					.setParameter("l", usu.getEmail()).setParameter("p", usu.getPass())
					.setParameter("passphrase", pass).setParameter("n", usu.getNombre())
					.setParameter("e", usu.getEmail()).setParameter("t", usu.getTipo()).executeUpdate();

			sesion.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			sesion.close();
		}

		return filas;
	}

	public boolean validarEmail(Usuario usu) {
		boolean correcto = true;

		Session sesion = SessionProvider.getSession();
		try {
			sesion.beginTransaction();

			if ((Usuario) sesion.createQuery("From Usuario Where email=:e")
					.setParameter("e", usu.getEmail())
					.uniqueResult() != null)
				correcto = false;

			sesion.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			sesion.close();
		}
		return correcto;
	}

}
