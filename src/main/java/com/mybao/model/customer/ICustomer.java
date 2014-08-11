package com.mybao.model.customer;

import java.util.Date;

import com.mybao.model.IPKItem;
import com.mybao.model.SexEnum;


/**
 * 客户接口
 * @author Owen
 *
 */
public interface ICustomer extends IPKItem
{
	/**
	 * 读取性别
	 * @return
	 */
	SexEnum getSex();
	/**
	 * 设置性别
	 * @param sex
	 */
	void setSex(SexEnum sex);
	/**
	 * 读取生日
	 * @return
	 */
	Date getBirthday();
	/**
	 * 设置生日
	 * @param birthday
	 */
	void setBirthday(Date birthday);
	
}
