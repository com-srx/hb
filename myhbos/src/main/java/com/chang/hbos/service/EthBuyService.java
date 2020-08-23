package com.chang.hbos.service;

import com.chang.hbos.entity.EthBuy;
import java.util.List;

/**
 * eth购买表(EthBuy)表服务接口
 *
 * @author makejava
 * @since 2020-08-22 21:01:05
 */
public interface EthBuyService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    EthBuy queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<EthBuy> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ethBuy 实例对象
     * @return 实例对象
     */
    EthBuy insert(EthBuy ethBuy);

    /**
     * 修改数据
     *
     * @param ethBuy 实例对象
     * @return 实例对象
     */
    EthBuy update(EthBuy ethBuy);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}