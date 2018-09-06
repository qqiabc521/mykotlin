package com.ljj.kotlin.demo3;

import kotlin.io.FilesKt;

import java.io.File;
import java.nio.charset.Charset;

public class Main {

    public static void main(String[] args){
        File file = new File("mykotlin.iml");
        String content = FilesKt.readText(file, Charset.forName("UTF-8"));
        System.out.println(content);
    }
}
