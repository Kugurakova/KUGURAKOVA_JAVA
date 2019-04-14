package ru.kugurakova.servlets;

import org.springframework.context.ApplicationContext;
import ru.kugurakova.repositories.jdbc.models.User;
import ru.kugurakova.services.UsersService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/users")
public class UsersServlet extends HttpServlet {

    private UsersService usersService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        ApplicationContext context = (ApplicationContext) config.getServletContext().getAttribute("springContext");
        usersService = context.getBean(UsersService.class);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> users = usersService.getAllUsers();
        req.setAttribute("users", users);
        req.getRequestDispatcher("WEB-INF/jsp/users.jsp").forward(req,resp);
    }


}