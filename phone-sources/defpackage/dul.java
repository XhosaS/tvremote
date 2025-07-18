package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dul implements duf {
    public final long a;

    public dul(long j) {
        this.a = j;
    }

    @Override // defpackage.duf
    public final long a(Context context) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dul)) {
            return false;
        }
        long j = this.a;
        long j2 = ((dul) obj).a;
        long j3 = bnq.a;
        return a.s(j, j2);
    }

    public final int hashCode() {
        long j = bnq.a;
        return a.k(this.a);
    }

    public final String toString() {
        return "FixedColorProvider(color=" + ((Object) bnq.g(this.a)) + ')';
    }
}
