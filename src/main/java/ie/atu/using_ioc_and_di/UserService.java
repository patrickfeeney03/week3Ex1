package ie.atu.using_ioc_and_di;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final EmailService emailService;

    @Autowired
    public UserService(EmailService emailService) {
        this.emailService = emailService;
    }

    public String registerUser(String username, String email) {
        return emailService.sendEmail(email, "Welcome");
    }
}
