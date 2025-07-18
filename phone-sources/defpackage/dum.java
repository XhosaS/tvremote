package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dum implements duf {
    public final int a;

    public dum(int i) {
        this.a = i;
    }

    @Override // defpackage.duf
    public final long a(Context context) {
        return bny.i(context.getColor(this.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dum) && this.a == ((dum) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "ResourceColorProvider(resId=" + this.a + ')';
    }
}
