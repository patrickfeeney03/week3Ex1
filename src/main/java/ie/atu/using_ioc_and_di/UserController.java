package ie.atu.using_ioc_and_di;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private UserService userService;
    private UserData userData;

    @Autowired
    public void constructorInjectedController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/registerUser/{name}/{email}")
    public String registerUser(@PathVariable String name, @PathVariable String email) {
        return userService.registerUser(name, email);
    }

    @PostMapping("/registerUserBody")
    @ResponseStatus(HttpStatus.CREATED)
    public UserData registerWithBody(@RequestBody UserData userData) {
        System.out.println("The user " + userData.getName() + "'s email is " + userData.getEmail() + ". He also" +
                " studies at " + userData.getUniversity());
        return userData;
    }
}
