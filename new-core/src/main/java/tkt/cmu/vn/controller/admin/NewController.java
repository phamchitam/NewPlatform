package tkt.cmu.vn.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import tkt.cmu.vn.repository.UserRepository;

@Controller
public class NewController {

    @RequestMapping(value = "/admin/new/list", method = RequestMethod.GET)
    public ModelAndView shoNews() {
        ModelAndView mav = new ModelAndView("/admin/new/list");
        return mav;
    }
}
