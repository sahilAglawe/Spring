package kapilit.userdaoImple;

import java.util.List;

import kapilit.user.user;
import kapilit.userDAO.userDAO;

public class userDaoImple implements userDAO {
	
	@PersistenceContext
    private EntityManager entityManager;

	@Override
	public user getUser(int id) {
		 return entityManager.find(user.class, id);
	}

	@Override
	public List<user> getAllUsers() {
		return entityManager.createQuery("FROM User", user.class).getResultList();
	}

	@Override
	public void save(user user) {
		  entityManager.merge(user); 
		
	}

	@Override
	public void delete(int id) {
		 user user = entityManager.find(user.class, id);
	        if (user != null) {
	            entityManager.remove(user);
	        }
		
	}

}
