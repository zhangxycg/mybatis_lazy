package com.zxy.dao;

import com.zxy.pojo.Account;

import java.util.List;

/**
 * @Description:
 * @Author: zhangxy
 * @Date: Created in 2019/11/27
 * @Modified By:
 */
public interface IAccountDao {
    /**
     * 查询所有账户信息
     *
     * @return
     */
    List<Account> findAll();

    /**
     * 根据用户id查询账户信息
     * @param uid
     * @return
     */
    List<Account> findAccountByUid(Integer uid);

}
