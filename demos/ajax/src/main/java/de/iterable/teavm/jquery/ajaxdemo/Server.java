package de.iterable.teavm.jquery.ajaxdemo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/api")
public class Server extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("application/json");
		try {
			String a = req.getParameter("a");
			String b = req.getParameter("b");
			String c = req.getParameter("c");
			int result = Integer.parseInt(a) + Integer.parseInt(b) + Integer.parseInt(c);
			resp.getWriter().write("{\"result\":" + result + "}");
		} catch (Exception ex) {
			resp.sendError(400, ex.getMessage());
		}
	}
}
