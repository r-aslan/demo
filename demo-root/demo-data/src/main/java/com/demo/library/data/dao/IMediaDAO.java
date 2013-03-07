/**
 * 
 */
package com.demo.library.data.dao;

import java.util.List;

/**
 * @author zo
 * Common operations on all medias
 */
public interface IMediaDAO<T> extends ICrudDAO<T> {
	List getAvailableMedia();
}
