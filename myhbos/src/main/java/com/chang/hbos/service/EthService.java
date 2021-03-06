package com.chang.hbos.service;

import com.chang.hbos.entity.Eth;
import java.util.List;

/**
 * eth基础表(Eth)表服务接口
 *
 * @author makejava
 * @since 2020-08-22 21:00:51
 */
public interface EthService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Eth queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Eth> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param eth 实例对象
     * @return 实例对象
     */
    Eth insert(Eth eth);

    /**
     * 修改数据
     *
     * @param eth 实例对象
     * @return 实例对象
     */
    Eth update(Eth eth);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}