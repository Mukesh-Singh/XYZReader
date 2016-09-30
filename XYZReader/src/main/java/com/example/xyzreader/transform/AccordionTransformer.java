package com.example.xyzreader.transform;

/**
 * Created by rahil on 9/10/15.
 */

import android.view.View;


/**
 * This class is used to create page swipe transformer
 */
public class AccordionTransformer extends BaseTransformer {


    @Override
    protected void onTransform(View view, float position) {
        view.setPivotX(position < 0 ? 0 : view.getWidth());
        view.setScaleX(position < 0 ? 1f + position : 1f - position);
    }


}