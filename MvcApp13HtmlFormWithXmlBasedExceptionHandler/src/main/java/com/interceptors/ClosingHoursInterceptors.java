package com.interceptors;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ClosingHoursInterceptors  extends HandlerInterceptorAdapter {


    String END_TIME="11:40:00";
    String START_TIME="13:30:00";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        LocalDateTime localdatetime=LocalDateTime.now();
        if(localdatetime.toLocalTime().compareTo(LocalTime.parse(END_TIME))>0 && localdatetime.toLocalTime().compareTo(LocalTime.parse(START_TIME))<0){

            response.getWriter().write("website is closed between 11.40 pm to 00.30 am");
            return  false;
        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        System.out.println("post handle called :"+request.getRequestURI());

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

        System.out.println("after completion called:"+request.getRequestURL());
    }
}
