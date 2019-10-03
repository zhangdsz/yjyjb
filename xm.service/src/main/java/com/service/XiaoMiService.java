package com.service;

/**
 * 服务层
 */
public class XiaoMiService {
    public String xiaoMiService(){
        //调用dao
        XiaoMiDao xm = new XiaoMiDao();

        return "张晋峰" + xm.addXiaoMi();
    }

    public static void main(String[] args) {
        XiaoMiService xms = new XiaoMiService();
        System.out.println(xms.xiaoMiService());
    }
}
