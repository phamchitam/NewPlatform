package tkt.cmu.vn.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import tkt.cmu.vn.dto.UserDTO;

@Controller(value="homeControllerofWeb")
public class HomeController {
    @RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView("web/home");
        UserDTO userDTO = new UserDTO();
        userDTO.setName("Khoa hoc Java Spring thang 09 nam 2018");
        mav.addObject("model",userDTO);
        return mav;
    }
}
