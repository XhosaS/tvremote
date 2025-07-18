package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flx implements fln {
    private String a;
    private fel b;
    private flw c;
    private boolean d;
    private long k;
    private final iom n;
    private final boolean[] e = new boolean[3];
    private final fmd f = new fmd(32);
    private final fmd g = new fmd(33);
    private final fmd h = new fmd(34);
    private final fmd i = new fmd(39);
    private final fmd j = new fmd(40);
    private long l = -9223372036854775807L;
    private final edi m = new edi();

    public flx(iom iomVar) {
        this.n = iomVar;
    }

    private final void f() {
        eci.e(this.b);
        String str = edt.a;
    }

    private final void g(long j, int i, int i2, long j2) {
        flw flwVar = this.c;
        boolean z = this.d;
        if (flwVar.i && flwVar.f) {
            flwVar.l = flwVar.b;
            flwVar.i = false;
        } else if (flwVar.g || flwVar.f) {
            if (z && flwVar.h) {
                flwVar.a(i + ((int) (j - flwVar.a)));
            }
            flwVar.j = flwVar.a;
            flwVar.k = flwVar.d;
            flwVar.l = flwVar.b;
            flwVar.h = true;
        }
        if (!this.d) {
            fmd fmdVar = this.f;
            fmdVar.d(i2);
            fmd fmdVar2 = this.g;
            fmdVar2.d(i2);
            fmd fmdVar3 = this.h;
            fmdVar3.d(i2);
            if (fmdVar.a && fmdVar2.a && fmdVar3.a) {
                String str = this.a;
                int i3 = fmdVar.c;
                byte[] bArr = new byte[fmdVar2.c + i3 + fmdVar3.c];
                System.arraycopy(fmdVar.b, 0, bArr, 0, i3);
                System.arraycopy(fmdVar2.b, 0, bArr, fmdVar.c, fmdVar2.c);
                System.arraycopy(fmdVar3.b, 0, bArr, fmdVar.c + fmdVar2.c, fmdVar3.c);
                eec eecVarL = eee.l(fmdVar2.b, 3, fmdVar2.c, null);
                eeb eebVar = eecVarL.b;
                String strE = eebVar != null ? eco.e(eebVar.a, eebVar.b, eebVar.c, eebVar.d, eebVar.e, eebVar.f) : null;
                dzd dzdVar = new dzd();
                dzdVar.a = str;
                dzdVar.a("video/mp2t");
                dzdVar.d("video/hevc");
                dzdVar.j = strE;
                dzdVar.t = eecVarL.e;
                dzdVar.u = eecVarL.f;
                dzdVar.v = eecVarL.g;
                dzdVar.w = eecVarL.h;
                dzdVar.C = new dyt(eecVarL.k, eecVarL.l, eecVarL.m, null, eecVarL.c + 8, eecVarL.d + 8);
                dzdVar.z = eecVarL.i;
                dzdVar.o = eecVarL.j;
                dzdVar.D = eecVarL.a + 1;
                dzdVar.p = Collections.singletonList(bArr);
                dze dzeVar = new dze(dzdVar);
                this.b.b(dzeVar);
                int i4 = dzeVar.aa;
                a.ab(i4 != -1);
                this.n.A(i4);
                this.d = true;
            }
        }
        fmd fmdVar4 = this.i;
        if (fmdVar4.d(i2)) {
            int iE = eee.e(fmdVar4.b, fmdVar4.c);
            edi ediVar = this.m;
            ediVar.I(fmdVar4.b, iE);
            ediVar.L(5);
            this.n.x(j2, ediVar);
        }
        fmd fmdVar5 = this.j;
        if (fmdVar5.d(i2)) {
            int iE2 = eee.e(fmdVar5.b, fmdVar5.c);
            edi ediVar2 = this.m;
            ediVar2.I(fmdVar5.b, iE2);
            ediVar2.L(5);
            this.n.x(j2, ediVar2);
        }
    }

    private final void h(byte[] bArr, int i, int i2) {
        flw flwVar = this.c;
        if (flwVar.e) {
            int i3 = flwVar.c;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                flwVar.f = (bArr[i4] & 128) != 0;
                flwVar.e = false;
            } else {
                flwVar.c = i3 + (i2 - i);
            }
        }
        if (!this.d) {
            this.f.a(bArr, i, i2);
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
        }
        this.i.a(bArr, i, i2);
        this.j.a(bArr, i, i2);
    }

    private final void i(long j, int i, int i2, long j2) {
        flw flwVar = this.c;
        boolean z = this.d;
        flwVar.f = false;
        flwVar.g = false;
        flwVar.d = j2;
        flwVar.c = 0;
        flwVar.a = j;
        if (i2 >= 32 && i2 != 40) {
            if (flwVar.h && !flwVar.i) {
                if (z) {
                    flwVar.a(i);
                }
                flwVar.h = false;
            }
            if (i2 <= 35 || i2 == 39) {
                flwVar.g = !flwVar.i;
                flwVar.i = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        flwVar.b = z2;
        flwVar.e = z2 || i2 <= 9;
        if (!this.d) {
            this.f.c(i2);
            this.g.c(i2);
            this.h.c(i2);
        }
        this.i.c(i2);
        this.j.c(i2);
    }

    @Override // defpackage.fln
    public final void a(edi ediVar) {
        f();
        while (ediVar.a() > 0) {
            int i = ediVar.b;
            int i2 = ediVar.c;
            byte[] bArr = ediVar.a;
            this.k += ediVar.a();
            this.b.c(ediVar, ediVar.a());
            while (i < i2) {
                int iC = eee.c(bArr, i, i2, this.e);
                if (iC == i2) {
                    h(bArr, i, i2);
                    return;
                }
                int i3 = bArr[iC + 3] & 126;
                int i4 = 3;
                if (iC > 0) {
                    int i5 = iC - 1;
                    if (bArr[i5] == 0) {
                        i4 = 4;
                        iC = i5;
                    }
                }
                int i6 = iC - i;
                if (i6 > 0) {
                    h(bArr, i, iC);
                }
                int i7 = i2 - iC;
                long j = this.k - i7;
                g(j, i7, i6 < 0 ? -i6 : 0, this.l);
                i(j, i7, i3 >> 1, this.l);
                i = iC + i4;
            }
        }
    }

    @Override // defpackage.fln
    public final void b(fdr fdrVar, fmr fmrVar) {
        fmrVar.c();
        this.a = fmrVar.b();
        this.b = fdrVar.dq(fmrVar.a(), 2);
        this.c = new flw(this.b);
        this.n.y(fdrVar, fmrVar);
    }

    @Override // defpackage.fln
    public final void c(boolean z) {
        f();
        if (z) {
            this.n.z();
            g(this.k, 0, 0, this.l);
            i(this.k, 0, 48, this.l);
        }
    }

    @Override // defpackage.fln
    public final void d(long j, int i) {
        this.l = j;
    }

    @Override // defpackage.fln
    public final void e() {
        this.k = 0L;
        this.l = -9223372036854775807L;
        eee.g(this.e);
        this.f.b();
        this.g.b();
        this.h.b();
        this.i.b();
        this.j.b();
        this.n.w();
        flw flwVar = this.c;
        if (flwVar != null) {
            flwVar.e = false;
            flwVar.f = false;
            flwVar.g = false;
            flwVar.h = false;
            flwVar.i = false;
        }
    }
}
