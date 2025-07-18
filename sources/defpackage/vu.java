package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vu extends io {
    public int a;
    public int b;
    public int g;
    public int h;
    public int i;
    public int j;
    public int[] k;
    public qn l;

    public vu() {
        super(-2, -2);
    }

    public final int e(View view) {
        return (view.getWidth() - this.a) - this.g;
    }

    public vu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public vu(io ioVar) {
        super(ioVar);
    }

    public vu(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public vu(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public vu(vu vuVar) {
        super((io) vuVar);
    }
}
