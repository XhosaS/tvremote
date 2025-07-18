package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tmj implements oco {
    private static final zdy a = zdy.h("com/google/android/libraries/search/rendering/xuikit/runtime/logging/XUiKitFloggerElementsErrorLogger");
    private final tmm b;

    public tmj(tmm tmmVar) {
        tmmVar.getClass();
        this.b = tmmVar;
    }

    @Override // defpackage.oco
    public final /* synthetic */ void a(acwg acwgVar, String str, Object... objArr) {
        ocn.a(this, acwgVar, str, objArr);
    }

    @Override // defpackage.oco
    public final /* synthetic */ void b(acsw acswVar, oal oalVar, String str, Object... objArr) {
        d(acswVar, oalVar, null, str, objArr);
    }

    @Override // defpackage.oco
    public final /* synthetic */ void c(acwg acwgVar, oal oalVar, String str, Object... objArr) {
        ocn.b(this, acwgVar, oalVar, null, str, objArr);
    }

    @Override // defpackage.oco
    public final void d(acsw acswVar, oal oalVar, Throwable th, String str, Object... objArr) {
        acswVar.getClass();
        oalVar.getClass();
        zdv zdvVar = (zdv) a.a(mjc.b(mjc.a(acswVar))).p(th);
        zer zerVar = tmm.a;
        Level levelB = mjc.b(mjc.a(acswVar));
        levelB.getClass();
        acjl acjlVar = acjl.a;
        acjk acjkVar = new acjk();
        if ((acjkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acjkVar.y();
        }
        tmm tmmVar = this.b;
        acjl acjlVar2 = (acjl) acjkVar.b;
        acjlVar2.d = acswVar.E;
        acjlVar2.c |= 1;
        acji acjiVar = acji.a;
        acjh acjhVar = new acjh();
        tmmVar.b(acjhVar);
        tml tmlVar = new tml(tmmVar, levelB, acjkVar, acjhVar);
        acjk acjkVar2 = tmlVar.a;
        String strR = oalVar.R(null);
        if (strR != null) {
            if ((acjkVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acjkVar2.y();
            }
            acjl acjlVar3 = (acjl) acjkVar2.b;
            acjlVar3.c |= 2;
            acjlVar3.e = strR;
        }
        acxn acxnVarQ = oalVar.Q();
        if (acxnVarQ != null) {
            acxt acxtVar = acxnVarQ.c;
            if (acxtVar == null) {
                acxtVar = acxt.a;
            }
            if (acxtVar != null) {
                abxc abxcVar = addu.b;
                abxcVar.getClass();
                if (abxcVar.a != acxt.a) {
                    throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                }
                if (acxtVar.n.n(abxcVar.d)) {
                    abxcVar.getClass();
                    int i = ((addu) acay.a(acxtVar, abxcVar)).d;
                    if ((acjkVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        acjkVar2.y();
                    }
                    acjl acjlVar4 = (acjl) acjkVar2.b;
                    acjlVar4.c |= 4;
                    acjlVar4.f = i;
                }
            }
        }
        ((zdv) zdvVar.o(zerVar, tmlVar.a()).q("com/google/android/libraries/search/rendering/xuikit/runtime/logging/XUiKitFloggerElementsErrorLogger", "log", 40, "XUiKitFloggerElementsErrorLogger.kt")).M(str, objArr);
    }

    @Override // defpackage.oco
    public final /* synthetic */ void e(acwg acwgVar, oal oalVar, Throwable th, String str, Object... objArr) {
        ocn.b(this, acwgVar, oalVar, th, str, objArr);
    }

    @Override // defpackage.oco
    public final /* synthetic */ void f(acwg acwgVar, Throwable th, Object... objArr) {
        ocn.c(this, acwgVar, th, objArr);
    }
}
