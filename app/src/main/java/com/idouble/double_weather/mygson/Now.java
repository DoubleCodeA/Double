package com.idouble.double_weather.mygson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/3/13.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }

}
