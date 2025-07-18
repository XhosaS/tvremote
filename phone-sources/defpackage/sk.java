package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sk extends bxw implements bxu, bzt {
    public qk a;
    public qj b;
    private vs c;
    private uv d;
    private boolean e;
    private boolean f;
    private vr g;
    private bxv h;
    private boolean i;
    private qj j;
    private kw k;
    private ybo l;

    public sk(vs vsVar, uv uvVar, boolean z, ybo yboVar, kw kwVar, boolean z2, qj qjVar) {
        this.c = vsVar;
        this.d = uvVar;
        this.e = z;
        this.l = yboVar;
        this.k = kwVar;
        this.f = z2;
        this.j = qjVar;
    }

    private final void g() {
        bxv bxvVar = this.h;
        if (bxvVar != null) {
            if (bxvVar.E().A) {
                return;
            }
            O(bxvVar);
            return;
        }
        if (this.f) {
            cbp.Q(this, new sw(this, 1));
        }
        qj qjVarE = e();
        if (qjVarE != null) {
            bxv bxvVar2 = qjVarE.g;
            if (bxvVar2.E().A) {
                return;
            }
            O(bxvVar2);
            this.h = bxvVar2;
        }
    }

    public final boolean b() {
        cmi cmiVarM = cmi.a;
        if (this.A) {
            cmiVarM = fh.M(this);
        }
        return og.p(cmiVarM, this.d);
    }

    @Override // defpackage.bko
    public final void bP() {
        boolean zB = b();
        if (this.i != zB) {
            this.i = zB;
            f(this.c, this.d, this.f, e(), this.e, this.l, this.k);
        }
    }

    @Override // defpackage.bko
    public final void cd() {
        this.i = b();
        g();
        if (this.g == null) {
            vr vrVar = new vr(this.c, e(), this.l, this.d, this.e, this.i, this.k);
            O(vrVar);
            this.g = vrVar;
        }
    }

    @Override // defpackage.bko
    public final boolean ce() {
        return false;
    }

    @Override // defpackage.bko
    public final void ch() {
        bxv bxvVar = this.h;
        if (bxvVar != null) {
            N(bxvVar);
        }
    }

    public final qj e() {
        return this.f ? this.b : this.j;
    }

    public final void f(vs vsVar, uv uvVar, boolean z, qj qjVar, boolean z2, ybo yboVar, kw kwVar) {
        boolean z3;
        this.c = vsVar;
        this.d = uvVar;
        boolean z4 = true;
        if (this.f != z) {
            this.f = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (yks.e(this.j, qjVar)) {
            z4 = false;
        } else {
            this.j = qjVar;
        }
        if (z3 || (z4 && !z)) {
            bxv bxvVar = this.h;
            if (bxvVar != null) {
                N(bxvVar);
            }
            this.h = null;
            g();
        }
        this.e = z2;
        this.l = yboVar;
        this.k = kwVar;
        boolean zB = b();
        this.i = zB;
        vr vrVar = this.g;
        if (vrVar != null) {
            vrVar.A(vsVar, uvVar, e(), z2, zB, yboVar, kwVar);
        }
    }

    @Override // defpackage.bzt
    public final void l() {
        qk qkVar = (qk) fh.P(this, sc.a);
        if (yks.e(qkVar, this.a)) {
            return;
        }
        this.a = qkVar;
        this.b = null;
        bxv bxvVar = this.h;
        if (bxvVar != null) {
            N(bxvVar);
        }
        this.h = null;
        g();
        vr vrVar = this.g;
        if (vrVar != null) {
            vrVar.A(this.c, this.d, e(), this.e, this.i, this.l, this.k);
        }
    }
}
