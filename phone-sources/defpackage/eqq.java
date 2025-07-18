package defpackage;

import com.google.common.collect.Iterables;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eqq implements ewx {
    public final int a;
    public final eqt b;
    public int c = -1;

    public eqq(eqt eqtVar, int i) {
        this.b = eqtVar;
        this.a = i;
    }

    private final boolean f() {
        int i = this.c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // defpackage.ewx
    public final int a(long j) throws Throwable {
        if (!f()) {
            return 0;
        }
        eqt eqtVar = this.b;
        int i = this.c;
        if (eqtVar.u()) {
            return 0;
        }
        eqs eqsVar = eqtVar.h[i];
        int iL = eqsVar.l(j, eqtVar.A);
        eqm eqmVar = (eqm) Iterables.getLast(eqtVar.d, null);
        if (eqmVar != null && !eqmVar.g()) {
            iL = Math.min(iL, eqmVar.a(i) - eqsVar.k());
        }
        eqsVar.D(iL);
        return iL;
    }

    @Override // defpackage.ewx
    public final void b() throws IOException {
        int i = this.c;
        if (i == -2) {
            eqt eqtVar = this.b;
            throw new eqw(eqtVar.f().b(this.a).c(0).Y);
        }
        if (i == -1) {
            this.b.l();
        } else if (i != -3) {
            eqt eqtVar2 = this.b;
            eqtVar2.l();
            eqtVar2.h[i].x();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r6 = this;
            int r0 = r6.c
            r1 = 1
            r2 = -1
            if (r0 != r2) goto L8
            r0 = r1
            goto L9
        L8:
            r0 = 0
        L9:
            defpackage.a.H(r0)
            eqt r0 = r6.b
            r0.h()
            int[] r3 = r0.t
            defpackage.a.aq(r3)
            int[] r3 = r0.t
            int r4 = r6.a
            r3 = r3[r4]
            r5 = -2
            if (r3 != r2) goto L2f
            java.util.Set r1 = r0.s
            exi r0 = r0.r
            eba r0 = r0.b(r4)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L35
            r3 = -3
            goto L39
        L2f:
            boolean[] r0 = r0.v
            boolean r2 = r0[r3]
            if (r2 == 0) goto L37
        L35:
            r3 = r5
            goto L39
        L37:
            r0[r3] = r1
        L39:
            r6.c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqq.c():void");
    }

    @Override // defpackage.ewx
    public final boolean dv() {
        int i = this.c;
        if (i == -3) {
            return true;
        }
        if (f()) {
            eqt eqtVar = this.b;
            if (!eqtVar.u() && eqtVar.h[i].F(eqtVar.A)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ewx
    public final int e(hig higVar, ehk ehkVar, int i) {
        dze dzeVar;
        int i2 = this.c;
        if (i2 == -3) {
            ehkVar.addFlag(4);
            return -4;
        }
        if (!f()) {
            return -3;
        }
        eqt eqtVar = this.b;
        if (eqtVar.u()) {
            return -3;
        }
        ArrayList arrayList = eqtVar.d;
        int i3 = 0;
        if (!arrayList.isEmpty()) {
            int i4 = 0;
            loop0: while (i4 < arrayList.size() - 1) {
                int i5 = ((eqm) arrayList.get(i4)).a;
                int length = eqtVar.h.length;
                for (int i6 = 0; i6 < length; i6++) {
                    if (eqtVar.v[i6] && eqtVar.h[i6].r() == i5) {
                        break loop0;
                    }
                }
                i4++;
            }
            edt.af(arrayList, 0, i4);
            eqm eqmVar = (eqm) arrayList.get(0);
            dze dzeVar2 = eqmVar.s;
            if (!dzeVar2.equals(eqtVar.p)) {
                eph ephVar = eqtVar.D;
                int i7 = eqtVar.a;
                int i8 = eqmVar.t;
                Object obj = eqmVar.u;
                ephVar.m(i7, dzeVar2, i8, eqmVar.v);
            }
            eqtVar.p = dzeVar2;
        }
        if (!arrayList.isEmpty() && !((eqm) arrayList.get(0)).g()) {
            return -3;
        }
        int iJ = eqtVar.h[i2].J(higVar, ehkVar, i, eqtVar.A);
        if (iJ == -5) {
            Object objC = higVar.a;
            objC.getClass();
            if (i2 == eqtVar.k) {
                int iW = sfy.W(eqtVar.h[i2].r());
                while (i3 < arrayList.size() && ((eqm) arrayList.get(i3)).a != iW) {
                    i3++;
                }
                if (i3 < arrayList.size()) {
                    dzeVar = ((eqm) arrayList.get(i3)).s;
                } else {
                    dzeVar = eqtVar.o;
                    dzeVar.getClass();
                }
                objC = ((dze) objC).c(dzeVar);
            }
            higVar.a = objC;
        }
        return iJ;
    }
}
