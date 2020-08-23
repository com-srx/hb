package com.chang.hbos.mapper;

import com.chang.hbos.entity.Eth;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * eth基础表(Eth)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-22 21:00:51
 */
@Mapper
public interface EthMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Eth queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Eth> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param eth 实例对象
     * @return 对象列表
     */
    List<Eth> queryAll(Eth eth);

    /**
     * 新增数据
     *
     * @param eth 实例对象
     * @return 影响行数
     */
    int insert(Eth eth);

    /**
     * 修改数据
     *
     * @param eth 实例对象
     * @return 影响行数
     */
    int update(Eth eth);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}