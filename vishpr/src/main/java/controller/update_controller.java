package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import dto.Dto;
@WebServlet("/update")
public class update_controller  extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		String s1=req.getParameter("name");
		String s2=req.getParameter("number");
		
		Dao d= new Dao();
		{
			d.setName(s1);
			d.setNumber(s2);	
		}
		Dto d1= new Dto();
		{
			d1.update(d);
				}
	}

}
