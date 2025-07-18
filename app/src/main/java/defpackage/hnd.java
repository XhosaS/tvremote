package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hnd extends Animation {
    private final View a;
    private final int b;
    private final TextView c;
    private final int d;
    private final int e;

    public hnd(View view, int i, TextView textView, int i2, int i3) {
        this.a = view;
        this.b = i;
        this.c = textView;
        this.d = i2;
        this.e = i3 - i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = (int) ((this.e * f) + this.d);
        this.c.setMaxHeight(i);
        int i2 = this.b;
        View view = this.a;
        view.getLayoutParams().height = i + i2;
        view.requestLayout();
    }
}
