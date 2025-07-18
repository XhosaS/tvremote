package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lqd {
    public final String a;
    public final String b;
    public final String c;
    public final tst d;
    public final tst e;
    public final tst f;
    public final tst g;
    public final tst h;
    public final ImmutableList i;
    private final tst j;
    private final tst k;
    private final tst l;
    private final tst m;
    private final tst n;
    private final tst o;
    private final tst p;
    private final tst q;
    private final tst r;
    private final ImmutableList s;

    public lqd() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lqd) {
            lqd lqdVar = (lqd) obj;
            if (this.a.equals(lqdVar.a) && this.b.equals(lqdVar.b) && this.c.equals(lqdVar.c) && this.j.equals(lqdVar.j) && this.k.equals(lqdVar.k) && this.l.equals(lqdVar.l) && this.d.equals(lqdVar.d) && this.e.equals(lqdVar.e) && this.m.equals(lqdVar.m) && this.f.equals(lqdVar.f) && this.n.equals(lqdVar.n) && this.g.equals(lqdVar.g) && this.o.equals(lqdVar.o) && this.p.equals(lqdVar.p) && this.h.equals(lqdVar.h) && this.i.equals(lqdVar.i) && this.q.equals(lqdVar.q) && this.r.equals(lqdVar.r) && this.s.equals(lqdVar.s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.s.hashCode();
    }

    public final String toString() {
        ImmutableList immutableList = this.s;
        tst tstVar = this.r;
        tst tstVar2 = this.q;
        ImmutableList immutableList2 = this.i;
        tst tstVar3 = this.h;
        tst tstVar4 = this.p;
        tst tstVar5 = this.o;
        tst tstVar6 = this.g;
        tst tstVar7 = this.n;
        tst tstVar8 = this.f;
        tst tstVar9 = this.m;
        tst tstVar10 = this.e;
        tst tstVar11 = this.d;
        tst tstVar12 = this.l;
        tst tstVar13 = this.k;
        return "Collection{collectionId=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", offerPreference=" + String.valueOf(this.j) + ", layoutTemplateId=" + String.valueOf(tstVar13) + ", snippet=" + String.valueOf(tstVar12) + ", loggingToken=" + String.valueOf(tstVar11) + ", collectionAssetItems=" + String.valueOf(tstVar10) + ", subCollectionIds=" + String.valueOf(tstVar9) + ", paginationToken=" + String.valueOf(tstVar8) + ", refreshToken=" + String.valueOf(tstVar7) + ", detailsPageSelection=" + String.valueOf(tstVar6) + ", tagInfoOptional=" + String.valueOf(tstVar5) + ", impressionCapCount=" + String.valueOf(tstVar4) + ", moduleBackground=" + String.valueOf(tstVar3) + ", images=" + String.valueOf(immutableList2) + ", card=" + String.valueOf(tstVar2) + ", coupon=" + String.valueOf(tstVar) + ", assetType=" + String.valueOf(immutableList) + "}";
    }

    public lqd(String str, String str2, String str3, tst tstVar, tst tstVar2, tst tstVar3, tst tstVar4, tst tstVar5, tst tstVar6, tst tstVar7, tst tstVar8, tst tstVar9, tst tstVar10, tst tstVar11, tst tstVar12, ImmutableList immutableList, tst tstVar13, tst tstVar14, ImmutableList immutableList2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.j = tstVar;
        this.k = tstVar2;
        this.l = tstVar3;
        this.d = tstVar4;
        this.e = tstVar5;
        this.m = tstVar6;
        this.f = tstVar7;
        this.n = tstVar8;
        this.g = tstVar9;
        this.o = tstVar10;
        this.p = tstVar11;
        this.h = tstVar12;
        this.i = immutableList;
        this.q = tstVar13;
        this.r = tstVar14;
        this.s = immutableList2;
    }
}
