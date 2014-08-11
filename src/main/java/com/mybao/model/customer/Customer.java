package com.mybao.model.customer;

import java.util.Date;

import com.mybao.model.PKItem;
import com.mybao.model.SexEnum;
import com.mybao.model.base.Education;

public class Customer extends PKItem
{

	private SexEnum sex;
	private Date birthday;
	private String hobby;
	private Education education;
	
	/**
	 * 获取学历
	 * @return
	 */
	public Education getEducation()
	{
		return education;
	}
	/**
	 * 设置学历
	 * @param education
	 */
	public void setEducation(Education education)
	{
		this.education = education;
	}
	
	/**
	 * 获取学历
	 * @return
	 */
	public String getHobby()
	{
		return hobby;
	}
	/**
	 * 设置学历
	 * @param hobby
	 */
	public void setHobby(String hobby)
	{
		this.hobby = hobby;
	}
	public SexEnum getSex()
	{
		return sex;
	}
	public void setSex(SexEnum sex)
	{
		this.sex = sex;
	}
	public Date getBirthday()
	{
		return birthday;
	}
	public void setBirthday(Date birthday)
	{
		this.birthday = birthday;
	} 
}
