package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class phu {
    public final Rect a = new Rect();
    public final Rect b = new Rect();

    public phu() {
        a();
    }

    public final void a() {
        this.a.set(0, 0, 0, 0);
        this.b.set(0, 0, 1073741823, 1073741823);
    }

    public final boolean b() {
        Rect rect = this.b;
        Rect rect2 = this.a;
        if (Math.max(Math.min(rect2.right, rect.right) - Math.max(rect2.left, rect.left), 0) > 0) {
            if (Math.max(Math.min(rect2.bottom, rect.bottom) - Math.max(rect2.top, rect.top), 0) > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            phu phuVar = (phu) obj;
            if (this.a.equals(phuVar.a) && this.b.equals(phuVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
