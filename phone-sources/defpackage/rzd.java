package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rzd {
    public final boolean a;
    public final List b;
    public final vsz c;
    public final String d;
    public final String e;
    public final List f;
    public final List g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public rzd(boolean z, List list, vsz vszVar, String str, String str2, List list2, List list3, boolean z2, boolean z3, boolean z4) {
        list.getClass();
        vszVar.getClass();
        str.getClass();
        str2.getClass();
        list2.getClass();
        list3.getClass();
        this.a = z;
        this.b = list;
        this.c = vszVar;
        this.d = str;
        this.e = str2;
        this.f = list2;
        this.g = list3;
        this.h = z2;
        this.i = z3;
        this.j = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzd)) {
            return false;
        }
        rzd rzdVar = (rzd) obj;
        return this.a == rzdVar.a && yks.e(this.b, rzdVar.b) && yks.e(this.c, rzdVar.c) && yks.e(this.d, rzdVar.d) && yks.e(this.e, rzdVar.e) && yks.e(this.f, rzdVar.f) && yks.e(this.g, rzdVar.g) && this.h == rzdVar.h && this.i == rzdVar.i && this.j == rzdVar.j;
    }

    public final int hashCode() {
        int iQ = (((((((((((a.q(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
        boolean z = this.j;
        return (((((iQ * 31) + a.q(this.h)) * 31) + a.q(this.i)) * 31) + a.q(z);
    }

    public final String toString() {
        return "SharedStorageInfo(shouldUseSharedStorage=" + this.a + ", enabledBackings=" + this.b + ", secret=" + this.c + ", dirPath=" + this.d + ", gmsCoreDirPath=" + this.e + ", includeStaticConfigPackages=" + this.f + ", excludeStaticConfigPackages=" + this.g + ", hasStorageInfoFromGms=" + this.h + ", allowEmptySnapshotToken=" + this.i + ", enableCommitV2Api=" + this.j + ")";
    }
}
