package defpackage;

import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnl extends bnr {
    public final int a;
    private final long c;

    public bnl(long j, int i) {
        super(Build.VERSION.SDK_INT >= 29 ? new BlendModeColorFilter(bny.h(j), bnj.k(i)) : new PorterDuffColorFilter(bny.h(j), bnj.l(i)));
        this.c = j;
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnl)) {
            return false;
        }
        long j = this.c;
        bnl bnlVar = (bnl) obj;
        long j2 = bnlVar.c;
        long j3 = bnq.a;
        return a.s(j, j2) && a.r(this.a, bnlVar.a);
    }

    public final int hashCode() {
        long j = bnq.a;
        return (a.k(this.c) * 31) + this.a;
    }

    public final String toString() {
        return "BlendModeColorFilter(color=" + ((Object) bnq.g(this.c)) + ", blendMode=" + ((Object) bnk.a(this.a)) + ')';
    }
}
