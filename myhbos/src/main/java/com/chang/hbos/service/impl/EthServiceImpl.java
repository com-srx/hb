package com.chang.hbos.service.impl;

import com.chang.hbos.entity.Eth;
import com.chang.hbos.mapper.EthMapper;
import com.chang.hbos.service.EthService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * eth基础表(Eth)表服务实现类
 *
 * @author makejava
 * @since 2020-08-22 21:00:52
 */
@Service("ethService")
public class EthServiceImpl implements EthService {
    @Resource
    private EthMapper ethMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Eth queryById(Integer id) {
        return this.ethMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Eth> queryAllByLimit(int offset, int limit) {
        return this.ethMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param eth 实例对象
     * @return 实例对象
     */
    @Override
    public Eth insert(Eth eth) {
        this.ethMapper.insert(eth);
        return eth;
    }

    /**
     * 修改数据
     *
     * @param eth 实例对象
     * @return 实例对象
     */
    @Override
    public Eth update(Eth eth) {
        this.ethMapper.update(eth);
        return this.queryById(eth.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.ethMapper.deleteById(id) > 0;
    }
}