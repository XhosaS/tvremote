package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pdo extends pck {
    static final tsl a = new pdh();
    static final tsg b = new pcw();

    @Override // defpackage.pck
    public final void a(vny vnyVar, vtw vtwVar) {
        tsl tslVar = a;
        vno vnoVar = vnyVar.c;
        if (vnoVar == null) {
            vnoVar = vno.a;
        }
        uzb uzbVar = (uzb) tslVar.apply(vnoVar);
        if ((uzbVar.b & 32) != 0) {
            uxw uxwVar = uzbVar.k;
            if (uxwVar == null) {
                uxwVar = uxw.a;
            }
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            uzb uzbVar2 = (uzb) vtwVar.b;
            uxwVar.getClass();
            uzbVar2.k = uxwVar;
            uzbVar2.b |= 32;
        }
    }

    @Override // defpackage.pck
    public final void b(vny vnyVar, vtw vtwVar) {
        tsl tslVar = a;
        vno vnoVar = vnyVar.c;
        if (vnoVar == null) {
            vnoVar = vno.a;
        }
        uzb uzbVar = (uzb) tslVar.apply(vnoVar);
        if ((uzbVar.b & 1) != 0) {
            wes wesVar = uzbVar.e;
            if (wesVar == null) {
                wesVar = wes.a;
            }
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            uzb uzbVar2 = (uzb) vtwVar.b;
            wesVar.getClass();
            uzbVar2.e = wesVar;
            uzbVar2.b |= 1;
        }
    }

    @Override // defpackage.pck
    public final void c(vny vnyVar, vtw vtwVar) {
        tsl tslVar = a;
        vno vnoVar = vnyVar.c;
        if (vnoVar == null) {
            vnoVar = vno.a;
        }
        uzb uzbVar = (uzb) tslVar.apply(vnoVar);
        if ((uzbVar.b & 8) != 0) {
            String str = uzbVar.h;
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            uzb uzbVar2 = (uzb) vtwVar.b;
            str.getClass();
            uzbVar2.b |= 8;
            uzbVar2.h = str;
        }
    }

    @Override // defpackage.pck
    public final void d(vny vnyVar, vtw vtwVar) {
        tsl tslVar = a;
        vno vnoVar = vnyVar.c;
        if (vnoVar == null) {
            vnoVar = vno.a;
        }
        uzb uzbVar = (uzb) tslVar.apply(vnoVar);
        if (uzbVar.c == 1) {
            String str = (String) uzbVar.d;
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            uzb uzbVar2 = (uzb) vtwVar.b;
            str.getClass();
            uzbVar2.c = 1;
            uzbVar2.d = str;
        }
    }

    @Override // defpackage.pck
    public final void e(vny vnyVar, vtw vtwVar) {
        tsl tslVar = a;
        vno vnoVar = vnyVar.c;
        if (vnoVar == null) {
            vnoVar = vno.a;
        }
        uzb uzbVar = (uzb) tslVar.apply(vnoVar);
        if (uzbVar.c == 8) {
            String str = (String) uzbVar.d;
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            uzb uzbVar2 = (uzb) vtwVar.b;
            str.getClass();
            uzbVar2.c = 8;
            uzbVar2.d = str;
        }
    }

    @Override // defpackage.pck
    public final void f(vny vnyVar, vtw vtwVar) {
        tsl tslVar = a;
        vno vnoVar = vnyVar.c;
        if (vnoVar == null) {
            vnoVar = vno.a;
        }
        uzb uzbVar = (uzb) tslVar.apply(vnoVar);
        if ((uzbVar.b & 4) != 0) {
            String str = uzbVar.g;
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            uzb uzbVar2 = (uzb) vtwVar.b;
            str.getClass();
            uzbVar2.b |= 4;
            uzbVar2.g = str;
        }
    }

    @Override // defpackage.pck
    public final void g(vny vnyVar, vtw vtwVar) {
        boolean z = vnyVar.e;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        uzb uzbVar = (uzb) vtwVar.b;
        uzb uzbVar2 = uzb.a;
        uzbVar.b |= 16;
        uzbVar.i = z;
    }

    @Override // defpackage.pck
    public final void h(vny vnyVar, vtw vtwVar) {
        tsl tslVar = a;
        vno vnoVar = vnyVar.c;
        if (vnoVar == null) {
            vnoVar = vno.a;
        }
        vun vunVar = ((uzb) tslVar.apply(vnoVar)).j;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        uzb uzbVar = (uzb) vtwVar.b;
        uzbVar.b();
        vsf.h(vunVar, uzbVar.j);
    }

    @Override // defpackage.pck
    public final void i(vny vnyVar, vtw vtwVar) {
        tsl tslVar = a;
        vno vnoVar = vnyVar.c;
        if (vnoVar == null) {
            vnoVar = vno.a;
        }
        uzb uzbVar = (uzb) tslVar.apply(vnoVar);
        if ((uzbVar.b & 128) != 0) {
            int iBm = a.bm(uzbVar.m);
            if (iBm == 0) {
                iBm = 1;
            }
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            uzb uzbVar2 = (uzb) vtwVar.b;
            uzbVar2.m = iBm - 1;
            uzbVar2.b |= 128;
        }
    }

    @Override // defpackage.pck
    public final void j(vny vnyVar, vtw vtwVar) {
        tsl tslVar = a;
        vno vnoVar = vnyVar.c;
        if (vnoVar == null) {
            vnoVar = vno.a;
        }
        uzb uzbVar = (uzb) tslVar.apply(vnoVar);
        if ((uzbVar.b & 2) != 0) {
            wes wesVar = uzbVar.f;
            if (wesVar == null) {
                wesVar = wes.a;
            }
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            uzb uzbVar2 = (uzb) vtwVar.b;
            wesVar.getClass();
            uzbVar2.f = wesVar;
            uzbVar2.b |= 2;
        }
    }

    @Override // defpackage.pck
    public final void k(vny vnyVar, vtw vtwVar) {
        tsl tslVar = a;
        vno vnoVar = vnyVar.c;
        if (vnoVar == null) {
            vnoVar = vno.a;
        }
        uzb uzbVar = (uzb) tslVar.apply(vnoVar);
        if (uzbVar.c == 9) {
            Integer num = (Integer) uzbVar.d;
            num.intValue();
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            uzb uzbVar2 = (uzb) vtwVar.b;
            uzbVar2.c = 9;
            uzbVar2.d = num;
        }
    }
}
