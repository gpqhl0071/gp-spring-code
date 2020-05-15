package com.gp.redhorse.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户余额表
 * </p>
 *
 * @author peng
 * @since 2020-04-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TUserBalance implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 人民币
     */
    private Long cny;

    /**
     * 美元
     */
    private Long usd;

    /**
     * 港币
     */
    private Long hkd;

    /**
     * 冻结金额
     */
    private Long freezeAmount;

    /**
     * 用户出金免收费额度
     */
    private Long quota;

    /**
     * 免提款手续费次数
     */
    private Integer freeNumber;

    /**
     * 收费金额
     */
    private Long tollAmount;

    /**
     * 免费金额
     */
    private Long freeAmount;

    /**
     * 可用积分
     */
    private Long integral;


}
