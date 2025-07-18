package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpx extends cpz {
    public final cpq a;
    cpr b;

    public cpx(cpd cpdVar) {
        super(cpdVar);
        cpq cpqVar = new cpq(this);
        this.a = cpqVar;
        this.b = null;
        this.i.l = 6;
        this.j.l = 7;
        cpqVar.l = 8;
        this.g = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.cpz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 959
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpx.b():void");
    }

    @Override // defpackage.cpz
    public final void c() {
        cpq cpqVar = this.i;
        if (cpqVar.i) {
            this.d.ab = cpqVar.f;
        }
    }

    @Override // defpackage.cpz
    public final void d() {
        this.e = null;
        this.i.b();
        this.j.b();
        this.a.b();
        this.f.b();
        this.h = false;
    }

    @Override // defpackage.cpz
    public final boolean e() {
        return this.k != 3 || this.d.u == 0;
    }

    @Override // defpackage.cpz, defpackage.cpo
    public final void f() {
        float f;
        int i = this.l;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 3) {
            cpd cpdVar = this.d;
            m(cpdVar.L, cpdVar.N, 1);
            return;
        }
        cpr cprVar = this.f;
        if (cprVar.c && !cprVar.i && this.k == 3) {
            cpd cpdVar2 = this.d;
            int i3 = cpdVar2.u;
            if (i3 == 2) {
                cpd cpdVar3 = cpdVar2.V;
                if (cpdVar3 != null) {
                    if (cpdVar3.i.f.i) {
                        cprVar.c((int) ((r5.f * cpdVar2.B) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                cpr cprVar2 = cpdVar2.h.f;
                if (cprVar2.i) {
                    int i4 = cpdVar2.Z;
                    if (i4 == -1 || i4 != 0) {
                        float f2 = cprVar2.f;
                        float f3 = cpdVar2.Y;
                        f = f2 / f3;
                        cprVar.c((int) (f + 0.5f));
                    } else {
                        f = cprVar2.f * cpdVar2.Y;
                        cprVar.c((int) (f + 0.5f));
                    }
                }
            }
        }
        cpq cpqVar = this.i;
        if (cpqVar.c) {
            cpq cpqVar2 = this.j;
            if (cpqVar2.c) {
                if (cpqVar.i && cpqVar2.i && cprVar.i) {
                    return;
                }
                if (!cprVar.i && this.k == 3) {
                    cpd cpdVar4 = this.d;
                    if (cpdVar4.t == 0 && !cpdVar4.K()) {
                        cpq cpqVar3 = (cpq) cpqVar.k.get(0);
                        cpq cpqVar4 = (cpq) cpqVar2.k.get(0);
                        int i5 = cpqVar3.f + cpqVar.e;
                        int i6 = cpqVar4.f + cpqVar2.e;
                        cpqVar.c(i5);
                        cpqVar2.c(i6);
                        cprVar.c(i6 - i5);
                        return;
                    }
                }
                if (!cprVar.i && this.k == 3 && this.c == 1) {
                    List list = cpqVar.k;
                    if (list.size() > 0) {
                        List list2 = cpqVar2.k;
                        if (list2.size() > 0) {
                            cpq cpqVar5 = (cpq) list.get(0);
                            cpq cpqVar6 = (cpq) list2.get(0);
                            int i7 = cpqVar5.f + cpqVar.e;
                            int i8 = cpqVar6.f + cpqVar2.e;
                            int i9 = cprVar.m;
                            int i10 = i8 - i7;
                            if (i10 < i9) {
                                cprVar.c(i10);
                            } else {
                                cprVar.c(i9);
                            }
                        }
                    }
                }
                if (cprVar.i) {
                    List list3 = cpqVar.k;
                    if (list3.size() > 0) {
                        List list4 = cpqVar2.k;
                        if (list4.size() > 0) {
                            cpq cpqVar7 = (cpq) list3.get(0);
                            cpq cpqVar8 = (cpq) list4.get(0);
                            int i11 = cpqVar7.f;
                            int i12 = cpqVar.e + i11;
                            int i13 = cpqVar8.f;
                            int i14 = cpqVar2.e + i13;
                            float f4 = this.d.ag;
                            if (cpqVar7 == cpqVar8) {
                                f4 = 0.5f;
                            }
                            if (cpqVar7 != cpqVar8) {
                                i13 = i14;
                            }
                            if (cpqVar7 != cpqVar8) {
                                i11 = i12;
                            }
                            cpqVar.c((int) (i11 + 0.5f + (((i13 - i11) - cprVar.f) * f4)));
                            cpqVar2.c(cpqVar.f + cprVar.f);
                        }
                    }
                }
            }
        }
    }

    public final void g() {
        this.h = false;
        cpq cpqVar = this.i;
        cpqVar.b();
        cpqVar.i = false;
        cpq cpqVar2 = this.j;
        cpqVar2.b();
        cpqVar2.i = false;
        cpq cpqVar3 = this.a;
        cpqVar3.b();
        cpqVar3.i = false;
        this.f.i = false;
    }

    public final String toString() {
        return "VerticalRun ".concat(String.valueOf(this.d.aj));
    }
}
