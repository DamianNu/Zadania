package frame;

import javax.swing.*;
import java.awt.EventQueue;

//public class Test {
//    public static void main(String[] args) {
//        EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new MyFrame2();
//            }
//        });
//
//    }
//}

import java.awt.EventQueue;

public class Test {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new MyFrame2();
            }
        });
    }
}