package com.kptsang.LambdaImage;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;


public class main{
//    String imagePath = "C:\\Users\\kapot\\Downloads";
//    BufferedImage myPicture = ImageIO.read(new File(imagePath));
//
//    JLabel picLabel1 = new JLabel(new ImageIcon(myPicture));
//    JPanel jPanel = new JPanel();
//    jPanel.add(picLabel1);
//
//    JFrame f =new JFrame();
//    f.setSize(new Dimension(myPicture.getWidth(), myPicture.getHeight()));
//    f.add(jPanel);
//    f.setVisible(true);

    public static void main(String[] args) throws Exception {
        try {
            String fileName = "image_test.jpeg";
            String website1 = "https://assets.gamepur.com/wp-content/uploads/2021/09/20121858/giancarlo-esposito-455x300.jpg";
            String website2 = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cc/Tom_Kenny_FSC_2015.jpg/220px-Tom_Kenny_FSC_2015.jpg";
            String website3 = "https://upload.wikimedia.org/wikipedia/commons/8/82/Francisco_de_Goya%2C_Saturno_devorando_a_su_hijo_%281819-1823%29.jpg";


            URL url = new URL(website3);
            InputStream inputStream = url.openStream();
            OutputStream outputStream = new FileOutputStream(fileName);
            byte[]buffer = new byte[2048];

            int length = 0;
            while ((length = inputStream.read(buffer))!= -1){
                System.out.println("Buffer Read of length: "+length);
                outputStream.write(buffer, 0 , length);
            }
            inputStream.close();
            outputStream.close();

        } catch(Exception e){
            System.out.println("Exception");
        }
    }

}
