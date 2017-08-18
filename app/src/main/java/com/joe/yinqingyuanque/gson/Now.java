package com.joe.yinqingyuanque.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by JDH on 2017/8/18.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
