package ir.iamnovinfar.hesabino.Infrastructure;

import android.animation.ObjectAnimator;
import android.widget.ImageView;

public   class Utility {

    public static void imageRotation(ImageView imageView){

        ObjectAnimator objectAnimator=ObjectAnimator.ofFloat(imageView,"rotation",0,90f);
        objectAnimator.setDuration(200);
        objectAnimator.start();



    }

}
