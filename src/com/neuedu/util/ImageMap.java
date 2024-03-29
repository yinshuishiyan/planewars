package com.neuedu.util;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.awt.Image;

public class ImageMap {
    //HashMap精确查找，不排序
    private static final Map<String,Image> map = new HashMap<>();

    static {
        map.put("bg01",ImageUtil.getImage("com\\neuedu\\imgs\\bg\\bg1.png"));

        map.put("my01",ImageUtil.getImage("com\\neuedu\\imgs\\plane\\my_1.png"));

        map.put("myb_1",ImageUtil.getImage("com\\neuedu\\imgs\\bullet\\myb_1.png"));


    }

    public static Image get(String key){
        return  map.get(key);
    }

}
