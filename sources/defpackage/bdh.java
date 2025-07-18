package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdh {
    public final boolean a;
    public final List b;
    public final ckv c;
    public final String d;
    public final String e;
    public final List f;
    public final List g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public bdh(boolean z, List list, ckv ckvVar, String str, String str2, List list2, List list3, boolean z2, boolean z3, boolean z4) {
        list.getClass();
        ckvVar.getClass();
        str.getClass();
        str2.getClass();
        list2.getClass();
        list3.getClass();
        this.a = z;
        this.b = list;
        this.c = ckvVar;
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
        if (!(obj instanceof bdh)) {
            return false;
        }
        bdh bdhVar = (bdh) obj;
        return this.a == bdhVar.a && dnx.aB(this.b, bdhVar.b) && dnx.aB(this.c, bdhVar.c) && dnx.aB(this.d, bdhVar.d) && dnx.aB(this.e, bdhVar.e) && dnx.aB(this.f, bdhVar.f) && dnx.aB(this.g, bdhVar.g) && this.h == bdhVar.h && this.i == bdhVar.i && this.j == bdhVar.j;
    }

    public final int hashCode() {
        int iC = (((((((((((bdq.c(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
        boolean z = this.j;
        return (((((iC * 31) + bdq.c(this.h)) * 31) + bdq.c(this.i)) * 31) + bdq.c(z);
    }

    public final String toString() {
        return "SharedStorageInfo(shouldUseSharedStorage=" + this.a + ", enabledBackings=" + this.b + ", secret=" + this.c + ", dirPath=" + this.d + ", gmsCoreDirPath=" + this.e + ", includeStaticConfigPackages=" + this.f + ", excludeStaticConfigPackages=" + this.g + ", hasStorageInfoFromGms=" + this.h + ", allowEmptySnapshotToken=" + this.i + ", enableCommitV2Api=" + this.j + ")";
    }
}
