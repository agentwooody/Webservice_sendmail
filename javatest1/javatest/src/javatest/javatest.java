package javatest;

import javax.jws.WebService;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.commons.net.smtp.SMTPClient;
import org.apache.commons.net.smtp.SMTPReply;
import org.xbill.DNS.Lookup;
import org.xbill.DNS.Record;
import org.xbill.DNS.Type;

import java.util.List;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

@WebService(endpointInterface="javatest.emailinterface",serviceName="emailinterface")
public class javatest implements emailinterface
{
	 static MimeMessage message; 

    public javatest() {
		final String ALIDM_SMTP_HOST = "smtpdm.aliyun.com";
	    final String ALIDM_SMTP_PORT = "25";//��"80"
        // ���÷����ʼ��Ļ�������
        final Properties props = new Properties();
        // ��ʾSMTP�����ʼ�����Ҫ���������֤
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", ALIDM_SMTP_HOST);
        props.put("mail.smtp.port", ALIDM_SMTP_PORT);
        // ���ʹ��ssl����ȥ��ʹ��25�˿ڵ����ã�������������,
        // props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        // props.put("mail.smtp.socketFactory.port", "465");
        // props.put("mail.smtp.port", "465");
        // �����˵��˺ţ���д����̨���õķ��ŵ�ַ,����xxx@xxx.com
        props.put("mail.user", "agentwoody2@fredswanshiwu.xyz");
        // ����SMTP����ʱ��Ҫ�ṩ������(�ڿ���̨ѡ���ŵ�ַ��������)
        props.put("mail.password", "FREDfan123");
        // ������Ȩ��Ϣ�����ڽ���SMTP���������֤
        Authenticator authenticator = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                // �û���������
                String userName = props.getProperty("mail.user");
                String password = props.getProperty("mail.password");
                return new PasswordAuthentication(userName, password);
            }
        };
        // ʹ�û������Ժ���Ȩ��Ϣ�������ʼ��Ự
        Session mailSession = Session.getInstance(props, authenticator);
//        mailSession.setDebug(true);
        //UUID uuid = UUID.randomUUID();
        //final String messageIDValue = "<" + uuid.toString() + ">";
        // �����ʼ���Ϣ
        message = new MimeMessage(mailSession){
            //@Override
            //protected void updateMessageID() throws MessagingException {
                //�����Զ���Message-IDֵ
                //setHeader("Message-ID", messageIDValue);
            //}
        };
    };
        @Override
        public void SendEmail(List<String> url,String payload) {
        try {
        // ���÷������ʼ���ַ�����ơ���д����̨���õķ��ŵ�ַ,����xxx@xxx.com���������mail.user����һ�¡������û������Զ�����д��
        InternetAddress from = new InternetAddress("agentwoody2@fredswanshiwu.xyz", "���������ƣ��û��Զ�����д��");
        message.setFrom(from);
        //��ѡ�����û��ŵ�ַ
        Address[] a = new Address[1];
        a[0] = new InternetAddress("***");
        message.setReplyTo(a);
        // �����ռ����ʼ���ַ������yyy@yyy.com
        //InternetAddress to = new InternetAddress("1019264872@qq.com");
        //message.setRecipient(MimeMessage.RecipientType.TO, to);
        //���ͬʱ�������ˣ��Ž����������滻Ϊ���£���Ϊ��������ϵͳ��һЩ���ƣ�����ÿ��Ͷ�ݸ�һ���ˣ�ͬʱ�������Ƶ��������͵�������30�ˣ���
        InternetAddress[] adds = new InternetAddress[url.size()];
        for(int i=0;i<url.size();i++) 
        {
        adds[i] = new InternetAddress(url.get(i));
        }
        message.setRecipients(Message.RecipientType.TO, adds);
        // �����ʼ�����
        message.setSubject("�����ʼ�");
        // �����ʼ���������
        message.setContent("���Ե�HTML�ʼ�", "text/html;charset=UTF-8");
        // �����ʼ�
        Transport.send(message);
        }
        catch (MessagingException e) {
            String err = e.getMessage();
            // �����ﴦ��message���ݣ� ��ʽ�ǹ̶���
            System.out.println(err);
        } 
        catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    };
    @Override
    public boolean checkEmail(String email) {
        if (!email.matches("[\\w\\.\\-]+@([\\w\\-]+\\.)+[\\w\\-]+")) {
            return false;
        }
        String host = "";
        String hostName = email.split("@")[1];
        Record[] result = null;
        SMTPClient client = new SMTPClient();
        try {
            // ����MX��¼
            Lookup lookup = new Lookup(hostName, Type.MX);
            lookup.run();
            if (lookup.getResult() != Lookup.SUCCESSFUL) {
                return false;
            } else {
                result = lookup.getAnswers();
            }
            // ���ӵ����������
            for (int i = 0; i < result.length; i++) {
                host = result[i].getAdditionalName().toString();
                client.connect(host);
                if (!SMTPReply.isPositiveCompletion(client.getReplyCode())) {
                    client.disconnect();
                    continue;
                } else {
                    break;
                }
            }
            //����2���Լ���д���ٵģ���Ч������
            client.login("163.com");
            client.setSender("sxgkwei@163.com");
            client.addRecipient(email);
            if (250 == client.getReplyCode()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                client.disconnect();
            } catch (IOException e) {
            }
        }
        return false;
    }

}