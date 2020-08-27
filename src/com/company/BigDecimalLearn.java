package com.company;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalLearn {
    public static void main(String[] args) throws UnsupportedEncodingException {
        BigDecimal test = new BigDecimal("232323213123123123.3432423");
        //RoundingMode.HALF_UP 四舍五入设置 进行截断
        System.out.println(test.add(new BigDecimal("23213123213213.23213")).setScale(2, RoundingMode.HALF_UP));
        String S = new String("dsdas");
        S.getBytes("utf-8");
    }
}
