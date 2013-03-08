/**
 * 
 */
package com.demo.library.data.dao;

import java.util.List;


/**
 * @author Zo Randrianarivo
 * Common operations on all medias
 * @param <T>
 */
public interface IMediaDAO<T> extends ICrudDAO<T> {
	/**
	 * get all available media in library
	 * @return
	 */
	List getAvailableMedia();
}
