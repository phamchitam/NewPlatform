package tkt.cmu.vn.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller(value="homeControllerofWeb")
public class HomeController {
    @RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
    public String home(){
        return "/web/home";
    }


    @RequestMapping(value = "/dang-nhap")
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/dang-nhap?incorrectAccount")
    public String incorrect(){
        return "incorrect";
    }

    @RequestMapping(value = "/logout")
    public String logout(){
        return "logout";
    }
}
