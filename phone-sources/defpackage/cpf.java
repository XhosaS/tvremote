package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cpf {
    public cpd a = null;
    int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    final /* synthetic */ cpg h;
    private int i;
    private cpc j;
    private cpc k;
    private cpc l;
    private cpc m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;

    public cpf(cpg cpgVar, int i, cpc cpcVar, cpc cpcVar2, cpc cpcVar3, cpc cpcVar4, int i2) {
        this.h = cpgVar;
        this.o = 0;
        this.q = 0;
        this.i = i;
        this.j = cpcVar;
        this.k = cpcVar2;
        this.l = cpcVar3;
        this.m = cpcVar4;
        this.n = cpgVar.aP;
        this.o = cpgVar.aL;
        this.p = cpgVar.aQ;
        this.q = cpgVar.aM;
        this.r = i2;
    }

    public final int a() {
        return this.i == 1 ? this.d - this.h.aB : this.d;
    }

    public final int b() {
        return this.i == 0 ? this.c - this.h.aA : this.c;
    }

    public final void c(cpd cpdVar) {
        if (this.i == 0) {
            cpg cpgVar = this.h;
            int iC = cpgVar.c(cpdVar, this.r);
            if (cpdVar.O() == 3) {
                this.g++;
                iC = 0;
            }
            this.c += iC + (cpdVar.ai != 8 ? cpgVar.aA : 0);
            int iA = cpgVar.a(cpdVar, this.r);
            if (this.a == null || this.b < iA) {
                this.a = cpdVar;
                this.b = iA;
                this.d = iA;
            }
        } else {
            cpg cpgVar2 = this.h;
            int iC2 = cpgVar2.c(cpdVar, this.r);
            int iA2 = cpgVar2.a(cpdVar, this.r);
            if (cpdVar.P() == 3) {
                this.g++;
                iA2 = 0;
            }
            this.d += iA2 + (cpdVar.ai != 8 ? cpgVar2.aB : 0);
            if (this.a == null || this.b < iC2) {
                this.a = cpdVar;
                this.b = iC2;
                this.c = iC2;
            }
        }
        this.f++;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(boolean r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 735
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpf.d(boolean, int, boolean):void");
    }

    public final void e(int i) {
        int i2 = this.g;
        if (i2 == 0) {
            return;
        }
        int i3 = this.f;
        int i4 = i / i2;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = this.e + i5;
            cpg cpgVar = this.h;
            if (i6 >= cpgVar.aI) {
                break;
            }
            cpd cpdVar = cpgVar.aH[i6];
            if (this.i == 0) {
                if (cpdVar != null && cpdVar.O() == 3 && cpdVar.t == 0) {
                    cpgVar.aa(cpdVar, 1, i4, cpdVar.P(), cpdVar.h());
                }
            } else if (cpdVar != null && cpdVar.P() == 3 && cpdVar.u == 0) {
                int i7 = i4;
                cpgVar.aa(cpdVar, cpdVar.O(), cpdVar.j(), 1, i7);
                i4 = i7;
            }
        }
        this.c = 0;
        this.d = 0;
        this.a = null;
        this.b = 0;
        int i8 = this.f;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.e + i9;
            cpg cpgVar2 = this.h;
            if (i10 >= cpgVar2.aI) {
                return;
            }
            cpd cpdVar2 = cpgVar2.aH[i10];
            if (this.i == 0) {
                int iJ = cpdVar2.j();
                int i11 = cpgVar2.aA;
                if (cpdVar2.ai == 8) {
                    i11 = 0;
                }
                this.c += iJ + i11;
                int iA = cpgVar2.a(cpdVar2, this.r);
                if (this.a == null || this.b < iA) {
                    this.a = cpdVar2;
                    this.b = iA;
                    this.d = iA;
                }
            } else {
                int iC = cpgVar2.c(cpdVar2, this.r);
                int iA2 = cpgVar2.a(cpdVar2, this.r);
                int i12 = cpgVar2.aB;
                if (cpdVar2.ai == 8) {
                    i12 = 0;
                }
                this.d += iA2 + i12;
                if (this.a == null || this.b < iC) {
                    this.a = cpdVar2;
                    this.b = iC;
                    this.c = iC;
                }
            }
        }
    }

    public final void f(int i, cpc cpcVar, cpc cpcVar2, cpc cpcVar3, cpc cpcVar4, int i2, int i3, int i4, int i5, int i6) {
        this.i = i;
        this.j = cpcVar;
        this.k = cpcVar2;
        this.l = cpcVar3;
        this.m = cpcVar4;
        this.n = i2;
        this.o = i3;
        this.p = i4;
        this.q = i5;
        this.r = i6;
    }
}
