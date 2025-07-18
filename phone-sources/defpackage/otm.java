package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class otm extends otk {
    public static final cuj a = new cuk(10);
    public oti b;
    public boolean c;
    public int d;
    public int i;
    public int j;
    public int k;
    public int l;
    public oto m;
    public int n;

    public otm() {
        g();
    }

    @Override // defpackage.otk
    public final int a(int i) {
        if (i == this.f) {
            return this.b.p;
        }
        oto otoVar = this.m;
        if (otoVar != null) {
            return this.b.p + this.k + otoVar.a(i);
        }
        return 0;
    }

    @Override // defpackage.otl
    protected final int b(boolean z, int i) {
        int iMax;
        oti otiVar = this.b;
        if (otiVar == null) {
            return 0;
        }
        int i2 = this.f;
        int i3 = i2 + 1;
        int i4 = i2 == 0 ? otiVar.f : otiVar.e;
        otiVar.p = i4;
        int i5 = i3 == i ? otiVar.j : otiVar.i;
        int iMax2 = Math.max(0, i4 + otiVar.m + i5);
        oto otoVar = this.m;
        int i6 = otoVar != null ? otoVar.i(i) : 0;
        if (this.c) {
            this.n = Math.max(0, ((this.k + i6) + this.l) - this.b.m);
            iMax = Math.max(this.i, i6) + this.l;
        } else {
            this.n = 0;
            iMax = Math.max(this.i + this.l, i6);
        }
        return Math.max(iMax2, this.b.p + this.k + iMax + i5);
    }

    @Override // defpackage.otl
    public final int c() {
        if (this.b == null) {
            return this.f;
        }
        oto otoVar = this.m;
        return otoVar == null ? this.f + 1 : otoVar.c();
    }

    @Override // defpackage.otk
    public final void e() {
        oti otiVar = this.b;
        if (otiVar != null) {
            otiVar.o = false;
        }
        oto otoVar = this.m;
        if (otoVar != null) {
            otoVar.m();
        }
    }

    @Override // defpackage.otk
    public final void f() {
        g();
        a.b(this);
    }

    @Override // defpackage.otl
    protected final void g() {
        super.g();
        oti otiVar = this.b;
        if (otiVar != null) {
            otiVar.b();
            this.b = null;
        }
        this.d = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.n = 0;
        oto otoVar = this.m;
        if (otoVar != null) {
            otoVar.n();
            this.m = null;
        }
    }

    @Override // defpackage.otl
    protected final boolean h(int i) {
        oto otoVar = this.m;
        boolean z = false;
        if (otoVar == null) {
            return false;
        }
        int iJ = otoVar.j(i);
        if (iJ != 0) {
            z = true;
            if (iJ != 2) {
                return true;
            }
            this.m.n();
            this.m = null;
        }
        return z;
    }

    @Override // defpackage.otl
    public final void l(int i) {
        super.l(i);
        oto otoVar = this.m;
        if (otoVar != null) {
            otoVar.l(i);
        }
    }
}
