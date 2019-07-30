package com.neuedu.runtime;

import com.neuedu.base.BaseSprite;
import com.neuedu.base.Drawable;
import com.neuedu.base.Moveable;
import com.neuedu.constant.FrameConstant;
import com.neuedu.util.ImageMap;

import java.awt.*;

public class Background extends BaseSprite implements Moveable, Drawable {

    private Image image;

    public Background() {
        this(0, FrameConstant.FRAME_HEIGHT - ImageMap.get("bg01").getHeight(null), ImageMap.get("bg01"));
    }

    public Background(int x, int y, Image bgImage) {
        super(x, y);
        this.image = bgImage;
    }

    @Override
    public void move() {
        setY(getY()+ FrameConstant.GAME_SPEED);
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(image,getX(),getY(),image.getWidth(null),image.getHeight(null),null);
        move();
    }
}
