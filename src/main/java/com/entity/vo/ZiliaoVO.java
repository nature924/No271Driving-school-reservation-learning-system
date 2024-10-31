package com.entity.vo;

import com.entity.ZiliaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 学习资料
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("ziliao")
public class ZiliaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 学习资料名称
     */

    @TableField(value = "ziliao_name")
    private String ziliaoName;


    /**
     * 学习资料编号
     */

    @TableField(value = "ziliao_uuid_number")
    private String ziliaoUuidNumber;


    /**
     * 学习资料照片
     */

    @TableField(value = "ziliao_photo")
    private String ziliaoPhoto;


    /**
     * 赞
     */

    @TableField(value = "zan_number")
    private Integer zanNumber;


    /**
     * 踩
     */

    @TableField(value = "cai_number")
    private Integer caiNumber;


    /**
     * 学习资料类型
     */

    @TableField(value = "ziliao_types")
    private Integer ziliaoTypes;


    /**
     * 学习资料视频
     */

    @TableField(value = "ziliao_video")
    private String ziliaoVideo;


    /**
     * 学习资料下载
     */

    @TableField(value = "ziliao_file")
    private String ziliaoFile;


    /**
     * 学习资料介绍
     */

    @TableField(value = "ziliao_content")
    private String ziliaoContent;


    /**
     * 逻辑删除
     */

    @TableField(value = "ziliao_delete")
    private Integer ziliaoDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 设置：学习资料名称
	 */
    public String getZiliaoName() {
        return ziliaoName;
    }


    /**
	 * 获取：学习资料名称
	 */

    public void setZiliaoName(String ziliaoName) {
        this.ziliaoName = ziliaoName;
    }
    /**
	 * 设置：学习资料编号
	 */
    public String getZiliaoUuidNumber() {
        return ziliaoUuidNumber;
    }


    /**
	 * 获取：学习资料编号
	 */

    public void setZiliaoUuidNumber(String ziliaoUuidNumber) {
        this.ziliaoUuidNumber = ziliaoUuidNumber;
    }
    /**
	 * 设置：学习资料照片
	 */
    public String getZiliaoPhoto() {
        return ziliaoPhoto;
    }


    /**
	 * 获取：学习资料照片
	 */

    public void setZiliaoPhoto(String ziliaoPhoto) {
        this.ziliaoPhoto = ziliaoPhoto;
    }
    /**
	 * 设置：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 获取：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 设置：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 获取：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 设置：学习资料类型
	 */
    public Integer getZiliaoTypes() {
        return ziliaoTypes;
    }


    /**
	 * 获取：学习资料类型
	 */

    public void setZiliaoTypes(Integer ziliaoTypes) {
        this.ziliaoTypes = ziliaoTypes;
    }
    /**
	 * 设置：学习资料视频
	 */
    public String getZiliaoVideo() {
        return ziliaoVideo;
    }


    /**
	 * 获取：学习资料视频
	 */

    public void setZiliaoVideo(String ziliaoVideo) {
        this.ziliaoVideo = ziliaoVideo;
    }
    /**
	 * 设置：学习资料下载
	 */
    public String getZiliaoFile() {
        return ziliaoFile;
    }


    /**
	 * 获取：学习资料下载
	 */

    public void setZiliaoFile(String ziliaoFile) {
        this.ziliaoFile = ziliaoFile;
    }
    /**
	 * 设置：学习资料介绍
	 */
    public String getZiliaoContent() {
        return ziliaoContent;
    }


    /**
	 * 获取：学习资料介绍
	 */

    public void setZiliaoContent(String ziliaoContent) {
        this.ziliaoContent = ziliaoContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getZiliaoDelete() {
        return ziliaoDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setZiliaoDelete(Integer ziliaoDelete) {
        this.ziliaoDelete = ziliaoDelete;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
