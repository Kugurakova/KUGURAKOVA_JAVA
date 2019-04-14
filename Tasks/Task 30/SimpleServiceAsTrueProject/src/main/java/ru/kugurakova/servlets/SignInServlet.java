package ru.kugurakova.servlets;

import lombok.SneakyThrows;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.kugurakova.forms.AuthUserForm;
import ru.kugurakova.services.UsersService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

@WebServlet("/signIn")
public class SignInServlet extends HttpServlet {

    private UsersService usersService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        ApplicationContext context = (ApplicationContext) config.getServletContext().getAttribute("springContext");
        usersService = context.getBean(UsersService.class);
    }

    @Override
    @SneakyThrows
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        PrintWriter writer = response.getWriter();
        writer.print("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "\t<title>SignIn</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div>\n" +
                "\t<form method='post'>\n" +
                "\t\t<input type=\"text\" name=\"login\" placeholder=\"Login\">\n" +
                "\t\t<br>\n" +
                "\t\t<input type=\"password\" name=\"password\" placeholder=\"Password\">\n" +
                "\t\t<br>\n" +
                "\t\t<input type=\"submit\" value=\"SignIn\">\n" +
                "\t</form>\n" +
                "</div>\n" +
                "</body>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AuthUserForm form = AuthUserForm.builder()
                .login(request.getParameter("login"))
                .password(request.getParameter("password"))
                .build();

        Optional<String> cookieValue = usersService.signInAndCreateCookieValue(form);
        if (cookieValue.isPresent()) {
            Cookie cookie = new Cookie("CLIENT_ID", cookieValue.get());
            cookie.setMaxAge(60 * 60 * 24 * 365);
            response.addCookie(cookie);
            response.sendRedirect("/users");
        } else {
            response.sendRedirect("/signIn");
        }
    }
}