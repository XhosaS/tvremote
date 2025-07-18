package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rml {
    public final abvo a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    private final boolean f;
    private final List g;
    private final List h;
    private final List i;
    private final boolean j;

    public rml(boolean z, List list, abvo abvoVar, String str, String str2, List list2, List list3, boolean z2, boolean z3, boolean z4) {
        list.getClass();
        abvoVar.getClass();
        str.getClass();
        str2.getClass();
        list2.getClass();
        list3.getClass();
        this.f = z;
        this.g = list;
        this.a = abvoVar;
        this.b = str;
        this.c = str2;
        this.h = list2;
        this.i = list3;
        this.j = z2;
        this.d = z3;
        this.e = z4;
    }

    public final int a(aags aagsVar, String str) {
        aagsVar.getClass();
        str.getClass();
        if (!this.j) {
            return 14;
        }
        if (!this.f || !this.g.contains(aagsVar)) {
            return 3;
        }
        if (this.a.A()) {
            return 4;
        }
        List list = this.h;
        if (list.isEmpty() || list.contains(str)) {
            return this.i.contains(str) ? 6 : 0;
        }
        return 5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rml)) {
            return false;
        }
        rml rmlVar = (rml) obj;
        return this.f == rmlVar.f && agvy.c(this.g, rmlVar.g) && agvy.c(this.a, rmlVar.a) && agvy.c(this.b, rmlVar.b) && agvy.c(this.c, rmlVar.c) && agvy.c(this.h, rmlVar.h) && agvy.c(this.i, rmlVar.i) && this.j == rmlVar.j && this.d == rmlVar.d && this.e == rmlVar.e;
    }

    public final int hashCode() {
        int iA = (((((((((((rmk.a(this.f) * 31) + this.g.hashCode()) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
        boolean z = this.e;
        return (((((iA * 31) + rmk.a(this.j)) * 31) + rmk.a(this.d)) * 31) + rmk.a(z);
    }

    public final String toString() {
        return "SharedStorageInfo(shouldUseSharedStorage=" + this.f + ", enabledBackings=" + this.g + ", secret=" + this.a + ", dirPath=" + this.b + ", gmsCoreDirPath=" + this.c + ", includeStaticConfigPackages=" + this.h + ", excludeStaticConfigPackages=" + this.i + ", hasStorageInfoFromGms=" + this.j + ", allowEmptySnapshotToken=" + this.d + ", enableCommitV2Api=" + this.e + ")";
    }
}
