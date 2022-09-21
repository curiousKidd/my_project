package my.project.demo.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/servlet")
public class DemoServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");

        PrintWriter w = response.getWriter();
        w.write("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<ul>\n" +
                "<li>\n" + "SERVLET TEST" + "</li>\n" +
                "<li>\n" + "소속학과 : 응용소프트웨어학과" + "</li>\n" +
                "<li>\n" + "학번 : 202046088" + "</li>\n" +
                "<li>\n" + "이름 : 남건우" + "</li>\n" +
                "<li>\n" + "학년 : 3학년" + "</li>\n" +
                "<li>\n" + "집위치 : 인천광역시" + "</li>\n" +
                "<li>\n" + "직장위치 : 서울특별시" + "</li>\n" +
                "<li>\n" + "회사명 : 회사 재직중" + "</li>\n" +
                "<li>\n" + "담당업무 : 메인사이트 관리" + "</li>\n" +
                "<li>\n" + "수강동기 : 기초지식 채우기" + "</li>\n" +
                "</ul>\n" +
                "</body>\n" +
                "</html>\n");

    }

}
