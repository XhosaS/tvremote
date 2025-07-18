package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmf implements fms {
    public final fln a;
    public int c;
    private int e;
    private edo f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private boolean k;
    private final edh d = new edh(new byte[10]);
    public int b = 0;

    public fmf(fln flnVar) {
        this.a = flnVar;
    }

    private final void e(int i) {
        this.b = i;
        this.e = 0;
    }

    private final boolean f(edi ediVar, byte[] bArr, int i) {
        int iMin = Math.min(ediVar.a(), i - this.e);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            ediVar.L(iMin);
        } else {
            ediVar.F(bArr, this.e, iMin);
        }
        int i2 = this.e + iMin;
        this.e = i2;
        return i2 == i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    @Override // defpackage.fms
    public final void a(edi ediVar, int i) {
        long jB;
        long j;
        eci.e(this.f);
        int i2 = -1;
        int i3 = 2;
        ?? r5 = 0;
        if ((i & 1) != 0) {
            int i4 = this.b;
            if (i4 != 0 && i4 != 1) {
                if (i4 != 2) {
                    int i5 = this.c;
                    if (i5 != -1) {
                        edb.e("PesReader", a.cd(i5, "Unexpected start indicator: expected ", " more bytes"));
                    }
                    this.a.c(ediVar.c == 0);
                } else {
                    edb.e("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            e(1);
        }
        int i6 = i;
        while (ediVar.a() > 0) {
            int i7 = this.b;
            if (i7 == 0) {
                ediVar.L(ediVar.a());
            } else if (i7 != 1) {
                if (i7 != i3) {
                    int iA = ediVar.a();
                    int i8 = this.c;
                    int i9 = i8 == i2 ? r5 : iA - i8;
                    if (i9 > 0) {
                        iA -= i9;
                        ediVar.J(ediVar.b + iA);
                    }
                    fln flnVar = this.a;
                    flnVar.a(ediVar);
                    int i10 = this.c;
                    if (i10 != i2) {
                        int i11 = i10 - iA;
                        this.c = i11;
                        if (i11 == 0) {
                            flnVar.c(r5);
                            e(1);
                        }
                    }
                } else {
                    int iMin = Math.min(10, this.j);
                    edh edhVar = this.d;
                    if (f(ediVar, (byte[]) edhVar.c, iMin) && f(ediVar, null, this.j)) {
                        edhVar.l(r5);
                        if (this.g) {
                            edhVar.n(4);
                            long jD = edhVar.d(3);
                            edhVar.n(1);
                            int iD = edhVar.d(15) << 15;
                            edhVar.n(1);
                            long jD2 = edhVar.d(15);
                            edhVar.n(1);
                            if (this.i || !this.h) {
                                j = jD;
                            } else {
                                edhVar.n(4);
                                edhVar.n(1);
                                int iD2 = edhVar.d(15) << 15;
                                edhVar.n(1);
                                j = jD;
                                long jD3 = edhVar.d(15);
                                edhVar.n(1);
                                this.f.b((edhVar.d(3) << 30) | iD2 | jD3);
                                this.i = true;
                            }
                            jB = this.f.b((j << 30) | iD | jD2);
                        } else {
                            jB = -9223372036854775807L;
                        }
                        i6 |= true != this.k ? 0 : 4;
                        this.a.d(jB, i6);
                        e(3);
                    }
                }
            } else if (f(ediVar, (byte[]) this.d.c, 9)) {
                e(true != d() ? 0 : 2);
            }
            i2 = -1;
            i3 = 2;
            r5 = 0;
        }
    }

    @Override // defpackage.fms
    public final void b(edo edoVar, fdr fdrVar, fmr fmrVar) {
        this.f = edoVar;
        this.a.b(fdrVar, fmrVar);
    }

    @Override // defpackage.fms
    public final void c() {
        this.b = 0;
        this.e = 0;
        this.i = false;
        this.a.e();
    }

    public final boolean d() {
        edh edhVar = this.d;
        edhVar.l(0);
        int iD = edhVar.d(24);
        if (iD != 1) {
            edb.e("PesReader", a.cf(iD, "Unexpected start code prefix: "));
            this.c = -1;
            return false;
        }
        edhVar.n(8);
        int iD2 = edhVar.d(16);
        edhVar.n(5);
        this.k = edhVar.p();
        edhVar.n(2);
        this.g = edhVar.p();
        this.h = edhVar.p();
        edhVar.n(6);
        int iD3 = edhVar.d(8);
        this.j = iD3;
        if (iD2 == 0) {
            this.c = -1;
        } else {
            int i = (iD2 - 3) - iD3;
            this.c = i;
            if (i < 0) {
                edb.e("PesReader", a.cf(i, "Found negative packet payload size: "));
                this.c = -1;
            }
        }
        return true;
    }
}
