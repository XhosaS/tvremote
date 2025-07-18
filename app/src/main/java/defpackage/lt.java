package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lt {
    public int a = 0;
    private final ImageView b;

    public lt(ImageView imageView) {
        this.b = imageView;
    }

    final void a() {
        ImageView imageView = this.b;
        if (imageView.getDrawable() != null) {
            imageView.getDrawable().setLevel(this.a);
        }
    }

    final void b() {
        Drawable drawable = this.b.getDrawable();
        if (drawable != null) {
            np.c(drawable);
        }
    }

    public final void c(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = this.b;
        Context context = imageView.getContext();
        int[] iArr = hs.f;
        rv rvVarF = rv.f(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = rvVarF.b;
        ahj.m(imageView, imageView.getContext(), iArr, attributeSet, typedArray, i, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1) {
                drawable = ra.e().c(imageView.getContext(), resourceId);
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (drawable != null) {
                np.c(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(rvVarF.a(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(np.a(typedArray.getInt(3, -1), null));
            }
        } finally {
            rvVarF.b.recycle();
        }
    }

    public final void d(int i) {
        if (i != 0) {
            ImageView imageView = this.b;
            Drawable drawableC = ra.e().c(imageView.getContext(), i);
            if (drawableC != null) {
                np.c(drawableC);
            }
            imageView.setImageDrawable(drawableC);
        } else {
            this.b.setImageDrawable(null);
        }
        b();
    }

    final boolean e() {
        return !(this.b.getBackground() instanceof RippleDrawable);
    }
}
