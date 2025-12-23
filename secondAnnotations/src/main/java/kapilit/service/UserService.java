package kapilit.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kapilit.user.user;

@Service
	public class UserService {

	    @Autowired
	    private kapilit.userDAO.userDAO userDAO;

	    public void addUser(user user) {
	        userDAO.save(user);
	    }

	    public user getUser(int id) {
	        return userDAO.getUser(id);
	    }

	    public List<user> getAllUsers() {
	        return userDAO.getAllUsers();
	    }

	    public void deleteUser(int id) {
	        userDAO.delete(id);
	    }
	}
