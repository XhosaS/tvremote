package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dxu {
    public static int a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(View.MeasureSpec.getSize(i), i2);
        }
        if (mode == 0) {
            return i2;
        }
        if (mode == 1073741824) {
            return View.MeasureSpec.getSize(i);
        }
        throw new IllegalStateException("Unexpected size mode: " + View.MeasureSpec.getMode(i));
    }

    public static int b(float f, int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? View.MeasureSpec.makeMeasureSpec(duc.a(f), Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(duc.a(f), 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0);
    }
}
