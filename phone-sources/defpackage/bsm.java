package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsm {
    public final bvc a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final kc g = new kc((byte[]) null);
    public final bsq f = new bsq();
    public final jj h = new jj(10);

    public bsm(bvc bvcVar) {
        this.a = bvcVar;
    }

    public final void a() {
        if (this.d) {
            this.d = true;
        } else {
            this.f.d.h();
        }
    }

    public final void b() {
        if (this.b) {
            this.c = true;
            return;
        }
        bfz bfzVar = this.f.d;
        Object[] objArr = bfzVar.a;
        int i = bfzVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((bsp) objArr[i2]).a();
        }
        a();
    }

    public final void c(bko bkoVar) {
        if (this.b) {
            this.e = true;
            this.g.p(bkoVar);
            return;
        }
        bsq bsqVar = this.f;
        kc kcVar = bsqVar.e;
        kcVar.k();
        kcVar.p(bsqVar);
        while (kcVar.g()) {
            bsq bsqVar2 = (bsq) kcVar.h(kcVar.b - 1);
            int i = 0;
            while (true) {
                bfz bfzVar = bsqVar2.d;
                if (i < bfzVar.b) {
                    bsp bspVar = (bsp) bfzVar.a[i];
                    if (yks.e(bspVar.a, bkoVar)) {
                        bfzVar.n(bspVar);
                        bspVar.a();
                    } else {
                        kcVar.p(bspVar);
                        i++;
                    }
                }
            }
        }
    }
}
