package com.hfut.service;

import com.hfut.dao.MsmerchantDao;
import com.hfut.entity.Msmerchant;
import com.hfut.vo.msmerchant.MsmerchantVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MsmerchantService {

    @Autowired
    MsmerchantDao msmerchantDao;

    public void insertMsmerchant(Msmerchant msmerchant) {   //添加商家
        msmerchantDao.insertMsmerchant(msmerchant);
    }

    public void deleteMsmerchantByid(int id) {           //通过id删除商家
        msmerchantDao.deleteMsmerchantByid(id);
    }

    public void updateMsmerchant(Msmerchant msmerchant){    //修改商家
        msmerchantDao.updateMsmerchant(msmerchant);
    }

    public Msmerchant queryMsmerchantByid(int id){  //通过id查询商家
        return msmerchantDao.queryMsmerchantByid(id);
    }

    public List<Msmerchant> queryMsmerchantbyvo(MsmerchantVo msmerchantVo) {//批量查询
        return msmerchantDao.queryMsmerchantbyvo(msmerchantVo);
    }
}
