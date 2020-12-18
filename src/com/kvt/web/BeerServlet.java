package com.kvt.web;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import webcontainer.HTTPServletRequest;
import webcontainer.HTTPServletResponse;
import webcontainer.HttpServlet;


public class BeerServlet extends HttpServlet {

  private static final String ENCODING = "utf-8";

  @Override
  public void doGet(HTTPServletRequest httpServletRequest,
      HTTPServletResponse httpServletResponse) {

    ByteArrayOutputStream bout = new ByteArrayOutputStream(8192);
    PrintWriter out;
    try {
      out = new PrintWriter(new OutputStreamWriter(bout, ENCODING));
      // out = httpServletResponse.getWriter();

      out.println("<html><head><style>body{background-color: #F8F4BD;}</style></head><body>"
          + "<h1 align=center>유진스의 선택은!!!!???<br></h1>");
      String result = httpServletRequest.getParameter("kind");

      out.println("<br><h3>맛도 좋고 몸에도 좋은 ~ <span style = 'color: red'>" + result
          + "</span></h3></body></html>");
      out.flush();

      httpServletResponse.setContentLength(bout.size());
      System.out.println(bout.size());

      httpServletResponse.showScreen(bout);


    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}

