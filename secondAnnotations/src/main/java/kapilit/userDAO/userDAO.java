package kapilit.userDAO;

import java.util.*;

import kapilit.user.user;

public interface userDAO {

	 user getUser(int id);

	    List<user> getAllUsers();

	    void save(user user);

	    void delete(int id);
}
