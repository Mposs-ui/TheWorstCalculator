package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ABadCalculator;;
/**
 * Servlet implementation class getCalculationServlet
 */
@WebServlet("/getCalculationServlet")
public class getCalculationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getCalculationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstUserNum = request.getParameter("firstUserNum");
		//The program requests the value from the secondUserNum parameter but there's no
		//parameter from the index.html page that has the secondUserNum
		
		String secondUserNum = request.getParameter("secondUserNum");
		ABadCalculator userCalculator = new
		ABadCalculator(Integer.parseInt(firstUserNum), Integer.parseInt(secondUserNum));
		request.setAttribute("userInput", userCalculator);
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
