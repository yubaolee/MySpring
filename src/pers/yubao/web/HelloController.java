package pers.yubao.web;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2016-11-16.
 */
public class HelloController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String hello = request.getParameter("hello");

        System.out.println("HelloController: " + hello);
        ModelAndView mav = new ModelAndView("hello");
        mav.addObject("hello", hello);

        return mav;
    }
}
