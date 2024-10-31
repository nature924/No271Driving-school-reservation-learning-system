package com.entity.model;

import com.entity.JiaolianYuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 教练预约
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiaolianYuyueModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 报名编号
     */
    private String jiaolianYuyueUuidNumber;


    /**
     * 教练
     */
    private Integer jiaolianId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 报名理由
     */
    private String jiaolianYuyueText;


    /**
     * 教练预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 报名状态
     */
    private Integer jiaolianYuyueYesnoTypes;


    /**
     * 审核回复
     */
    private String jiaolianYuyueYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date jiaolianYuyueShenheTime;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date jiaolianYuyueTime;


    /**
     * 创建时间 show3 listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：报名编号
	 */
    public String getJiaolianYuyueUuidNumber() {
        return jiaolianYuyueUuidNumber;
    }


    /**
	 * 设置：报名编号
	 */
    public void setJiaolianYuyueUuidNumber(String jiaolianYuyueUuidNumber) {
        this.jiaolianYuyueUuidNumber = jiaolianYuyueUuidNumber;
    }
    /**
	 * 获取：教练
	 */
    public Integer getJiaolianId() {
        return jiaolianId;
    }


    /**
	 * 设置：教练
	 */
    public void setJiaolianId(Integer jiaolianId) {
        this.jiaolianId = jiaolianId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：报名理由
	 */
    public String getJiaolianYuyueText() {
        return jiaolianYuyueText;
    }


    /**
	 * 设置：报名理由
	 */
    public void setJiaolianYuyueText(String jiaolianYuyueText) {
        this.jiaolianYuyueText = jiaolianYuyueText;
    }
    /**
	 * 获取：教练预约时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：教练预约时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：报名状态
	 */
    public Integer getJiaolianYuyueYesnoTypes() {
        return jiaolianYuyueYesnoTypes;
    }


    /**
	 * 设置：报名状态
	 */
    public void setJiaolianYuyueYesnoTypes(Integer jiaolianYuyueYesnoTypes) {
        this.jiaolianYuyueYesnoTypes = jiaolianYuyueYesnoTypes;
    }
    /**
	 * 获取：审核回复
	 */
    public String getJiaolianYuyueYesnoText() {
        return jiaolianYuyueYesnoText;
    }


    /**
	 * 设置：审核回复
	 */
    public void setJiaolianYuyueYesnoText(String jiaolianYuyueYesnoText) {
        this.jiaolianYuyueYesnoText = jiaolianYuyueYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getJiaolianYuyueShenheTime() {
        return jiaolianYuyueShenheTime;
    }


    /**
	 * 设置：审核时间
	 */
    public void setJiaolianYuyueShenheTime(Date jiaolianYuyueShenheTime) {
        this.jiaolianYuyueShenheTime = jiaolianYuyueShenheTime;
    }
    /**
	 * 获取：预约时间
	 */
    public Date getJiaolianYuyueTime() {
        return jiaolianYuyueTime;
    }


    /**
	 * 设置：预约时间
	 */
    public void setJiaolianYuyueTime(Date jiaolianYuyueTime) {
        this.jiaolianYuyueTime = jiaolianYuyueTime;
    }
    /**
	 * 获取：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3 listShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
