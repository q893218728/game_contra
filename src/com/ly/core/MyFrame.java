package com.ly.core;

import com.ly.constant.Constant;
import com.sun.deploy.util.UpdateCheck;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
    /**
     * 加载窗口的方法
     */

    public void launchFrame(){
        this.setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);//设置窗口大小
        this.setLocationRelativeTo(null);//设置窗口居中
        this.setTitle(Constant.GAME_TITLE);//设置窗口标题
        this.setResizable(false);//不允许更改窗口大小
        //可以关闭窗口
        this.setVisible(true);//设置窗口显示,一定放在最后。
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                 System.exit(0);
            }
        });
       //enableInput 禁止输入法
    }

    /**
     * 线程类(内部类)，启动画东西的线程
     */
    class MyThread extends Thread{
        @Override
        public void run() {
            while (true){
                repaint();//无限调用paint方法
                try{
                    Thread.sleep(40);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    Image backImg = null;

    /**
     * 重写update方法，在底层添加一层白色的虚拟图片，用来避免图片闪烁
     * @param g
     */
    @Override
    public void update(Graphics g) {
        if(backImg == null){
            //虚拟图片不存在创建一个和窗口一样大的图片
            backImg = createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
        }

        Graphics backg = backImg.getGraphics();
        Color c = backg.getColor();
        backg.setColor(Color.white);
        backg.fillRect(0,0,Constant.GAME_WIDTH,Constant.GAME_HEIGHT);//矩形填充
        backg.setColor(c);
        paint(backg);
        g.drawImage(backImg,0,0,null);
    }
}
