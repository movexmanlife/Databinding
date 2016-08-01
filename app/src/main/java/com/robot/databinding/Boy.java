package com.robot.databinding;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Boy extends Ani implements Serializable{
    public String school;
    public String need() {
        return "love";
    }
}
