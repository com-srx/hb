package com.chang.hbos.controller;

import com.chang.hbos.entity.Eth;
import com.chang.hbos.service.EthService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * eth基础表(Eth)表控制层
 *
 * @author makejava
 * @since 2020-08-22 21:00:52
 */
@RestController
@RequestMapping("eth")
public class EthController {
    /**
     * 服务对象
     */
    @Resource
    private EthService ethService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Eth selectOne(Integer id) {
        return this.ethService.queryById(id);
    }

    @CrossOrigin
    @GetMapping("selectAll")
    public List<Eth> selectAll(int pageSize, int pageNum)
    {
        return this.ethService.queryAllByLimit(pageSize,pageNum);
    }
}