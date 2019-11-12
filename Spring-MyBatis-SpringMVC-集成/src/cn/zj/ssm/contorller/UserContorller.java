package cn.zj.ssm.contorller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import cn.zj.ssm.pojo.User;
import cn.zj.ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserContorller {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/list")
	public String getuser(Model model) {
		List<User> getlist = userService.getlist();
		model.addAttribute("list", getlist);
		return "index";
	}
	
	@RequestMapping("/delete")
	public String delete(Integer id) {
		int delete = userService.delete(id);
		System.err.println("影响数据【"+delete+"】");		
		return "redirect:/user/list.do";
	}
	
	@RequestMapping("/login")
	public String login(String username,String password,Model model,HttpServletRequest request) throws UnsupportedEncodingException {
		System.err.println(username);
		System.err.println(password);
		User user = userService.login(username, password);
	        
		if (user!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("username",user.getUsername());
			return "redirect:/user/list.do";
		}
		
		request.setCharacterEncoding("UTF-8");
		
		model.addAttribute("login", "亲，户名或者密码错误");
		
		return "forward:/login.jsp";	
		
	}
}
