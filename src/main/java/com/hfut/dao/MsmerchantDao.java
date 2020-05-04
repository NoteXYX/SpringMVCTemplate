package com.hfut.dao;

import com.hfut.entity.Msmerchant;
import com.hfut.vo.msmerchant.MsmerchantVo;

import java.util.List;

public interface MsmerchantDao {
    public void insertMsmerchant(Msmerchant msmerchant);  //添加商家
    public void deleteMsmerchantByid(int id);           //通过id删除商家
    public void updateMsmerchant(Msmerchant msmerchant);  //修改商家
    public Msmerchant queryMsmerchantByid(int id);      //通过id查询商家
    public List<Msmerchant> queryMsmerchantbyvo(MsmerchantVo msmerchantVo); //商家批量查询
}
