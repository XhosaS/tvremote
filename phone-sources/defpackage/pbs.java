package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
class pbs extends tsg {
    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doBackward(Object obj) {
        uxf uxfVar = (uxf) obj;
        vtw vtwVarM = vob.a.m();
        if ((uxfVar.b & 1) != 0) {
            String str = uxfVar.c;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vob vobVar = (vob) vtwVarM.b;
            str.getClass();
            vobVar.b |= 1;
            vobVar.c = str;
        }
        if ((uxfVar.b & 2) != 0) {
            String str2 = uxfVar.d;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vob vobVar2 = (vob) vtwVarM.b;
            str2.getClass();
            vobVar2.b |= 2;
            vobVar2.d = str2;
        }
        if ((uxfVar.b & 4) != 0) {
            String str3 = uxfVar.e;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vob vobVar3 = (vob) vtwVarM.b;
            str3.getClass();
            vobVar3.b |= 4;
            vobVar3.e = str3;
        }
        if ((uxfVar.b & 8) != 0) {
            String str4 = uxfVar.f;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vob vobVar4 = (vob) vtwVarM.b;
            str4.getClass();
            vobVar4.b |= 8;
            vobVar4.f = str4;
        }
        if ((uxfVar.b & 16) != 0) {
            tsg tsgVarReverse = pcz.a.reverse();
            uxe uxeVarB = uxe.b(uxfVar.g);
            if (uxeVarB == null) {
                uxeVarB = uxe.UNKNOWN;
            }
            voa voaVar = (voa) tsgVarReverse.convert(uxeVarB);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vob vobVar5 = (vob) vtwVarM.b;
            vobVar5.g = voaVar.f;
            vobVar5.b |= 16;
        }
        Iterator<E> it = uxfVar.h.iterator();
        while (it.hasNext()) {
            vok vokVar = (vok) pcz.b.reverse().convert((uyl) it.next());
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vob vobVar6 = (vob) vtwVarM.b;
            vokVar.getClass();
            vun vunVar = vobVar6.h;
            if (!vunVar.c()) {
                vobVar6.h = vuc.s(vunVar);
            }
            vobVar6.h.add(vokVar);
        }
        if ((uxfVar.b & 32) != 0) {
            int i = uxfVar.i;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vob vobVar7 = (vob) vtwVarM.b;
            vobVar7.b |= 32;
            vobVar7.i = i;
        }
        return (vob) vtwVarM.r();
    }

    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doForward(Object obj) {
        vob vobVar = (vob) obj;
        vtw vtwVarM = uxf.a.m();
        if ((vobVar.b & 1) != 0) {
            String str = vobVar.c;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uxf uxfVar = (uxf) vtwVarM.b;
            str.getClass();
            uxfVar.b |= 1;
            uxfVar.c = str;
        }
        if ((vobVar.b & 2) != 0) {
            String str2 = vobVar.d;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uxf uxfVar2 = (uxf) vtwVarM.b;
            str2.getClass();
            uxfVar2.b |= 2;
            uxfVar2.d = str2;
        }
        if ((vobVar.b & 4) != 0) {
            String str3 = vobVar.e;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uxf uxfVar3 = (uxf) vtwVarM.b;
            str3.getClass();
            uxfVar3.b |= 4;
            uxfVar3.e = str3;
        }
        if ((vobVar.b & 8) != 0) {
            String str4 = vobVar.f;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uxf uxfVar4 = (uxf) vtwVarM.b;
            str4.getClass();
            uxfVar4.b |= 8;
            uxfVar4.f = str4;
        }
        if ((vobVar.b & 16) != 0) {
            tsg tsgVar = pcz.a;
            voa voaVarB = voa.b(vobVar.g);
            if (voaVarB == null) {
                voaVarB = voa.UNKNOWN;
            }
            uxe uxeVar = (uxe) tsgVar.convert(voaVarB);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uxf uxfVar5 = (uxf) vtwVarM.b;
            uxfVar5.g = uxeVar.f;
            uxfVar5.b |= 16;
        }
        Iterator<E> it = vobVar.h.iterator();
        while (it.hasNext()) {
            uyl uylVar = (uyl) pcz.b.convert((vok) it.next());
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uxf uxfVar6 = (uxf) vtwVarM.b;
            uylVar.getClass();
            vun vunVar = uxfVar6.h;
            if (!vunVar.c()) {
                uxfVar6.h = vuc.s(vunVar);
            }
            uxfVar6.h.add(uylVar);
        }
        if ((vobVar.b & 32) != 0) {
            int i = vobVar.i;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uxf uxfVar7 = (uxf) vtwVarM.b;
            uxfVar7.b |= 32;
            uxfVar7.i = i;
        }
        return (uxf) vtwVarM.r();
    }
}
