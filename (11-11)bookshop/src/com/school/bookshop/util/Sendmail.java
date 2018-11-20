package com.school.bookshop.util;


import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import sun.tools.tree.ThisExpression;


public class Sendmail {

    /**
     * @param args
     * @throws Exception 
     */
	private String toer;
	private String message2;
	public Sendmail(String toer,String message){
		this.toer = toer;
		this.message2 = message;
	}
	
	
	public void setConfig(){
        Properties prop = new Properties();
        prop.setProperty("mail.host", "smtp.qq.com");
        prop.setProperty("mail.transport.protocol", "smtp");
        prop.setProperty("mail.smtp.auth", "true");
        //使用JavaMail发送邮件的5个步骤
        //1、创建session
        Session session = Session.getInstance(prop);
        //开启Session的debug模式，这样就可以查看到程序发送Email的运行状态
        session.setDebug(true);
        //2、通过session得到transport对象
        Transport ts;
		try {
			ts = session.getTransport();
			//3、使用邮箱的用户名和密码连上邮件服务器，发送邮件时，发件人需要提交邮箱的用户名和密码给smtp服务器，用户名和密码都通过验证之后才能够正常发送邮件给收件人。
	        ts.connect("smtp.qq.com", "942445346@qq.com", "ctixydsvapdwbajf");
	        //4、创建邮件
	        Message message = createSimpleMail(session);
	        //5、发送邮件
	        ts.sendMessage(message, message.getAllRecipients());
	        ts.close();
		} catch (NoSuchProviderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
	
    public MimeMessage createSimpleMail(Session session)
            throws Exception {
        //创建邮件对象
        MimeMessage message = new MimeMessage(session);
        //指明邮件的发件人
        message.setFrom(new InternetAddress("942445346@qq.com"));
        //指明邮件的收件人，现在发件人和收件人是一样的，那就是自己给自己发
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(toer));
        //邮件的标题
        message.setSubject("验证码");
        //邮件的文本内容
        message.setContent(message2, "text/html;charset=UTF-8");//"text/html;charset=UTF-8""text/plain;charset=utf-8"
        //返回创建好的邮件对象
        return message;
    }
    
    public static void main(String[] args) {
    	Sendmail sendmail = new Sendmail("1833634260@qq.com","cj，真蠢");
    	sendmail.setConfig();
	}
}