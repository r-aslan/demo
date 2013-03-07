/**
 * 
 */
package com.demo.library.service.services;

import java.util.List;

import com.demo.library.service.beans.CustomerBean;
import com.demo.library.service.beans.MediaBean;

/**
 * @author zo
 *
 */
public interface IMediaService {

	/**
	 * borrow this media : set id_borrower to a new value
	 */
	void bookMedia(List<MediaBean> mediaBean, CustomerBean customerBean);
	void returnMedias(List<MediaBean> mediaBeanList);
	List<MediaBean> getAvailableMedias();
	MediaBean getMediaBeanById(int id);
	List<MediaBean> getMediasByCustomer(CustomerBean customerBean);

}
