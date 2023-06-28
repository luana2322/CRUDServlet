package controller;

import java.io.IOException;
import model.Student;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.StuDAO;

/**
 * Servlet implementation class add
 */
@WebServlet("/add")
public class add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public add() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String pass=request.getParameter("pass");
		String adress=request.getParameter("address");
		int age=Integer.parseInt(request.getParameter("age"));
		Student student=new Student(id, name, pass, adress, age);
		
		StuDAO stu=new StuDAO();
		if(stu.check(id)!=null) {
				request.setAttribute("error", id+" exited!!!");
			request.getRequestDispatcher("add.jsp").forward(request, response);
		}else {
			
			stu.insert(student);
		response.sendRedirect("list");
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
