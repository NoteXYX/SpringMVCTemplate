package com.hfut.action;

import com.hfut.entity.Msmerchant;
import com.hfut.service.MsmerchantService;
import com.hfut.vo.msmerchant.MsmerchantVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("msMerchantAction")
public class MsMerchantAction {

    @Autowired
    MsmerchantService msmerchantService;

    @RequestMapping("toadd")
    public String toadd() {
        return "msmerchant/add";
    }

    @RequestMapping(value="add", method= RequestMethod.POST)
    public String add(Msmerchant msmerchant) {
        msmerchantService.insertMsmerchant(msmerchant);
        System.out.println(msmerchant);
        return "redirect:querybyvo";
    }

    @RequestMapping("toupdate")
    public String toupdate(HttpServletRequest request, int id) {
        Msmerchant msmerchant = msmerchantService.queryMsmerchantByid(id);
        request.setAttribute("msmerchant", msmerchant);
        return "msmerchant/update";
    }

    @RequestMapping(value="update", method= RequestMethod.POST)
    public String update(Msmerchant msmerchant) {
        msmerchantService.updateMsmerchant(msmerchant);
        System.out.println(msmerchant);
        return "redirect:querybyvo";
    }

    @RequestMapping("del")
    public String del(HttpServletRequest request, int id) {
        msmerchantService.deleteMsmerchantByid(id);
        return "redirect:querybyvo";
    }

    @RequestMapping("querybyid")
    public String querybyid(HttpServletRequest request, int id) {
        Msmerchant msmerchant = msmerchantService.queryMsmerchantByid(id);
        request.setAttribute("msmerchant", msmerchant);
        return "msmerchant/view";
    }

    @RequestMapping("querybyvo")
    public String querybyvo(HttpServletRequest request, MsmerchantVo msmerchantVo) {
        List<Msmerchant> list = msmerchantService.queryMsmerchantbyvo(msmerchantVo);
        request.setAttribute("msmerchantlist", list);
        return "msmerchant/list";
    }

}
