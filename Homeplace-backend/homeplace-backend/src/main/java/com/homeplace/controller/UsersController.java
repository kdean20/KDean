package com.homeplace.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.homeplace.entity.Users;
import com.homeplace.service.UsersService;

@Controller
public class UsersController {
	
	@Autowired
	UsersService usersService;
	
	@GetMapping("/")
    public String welcome(Model model){
        return "index";    
    }
	
	 @GetMapping("/home")
	 public String home(Model model) {
	    return "home";
	}
	
	@GetMapping("/register")
	public ModelAndView register(Model model) {
		return new ModelAndView("register", "users", new Users());
	}
	
	// Handle register
	@PostMapping("/register")
	public String handleRegister(Model model, @ModelAttribute("users") Users users, HttpSession session) {
		usersService.saveUsers(users);
		model.addAttribute("newUsers",users);
		return("/thank-you");
		
	}
	
	@GetMapping("/login")
    public ModelAndView login(Model model) {
    	return new ModelAndView("login", "users", new Users());
    	
    }
	
	// Handle Login
	 @PostMapping("/login")
	    public String handleLogin(Model model, @ModelAttribute("users") Users users, HttpSession session) {
	    	Users loginUser = usersService.loginUsers(users);	    	
	    	
	    	if(loginUser != null) {
	    		session.setAttribute("loggedInUsers", loginUser);
	    		return "home";
	    	}
	    	else {
	    		model.addAttribute("error", "Invalid email or password"); 
	    		model.addAttribute("users", new Users());
	    		return "login";
	    	}
	    }

}
