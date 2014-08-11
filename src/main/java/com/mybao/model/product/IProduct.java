package com.mybao.model.product;

import java.util.Date;

import com.mybao.model.IPKItem;
/**
 * 保险产品
 * @author Owen
 *
 */
public interface IProduct extends IPKItem
{
	/**
	 * 读取产品类型
	 * @return
	 */
	ProductTypeEnum getProductType();
	/**
	 * 设置产品类型
	 * @param productType
	 */
	void setProductType(ProductTypeEnum productType);
	/**
	 * 费率表对应的金额类型
	 * @return
	 */
	RateTypeEnum getRateType();
	/**
	 * 设置费率表对应的金额类型
	 * @return
	 */
	void setRateType(RateTypeEnum rateType);
	/**获取上市时间
	 * 
	 * @return
	 */
	Date getTimeToMarket();
	/**设置上市时间
	 * 
	 * @return
	 */
	void setTimeToMarket(Date timeToMarket);
	
	
	
}
