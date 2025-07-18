package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class pce extends tsg {
    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doBackward(Object obj) {
        uyk uykVarB;
        uyl uylVar = (uyl) obj;
        vtw vtwVarM = vok.a.m();
        if ((uylVar.b & 1) != 0) {
            String str = uylVar.e;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vok vokVar = (vok) vtwVarM.b;
            str.getClass();
            vokVar.b |= 1;
            vokVar.e = str;
        }
        if (uylVar.c == 2 && sij.Q(2) == 1) {
            String str2 = (String) uylVar.d;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vok vokVar2 = (vok) vtwVarM.b;
            str2.getClass();
            vokVar2.c = 2;
            vokVar2.d = str2;
        }
        if (uylVar.c == 4 && sij.Q(4) == 2) {
            Integer num = (Integer) uylVar.d;
            num.intValue();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vok vokVar3 = (vok) vtwVarM.b;
            vokVar3.c = 4;
            vokVar3.d = num;
        }
        if (uylVar.c == 5 && sij.Q(5) == 3) {
            Boolean bool = (Boolean) uylVar.d;
            bool.booleanValue();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vok vokVar4 = (vok) vtwVarM.b;
            vokVar4.c = 5;
            vokVar4.d = bool;
        }
        if (uylVar.c == 3 && sij.Q(3) == 4) {
            tsg tsgVarReverse = pdk.a.reverse();
            if (uylVar.c != 3 || (uykVarB = uyk.b(((Integer) uylVar.d).intValue())) == null) {
                uykVarB = uyk.CLIENT_VALUE_UNKNOWN;
            }
            voj vojVar = (voj) tsgVarReverse.convert(uykVarB);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vok vokVar5 = (vok) vtwVarM.b;
            vokVar5.d = Integer.valueOf(vojVar.c);
            vokVar5.c = 3;
        }
        return (vok) vtwVarM.r();
    }

    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doForward(Object obj) {
        vok vokVar = (vok) obj;
        vtw vtwVarM = uyl.a.m();
        if ((vokVar.b & 1) != 0) {
            String str = vokVar.e;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uyl uylVar = (uyl) vtwVarM.b;
            str.getClass();
            uylVar.b |= 1;
            uylVar.e = str;
        }
        if (vokVar.c == 2 && a.g(2) == 3) {
            String str2 = (String) vokVar.d;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uyl uylVar2 = (uyl) vtwVarM.b;
            str2.getClass();
            uylVar2.c = 2;
            uylVar2.d = str2;
        }
        if (vokVar.c == 4 && a.g(4) == 5) {
            Integer num = (Integer) vokVar.d;
            num.intValue();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uyl uylVar3 = (uyl) vtwVarM.b;
            uylVar3.c = 4;
            uylVar3.d = num;
        }
        if (vokVar.c == 5 && a.g(5) == 6) {
            Boolean bool = (Boolean) vokVar.d;
            bool.booleanValue();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uyl uylVar4 = (uyl) vtwVarM.b;
            uylVar4.c = 5;
            uylVar4.d = bool;
        }
        if (vokVar.c == 3 && a.g(3) == 4) {
            tsg tsgVar = pdk.a;
            voj vojVarB = voj.b(((Integer) vokVar.d).intValue());
            if (vojVarB == null) {
                vojVarB = voj.CLIENT_VALUE_UNKNOWN;
            }
            uyk uykVar = (uyk) tsgVar.convert(vojVarB);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uyl uylVar5 = (uyl) vtwVarM.b;
            uylVar5.d = Integer.valueOf(uykVar.c);
            uylVar5.c = 3;
        }
        return (uyl) vtwVarM.r();
    }
}
