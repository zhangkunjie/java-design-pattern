package com.designpattern1.adapter;

/**
 * @author: kunjie.zhang
 * @description:
 * @date: Created in 2018年06月05日 上午11:01
 * @modified By:
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}