import java.awt.*;
import java.awt.event.*;
public class Main {
    public static void main(String[] args) {

        BaseCount count1=new BaseCount("0");
        Frame win=new Frame("ti计算器");
        win.setSize(600,700);
        win.setLocation(300,200);

        //输入文本框
        Panel text=new Panel();
        text.add(new TextField(80));
        win.add(text,BorderLayout.NORTH);

        //按钮
        Panel butt=new Panel();
        butt.setLayout(new GridLayout(8,5,20,20));
        //DEC

        Button DEC=new Button("DEC");
        Button HEX=new Button("HEX");
        Button OCT=new Button("OCT");
        Button OFF=new Button("OFF");
        Button ON_C=new Button("ON/C");

        butt.add(DEC);
        butt.add(HEX);
        butt.add(OCT);
        butt.add(OFF);
        butt.add(ON_C);

        Button STO=new Button("STO");
        Button RCL=new Button("RCL");
        Button SUM=new Button("SUM");
        Button ZUOKUOHAO=new Button("(");
        Button YOUKUOHAO=new Button(")");

        butt.add(STO);
        butt.add(RCL);
        butt.add(SUM);
        butt.add(ZUOKUOHAO);
        butt.add(YOUKUOHAO);

        Button SHF=new Button("SHF");
        Button d=new Button("d");
        Button E=new Button("E");
        Button F=new Button("F");
        Button K=new Button("K");

        butt.add(d);
        butt.add(E);
        butt.add(F);
        butt.add(K);
        butt.add(SHF);



        Button SC=new Button("SC");
        Button A=new Button("A");
        Button b=new Button("b");
        Button C=new Button("C");
        Button chu=new Button("÷");

        butt.add(SC);
        butt.add(A);
        butt.add(b);
        butt.add(C);
        butt.add(chu);

        Button OR=new Button("OR");
        Button SEVEN=new Button("7");
        Button EIGHT=new Button("8");
        Button NINE=new Button("9");
        Button CHEN=new Button("×");

        butt.add(OR);
        butt.add(SEVEN);
        butt.add(EIGHT);
        butt.add(NINE);
        butt.add(CHEN);

        Button AND=new Button("AND");
        Button FOUR=new Button("4");
        Button FIVE=new Button("5");
        Button SIX=new Button("6");
        Button JIAN=new Button("-");

        butt.add(AND);
        butt.add(FOUR);
        butt.add(FIVE);
        butt.add(SIX);
        butt.add(JIAN);

        Button XOR=new Button("XOR");
        Button ONE=new Button("1");
        Button TWO=new Button("2");
        Button THREE=new Button("3");
        Button JIA=new Button("+");

        butt.add(XOR);
        butt.add(ONE);
        butt.add(TWO);
        butt.add(THREE);
        butt.add(JIA);

        Button CE=new Button("CE");
        Button ZERO=new Button("0");
        Button POINT=new Button(".");
        Button JIACHU=new Button("+/-");
        Button EQU=new Button("=");

        butt.add(CE);
        butt.add(ZERO);
        butt.add(POINT);
        butt.add(JIACHU);
        butt.add(EQU);


        //事件监听
        ActionListener listener=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BiaoDaShi=e.getActionCommand();
                System.out.println(BiaoDaShi);
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
