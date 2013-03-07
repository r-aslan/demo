/**
 * 
 */
package com.demo.library.service.services;

import java.util.List;

import com.demo.library.service.beans.FormatBean;

/**
 * @author zo
 *
 */
public interface IFormatService {

	/**
	 * @return
	 */
	List<FormatBean> getListFormat();
	/**
	 * @param id
	 * @return
	 */
	FormatBean getFormatById(int id);
	void insertFormat(FormatBean formatBean);
	void updateFormat(FormatBean formatBean);
	void deleteFormat(FormatBean formatBean);
}
