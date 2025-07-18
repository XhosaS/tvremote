package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uta {
    private final boolean d(Drawable drawable) {
        return drawable.getAlpha() == 255 && drawable.isVisible();
    }

    public final Drawable a(LayerDrawable layerDrawable) {
        if (layerDrawable.getDrawable(1) == null) {
            return null;
        }
        Drawable drawable = layerDrawable.getDrawable(1);
        drawable.getClass();
        return ((LayerDrawable) drawable).getDrawable(1);
    }

    public final void b(LayerDrawable layerDrawable) {
        ObjectAnimator objectAnimator;
        layerDrawable.getClass();
        Drawable drawableA = a(layerDrawable);
        if (drawableA != null && d(drawableA)) {
            Drawable drawableA2 = a(layerDrawable);
            if (drawableA2 == null) {
                objectAnimator = null;
            } else {
                ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(drawableA2, "alpha", 255, 0);
                objectAnimatorOfInt.setDuration(100L);
                objectAnimatorOfInt.getClass();
                objectAnimatorOfInt.addListener(new usz(this, layerDrawable));
                objectAnimator = objectAnimatorOfInt;
            }
            if (objectAnimator != null) {
                objectAnimator.start();
            }
        }
    }

    public final void c(LayerDrawable layerDrawable) {
        layerDrawable.getClass();
        Drawable drawableA = a(layerDrawable);
        if (drawableA == null || d(drawableA)) {
            return;
        }
        drawableA.setAlpha(255);
        drawableA.setVisible(true, false);
    }
}
