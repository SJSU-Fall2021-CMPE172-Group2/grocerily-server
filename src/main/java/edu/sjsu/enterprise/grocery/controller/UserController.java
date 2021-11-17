package edu.sjsu.enterprise.grocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.sjsu.enterprise.grocery.User;
import edu.sjsu.enterprise.grocery.UserRepository;

@Controller
@RequestMapping(path = "/user")
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@PostMapping(path = "/create", consumes = "application/json")
	public @ResponseBody String addNewUser(@RequestBody User user) {
		userRepository.save(user);
		return "Saved:" + user.getUserName();
	}

	@GetMapping(path = "/", produces = "application/json")
	public @ResponseBody List<User> getUser(@RequestParam String name) {
		// This returns a JSON or XML with the users
		return userRepository.findByUserName(name);
	}
}