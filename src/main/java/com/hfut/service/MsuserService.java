package com.hfut.service;

import com.hfut.dao.MsuserDao;
import com.hfut.entity.Msuser;
import com.hfut.vo.msuser.MsuserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MsuserService {

    @Autowired
    MsuserDao msuserDao;

    public void insertMsuser(Msuser msuser) {   //添加用户
        msuserDao.insertMsuser(msuser);
    }

    public void deleteMsuserByid(int id) {      //通过id删除用户
        msuserDao.deleteMsuserByid(id);
    }

    public void updateMsuser(Msuser msuser) {   //修改用户
        msuserDao.updateMsuser(msuser);
    }

    public Msuser queryMsuserByid(int id) {     //通过id查询用户
        return msuserDao.queryMsuserByid(id);
    }

    public List<Msuser> queryMsuserbyvo(MsuserVo msuserVo) {    //用户批量查询
        return msuserDao.queryMsuserbyvo(msuserVo);
    }
}
