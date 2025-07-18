package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flz implements fln {
    private final String a;
    private final int b;
    private final String c = "video/mp2t";
    private final edi d;
    private final edh e;
    private fel f;
    private String g;
    private dze h;
    private int i;
    private int j;
    private int k;
    private int l;
    private long m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private long s;
    private int t;
    private long u;
    private int v;
    private String w;

    public flz(String str, int i) {
        this.a = str;
        this.b = i;
        edi ediVar = new edi(1024);
        this.d = ediVar;
        this.e = new edh(ediVar.a);
        this.m = -9223372036854775807L;
    }

    private final int f(edh edhVar) {
        int iA = edhVar.a();
        gb gbVarB = fcu.b(edhVar, true);
        this.w = (String) gbVarB.c;
        this.t = gbVarB.a;
        this.v = gbVarB.b;
        return iA - edhVar.a();
    }

    private static long g(edh edhVar) {
        return edhVar.d((edhVar.d(2) + 1) * 8);
    }

    @Override // defpackage.fln
    public final void a(edi ediVar) throws eaf {
        int i;
        int i2;
        int iD;
        boolean zP;
        eci.e(this.f);
        while (ediVar.a() > 0) {
            int i3 = this.i;
            if (i3 != 0) {
                if (i3 == 1) {
                    int iJ = ediVar.j();
                    if ((iJ & 224) == 224) {
                        this.l = iJ;
                        this.i = 2;
                    } else if (iJ != 86) {
                        this.i = 0;
                    }
                } else if (i3 != 2) {
                    int iMin = Math.min(ediVar.a(), this.k - this.j);
                    edh edhVar = this.e;
                    ediVar.F((byte[]) edhVar.c, this.j, iMin);
                    int i4 = this.j + iMin;
                    this.j = i4;
                    if (i4 == this.k) {
                        edhVar.l(0);
                        if (edhVar.p()) {
                            if (this.n) {
                            }
                            this.i = 0;
                        } else {
                            this.n = true;
                            int iD2 = edhVar.d(1);
                            if (iD2 == 1) {
                                iD = edhVar.d(1);
                                i2 = 1;
                            } else {
                                i2 = iD2;
                                iD = 0;
                            }
                            this.o = iD;
                            if (iD != 0) {
                                throw new eaf(null, null, true, 1);
                            }
                            if (i2 == 1) {
                                g(edhVar);
                                i2 = 1;
                            }
                            if (!edhVar.p()) {
                                throw new eaf(null, null, true, 1);
                            }
                            this.p = edhVar.d(6);
                            int iD3 = edhVar.d(4);
                            int iD4 = edhVar.d(3);
                            if (iD3 != 0 || iD4 != 0) {
                                throw new eaf(null, null, true, 1);
                            }
                            if (i2 == 0) {
                                int iC = edhVar.c();
                                int iF = f(edhVar);
                                edhVar.l(iC);
                                byte[] bArr = new byte[(iF + 7) / 8];
                                edhVar.q(bArr, iF);
                                dzd dzdVar = new dzd();
                                dzdVar.a = this.g;
                                dzdVar.a(this.c);
                                dzdVar.d("audio/mp4a-latm");
                                dzdVar.j = this.w;
                                dzdVar.E = this.v;
                                dzdVar.F = this.t;
                                dzdVar.p = Collections.singletonList(bArr);
                                dzdVar.d = this.a;
                                dzdVar.f = this.b;
                                dze dzeVar = new dze(dzdVar);
                                if (!dzeVar.equals(this.h)) {
                                    this.h = dzeVar;
                                    this.u = 1024000000 / dzeVar.ar;
                                    this.f.b(dzeVar);
                                }
                            } else {
                                edhVar.n(((int) g(edhVar)) - f(edhVar));
                            }
                            int iD5 = edhVar.d(3);
                            this.q = iD5;
                            if (iD5 == 0) {
                                edhVar.n(8);
                            } else if (iD5 == 1) {
                                edhVar.n(9);
                            } else if (iD5 == 3 || iD5 == 4 || iD5 == 5) {
                                edhVar.n(6);
                            } else {
                                if (iD5 != 6 && iD5 != 7) {
                                    throw new IllegalStateException();
                                }
                                edhVar.n(1);
                            }
                            boolean zP2 = edhVar.p();
                            this.r = zP2;
                            this.s = 0L;
                            if (zP2) {
                                if (i2 != 1) {
                                    do {
                                        zP = edhVar.p();
                                        this.s = (this.s << 8) + edhVar.d(8);
                                    } while (zP);
                                } else {
                                    this.s = g(edhVar);
                                }
                            }
                            if (edhVar.p()) {
                                edhVar.n(8);
                            }
                        }
                        if (this.o != 0) {
                            throw new eaf(null, null, true, 1);
                        }
                        if (this.p != 0) {
                            throw new eaf(null, null, true, 1);
                        }
                        if (this.q != 0) {
                            throw new eaf(null, null, true, 1);
                        }
                        int i5 = 0;
                        while (true) {
                            int iD6 = edhVar.d(8);
                            i = i5 + iD6;
                            if (iD6 != 255) {
                                break;
                            } else {
                                i5 = i;
                            }
                        }
                        int iC2 = edhVar.c();
                        if ((iC2 & 7) == 0) {
                            this.d.K(iC2 >> 3);
                        } else {
                            edi ediVar2 = this.d;
                            edhVar.q(ediVar2.a, i * 8);
                            ediVar2.K(0);
                        }
                        this.f.c(this.d, i);
                        a.ab(this.m != -9223372036854775807L);
                        this.f.e(this.m, 1, i, 0, null);
                        this.m += this.u;
                        if (this.r) {
                            edhVar.n((int) this.s);
                        }
                        this.i = 0;
                    } else {
                        continue;
                    }
                } else {
                    int iJ2 = ((this.l & (-225)) << 8) | ediVar.j();
                    this.k = iJ2;
                    edi ediVar3 = this.d;
                    if (iJ2 > ediVar3.a.length) {
                        ediVar3.G(iJ2);
                        this.e.j(ediVar3.a);
                    }
                    this.j = 0;
                    this.i = 3;
                }
            } else if (ediVar.j() == 86) {
                this.i = 1;
            }
        }
    }

    @Override // defpackage.fln
    public final void b(fdr fdrVar, fmr fmrVar) {
        fmrVar.c();
        this.f = fdrVar.dq(fmrVar.a(), 1);
        this.g = fmrVar.b();
    }

    @Override // defpackage.fln
    public final void d(long j, int i) {
        this.m = j;
    }

    @Override // defpackage.fln
    public final void e() {
        this.i = 0;
        this.m = -9223372036854775807L;
        this.n = false;
    }

    @Override // defpackage.fln
    public final void c(boolean z) {
    }
}
