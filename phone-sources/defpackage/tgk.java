package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tgk extends tgi {
    public static final cuj a = new cuk(10);
    public tgg b;
    public boolean c;
    public int d;
    public int i;
    public int j;
    public int k;
    public int l;
    public tgm m;
    public int n;

    public tgk() {
        g();
    }

    @Override // defpackage.tgi
    public final int a(int i) {
        if (i == this.f) {
            return this.b.p;
        }
        tgm tgmVar = this.m;
        if (tgmVar != null) {
            return this.b.p + this.k + tgmVar.a(i);
        }
        return 0;
    }

    @Override // defpackage.tgj
    protected final int b(boolean z, int i) {
        int iMax;
        tgg tggVar = this.b;
        if (tggVar == null) {
            return 0;
        }
        int i2 = this.f;
        int i3 = i2 + 1;
        int i4 = i2 == 0 ? tggVar.f : tggVar.e;
        tggVar.p = i4;
        int iMax2 = Math.max(0, i4 + tggVar.m + (i3 == i ? tggVar.j : tggVar.i));
        tgm tgmVar = this.m;
        int iJ = tgmVar != null ? tgmVar.j(i) : 0;
        if (this.c) {
            this.n = Math.max(0, ((this.k + iJ) + this.l) - this.b.m);
            iMax = Math.max(this.i, iJ) + this.l;
        } else {
            this.n = 0;
            iMax = Math.max(this.i + this.l, iJ);
        }
        return Math.max(iMax2, this.b.p + this.k + iMax);
    }

    @Override // defpackage.tgj
    public final int c() {
        if (this.b == null) {
            return this.f;
        }
        tgm tgmVar = this.m;
        return tgmVar == null ? this.f + 1 : tgmVar.c();
    }

    @Override // defpackage.tgi
    public final void e() {
        tgg tggVar = this.b;
        if (tggVar != null) {
            tggVar.o = false;
        }
        tgm tgmVar = this.m;
        if (tgmVar != null) {
            tgmVar.i();
        }
    }

    @Override // defpackage.tgi
    public final void f() {
        g();
        a.b(this);
    }

    @Override // defpackage.tgj
    protected final void g() {
        super.g();
        tgg tggVar = this.b;
        if (tggVar != null) {
            tggVar.b();
            this.b = null;
        }
        this.d = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.n = 0;
        tgm tgmVar = this.m;
        if (tgmVar != null) {
            tgmVar.o();
            this.m = null;
        }
    }

    @Override // defpackage.tgj
    protected final boolean h(int i) {
        tgm tgmVar = this.m;
        boolean z = false;
        if (tgmVar == null) {
            return false;
        }
        int iK = tgmVar.k(i);
        if (iK != 0) {
            z = true;
            if (iK != 2) {
                return true;
            }
            this.m.o();
            this.m = null;
        }
        return z;
    }

    @Override // defpackage.tgi
    public final void i(StringBuilder sb) {
        sb.append('@');
        sb.append(this.f);
        sb.append("(flow");
        tgm tgmVar = this.m;
        if (tgmVar != null) {
            tgmVar.n(sb);
        } else {
            sb.append("{}");
        }
        sb.append(')');
    }

    @Override // defpackage.tgj
    public final void m(int i) {
        super.m(i);
        tgm tgmVar = this.m;
        if (tgmVar != null) {
            tgmVar.m(i);
        }
    }
}
