package com.demo.library.data.dao;

import java.util.List;

import com.demo.library.data.domain.AbstractMedia;
import com.demo.library.data.domain.Customer;

public interface IAbstractMediaDAO extends IMediaDAO<AbstractMedia> {

	/**
	 * Borrow a media
	 * @param t : the media to borrow
	 */
	void BorrowAMedia(AbstractMedia abstractMedia);
	void updateMediaCustomers(int id, Customer customer);
	void updateListOfMedias(List<Integer> idList, Customer customer);
	List getMediasByCustomer(Customer customer);
}
