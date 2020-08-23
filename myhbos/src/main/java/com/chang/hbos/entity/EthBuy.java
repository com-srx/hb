package com.chang.hbos.entity;

import java.util.Date;
import lombok.Data;
import java.io.Serializable;

/**
 * eth购买表(EthBuy)实体类
 *
 * @author makejava
 * @since 2020-08-22 21:01:04
 */
@Data
public class EthBuy implements Serializable {
    private static final long serialVersionUID = -77458119914839752L;
    
    private Integer id;
    /**
    * eth单价
    */
    private Double ethSinglePrice;
    /**
    * 购买数量
    */
    private Double ethBuyNum;
    /**
    * eth总价
    */
    private Double ethSumPrice;
    
    private Date createTime;
    
    private Date updateTime;


}