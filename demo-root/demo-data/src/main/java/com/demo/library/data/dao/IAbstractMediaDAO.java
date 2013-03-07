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
	/**
	 * set customer to media
	 * @param id id of {@link AbstractMedia}
	 * @param customer {@link Customer} who borrows media
	 */
	void updateMediaCustomers(int id, Customer customer);
	/**
	 * update list of media borrowed by customer
	 * @param idList list of borrowed media
	 * @param customer
	 */
	void updateListOfMedias(List<Integer> idList, Customer customer);
	/**
	 * get all medias borrowed by customer
	 * @param customer {@link Customer}
	 * @return {@link List}<{@link AbstractMedia}>
	 */
	List getMediasByCustomer(Customer customer);
}
