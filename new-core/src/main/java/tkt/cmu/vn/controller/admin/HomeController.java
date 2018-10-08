package tkt.cmu.vn.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import tkt.cmu.vn.repository.UserRepository;


@Controller(value="homeControllerofAdmin")
public class HomeController {
    @Autowired
    UserRepository userRepository;
    @RequestMapping(value = "/admin/home")
    public ModelAndView home() {
        String username;
        String fullName;
        ModelAndView mav = new ModelAndView("/admin/home");
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        username = auth.getName();
        fullName = userRepository.findByUserName(username).getFullName();
        mav.addObject("fullName", fullName);
        return mav;
    }
}
