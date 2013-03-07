package com.demo.library.service.services;

import java.text.Format;

import com.demo.library.data.domain.AbstractMedia;
import com.demo.library.data.domain.Actor;
import com.demo.library.data.domain.Customer;
import com.demo.library.data.domain.Employee;
import com.demo.library.data.domain.Movie;
import com.demo.library.data.domain.Music;
import com.demo.library.data.domain.VideoGame;
import com.demo.library.service.beans.ActorBean;
import com.demo.library.service.beans.CustomerBean;
import com.demo.library.service.beans.EmployeeBean;
import com.demo.library.service.beans.FormatBean;
import com.demo.library.service.beans.MediaBean;
import com.demo.library.service.beans.MovieBean;
import com.demo.library.service.beans.MusicBean;
import com.demo.library.service.beans.VideoGameBean;

public interface IBeanDataConverterService {

	FormatBean getFormatBeanFromFormat(Format format);
	Format getFormatFromFormatBean(FormatBean formatBean);
	ActorBean getActorBeanFromActor(Actor actor);
	Actor getActorFromActorBean(ActorBean actorBean);
	EmployeeBean getEmployeeBeanFromEmployee(Employee employee);
	Employee getEmployeeFromEmployeeBean(EmployeeBean employeeBean);
	MediaBean getMediaBeanFromMedia(AbstractMedia abstractMedia);
	MovieBean getMovieBeanFromMovie(Movie movie);
	Movie getMovieFromMovieBean(MovieBean movieBean);
	MusicBean getMusicBeanFromMusic(Music music);
	Music getMusicFromMusicBean(MusicBean musicBean);
	VideoGameBean getVideoBeanFromVideo(VideoGame videoGame);
	VideoGame getVideoGameFromVideoGameBean(VideoGameBean videoGameBean);
	CustomerBean getCustomerBeanFromCustomer(Customer customer);
	Customer getCustomerFromCustomerBean(CustomerBean customerBean);
	AbstractMedia getMediaFromMediaBean(MediaBean mediaBean);
	
}
