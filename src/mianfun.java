import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class mianfun {
    public static void main(String[] args) {


        JFrame win=new JFrame("ti计算器");
        win.setSize(600,700);
        win.setLocation(300,200);

        ImageIcon i7=new ImageIcon("7.jpg");



        //输入文本框
        JPanel text=new JPanel();
        JTextField tex=new JTextField(50);
        text.add(tex);
        tex.setEditable(false);
        win.add(text,BorderLayout.NORTH);

        //按钮
        JPanel butt=new JPanel();
        butt.setLayout(new GridLayout(8,5,20,20));
        //DEC

        //win.setContentPane(butt);

        JButton DEC=new JButton("DEC");
        JButton HEX=new JButton("HEX");
        JButton OCT=new JButton("OCT");
        JButton OFF=new JButton("OFF");
        JButton ON_C=new JButton("ON/C");

        butt.add(DEC);
        butt.add(HEX);
        butt.add(OCT);
        butt.add(OFF);
        butt.add(ON_C);

        JButton STO=new JButton("STO");
        JButton RCL=new JButton("RCL");
        JButton SUM=new JButton("SUM");
        JButton ZUOKUOHAO=new JButton("(");
        JButton YOUKUOHAO=new JButton(")");

        butt.add(STO);
        butt.add(RCL);
        butt.add(SUM);
        butt.add(ZUOKUOHAO);
        butt.add(YOUKUOHAO);

        JButton SHF=new JButton("SHF");
        JButton d=new JButton("d");
        JButton E=new JButton("E");
        JButton F=new JButton("F");
        JButton K=new JButton("K");

        butt.add(d);
        butt.add(E);
        butt.add(F);
        butt.add(K);
        butt.add(SHF);



        JButton SC=new JButton("SC");
        JButton A=new JButton("A");
        JButton b=new JButton("b");
        JButton C=new JButton("C");
        JButton chu=new JButton("÷");

        butt.add(SC);
        butt.add(A);
        butt.add(b);
        butt.add(C);
        butt.add(chu);

        JButton OR=new JButton("OR");
        JButton SEVEN=new JButton("7");


        JButton EIGHT=new JButton("8");
        JButton NINE=new JButton("9");
        JButton CHEN=new JButton("×");

        butt.add(OR);
        butt.add(SEVEN);
        butt.add(EIGHT);
        butt.add(NINE);
        butt.add(CHEN);

        JButton AND=new JButton("AND");
        JButton FOUR=new JButton("4");
        JButton FIVE=new JButton("5");
        JButton SIX=new JButton("6");
        JButton JIAN=new JButton("-");

        butt.add(AND);
        butt.add(FOUR);
        butt.add(FIVE);
        butt.add(SIX);
        butt.add(JIAN);

        JButton XOR=new JButton("XOR");
        JButton ONE=new JButton("1");
        JButton TWO=new JButton("2");
        JButton THREE=new JButton("3");
        JButton JIA=new JButton("+");

        butt.add(XOR);
        butt.add(ONE);
        butt.add(TWO);
        butt.add(THREE);
        butt.add(JIA);

        JButton CE=new JButton("CE");
        JButton ZERO=new JButton("0");
        JButton POINT=new JButton(".");
        JButton JIACHU=new JButton("+/-");
        JButton EQU=new JButton("=");

        butt.add(CE);
        butt.add(ZERO);
        butt.add(POINT);
        butt.add(JIACHU);
        butt.add(EQU);


        //事件监听
        ActionListener listener=new ActionListener() {
            String BiaoDaShi="";
            String xianshi="";
            int tai=1;
            int lingpai=1;
            String bianliang="";
            int jinzhi=10;
            @Override
            public void actionPerformed(ActionEvent e) {

                String temp=e.getActionCommand();
                System.out.println(temp);

                if((tai==1)&&(temp=="ON/C"))
                {
                    tai=0;
                    tex.setText("0");


                }
                if((tai==0)&&(temp=="OFF"))
                {
                    tai=1;
                    tex.setText("");
                }


                //如果开机了
                if(tai==0)
                {
                    //八进
                    if(temp=="OCT")
                    {

                    }




                    //十进制
                    if(jinzhi==10)
                    {
                        if((temp!="=")&&(tai==0)&&(temp!="ON/C")&&temp!="OFF")
                        {
                            if(temp=="×")
                            {
                                BiaoDaShi+="*";
                                xianshi+="×";
                            }
                            else if(temp=="÷")
                            {
                                BiaoDaShi+="/";
                                xianshi+="÷";
                            }
                            else
                            {
                                bianliang+=temp;

                                BiaoDaShi+=temp;
                                xianshi+=temp;
                            }

                            tex.setText(xianshi);
                        }
                        else if((temp!="ON/C")&&temp!="OFF"){
                            System.out.println(BiaoDaShi);
                            BaseCount count1=new BaseCount(BiaoDaShi);
                            BiaoDaShi=""+count1.Count();
                            xianshi=""+count1.Count();
                            System.out.println(BiaoDaShi);
                            System.out.println(xianshi);
                            tex.setText(count1.Count());
                        }
                    }
                }













            }
        };

        win.add(butt);

        DEC.addActionListener(listener);
        HEX.addActionListener(listener);
        OCT.addActionListener(listener);
        OFF.addActionListener(listener);
        ON_C.addActionListener(listener);

        STO.addActionListener(listener);
        RCL.addActionListener(listener);
        SUM.addActionListener(listener);
        ZUOKUOHAO.addActionListener(listener);
        YOUKUOHAO.addActionListener(listener);

        SHF.addActionListener(listener);
        d.addActionListener(listener);
        E.addActionListener(listener);
        F.addActionListener(listener);
        K.addActionListener(listener);

        SC.addActionListener(listener);
        A.addActionListener(listener);
        b.addActionListener(listener);
        C.addActionListener(listener);
        chu.addActionListener(listener);

        OR.addActionListener(listener);
        SEVEN.addActionListener(listener);
        EIGHT.addActionListener(listener);
        NINE.addActionListener(listener);
        CHEN.addActionListener(listener);

        AND.addActionListener(listener);
        FOUR.addActionListener(listener);
        FIVE.addActionListener(listener);
        SIX.addActionListener(listener);
        JIAN.addActionListener(listener);

        XOR.addActionListener(listener);
        ONE.addActionListener(listener);
        TWO.addActionListener(listener);
        THREE.addActionListener(listener);
        JIA.addActionListener(listener);

        CE.addActionListener(listener);
        ZERO.addActionListener(listener);
        POINT.addActionListener(listener);
        JIACHU.addActionListener(listener);
        EQU.addActionListener(listener);








        //win.pack();



        win.addWindowListener(new WindowAdapter() {

            @Override
            public void windowOpened(WindowEvent e) {
                super.windowOpened(e);
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            @Override
            public void windowActivated(WindowEvent e) {
                super.windowActivated(e);
            }
        });
        win.setVisible(true);
    }
}
