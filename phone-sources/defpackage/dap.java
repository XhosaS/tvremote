package defpackage;

import android.graphics.Rect;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dap<T> implements Comparator<T> {
    private final Rect a = new Rect();
    private final Rect b = new Rect();
    private final boolean c;

    public dap(boolean z) {
        this.c = z;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        Rect rect = this.a;
        ((cyq) t).m(rect);
        Rect rect2 = this.b;
        ((cyq) t2).m(rect2);
        int i = -1;
        if (rect.top < rect2.top) {
            return -1;
        }
        int i2 = 1;
        if (rect.top > rect2.top) {
            return 1;
        }
        if (rect.left >= rect2.left) {
            if (rect.left > rect2.left) {
                i2 = -1;
                i = 1;
            } else {
                if (rect.bottom < rect2.bottom) {
                    return -1;
                }
                if (rect.bottom > rect2.bottom) {
                    return 1;
                }
                if (rect.right >= rect2.right) {
                    if (rect.right <= rect2.right) {
                        return 0;
                    }
                    i2 = -1;
                    i = 1;
                }
            }
        }
        return this.c ? i2 : i;
    }
}
