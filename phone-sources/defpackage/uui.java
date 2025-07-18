package defpackage;

import java.nio.charset.Charset;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uui {
    public static final Charset a;
    public static final uuh b;
    private static final uda c;
    private final uuw d;

    static {
        vtw vtwVarM = uda.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        uda udaVar = (uda) vucVar;
        udaVar.b |= 1;
        udaVar.c = 0L;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        uda.c((uda) vtwVarM.b);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        uda.b((uda) vtwVarM.b);
        c = (uda) vtwVarM.r();
        a = Charset.forName("UTF-8");
        b = uuh.a().a();
    }

    public uui(String str, String str2) {
        vtw vtwVarM = uux.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        uux uuxVar = (uux) vucVar;
        str.getClass();
        uuxVar.b |= 1;
        uuxVar.c = str;
        if (str2 != null) {
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            uux uuxVar2 = (uux) vtwVarM.b;
            uuxVar2.b |= 2;
            uuxVar2.d = str2;
        }
        vtw vtwVarM2 = uuw.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        uuw uuwVar = (uuw) vtwVarM2.b;
        uux uuxVar3 = (uux) vtwVarM.r();
        uuxVar3.getClass();
        uuwVar.c = uuxVar3;
        uuwVar.b |= 1;
        vtw vtwVarM3 = uva.a.m();
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        uva uvaVar = (uva) vtwVarM3.b;
        uvaVar.c = 0;
        uvaVar.b |= 1;
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        uuw uuwVar2 = (uuw) vtwVarM2.b;
        uva uvaVar2 = (uva) vtwVarM3.r();
        uvaVar2.getClass();
        uuwVar2.d = uvaVar2;
        uuwVar2.b |= 2;
        this.d = (uuw) vtwVarM2.r();
    }

    public static Object a(tvu tvuVar, tuy tuyVar) {
        return tvuVar.l().d(tuyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.vtw c(defpackage.udb r7, int r8, defpackage.uuh r9, java.lang.Object... r10) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uui.c(udb, int, uuh, java.lang.Object[]):vtw");
    }

    public final vtw b(tvu tvuVar, int i, uuh uuhVar) {
        String name;
        udb udbVar;
        yzi yziVar;
        if (tvuVar.l().d(roe.a) != null) {
            vtw vtwVarM = udb.a.m();
            uda udaVar = c;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            udb udbVar2 = (udb) vtwVarM.b;
            udaVar.getClass();
            udbVar2.c = udaVar;
            udbVar2.b |= 1;
            int iIntValue = tvuVar.p().intValue();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            udb udbVar3 = (udb) vtwVarM.b;
            udbVar3.b |= 4;
            udbVar3.e = iIntValue;
            String strB = tvuVar.f().b();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            udb udbVar4 = (udb) vtwVarM.b;
            strB.getClass();
            udbVar4.b |= 8;
            udbVar4.f = strB;
            String strD = tvuVar.f().d();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            udb udbVar5 = (udb) vtwVarM.b;
            strD.getClass();
            udbVar5.b |= 16;
            udbVar5.g = strD;
            int iA = tvuVar.f().a();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            udb udbVar6 = (udb) vtwVarM.b;
            udbVar6.b |= 32;
            udbVar6.h = iA;
            String strE = tvuVar.f().e();
            if (strE != null) {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                udb udbVar7 = (udb) vtwVarM.b;
                udbVar7.b |= 64;
                udbVar7.i = strE;
            }
            String str = (String) tvuVar.l().d(roe.b);
            if (str != null) {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                udb udbVar8 = (udb) vtwVarM.b;
                udbVar8.b |= 2;
                udbVar8.d = str;
            } else {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                udb udbVar9 = (udb) vtwVarM.b;
                udbVar9.b |= 2;
                udbVar9.d = "Unknown native thread";
            }
            tww twwVarM = tvuVar.m();
            if (twwVarM != null) {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                String str2 = twwVarM.b;
                udb udbVar10 = (udb) vtwVarM.b;
                udbVar10.b |= 256;
                udbVar10.j = str2;
            } else {
                String string = tvuVar.n().toString();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                udb udbVar11 = (udb) vtwVarM.b;
                string.getClass();
                udbVar11.b |= 256;
                udbVar11.j = string;
            }
            udbVar = (udb) vtwVarM.r();
        } else {
            tww twwVarM2 = tvuVar.m();
            if (twwVarM2 != null) {
                name = twwVarM2.b;
            } else {
                Object objN = tvuVar.n();
                name = objN instanceof String ? (String) objN : objN != null ? objN.getClass().getName() : "null";
            }
            Throwable th = i == 2 ? (Throwable) a(tvuVar, tul.a) : null;
            tuq tuqVarF = tvuVar.f();
            Level levelP = tvuVar.p();
            String strB2 = tuqVarF.b();
            String strD2 = tuqVarF.d();
            int iA2 = tuqVarF.a();
            vtw vtwVarM2 = udb.a.m();
            uda udaVar2 = c;
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            udb udbVar12 = (udb) vtwVarM2.b;
            udaVar2.getClass();
            udbVar12.c = udaVar2;
            udbVar12.b |= 1;
            String name2 = Thread.currentThread().getName();
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            udb udbVar13 = (udb) vtwVarM2.b;
            name2.getClass();
            udbVar13.b |= 2;
            udbVar13.d = name2;
            int iIntValue2 = levelP.intValue();
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            vuc vucVar = vtwVarM2.b;
            udb udbVar14 = (udb) vucVar;
            udbVar14.b |= 4;
            udbVar14.e = iIntValue2;
            if (!vucVar.A()) {
                vtwVarM2.u();
            }
            vuc vucVar2 = vtwVarM2.b;
            udb udbVar15 = (udb) vucVar2;
            strB2.getClass();
            udbVar15.b |= 8;
            udbVar15.f = strB2;
            if (!vucVar2.A()) {
                vtwVarM2.u();
            }
            vuc vucVar3 = vtwVarM2.b;
            udb udbVar16 = (udb) vucVar3;
            strD2.getClass();
            udbVar16.b |= 16;
            udbVar16.g = strD2;
            if (!vucVar3.A()) {
                vtwVarM2.u();
            }
            vuc vucVar4 = vtwVarM2.b;
            udb udbVar17 = (udb) vucVar4;
            udbVar17.b |= 32;
            udbVar17.h = iA2;
            if (name != null) {
                if (!vucVar4.A()) {
                    vtwVarM2.u();
                }
                udb udbVar18 = (udb) vtwVarM2.b;
                udbVar18.b |= 256;
                udbVar18.j = name;
            }
            if (th != null) {
                vtw vtwVarAw = uuhVar.c ? sfy.aw(th, false) : sfy.ay(th);
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                udb udbVar19 = (udb) vtwVarM2.b;
                udg udgVar = (udg) vtwVarAw.r();
                udgVar.getClass();
                udbVar19.k = udgVar;
                udbVar19.b |= 1024;
            }
            udbVar = (udb) vtwVarM2.r();
        }
        vtw vtwVarC = tvuVar.m() != null ? c(udbVar, i, uuhVar, tvuVar.K()) : c(udbVar, i, uuhVar, new Object[0]);
        if (i == 2 && uuhVar.a && (yziVar = (yzi) a(tvuVar, uuk.b)) != null) {
            if (!vtwVarC.b.A()) {
                vtwVarC.u();
            }
            uuz uuzVar = (uuz) vtwVarC.b;
            uuz uuzVar2 = uuz.a;
            uuzVar.e = yziVar;
            uuzVar.b |= 4;
        }
        return vtwVarC;
    }
}
