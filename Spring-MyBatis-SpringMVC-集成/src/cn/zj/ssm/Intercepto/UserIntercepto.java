package cn.zj.ssm.Intercepto;

import static org.hamcrest.CoreMatchers.nullValue;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


public class UserIntercepto implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		//��ͼ���֮��ִ�е�
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
         //�ٿ�����ִ��֮��ִ�е�
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
		  HttpSession session = request.getSession();
		  
		  String username =(String)session.getAttribute("username");
		  
		  if (username!=null) {
			 System.out.println(username);
			  return true;
		}
		  request.setAttribute("loginNO", "��δ��½�������½");
		  request.getRequestDispatcher("/login.jsp").forward(request,response);
		  return false;
	}

}
