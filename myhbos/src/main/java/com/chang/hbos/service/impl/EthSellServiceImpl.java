package com.chang.hbos.service.impl;

import com.chang.hbos.entity.EthSell;
import com.chang.hbos.mapper.EthSellMapper;
import com.chang.hbos.service.EthSellService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * eth出售表(EthSell)表服务实现类
 *
 * @author makejava
 * @since 2020-08-22 21:01:13
 */
@Service("ethSellService")
public class EthSellServiceImpl implements EthSellService {
    @Resource
    private EthSellMapper ethSellMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public EthSell queryById(Integer id) {
        return this.ethSellMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<EthSell> queryAllByLimit(int offset, int limit) {
        return this.ethSellMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ethSell 实例对象
     * @return 实例对象
     */
    @Override
    public EthSell insert(EthSell ethSell) {
        this.ethSellMapper.insert(ethSell);
        return ethSell;
    }

    /**
     * 修改数据
     *
     * @param ethSell 实例对象
     * @return 实例对象
     */
    @Override
    public EthSell update(EthSell ethSell) {
        this.ethSellMapper.update(ethSell);
        return this.queryById(ethSell.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.ethSellMapper.deleteById(id) > 0;
    }
}