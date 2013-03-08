package com.chal.demo.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * @author Zo Randrianarivo
 *
 */
@Controller
public class HomeController {


	private Logger log = LoggerFactory.getLogger(HomeController.class);

	
	/**
	 * Custom handler for displaying a trader
	 * 
	 * @param traderId
	 *            id of the trader to display
	 * @return a ModelMap with the model attributes for the view
	 */
	@RequestMapping("/home.html")
	public ModelAndView showHomePage() {

		log.debug("Home page");

		ModelAndView mav = new ModelAndView("homePage");

		return mav;
	}

}
