package com.chang.hbos.controller;

import com.chang.hbos.entity.EthBuy;
import com.chang.hbos.service.EthBuyService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * eth购买表(EthBuy)表控制层
 *
 * @author makejava
 * @since 2020-08-22 21:01:05
 */
@RestController
@RequestMapping("ethBuy")
public class EthBuyController {
    /**
     * 服务对象
     */
    @Resource
    private EthBuyService ethBuyService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public EthBuy selectOne(Integer id) {
        return this.ethBuyService.queryById(id);
    }

    @GetMapping("selectAll")
    public List<EthBuy> selectAll(int pageSize, int pageNum)
    {
        return this.ethBuyService.queryAllByLimit(pageSize,pageNum);
    }

}