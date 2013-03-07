/**
 * 
 */
package com.demo.library.data.dao.impl;

import com.demo.library.data.dao.IFormatDAO;
import com.demo.library.data.domain.Format;

/**
 * @author zo
 * Implementation of IFormatDAO
 */
public class FormatDAOImpl extends CrudDAOImpl<Format> implements IFormatDAO {

	public FormatDAOImpl() {
		super(Format.class);
	}

}
