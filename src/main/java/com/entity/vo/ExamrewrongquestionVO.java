package com.entity.vo;

import com.entity.ExamrewrongquestionEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 错题表
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("examrewrongquestion")
public class ExamrewrongquestionVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户id
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 试卷（外键）
     */

    @TableField(value = "exampaper_id")
    private Integer exampaperId;


    /**
     * 试题id（外键）
     */

    @TableField(value = "examquestion_id")
    private Integer examquestionId;


    /**
     * 考生作答
     */

    @TableField(value = "examredetails_myanswer")
    private String examredetailsMyanswer;


    /**
     * 记录时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show3
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户id
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户id
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：试卷（外键）
	 */
    public Integer getExampaperId() {
        return exampaperId;
    }


    /**
	 * 获取：试卷（外键）
	 */

    public void setExampaperId(Integer exampaperId) {
        this.exampaperId = exampaperId;
    }
    /**
	 * 设置：试题id（外键）
	 */
    public Integer getExamquestionId() {
        return examquestionId;
    }


    /**
	 * 获取：试题id（外键）
	 */

    public void setExamquestionId(Integer examquestionId) {
        this.examquestionId = examquestionId;
    }
    /**
	 * 设置：考生作答
	 */
    public String getExamredetailsMyanswer() {
        return examredetailsMyanswer;
    }


    /**
	 * 获取：考生作答
	 */

    public void setExamredetailsMyanswer(String examredetailsMyanswer) {
        this.examredetailsMyanswer = examredetailsMyanswer;
    }
    /**
	 * 设置：记录时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：记录时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
