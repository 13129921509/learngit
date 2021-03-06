package com.school.bookshop.test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletInputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;

import sun.util.logging.resources.logging;

import com.school.bookshop.model.Book;
import com.school.bookshop.service.BookService;
import com.school.bookshop.util.HttpUtil;

public class BookServiceTest extends BaseSpringTest4{
	@Autowired
	private BookService bookService;
	Logger logging = Logger.getLogger(BookServiceTest.class);
	
	@Test
	public void Test_01(){
		Map<String, Object>map = new HashMap<String, Object>();
		map.put("bookCateGoryId", "1");
		System.out.println(bookService.getBookofCategory(map).size());
	}
	
	@Test
	public void Test_02(){
		Map<String, Object>map = new HashMap<String, Object>();
		map.put("bookCateGoryId", "1");
		System.out.println(bookService.getBoosCategory_next(map,0).get(0).getBookId());
	}
	
	@Test
	public void Tets_03(){
		Map<String, Object>map = new HashMap<String, Object>();
		map.put("bookCateGoryId", "7");
		System.out.println(bookService.getBookCategoryCount(map));
	}
	
	@Test public void Test_04(){
		Map<String,Object> map = HttpUtil.getQueryMap2(new HttpServletRequest() {
			
			public void setCharacterEncoding(String arg0)
					throws UnsupportedEncodingException {
				// TODO Auto-generated method stub
				
			}
			
			public void setAttribute(String arg0, Object arg1) {
				// TODO Auto-generated method stub
				
			}
			
			public void removeAttribute(String arg0) {
				// TODO Auto-generated method stub
				
			}
			
			public boolean isSecure() {
				// TODO Auto-generated method stub
				return false;
			}
			
			public int getServerPort() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			public String getServerName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String getScheme() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public RequestDispatcher getRequestDispatcher(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String getRemoteHost() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String getRemoteAddr() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String getRealPath(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public BufferedReader getReader() throws IOException {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String getProtocol() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String[] getParameterValues(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Enumeration getParameterNames() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Map getParameterMap() {
				// TODO Auto-generated method stub
				Map<String,Object> map = new HashMap<String, Object>();
				map.put("sell_min", "0");
				map.put("sell_max", "5");
				map.put("bookCateGoryId", "1");
				return map;
			}
			
			public String getParameter(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Enumeration getLocales() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Locale getLocale() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public ServletInputStream getInputStream() throws IOException {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String getContentType() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public int getContentLength() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			public String getCharacterEncoding() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Enumeration getAttributeNames() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Object getAttribute(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public boolean isUserInRole(String arg0) {
				// TODO Auto-generated method stub
				return false;
			}
			
			public boolean isRequestedSessionIdValid() {
				// TODO Auto-generated method stub
				return false;
			}
			
			public boolean isRequestedSessionIdFromUrl() {
				// TODO Auto-generated method stub
				return false;
			}
			
			public boolean isRequestedSessionIdFromURL() {
				// TODO Auto-generated method stub
				return false;
			}
			
			public boolean isRequestedSessionIdFromCookie() {
				// TODO Auto-generated method stub
				return false;
			}
			
			public Principal getUserPrincipal() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public HttpSession getSession(boolean arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public HttpSession getSession() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String getServletPath() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String getRequestedSessionId() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public StringBuffer getRequestURL() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String getRequestURI() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String getRemoteUser() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String getQueryString() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String getPathTranslated() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String getPathInfo() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String getMethod() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public int getIntHeader(String arg0) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			public Enumeration getHeaders(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Enumeration getHeaderNames() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String getHeader(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public long getDateHeader(String arg0) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			public Cookie[] getCookies() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String getContextPath() {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String getAuthType() {
				// TODO Auto-generated method stub
				return null;
			}
		});
		System.out.println(bookService.getBoosCategory_next(map, 0).size());
	}
	
	@Test
	public void Test_05(){
		Map<String,Object> map = HttpUtil.getQueryMap2(new HttpServletRequest(){

			public Object getAttribute(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			public Enumeration getAttributeNames() {
				// TODO Auto-generated method stub
				return null;
			}

			public String getCharacterEncoding() {
				// TODO Auto-generated method stub
				return null;
			}

			public int getContentLength() {
				// TODO Auto-generated method stub
				return 0;
			}

			public String getContentType() {
				// TODO Auto-generated method stub
				return null;
			}

			public ServletInputStream getInputStream() throws IOException {
				// TODO Auto-generated method stub
				return null;
			}

			public Locale getLocale() {
				// TODO Auto-generated method stub
				return null;
			}

			public Enumeration getLocales() {
				// TODO Auto-generated method stub
				return null;
			}

			public String getParameter(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			public Map getParameterMap() {
				// TODO Auto-generated method stub
				Map<String,Object> map = new HashMap<String, Object>();
				//{min=5, bookCateGoryId=2, max=10, page=1}
				map.put("sell_min", 5);
				map.put("bookCateGoryId", 2);
				map.put("sell_max", 10);
				map.put("min_discount", 2);
				map.put("max_discount", 5);
				return map;
			}

			public Enumeration getParameterNames() {
				// TODO Auto-generated method stub
				return null;
			}

			public String[] getParameterValues(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			public String getProtocol() {
				// TODO Auto-generated method stub
				return null;
			}

			public BufferedReader getReader() throws IOException {
				// TODO Auto-generated method stub
				return null;
			}

			public String getRealPath(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			public String getRemoteAddr() {
				// TODO Auto-generated method stub
				return null;
			}

			public String getRemoteHost() {
				// TODO Auto-generated method stub
				return null;
			}

			public RequestDispatcher getRequestDispatcher(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			public String getScheme() {
				// TODO Auto-generated method stub
				return null;
			}

			public String getServerName() {
				// TODO Auto-generated method stub
				return null;
			}

			public int getServerPort() {
				// TODO Auto-generated method stub
				return 0;
			}

			public boolean isSecure() {
				// TODO Auto-generated method stub
				return false;
			}

			public void removeAttribute(String arg0) {
				// TODO Auto-generated method stub
				
			}

			public void setAttribute(String arg0, Object arg1) {
				// TODO Auto-generated method stub
				
			}

			public void setCharacterEncoding(String arg0)
					throws UnsupportedEncodingException {
				// TODO Auto-generated method stub
				
			}

			public String getAuthType() {
				// TODO Auto-generated method stub
				return null;
			}

			public String getContextPath() {
				// TODO Auto-generated method stub
				return null;
			}

			public Cookie[] getCookies() {
				// TODO Auto-generated method stub
				return null;
			}

			public long getDateHeader(String arg0) {
				// TODO Auto-generated method stub
				return 0;
			}

			public String getHeader(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			public Enumeration getHeaderNames() {
				// TODO Auto-generated method stub
				return null;
			}

			public Enumeration getHeaders(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			public int getIntHeader(String arg0) {
				// TODO Auto-generated method stub
				return 0;
			}

			public String getMethod() {
				// TODO Auto-generated method stub
				return null;
			}

			public String getPathInfo() {
				// TODO Auto-generated method stub
				return null;
			}

			public String getPathTranslated() {
				// TODO Auto-generated method stub
				return null;
			}

			public String getQueryString() {
				// TODO Auto-generated method stub
				return null;
			}

			public String getRemoteUser() {
				// TODO Auto-generated method stub
				return null;
			}

			public String getRequestURI() {
				// TODO Auto-generated method stub
				return null;
			}

			public StringBuffer getRequestURL() {
				// TODO Auto-generated method stub
				return null;
			}

			public String getRequestedSessionId() {
				// TODO Auto-generated method stub
				return null;
			}

			public String getServletPath() {
				// TODO Auto-generated method stub
				return null;
			}

			public HttpSession getSession() {
				// TODO Auto-generated method stub
				return null;
			}

			public HttpSession getSession(boolean arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			public Principal getUserPrincipal() {
				// TODO Auto-generated method stub
				return null;
			}

			public boolean isRequestedSessionIdFromCookie() {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean isRequestedSessionIdFromURL() {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean isRequestedSessionIdFromUrl() {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean isRequestedSessionIdValid() {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean isUserInRole(String arg0) {
				// TODO Auto-generated method stub
				return false;
			}
			
		});
		System.out.println(bookService.getBoosCategory_next(map, 0).get(0).getBookTitle());
	
	}
}
