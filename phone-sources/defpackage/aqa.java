package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqa {
    public final chc a;
    public final chc b;
    private final chc c;
    private final chc d;
    private final chc e;
    private final chc f;
    private final chc g;
    private final chc h;
    private final chc i;
    private final chc j;
    private final chc k;
    private final chc l;
    private final chc m;

    public aqa(chc chcVar, chc chcVar2, chc chcVar3, chc chcVar4, chc chcVar5, chc chcVar6, chc chcVar7, chc chcVar8, chc chcVar9, chc chcVar10, chc chcVar11, chc chcVar12, chc chcVar13) {
        this.c = chcVar;
        this.d = chcVar2;
        this.e = chcVar3;
        this.f = chcVar4;
        this.g = chcVar5;
        this.h = chcVar6;
        this.i = chcVar7;
        this.j = chcVar8;
        this.k = chcVar9;
        this.a = chcVar10;
        this.b = chcVar11;
        this.l = chcVar12;
        this.m = chcVar13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqa)) {
            return false;
        }
        aqa aqaVar = (aqa) obj;
        return yks.e(this.c, aqaVar.c) && yks.e(this.d, aqaVar.d) && yks.e(this.e, aqaVar.e) && yks.e(this.f, aqaVar.f) && yks.e(this.g, aqaVar.g) && yks.e(this.h, aqaVar.h) && yks.e(this.i, aqaVar.i) && yks.e(this.j, aqaVar.j) && yks.e(this.k, aqaVar.k) && yks.e(this.a, aqaVar.a) && yks.e(this.b, aqaVar.b) && yks.e(this.l, aqaVar.l) && yks.e(this.m, aqaVar.m);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode();
    }

    public final String toString() {
        return "Typography(h1=" + this.c + ", h2=" + this.d + ", h3=" + this.e + ", h4=" + this.f + ", h5=" + this.g + ", h6=" + this.h + ", subtitle1=" + this.i + ", subtitle2=" + this.j + ", body1=" + this.k + ", body2=" + this.a + ", button=" + this.b + ", caption=" + this.l + ", overline=" + this.m + ')';
    }
}
