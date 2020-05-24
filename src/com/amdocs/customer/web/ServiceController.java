package com.amdocs.customer.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.amdocs.customer.Business.ServiceBusiness;

@Controller
public class ServiceController {
    protected final Log logger = LogFactory.getLog(getClass());
    ServiceBusiness service = new ServiceBusiness();

    @RequestMapping(value="/services.htm")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        logger.info("Returning hello view");

        return new ModelAndView("views/service.jsp");
    }
	
}
