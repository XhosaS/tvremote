package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzq extends gzv {
    public final Drawable a = null;
    public final gzu b;
    public final Throwable c;

    public gzq(gzu gzuVar, Throwable th) {
        this.b = gzuVar;
        this.c = th;
    }

    @Override // defpackage.gzv
    public final gzu a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzq)) {
            return false;
        }
        gzq gzqVar = (gzq) obj;
        Drawable drawable = gzqVar.a;
        return yks.e(null, null) && yks.e(this.b, gzqVar.b) && yks.e(this.c, gzqVar.c);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }
}
