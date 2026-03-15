package com.jeevan.login.controller;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jeevan.login.entity.LoginEntity;
import com.jeevan.login.repository.RepositoryInterface;



import org.springframework.ui.Model;

@Controller
public class HomeController {
    private RepositoryInterface repository;
    HomeController(RepositoryInterface repository) {
        this.repository = repository;
    }
   
   @GetMapping("/register")
public String showRegisterForm(Model model) {
    model.addAttribute("user", new LoginEntity());
    return "register";
    }
    @PostMapping("/login")
    public String loginUser(@RequestParam String username,
                        @RequestParam String password,
                        Model model) {

    Optional<LoginEntity> userOptional = repository.findByUsername(username);

    if (userOptional.isPresent()) {
        LoginEntity user = userOptional.get();

        if (user.getPassword().equals(password)) {
            model.addAttribute("name", user.getUsername());
            return "home";
        }
    }

    model.addAttribute("error", "Invalid username or password");
    return "login";
        }
        @GetMapping("/login")
        public String showLoginForm() {
            return "login";
        }



@PostMapping("/register")
public String registerUser( @ModelAttribute("user") LoginEntity user,
                           Model model) {

    repository.save(user);
    model.addAttribute("message", "Registration successful! Please login.");
    return "login";
    
}
}