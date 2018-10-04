package tkt.cmu.vn.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller(value="homeControllerofAdmin")
public class HomeController {
    @RequestMapping(value = "/admin/home")
    public String home() {
        return "/admin/home";
    }
}
