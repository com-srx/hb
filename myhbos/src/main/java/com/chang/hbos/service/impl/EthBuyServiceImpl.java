package com.chang.hbos.service.impl;

import com.chang.hbos.entity.EthBuy;
import com.chang.hbos.mapper.EthBuyMapper;
import com.chang.hbos.service.EthBuyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * eth购买表(EthBuy)表服务实现类
 *
 * @author makejava
 * @since 2020-08-22 21:01:05
 */
@Service("ethBuyService")
public class EthBuyServiceImpl implements EthBuyService {
    @Resource
    private EthBuyMapper EthBuyMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public EthBuy queryById(Integer id) {
        return this.EthBuyMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<EthBuy> queryAllByLimit(int offset, int limit) {
        return this.EthBuyMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ethBuy 实例对象
     * @return 实例对象
     */
    @Override
    public EthBuy insert(EthBuy ethBuy) {
        this.EthBuyMapper.insert(ethBuy);
        return ethBuy;
    }

    /**
     * 修改数据
     *
     * @param ethBuy 实例对象
     * @return 实例对象
     */
    @Override
    public EthBuy update(EthBuy ethBuy) {
        this.EthBuyMapper.update(ethBuy);
        return this.queryById(ethBuy.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.EthBuyMapper.deleteById(id) > 0;
    }
}