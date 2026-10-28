package br.edu.ifspcjo.ads.web2.ifitness.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.edu.ifspcjo.ads.web2.ifitness.domain.model.User;
import br.edu.ifspcjo.ads.web2.ifitness.repository.UserRepository;
import br.edu.ifspcjo.ads.web2.ifitness.service.exception.EmailAlreadyRegisteredException;


@Service
public class UserService {

    	@Autowired
	private UserRepository userRepository;

	public User save(User user) {
		if (userRepository.existsByEmail(user.getEmail())) {
			throw new EmailAlreadyRegisteredException();
		}
		return userRepository.save(user);
	}

	public User findUserById(Long id) {
		User userSaved = userRepository.findById(id)
				.orElseThrow(() -> new EmptyResultDataAccessException(1));
		return userSaved;
	}

}

