package com.chang.hbos.entity;

import java.util.Date;
import lombok.Data;
import java.io.Serializable;

/**
 * eth出售表(EthSell)实体类
 *
 * @author makejava
 * @since 2020-08-22 21:01:11
 */
@Data
public class EthSell implements Serializable {
    private static final long serialVersionUID = -31188483978978028L;
    
    private Integer id;
    /**
    * eth单价
    */
    private Double ethSinglePrice;
    /**
    * 出售数量
    */
    private Double ethSellNum;
    /**
    * eth总价
    */
    private Double ethSumPrice;
    
    private Date createTime;
    
    private Date updateTime;


}