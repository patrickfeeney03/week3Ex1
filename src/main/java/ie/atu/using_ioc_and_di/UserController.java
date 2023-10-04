package ie.atu.using_ioc_and_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserService userService;

    @Autowired
    public void constructorInjectedController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/registerUser/{name}/{email}")
    public String registerUser(@PathVariable String name, @PathVariable String email) {
        return userService.registerUser(name, email);
    }
}
