package com.entity.model;

import com.entity.JiaolianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 教练
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiaolianModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 教练姓名
     */
    private String jiaolianName;


    /**
     * 教练手机号
     */
    private String jiaolianPhone;


    /**
     * 教练身份证号
     */
    private String jiaolianIdNumber;


    /**
     * 教练头像
     */
    private String jiaolianPhoto;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 电子邮箱
     */
    private String jiaolianEmail;


    /**
     * 创建时间
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
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：教练姓名
	 */
    public String getJiaolianName() {
        return jiaolianName;
    }


    /**
	 * 设置：教练姓名
	 */
    public void setJiaolianName(String jiaolianName) {
        this.jiaolianName = jiaolianName;
    }
    /**
	 * 获取：教练手机号
	 */
    public String getJiaolianPhone() {
        return jiaolianPhone;
    }


    /**
	 * 设置：教练手机号
	 */
    public void setJiaolianPhone(String jiaolianPhone) {
        this.jiaolianPhone = jiaolianPhone;
    }
    /**
	 * 获取：教练身份证号
	 */
    public String getJiaolianIdNumber() {
        return jiaolianIdNumber;
    }


    /**
	 * 设置：教练身份证号
	 */
    public void setJiaolianIdNumber(String jiaolianIdNumber) {
        this.jiaolianIdNumber = jiaolianIdNumber;
    }
    /**
	 * 获取：教练头像
	 */
    public String getJiaolianPhoto() {
        return jiaolianPhoto;
    }


    /**
	 * 设置：教练头像
	 */
    public void setJiaolianPhoto(String jiaolianPhoto) {
        this.jiaolianPhoto = jiaolianPhoto;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：电子邮箱
	 */
    public String getJiaolianEmail() {
        return jiaolianEmail;
    }


    /**
	 * 设置：电子邮箱
	 */
    public void setJiaolianEmail(String jiaolianEmail) {
        this.jiaolianEmail = jiaolianEmail;
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

    }
