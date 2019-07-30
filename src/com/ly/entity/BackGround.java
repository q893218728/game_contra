package com.ly.entity;

import com.ly.core.Drawable;
import com.ly.core.Moveable;
import com.ly.core.Spirte;
import com.ly.until.ImageMap;
import com.ly.until.ImageUtil;

import java.awt.*;

public class BackGround extends Spirte implements Drawable, Moveable {

    private Image img;

    public BackGround() {
        super();
        this.img = ImageMap.get("bg01");
    }



    @Override
    public void draw(Graphics g) {
        g.drawImage(img, getX(), getY(), img.getWidth(null), img.getHeight(null), null);
        move();
    }

    @Override
    public void move() {
       setX(getX()-5);
    }
}
