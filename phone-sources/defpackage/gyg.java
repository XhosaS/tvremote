package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyg extends fki {
    public final Drawable a;
    public final boolean b;
    public final int c;

    public gyg(Drawable drawable, boolean z, int i) {
        super((short[]) null);
        this.a = drawable;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gyg)) {
            return false;
        }
        gyg gygVar = (gyg) obj;
        return yks.e(this.a, gygVar.a) && this.b == gygVar.b && this.c == gygVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = this.c;
        a.bw(i);
        return ((iHashCode + a.q(this.b)) * 31) + i;
    }
}
