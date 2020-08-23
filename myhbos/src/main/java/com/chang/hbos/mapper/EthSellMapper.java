package com.chang.hbos.mapper;

import com.chang.hbos.entity.EthSell;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * eth出售表(EthSell)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-22 21:01:12
 */
@Mapper
public interface EthSellMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    EthSell queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<EthSell> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ethSell 实例对象
     * @return 对象列表
     */
    List<EthSell> queryAll(EthSell ethSell);

    /**
     * 新增数据
     *
     * @param ethSell 实例对象
     * @return 影响行数
     */
    int insert(EthSell ethSell);

    /**
     * 修改数据
     *
     * @param ethSell 实例对象
     * @return 影响行数
     */
    int update(EthSell ethSell);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}