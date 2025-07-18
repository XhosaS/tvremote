package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmk implements fms {
    private final fmj a;
    private final edi b = new edi(32);
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    public fmk(fmj fmjVar) {
        this.a = fmjVar;
    }

    @Override // defpackage.fms
    public final void a(edi ediVar, int i) {
        int i2 = i & 1;
        int iJ = i2 != 0 ? ediVar.b + ediVar.j() : -1;
        if (this.f) {
            if (i2 == 0) {
                return;
            }
            this.f = false;
            ediVar.K(iJ);
            this.d = 0;
        }
        while (ediVar.a() > 0) {
            int i3 = this.d;
            if (i3 < 3) {
                if (i3 == 0) {
                    int iJ2 = ediVar.j();
                    ediVar.K(ediVar.b - 1);
                    if (iJ2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(ediVar.a(), 3 - this.d);
                edi ediVar2 = this.b;
                ediVar.F(ediVar2.a, this.d, iMin);
                int i4 = this.d + iMin;
                this.d = i4;
                if (i4 == 3) {
                    ediVar2.K(0);
                    ediVar2.J(3);
                    ediVar2.L(1);
                    int iJ3 = ediVar2.j();
                    int iJ4 = ediVar2.j();
                    this.e = (iJ3 & 128) != 0;
                    this.c = (((iJ3 & 15) << 8) | iJ4) + 3;
                    int iB = ediVar2.b();
                    int i5 = this.c;
                    if (iB < i5) {
                        int iB2 = ediVar2.b();
                        ediVar2.D(Math.min(4098, Math.max(i5, iB2 + iB2)));
                    }
                }
            } else {
                int iMin2 = Math.min(ediVar.a(), this.c - this.d);
                edi ediVar3 = this.b;
                ediVar.F(ediVar3.a, this.d, iMin2);
                int i6 = this.d + iMin2;
                this.d = i6;
                int i7 = this.c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.e) {
                        ediVar3.J(i7);
                    } else {
                        if (edt.f(ediVar3.a, 0, i7, -1) != 0) {
                            this.f = true;
                            return;
                        }
                        ediVar3.J(this.c - 4);
                    }
                    ediVar3.K(0);
                    this.a.a(ediVar3);
                    this.d = 0;
                }
            }
        }
    }

    @Override // defpackage.fms
    public final void b(edo edoVar, fdr fdrVar, fmr fmrVar) {
        this.a.b(edoVar, fdrVar, fmrVar);
        this.f = true;
    }

    @Override // defpackage.fms
    public final void c() {
        this.f = true;
    }
}
