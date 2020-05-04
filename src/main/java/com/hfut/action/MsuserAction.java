package com.hfut.action;

import com.hfut.entity.Msuser;
import com.hfut.service.MsuserService;
import com.hfut.vo.msuser.MsuserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("msUserAction")
public class MsuserAction {

    @Autowired
    MsuserService msuserService;

    @RequestMapping("toadd")
    public String toadd() {
        return "msuser/add";
    }

    @RequestMapping(value="add", method= RequestMethod.POST)
    public String add(Msuser msuser) {
        msuserService.insertMsuser(msuser);
        System.out.println(msuser);
        return "redirect:querybyvo";
    }

    @RequestMapping("toupdate")
    public String toupdate(HttpServletRequest request, int id) {
        Msuser msuser = msuserService.queryMsuserByid(id);
        request.setAttribute("msuser", msuser);
        return "msuser/update";
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String update(Msuser msuser) {
        msuserService.updateMsuser(msuser);
        System.out.println(msuser);
        return "redirect:querybyvo";
    }

    @RequestMapping("del")
    public String del(HttpServletRequest request, int id) {
        msuserService.deleteMsuserByid(id);
        return "redirect:querybyvo";
    }

    @RequestMapping("querybyid")
    public String querybyid(HttpServletRequest request, int id) {
        Msuser msuser = msuserService.queryMsuserByid(id);
        request.setAttribute("msuser", msuser);
        return "msuser/view";
    }

    @RequestMapping("querybyvo")
    public String querybyvo(HttpServletRequest request, MsuserVo msuserVo) {
        List<Msuser> list = msuserService.queryMsuserbyvo(msuserVo);
        request.setAttribute("msuserlist", list);
        return "msuser/list";
    }

}
