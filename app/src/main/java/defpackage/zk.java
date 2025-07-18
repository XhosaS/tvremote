package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class zk extends zn {
    public final zc a;
    zd b;

    public zk(yn ynVar) {
        super(ynVar);
        zc zcVar = new zc(this);
        this.a = zcVar;
        this.b = null;
        this.i.l = 6;
        this.j.l = 7;
        zcVar.l = 8;
        this.g = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.zn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 952
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zk.b():void");
    }

    @Override // defpackage.zn
    public final void c() {
        zc zcVar = this.i;
        if (zcVar.i) {
            this.d.ab = zcVar.f;
        }
    }

    @Override // defpackage.zn
    public final void d() {
        this.e = null;
        this.i.b();
        this.j.b();
        this.a.b();
        this.f.b();
        this.h = false;
    }

    @Override // defpackage.zn
    public final boolean e() {
        return this.k != 3 || this.d.u == 0;
    }

    @Override // defpackage.zn, defpackage.za
    public final void f() {
        float f;
        int i = this.l;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 3) {
            yn ynVar = this.d;
            m(ynVar.L, ynVar.N, 1);
            return;
        }
        zd zdVar = this.f;
        if (zdVar.c && !zdVar.i && this.k == 3) {
            yn ynVar2 = this.d;
            int i3 = ynVar2.u;
            if (i3 == 2) {
                yn ynVar3 = ynVar2.V;
                if (ynVar3 != null) {
                    if (ynVar3.i.f.i) {
                        zdVar.c((int) ((r5.f * ynVar2.B) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                zd zdVar2 = ynVar2.h.f;
                if (zdVar2.i) {
                    int i4 = ynVar2.Z;
                    if (i4 == -1 || i4 != 0) {
                        float f2 = zdVar2.f;
                        float f3 = ynVar2.Y;
                        f = f2 / f3;
                        zdVar.c((int) (f + 0.5f));
                    } else {
                        f = zdVar2.f * ynVar2.Y;
                        zdVar.c((int) (f + 0.5f));
                    }
                }
            }
        }
        zc zcVar = this.i;
        if (zcVar.c) {
            zc zcVar2 = this.j;
            if (zcVar2.c) {
                if (zcVar.i && zcVar2.i && zdVar.i) {
                    return;
                }
                if (!zdVar.i && this.k == 3) {
                    yn ynVar4 = this.d;
                    if (ynVar4.t == 0 && !ynVar4.I()) {
                        zc zcVar3 = (zc) zcVar.k.get(0);
                        zc zcVar4 = (zc) zcVar2.k.get(0);
                        int i5 = zcVar3.f + zcVar.e;
                        int i6 = zcVar4.f + zcVar2.e;
                        zcVar.c(i5);
                        zcVar2.c(i6);
                        zdVar.c(i6 - i5);
                        return;
                    }
                }
                if (!zdVar.i && this.k == 3 && this.c == 1) {
                    List list = zcVar.k;
                    if (list.size() > 0) {
                        List list2 = zcVar2.k;
                        if (list2.size() > 0) {
                            zc zcVar5 = (zc) list.get(0);
                            zc zcVar6 = (zc) list2.get(0);
                            int i7 = zcVar5.f + zcVar.e;
                            int i8 = zcVar6.f + zcVar2.e;
                            int i9 = zdVar.m;
                            int i10 = i8 - i7;
                            if (i10 < i9) {
                                zdVar.c(i10);
                            } else {
                                zdVar.c(i9);
                            }
                        }
                    }
                }
                if (zdVar.i) {
                    List list3 = zcVar.k;
                    if (list3.size() > 0) {
                        List list4 = zcVar2.k;
                        if (list4.size() > 0) {
                            zc zcVar7 = (zc) list3.get(0);
                            zc zcVar8 = (zc) list4.get(0);
                            int i11 = zcVar7.f;
                            int i12 = zcVar.e + i11;
                            int i13 = zcVar8.f;
                            int i14 = zcVar2.e + i13;
                            float f4 = this.d.ag;
                            if (zcVar7 == zcVar8) {
                                f4 = 0.5f;
                            }
                            if (zcVar7 != zcVar8) {
                                i13 = i14;
                            }
                            if (zcVar7 != zcVar8) {
                                i11 = i12;
                            }
                            zcVar.c((int) (i11 + 0.5f + (((i13 - i11) - zdVar.f) * f4)));
                            zcVar2.c(zcVar.f + zdVar.f);
                        }
                    }
                }
            }
        }
    }

    public final void g() {
        this.h = false;
        zc zcVar = this.i;
        zcVar.b();
        zcVar.i = false;
        zc zcVar2 = this.j;
        zcVar2.b();
        zcVar2.i = false;
        zc zcVar3 = this.a;
        zcVar3.b();
        zcVar3.i = false;
        this.f.i = false;
    }

    public final String toString() {
        return "VerticalRun ".concat(String.valueOf(this.d.aj));
    }
}
