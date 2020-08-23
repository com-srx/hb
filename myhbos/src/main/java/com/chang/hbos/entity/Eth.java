package com.chang.hbos.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * eth基础表(Eth)实体类
 *
 * @author makejava
 * @since 2020-08-22 20:56:13
 */
@Data
public class Eth implements Serializable {
    private static final long serialVersionUID = 389592537131822233L;
    
    private Integer id;
    /**
    * 交易数量
    */
    private Double transactionNum;
    /**
    * 交易类型
    */
    private String transactionType;
    /**
    * 交易单价
    */
    private Double transactionSinglePrice;
    /**
    * 交易总价
    */
    private Double transactionSumPrice;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 更新时间
    */
    private Date updateTime;


}