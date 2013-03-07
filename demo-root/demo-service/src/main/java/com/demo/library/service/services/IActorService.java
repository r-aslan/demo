/**
 * 
 */
package com.demo.library.service.services;

import java.util.List;

import com.demo.library.service.beans.ActorBean;

/**
 * @author zo
 *
 */
public interface IActorService {

	ActorBean getActorsById(int id);
	List<ActorBean> getAllActors();
	void insertActor(ActorBean actorBean);
	void updateActor(ActorBean actorBean);
	void deleteActor(ActorBean actorBean);
}
