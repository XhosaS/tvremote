package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class soc extends LinearLayout.LayoutParams {
    public int a;
    public Interpolator b;
    public rzy c;

    public soc() {
        super(-1, -2);
        this.a = 1;
    }

    public soc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sok.b);
        this.a = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.c = typedArrayObtainStyledAttributes.getInt(0, 0) == 1 ? new rzy((byte[]) null) : null;
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            this.b = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public soc(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 1;
    }

    public soc(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.a = 1;
    }

    public soc(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 1;
    }
}
