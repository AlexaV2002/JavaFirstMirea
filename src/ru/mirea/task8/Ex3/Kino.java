package ru.mirea.task8.Ex3;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Kino extends JFrame {
    protected static Image image;
    private static JFrame jFrame;
    private static String text;
    protected static ArrayList<Image> framlist = new ArrayList<>();

    Kino(){
        setLayout(new FlowLayout());
        setSize(1920,1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.drawImage(image,0,0, 960, 580, null);
    }


    public static void main(String[] args) {
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_00_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_01_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_02_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_03_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_04_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_05_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_06_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_07_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_08_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_09_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_10_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_11_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_12_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_13_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_14_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_15_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_16_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_17_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_18_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_19_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_20_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_21_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_22_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_23_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_24_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_25_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_26_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_27_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_28_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_29_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_30_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_31_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_32_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_33_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_34_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_35_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_36_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_37_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_38_delay-0.1s.gif").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/Ex3/anim/frame_39_delay-0.1s.gif").getImage());
        Kino animImg = new Kino();
        while (true) {
            for (int i = 0; i < 40; i++) {
                image = framlist.get(i);
                animImg.repaint();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
