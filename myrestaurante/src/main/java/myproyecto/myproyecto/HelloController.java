package myproyecto.myproyecto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
   
    
        @GetMapping("/my Restaurante")
        public String hello() {
            return "Hola, \n Este es my Restaurante";
        }
}
