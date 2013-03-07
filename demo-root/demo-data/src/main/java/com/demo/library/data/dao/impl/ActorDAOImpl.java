/**
 * 
 */
package com.demo.library.data.dao.impl;

import com.demo.library.data.dao.IActorDAO;
import com.demo.library.data.domain.Actor;

/**
 * @author zo
 * Implementation of IActorDAO
 */
public class ActorDAOImpl extends CrudDAOImpl<Actor> implements IActorDAO {

	public ActorDAOImpl() {
		super(Actor.class);
	}


}
