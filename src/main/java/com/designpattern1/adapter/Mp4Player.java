package com.designpattern1.adapter;

/**
 * @author: kunjie.zhang
 * @description:
 * @date: Created in 2018年06月05日 上午11:02
 * @modified By:
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}