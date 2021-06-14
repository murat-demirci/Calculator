import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jframe {
    public static void main(String[] args) {
        String[] isaret={"7","8","9","/",
                "4","5","6","*",
                "1","2","3","-","0","C","=","+"};
        int sayac=0;
        JFrame frame = new JFrame("Hesap Makinesi");
        frame.setBounds(500,500,320,320);
        Image im= Toolkit.getDefaultToolkit().getImage("C:\\Users\\demur\\Desktop\\images.png");
        frame.setIconImage(im);
        JPanel panel=new JPanel();
        panel.setBorder(new EmptyBorder(5,5,5,5));
        panel.setLayout(null);
        TextField sonuc;
        sonuc=new TextField();
        sonuc.setBounds(50,13,215,25);
        sonuc.setFont(new Font("Cambria",Font.ITALIC+Font.BOLD,16));
        JButton[] b=new JButton[16];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                b[sayac]=new JButton();
                b[sayac].setText(isaret[sayac]);
                b[sayac].setBounds(50+j*55,50+i*55,50,50);
                frame.add(b[sayac]);
                sayac++;
            }
        }
        ActionListener a1=new ActionListener() {
            int islem,s1,s2,cal; double cal2;
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b[0]) {
                    sonuc.setText(sonuc.getText() + 7);
                } else if (e.getSource() == b[1]) {
                    sonuc.setText(sonuc.getText() + 8);
                } else if (e.getSource() == b[2]) {
                    sonuc.setText(sonuc.getText() + 9);
                } else if (e.getSource() == b[3]) {//bolme
                    s1 = Integer.parseInt(sonuc.getText());
                    islem = 1;
                    sonuc.setText("");
                } else if (e.getSource() == b[4]) {
                    sonuc.setText(sonuc.getText() + 4);
                } else if (e.getSource() == b[5]) {
                    sonuc.setText(sonuc.getText() + 5);
                } else if (e.getSource() == b[6]) {
                    sonuc.setText(sonuc.getText() + 6);
                } else if (e.getSource() == b[7]) {//*
                    s1 = Integer.parseInt(sonuc.getText());
                    islem = 2;
                    sonuc.setText("");
                } else if (e.getSource() == b[8]) {
                    sonuc.setText(sonuc.getText() + 1);
                } else if (e.getSource() == b[9]) {
                    sonuc.setText(sonuc.getText() + 2);
                } else if (e.getSource() == b[10]) {
                    sonuc.setText(sonuc.getText() + 3);
                } else if (e.getSource() == b[11]) {//-
                    s1 = Integer.parseInt(sonuc.getText());
                    islem = 3;
                    sonuc.setText("");
                } else if (e.getSource() == b[12]) {
                    sonuc.setText(sonuc.getText() + 0);
                } else if (e.getSource() == b[13]) {//C
                    sonuc.setText("");
                } else if (e.getSource() == b[14]) {//=
                    s2 = Integer.parseInt(sonuc.getText());
                    if (islem == 1) {
                        cal2= (double)s1 / s2;
                        sonuc.setText(Double.toString(cal2));

                    } else if (islem == 2) {
                        cal = s1 * s2;
                        sonuc.setText(Integer.toString(cal));

                    } else if (islem == 3) {
                        cal = s1 - s2;
                        sonuc.setText(Integer.toString(cal));

                    } else if (islem == 4) {
                        cal = s1 + s2;
                        sonuc.setText(Integer.toString(cal));

                    }
                } else if (e.getSource() == b[15]) {//+
                    s1 = Integer.parseInt(sonuc.getText());
                    islem = 4;
                    sonuc.setText("");
                }
            }
        };
        b[0].addActionListener(a1);
        b[1].addActionListener(a1);
        b[2].addActionListener(a1);
        b[3].addActionListener(a1);
        b[4].addActionListener(a1);
        b[5].addActionListener(a1);
        b[6].addActionListener(a1);
        b[7].addActionListener(a1);
        b[8].addActionListener(a1);
        b[9].addActionListener(a1);
        b[10].addActionListener(a1);
        b[11].addActionListener(a1);
        b[12].addActionListener(a1);
        b[13].addActionListener(a1);
        b[14].addActionListener(a1);
        b[15].addActionListener(a1);

        frame.add(panel);
        frame.add(sonuc);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

    }

}
