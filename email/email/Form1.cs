using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace email
{
    public partial class Form1 : Form
    {
        ServiceReference1.emailinterfaceClient s = new ServiceReference1.emailinterfaceClient();


        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            string a = textBox1.Text;
            string payload = textBox2.Text;
            List<string> URL = new List<string>(a.Split(';'));
            System.String[] str = URL.ToArray();
            if (URL.Count > 0)
                for (int i = 0; i < URL.Count; i++)
                {
                    s.SendEmail(str, payload);

                }
            else {  MessageBox.Show("地址不能为空");
            }
           
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }
    }
}

