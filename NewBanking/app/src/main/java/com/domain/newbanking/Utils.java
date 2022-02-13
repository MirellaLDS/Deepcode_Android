package com.domain.newbanking;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class Utils {

    public static void setColorShape(ImageView view, int color) {
        GradientDrawable shape = (GradientDrawable) view.getDrawable();
        shape.setColor(color);
    }

    public static void setColorShape(ConstraintLayout view, int color) {
        GradientDrawable shape = (GradientDrawable) view.getBackground();
        shape.setColor(color);
    }
}
