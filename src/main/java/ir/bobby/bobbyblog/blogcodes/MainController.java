package ir.bobby.bobbyblog.blogcodes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
        @RequestMapping("/")
        public String index() {
            return "Hello World!\n" +
                    "This is a blog post about Spring Boot.\n";
        }
}
