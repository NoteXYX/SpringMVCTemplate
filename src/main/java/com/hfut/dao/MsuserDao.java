package com.hfut.dao;

import com.hfut.entity.Msuser;
import com.hfut.vo.msuser.MsuserVo;

import java.util.List;

public interface MsuserDao {
    public void insertMsuser(Msuser msuser);  //添加用户
    public void deleteMsuserByid(int id);           //通过id删除用户
    public void updateMsuser(Msuser msuser);  //修改用户
    public Msuser queryMsuserByid(int id);      //通过id查询用户
    public List<Msuser> queryMsuserbyvo(MsuserVo msuserVo); //用户批量查询
}
