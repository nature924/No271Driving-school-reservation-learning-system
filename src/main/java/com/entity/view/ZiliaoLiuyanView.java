package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ZiliaoLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 学习资料留言
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("ziliao_liuyan")
public class ZiliaoLiuyanView extends ZiliaoLiuyanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表

	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 电子邮箱
		*/

		@ColumnInfo(comment="电子邮箱",type="varchar(200)")
		private String yonghuEmail;
	//级联表 学习资料
		/**
		* 学习资料名称
		*/

		@ColumnInfo(comment="学习资料名称",type="varchar(200)")
		private String ziliaoName;
		/**
		* 学习资料编号
		*/

		@ColumnInfo(comment="学习资料编号",type="varchar(200)")
		private String ziliaoUuidNumber;
		/**
		* 学习资料照片
		*/

		@ColumnInfo(comment="学习资料照片",type="varchar(200)")
		private String ziliaoPhoto;
		/**
		* 赞
		*/

		@ColumnInfo(comment="赞",type="int(11)")
		private Integer zanNumber;
		/**
		* 踩
		*/

		@ColumnInfo(comment="踩",type="int(11)")
		private Integer caiNumber;
		/**
		* 学习资料类型
		*/
		@ColumnInfo(comment="学习资料类型",type="int(11)")
		private Integer ziliaoTypes;
			/**
			* 学习资料类型的值
			*/
			@ColumnInfo(comment="学习资料类型的字典表值",type="varchar(200)")
			private String ziliaoValue;
		/**
		* 学习资料视频
		*/

		@ColumnInfo(comment="学习资料视频",type="varchar(200)")
		private String ziliaoVideo;
		/**
		* 学习资料下载
		*/

		@ColumnInfo(comment="学习资料下载",type="varchar(200)")
		private String ziliaoFile;
		/**
		* 学习资料介绍
		*/

		@ColumnInfo(comment="学习资料介绍",type="longtext")
		private String ziliaoContent;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer ziliaoDelete;



	public ZiliaoLiuyanView() {

	}

	public ZiliaoLiuyanView(ZiliaoLiuyanEntity ziliaoLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, ziliaoLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 电子邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 电子邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}
	//级联表的get和set 学习资料

		/**
		* 获取： 学习资料名称
		*/
		public String getZiliaoName() {
			return ziliaoName;
		}
		/**
		* 设置： 学习资料名称
		*/
		public void setZiliaoName(String ziliaoName) {
			this.ziliaoName = ziliaoName;
		}

		/**
		* 获取： 学习资料编号
		*/
		public String getZiliaoUuidNumber() {
			return ziliaoUuidNumber;
		}
		/**
		* 设置： 学习资料编号
		*/
		public void setZiliaoUuidNumber(String ziliaoUuidNumber) {
			this.ziliaoUuidNumber = ziliaoUuidNumber;
		}

		/**
		* 获取： 学习资料照片
		*/
		public String getZiliaoPhoto() {
			return ziliaoPhoto;
		}
		/**
		* 设置： 学习资料照片
		*/
		public void setZiliaoPhoto(String ziliaoPhoto) {
			this.ziliaoPhoto = ziliaoPhoto;
		}

		/**
		* 获取： 赞
		*/
		public Integer getZanNumber() {
			return zanNumber;
		}
		/**
		* 设置： 赞
		*/
		public void setZanNumber(Integer zanNumber) {
			this.zanNumber = zanNumber;
		}

		/**
		* 获取： 踩
		*/
		public Integer getCaiNumber() {
			return caiNumber;
		}
		/**
		* 设置： 踩
		*/
		public void setCaiNumber(Integer caiNumber) {
			this.caiNumber = caiNumber;
		}
		/**
		* 获取： 学习资料类型
		*/
		public Integer getZiliaoTypes() {
			return ziliaoTypes;
		}
		/**
		* 设置： 学习资料类型
		*/
		public void setZiliaoTypes(Integer ziliaoTypes) {
			this.ziliaoTypes = ziliaoTypes;
		}


			/**
			* 获取： 学习资料类型的值
			*/
			public String getZiliaoValue() {
				return ziliaoValue;
			}
			/**
			* 设置： 学习资料类型的值
			*/
			public void setZiliaoValue(String ziliaoValue) {
				this.ziliaoValue = ziliaoValue;
			}

		/**
		* 获取： 学习资料视频
		*/
		public String getZiliaoVideo() {
			return ziliaoVideo;
		}
		/**
		* 设置： 学习资料视频
		*/
		public void setZiliaoVideo(String ziliaoVideo) {
			this.ziliaoVideo = ziliaoVideo;
		}

		/**
		* 获取： 学习资料下载
		*/
		public String getZiliaoFile() {
			return ziliaoFile;
		}
		/**
		* 设置： 学习资料下载
		*/
		public void setZiliaoFile(String ziliaoFile) {
			this.ziliaoFile = ziliaoFile;
		}

		/**
		* 获取： 学习资料介绍
		*/
		public String getZiliaoContent() {
			return ziliaoContent;
		}
		/**
		* 设置： 学习资料介绍
		*/
		public void setZiliaoContent(String ziliaoContent) {
			this.ziliaoContent = ziliaoContent;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getZiliaoDelete() {
			return ziliaoDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setZiliaoDelete(Integer ziliaoDelete) {
			this.ziliaoDelete = ziliaoDelete;
		}


	@Override
	public String toString() {
		return "ZiliaoLiuyanView{" +
			", ziliaoName=" + ziliaoName +
			", ziliaoUuidNumber=" + ziliaoUuidNumber +
			", ziliaoPhoto=" + ziliaoPhoto +
			", zanNumber=" + zanNumber +
			", caiNumber=" + caiNumber +
			", ziliaoVideo=" + ziliaoVideo +
			", ziliaoFile=" + ziliaoFile +
			", ziliaoContent=" + ziliaoContent +
			", ziliaoDelete=" + ziliaoDelete +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			"} " + super.toString();
	}
}
