package com.ly.entity;

import com.ly.core.Drawable;
import com.ly.core.Moveable;
import com.ly.core.Spirte;
import com.ly.until.ImageMap;

import java.awt.*;

public class BackGround extends Spirte implements Drawable, Moveable {

    private Image img = ImageMap.get("bg1");

    @Override
    public void draw(Graphics g) {

    }

    @Override
    public void move() {

    }
}
