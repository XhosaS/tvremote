package defpackage;

import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mag extends lxz {
    public static final idf i = new lxq(12);
    public final int j;
    public final int k;
    public final int l;

    @Deprecated
    public final String m;
    public final String n;
    public final String o;
    public final List p;
    public final List q;
    public final List r;
    public final int s;

    public mag(ieg iegVar, boolean z, String str, Locale locale, String str2, List list, List list2, List list3) {
        super(iegVar, str, locale, str2);
        this.m = "";
        this.l = 2;
        this.j = 7;
        this.n = "";
        this.k = (true != z ? 0 : 16384) | 5399;
        this.o = "";
        this.s = 1;
        this.p = list;
        this.q = list2;
        this.r = list3;
    }

    @Override // defpackage.lxz
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        mag magVar = (mag) obj;
        return this.k == magVar.k && this.m.equals(magVar.m) && this.n.equals(magVar.n) && this.o.equals(magVar.o) && this.p.equals(magVar.p) && this.q.equals(magVar.q) && this.r.equals(magVar.r);
    }

    @Override // defpackage.lxz
    public final int hashCode() {
        int iHashCode = (((((((((((super.hashCode() * 31) + 7) * 31) + this.k) * 31) + 2) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode();
        a.bw(1);
        return (((((((iHashCode * 31) + 1) * 31) + this.p.hashCode()) * 31) + this.q.hashCode()) * 31) + this.r.hashCode();
    }
}
