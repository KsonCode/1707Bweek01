package com.laoxu.a1707bweek01.entity;

import java.util.List;

public class HomeEntity {
    public String message;
    public String status;
    public List<Home> result;

    public static class Home {
        public String commodityName;
        public String masterPic;
    }
}
