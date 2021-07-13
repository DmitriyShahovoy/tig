package online.prjctr.hsa.spring.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        userService.save(new User("test"));
        return "save ok";
    }

    @RequestMapping("/find")
    @ResponseBody
    public String find() {
        userService.find();
        return "find ok";
    }
}
