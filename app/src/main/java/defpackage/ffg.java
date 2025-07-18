package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffg extends fff {
    final /* synthetic */ ffj i;

    public ffg(ffj ffjVar) {
        this.i = ffjVar;
    }

    @Override // defpackage.fff
    public final ffm a() {
        return this.i.f;
    }

    @Override // defpackage.fff
    public final void c() {
        this.i.L();
    }

    @Override // defpackage.fff
    public final void d() {
        int iA;
        ffj ffjVar = this.i;
        hkx hkxVar = ffjVar.h;
        if (hkxVar != null) {
            aeal aealVar = ((hky) hkxVar).e;
            String str = null;
            if (aealVar != null && (aealVar.b & 512) != 0) {
                adxe adxeVar = aealVar.j;
                if (adxeVar == null) {
                    adxeVar = adxe.a;
                }
                Iterator it = adxeVar.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    adxc adxcVar = (adxc) it.next();
                    int i = adxcVar.b;
                    if ((i & 1) != 0 && (i & 2) != 0 && (iA = adxb.a(adxcVar.c)) != 0 && iA == 6) {
                        str = adxcVar.d;
                        break;
                    }
                }
            }
            if (str == null || str.length() <= 0) {
                return;
            }
            ffjVar.f.m(str);
        }
    }
}
