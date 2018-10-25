package tkt.cmu.vn.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import tkt.cmu.vn.constant.SystemConstant;
import tkt.cmu.vn.dto.NewDTO;
import tkt.cmu.vn.repository.NewRepository;
import tkt.cmu.vn.repository.UserRepository;
import tkt.cmu.vn.repository.paging.PageRequest;
import tkt.cmu.vn.service.impl.NewService;

@Controller
public class NewController {

    @Autowired
    private NewService newService;

    @RequestMapping(value = "/admin/new/list", method = RequestMethod.GET)
    public ModelAndView shoNews(@ModelAttribute(SystemConstant.MODEL) NewDTO model) {
        ModelAndView mav = new ModelAndView("/admin/new/list");
        newService.findAll(model, new PageRequest(model.getPage(),model.getMaxPageItems()));
        mav.addObject(SystemConstant.MODEL, model);
        return mav;
    }
}
