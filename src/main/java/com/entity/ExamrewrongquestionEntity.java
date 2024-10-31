package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 错题表
 *
 * @author 
 * @email
 */
@TableName("examrewrongquestion")
public class ExamrewrongquestionEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ExamrewrongquestionEntity() {

	}

	public ExamrewrongquestionEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(20)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户id
     */
    @ColumnInfo(comment="用户id",type="int(20)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 试卷（外键）
     */
    @ColumnInfo(comment="试卷（外键）",type="int(20)")
    @TableField(value = "exampaper_id")

    private Integer exampaperId;


    /**
     * 试题id（外键）
     */
    @ColumnInfo(comment="试题id（外键）",type="int(20)")
    @TableField(value = "examquestion_id")

    private Integer examquestionId;


    /**
     * 考生作答
     */
    @ColumnInfo(comment="考生作答",type="varchar(200)")
    @TableField(value = "examredetails_myanswer")

    private String examredetailsMyanswer;


    /**
     * 记录时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="记录时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Examrewrongquestion{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", exampaperId=" + exampaperId +
            ", examquestionId=" + examquestionId +
            ", examredetailsMyanswer=" + examredetailsMyanswer +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
