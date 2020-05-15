package com.gp.redhorse.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 取款表
 * </p>
 *
 * @author peng
 * @since 2020-04-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TWithdraw implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 银行卡主键ID
     */
    private Integer bankCardId;

    /**
     * 币种1人民币 2美金 3港币
     */
    private Integer curreny;

    /**
     * 取款金额
     */
    private Long amount;

    /**
     * 取款手续费
     */
    private Long fee;

    /**
     * 申请时间
     */
    private LocalDateTime applyTime;

    /**
     * 第一次审核时间
     */
    private LocalDateTime auditTime1;

    /**
     * 第二次审核时间
     */
    private LocalDateTime auditTime2;

    /**
     * 发送到第三方支付公司时间
     */
    private LocalDateTime sendTime;

    /**
     * 支付时间（从银行更新时的时间）
     */
    private LocalDateTime payTime;

    /**
     * 0-提交申请 1-审核不通过 2-审核通过 3-拒绝支付 4-同意支付 5-支付成功 6-支付失败 7-线下同意支付 8-线下支付成功 9-线下支付失败 10-线下支付退款 11-部分成功 
     */
    private Integer state;

    /**
     * 打款结果描述
     */
    private String stateDesc;

    /**
     * 删除 1正常 0已删除
     */
    private Integer flag;

    /**
     * 打款批次号
     */
    private String batchNo;

    /**
     * 商户订单号、流水号
     */
    private String orderId;

    /**
     * 支付通道：0：线下支付；1：易宝；3：易汇金；  4：unionpay 5：chinapay、8-合众支付、10-邦付宝、12-九派、18-小米支付、21-通联支付、24-汇潮支付、26-广州银联支付、27-新之瑞代付、30-baymax代付、31-钱宝、32-新之瑞银联、33-信汇代付、34-新之瑞新接口银联、36-信汇大象代付
     */
    private String payChannel;

    /**
     * 取款使用积分
     */
    private Long integral;

    /**
     * 0-未拆单、1-已拆单
     */
    private Integer isSplitOrder;


}
