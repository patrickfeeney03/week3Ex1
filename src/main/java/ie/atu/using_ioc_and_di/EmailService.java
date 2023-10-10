package ie.atu.using_ioc_and_di;

import org.springframework.stereotype.Service;

@Service
public class EmailService {
    public String sendEmail(String to, String message) {
        System.out.println("This email is being sent to " + to);
        return ("This email is intended to: " + to + "<br>And the message is: " + message);
    }
}
