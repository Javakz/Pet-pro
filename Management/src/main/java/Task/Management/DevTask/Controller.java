package Task.Management.DevTask;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class Controller {

    @GetMapping("/api")
    public int get(){
        return 10*10;
    }


}
