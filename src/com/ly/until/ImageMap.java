package com.ly.until;

import com.ly.constant.Constant;

import java.awt.Image;
import java.util.HashMap;
import java.util.Map;

public class ImageMap {
    private static final Map<String, Image> map = new HashMap<>();

    static {
        map.put("bg01",ImageUtil.getImage(Constant.IMG_PRE + "bg01" + Constant.IMG_AFTER));
    }


    public static Image get(String key){
        return map.get(key);
    }
}
