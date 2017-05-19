package br.com.goldcalled.GoldCalled;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AutorizadorInterceptor extends HandlerInterceptorAdapter {


    public boolean preHandler(HttpServletRequest httpServletRequest, HttpServletResponse  httpServletResponse) throws Exception{

        String uri = httpServletRequest.getRequestURI();
        if (uri.endsWith("loginForm") || uri.endsWith("logar")||uri.endsWith("resources"))
            return true;
        if (httpServletRequest.getSession().getAttribute("usuarioLogado") != null){
            return true;
        }
        httpServletResponse.sendRedirect("loginForm");
        return false;
    }

}
