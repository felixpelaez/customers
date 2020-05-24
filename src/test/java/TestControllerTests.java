package test.java;

import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;
import com.amdocs.customer.web.ServiceController;

public class TestControllerTests {
	
    @Test
    public void testHandleRequestView() throws Exception{		
        ServiceController controller = new ServiceController();
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        assertEquals("service.jsp", modelAndView.getViewName());
    }

}
