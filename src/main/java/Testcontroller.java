import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testcontroller {
    @PostMapping ("/Test")
    public String test(){
        return "Hi Hello";
    }
}
