package com.designpattern1.compositeentity;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/5 下午8:10
 */
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2) {
        cgo.setData(data1, data2);
    }

    public String[] getData() {
        return cgo.getData();
    }
}
