package defpackage;

import com.google.common.collect.Multimap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pvu {
    public final vht a;
    public final Multimap b;
    public final Multimap c;
    public final boolean d;

    public pvu() {
        this(null, null, null, false, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvu)) {
            return false;
        }
        pvu pvuVar = (pvu) obj;
        return this.a == pvuVar.a && yks.e(this.b, pvuVar.b) && yks.e(this.c, pvuVar.c) && this.d == pvuVar.d;
    }

    public final int hashCode() {
        vht vhtVar = this.a;
        int iHashCode = vhtVar == null ? 0 : vhtVar.hashCode();
        Multimap multimap = this.b;
        int iHashCode2 = multimap == null ? 0 : multimap.hashCode();
        int i = iHashCode * 31;
        Multimap multimap2 = this.c;
        return ((((i + iHashCode2) * 31) + (multimap2 != null ? multimap2.hashCode() : 0)) * 31) + a.q(this.d);
    }

    public final String toString() {
        return "RemovalInfo(removeReason=" + this.a + ", removeReasonToThreadIds=" + this.b + ", reachedLimitMap=" + this.c + ", dueToAnotherAccountAction=" + this.d + ")";
    }

    public /* synthetic */ pvu(vht vhtVar, Multimap multimap, Multimap multimap2, boolean z, int i) {
        this.a = 1 == (i & 1) ? null : vhtVar;
        this.b = (i & 2) != 0 ? null : multimap;
        this.c = (i & 4) != 0 ? null : multimap2;
        this.d = ((i & 8) == 0) & z;
    }
}
