package com.prakash.androidwidgets.imageswitcher;

public class ImageSwitcherImpl implements ImageSwitcherController{
    @Override
    public int getNextImageIndex(int arrayIndex, int arrayLength) {
        if (arrayIndex < arrayLength - 1) {
            return arrayIndex += 1;
        } else {
           return arrayIndex = 0;
        }
    }
}
