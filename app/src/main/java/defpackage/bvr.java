package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes.dex */
class bvr {
    public static final bvs a;
    static final Property b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new bvw();
        } else {
            a = new bvv();
        }
        b = new bvp(Float.class);
        new bvq(Rect.class);
    }
}
