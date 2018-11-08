package client;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javatest.Emailinterface;
import javatest.Emailinterface_Service;

public class client extends JFrame implements ActionListener
{
    private static Emailinterface sendMail;
    public static void main(String[] args)
    {
    	Emailinterface_Service sendMailInterface_Service=new Emailinterface_Service();
        sendMail=sendMailInterface_Service.getJavatestPort();
        mail_frame();
    }
    private static JFrame frame = new JFrame("�����ʼ�");
    private static Container c = frame.getContentPane();
    private static JTextField input1 = new JTextField();
    static JLabel a1 = new JLabel("���͵�����:");
    static JLabel a3 = new JLabel("�ж����ַʱ��ʹ���á�;������):");
    private static JTextField input2 = new JTextField();
    static JLabel a2 = new JLabel("�ʼ�����:");
    private static JButton send = new JButton("����");


    static void mail_frame()
    {


        frame.setSize(500,500);

        c.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        JPanel fieldPanel = new JPanel();
        fieldPanel.setLayout(null);

        a1.setBounds(10,20,450,20);
        fieldPanel.add(a1);
        a3.setBounds(10,40,450,20);
        fieldPanel.add(a3);
        input1.setBounds(10,60,450,20);
        fieldPanel.add(input1);

        a2.setBounds(10,100,80,20);;
        fieldPanel.add(a2);
        input2.setBounds(10,120,450,300);
        fieldPanel.add(input2);
        c.add(fieldPanel,"Center");

        client client=new client();
        send.addActionListener(client);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(send);
        c.add(buttonPanel,"South");

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO �Զ����ɵķ������
        if(e.getActionCommand()=="����")
        {
            String url=input1.getText();
            Vector<String> URL=new Vector<String>();
            StringTokenizer st = new StringTokenizer(url,";");
            int i=0;
            while(st.hasMoreTokens() )
            {
                URL.addElement(st.nextToken());
                System.out.println(URL.get(i));
                i++;
            }
            String payload=input2.getText();
            if(URL.size()>=1)
            {
                sendMail.sendEmail(URL, payload);
                System.out.println("���ͳɹ�");
            }
            else {
                System.out.println("���ŵ�ַ����Ϊ��");
            }
        }
    }
}
