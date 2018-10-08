package tkt.cmu.vn.controller.web;

import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpRequest;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import tkt.cmu.vn.entity.UserEntity;
import tkt.cmu.vn.repository.UserRepository;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;


@Controller(value="homeControllerofWeb")
public class HomeController {

    @Autowired
    private UserRepository userRepository;


    @RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
    public ModelAndView home(){
        String username ;
        String fullName ;
        ModelAndView mav = new ModelAndView("/web/home");
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        username = auth.getName();
        fullName = userRepository.findByUserName(username).getFullName();
        mav.addObject("fullName",fullName);
        return mav;
    }


    @RequestMapping(value = "/dang-nhap")
    public String login(){
        return "login";
    }


    @RequestMapping(value = "/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response){

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){

            new SecurityContextLogoutHandler().logout(request, response, auth);
        }

        return "redirect:/dang-nhap";
    }



}
