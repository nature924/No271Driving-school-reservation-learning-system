package com.entity.model;

import com.entity.ExamrewrongquestionEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 错题表
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ExamrewrongquestionModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户id
     */
    private Integer yonghuId;


    /**
     * 试卷（外键）
     */
    private Integer exampaperId;


    /**
     * 试题id（外键）
     */
    private Integer examquestionId;


    /**
     * 考生作答
     */
    private String examredetailsMyanswer;


    /**
     * 记录时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3
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
	 * 获取：用户id
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户id
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：试卷（外键）
	 */
    public Integer getExampaperId() {
        return exampaperId;
    }


    /**
	 * 设置：试卷（外键）
	 */
    public void setExampaperId(Integer exampaperId) {
        this.exampaperId = exampaperId;
    }
    /**
	 * 获取：试题id（外键）
	 */
    public Integer getExamquestionId() {
        return examquestionId;
    }


    /**
	 * 设置：试题id（外键）
	 */
    public void setExamquestionId(Integer examquestionId) {
        this.examquestionId = examquestionId;
    }
    /**
	 * 获取：考生作答
	 */
    public String getExamredetailsMyanswer() {
        return examredetailsMyanswer;
    }


    /**
	 * 设置：考生作答
	 */
    public void setExamredetailsMyanswer(String examredetailsMyanswer) {
        this.examredetailsMyanswer = examredetailsMyanswer;
    }
    /**
	 * 获取：记录时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：记录时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
