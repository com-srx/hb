package com.chang.hbos.controller;

import com.chang.hbos.entity.EthSell;
import com.chang.hbos.service.EthSellService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * eth出售表(EthSell)表控制层
 *
 * @author makejava
 * @since 2020-08-22 21:01:13
 */
@RestController
@RequestMapping("ethSell")
public class EthSellController {
    /**
     * 服务对象
     */
    @Resource
    private EthSellService ethSellService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public EthSell selectOne(Integer id) {
        return this.ethSellService.queryById(id);
    }

}