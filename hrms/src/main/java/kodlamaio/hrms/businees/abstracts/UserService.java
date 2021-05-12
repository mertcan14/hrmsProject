package kodlamaio.hrms.businees.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.User;

public interface UserService {
	List<User> getAll();
}
