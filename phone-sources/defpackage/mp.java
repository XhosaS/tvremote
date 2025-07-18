package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mp {
    public final mh a;
    public final mn b;
    public final lv c;
    public final mm d;
    public final boolean e;
    public final Map f;

    public mp() {
        this(null, null, null, false, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mp)) {
            return false;
        }
        mp mpVar = (mp) obj;
        if (!yks.e(this.a, mpVar.a) || !yks.e(this.b, mpVar.b) || !yks.e(this.c, mpVar.c)) {
            return false;
        }
        mm mmVar = mpVar.d;
        return yks.e(null, null) && this.e == mpVar.e && yks.e(this.f, mpVar.f);
    }

    public final int hashCode() {
        mh mhVar = this.a;
        int iHashCode = mhVar == null ? 0 : mhVar.hashCode();
        mn mnVar = this.b;
        int iHashCode2 = mnVar == null ? 0 : mnVar.hashCode();
        int i = iHashCode * 31;
        lv lvVar = this.c;
        return ((((((i + iHashCode2) * 31) + (lvVar != null ? lvVar.hashCode() : 0)) * 961) + a.q(this.e)) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=null, hold=" + this.e + ", effectsMap=" + this.f + ')';
    }

    public mp(mh mhVar, mn mnVar, lv lvVar, boolean z, Map map) {
        this.a = mhVar;
        this.b = mnVar;
        this.c = lvVar;
        this.d = null;
        this.e = z;
        this.f = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ mp(mh mhVar, mn mnVar, lv lvVar, boolean z, Map map, int i) {
        Map map2 = (i & 32) != 0 ? yhc.a : map;
        int i2 = i & 4;
        int i3 = i & 2;
        boolean z2 = (i & 16) == 0;
        int i4 = i & 1;
        boolean z3 = z2 & z;
        lv lvVar2 = i2 != 0 ? null : lvVar;
        this(1 == i4 ? null : mhVar, i3 != 0 ? null : mnVar, lvVar2, z3, map2);
    }
}
