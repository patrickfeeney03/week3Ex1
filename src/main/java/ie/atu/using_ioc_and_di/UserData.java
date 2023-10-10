package ie.atu.using_ioc_and_di;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserData {
    private String name;
    private String email;
    private String university;
}
