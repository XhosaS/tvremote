package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxo {
    public final Drawable a;
    public final boolean b;

    public gxo(Drawable drawable, boolean z) {
        this.a = drawable;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxo)) {
            return false;
        }
        gxo gxoVar = (gxo) obj;
        return yks.e(this.a, gxoVar.a) && this.b == gxoVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.q(this.b);
    }
}
