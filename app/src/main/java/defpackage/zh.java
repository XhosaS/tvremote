package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
class zh extends zn {
    public zh(yn ynVar) {
        super(ynVar);
    }

    private final void g(zc zcVar) {
        zc zcVar2 = this.i;
        zcVar2.j.add(zcVar);
        zcVar.k.add(zcVar2);
    }

    @Override // defpackage.zn
    public final void b() {
        yn ynVar = this.d;
        if (ynVar instanceof yj) {
            zc zcVar = this.i;
            zcVar.b = true;
            yj yjVar = (yj) ynVar;
            int i = yjVar.a;
            boolean z = yjVar.b;
            int i2 = 0;
            if (i == 0) {
                zcVar.l = 4;
                while (i2 < yjVar.at) {
                    yn ynVar2 = yjVar.as[i2];
                    if (z || ynVar2.ai != 8) {
                        zc zcVar2 = ynVar2.h.i;
                        zcVar2.j.add(zcVar);
                        zcVar.k.add(zcVar2);
                    }
                    i2++;
                }
                g(this.d.h.i);
                g(this.d.h.j);
                return;
            }
            if (i == 1) {
                zcVar.l = 5;
                while (i2 < yjVar.at) {
                    yn ynVar3 = yjVar.as[i2];
                    if (z || ynVar3.ai != 8) {
                        zc zcVar3 = ynVar3.h.j;
                        zcVar3.j.add(zcVar);
                        zcVar.k.add(zcVar3);
                    }
                    i2++;
                }
                g(this.d.h.i);
                g(this.d.h.j);
                return;
            }
            if (i == 2) {
                zcVar.l = 6;
                while (i2 < yjVar.at) {
                    yn ynVar4 = yjVar.as[i2];
                    if (z || ynVar4.ai != 8) {
                        zc zcVar4 = ynVar4.i.i;
                        zcVar4.j.add(zcVar);
                        zcVar.k.add(zcVar4);
                    }
                    i2++;
                }
                g(this.d.i.i);
                g(this.d.i.j);
                return;
            }
            if (i != 3) {
                return;
            }
            zcVar.l = 7;
            while (i2 < yjVar.at) {
                yn ynVar5 = yjVar.as[i2];
                if (z || ynVar5.ai != 8) {
                    zc zcVar5 = ynVar5.i.j;
                    zcVar5.j.add(zcVar);
                    zcVar.k.add(zcVar5);
                }
                i2++;
            }
            g(this.d.i.i);
            g(this.d.i.j);
        }
    }

    @Override // defpackage.zn
    public final void c() {
        yn ynVar = this.d;
        if (ynVar instanceof yj) {
            int i = ((yj) ynVar).a;
            if (i == 0 || i == 1) {
                ynVar.aa = this.i.f;
            } else {
                ynVar.ab = this.i.f;
            }
        }
    }

    @Override // defpackage.zn
    public final void d() {
        this.e = null;
        this.i.b();
    }

    @Override // defpackage.zn
    public final boolean e() {
        return false;
    }

    @Override // defpackage.zn, defpackage.za
    public final void f() {
        yj yjVar = (yj) this.d;
        int i = yjVar.a;
        zc zcVar = this.i;
        Iterator it = zcVar.k.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((zc) it.next()).f;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            zcVar.c(i3 + yjVar.c);
        } else {
            zcVar.c(i2 + yjVar.c);
        }
    }
}
