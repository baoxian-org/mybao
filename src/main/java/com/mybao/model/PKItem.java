package com.mybao.model;
/**
 * 带主键的基础数据类
 * @author Owen
 *
 */
public abstract class PKItem extends Item implements IPKItem
{
	private long id;
	public long getId()
	{
		return id;
	}
	public void setId(long id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getNumber()
	{
		return number;
	}
	public void setNumber(String number)
	{
		this.number = number;
	}
	private String name;
	private String number;
	
}
