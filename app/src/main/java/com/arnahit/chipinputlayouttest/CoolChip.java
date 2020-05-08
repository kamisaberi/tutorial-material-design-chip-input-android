package com.arnahit.chipinputlayouttest;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.Nullable;

import com.arnahit.chipinputlayout.Chip;


public class CoolChip extends Chip {
    private int id;
    private final String coolName;

    public CoolChip(int id, String coolName) {
        this.coolName = coolName;
        this.id = id;
    }

    @Nullable
    @Override
    public Object getId() {
        return id;
    }

    public String getTitle() {
        return coolName;
    }

    @Nullable
    @Override
    public String getSubtitle() {
        return null;
    }

    @Override
    public Uri getAvatarUri() {
        return null;
    }

    @Nullable
    @Override
    public Drawable getAvatarDrawable() {
        return null;
    }

    // ...other chip methods that are required to implement
}