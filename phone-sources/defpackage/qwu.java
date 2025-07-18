package defpackage;

import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qwu {
    public static final String a = "qwu";
    public final qwn b;
    public final qyb c;
    private final cr d;
    private final by e;
    private final qyn f;

    public qwu(cr crVar, qwn qwnVar, by byVar, qyb qybVar, qyn qynVar) {
        this.d = crVar;
        this.b = qwnVar;
        this.e = byVar;
        this.c = qybVar;
        this.f = qynVar;
        AppCompatDialogFragment appCompatDialogFragmentD = d(crVar);
        if (appCompatDialogFragmentD == null) {
            return;
        }
        if (appCompatDialogFragmentD instanceof rme) {
            e((rme) appCompatDialogFragmentD);
        } else {
            if (!(appCompatDialogFragmentD instanceof qxr) || qybVar == null) {
                return;
            }
            f((qxr) appCompatDialogFragmentD, qybVar, qwnVar, qynVar);
        }
    }

    private static AppCompatDialogFragment d(cr crVar) {
        return (AppCompatDialogFragment) crVar.f(a);
    }

    private final void e(rme rmeVar) {
        sjl.c();
        vtw vtwVarM = wds.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wds wdsVar = (wds) vucVar;
        wdsVar.d = 1;
        wdsVar.b |= 2;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        vuc vucVar2 = vtwVarM.b;
        wds wdsVar2 = (wds) vucVar2;
        wdsVar2.f = 8;
        wdsVar2.b |= 32;
        if (!vucVar2.A()) {
            vtwVarM.u();
        }
        qwn qwnVar = this.b;
        wds wdsVar3 = (wds) vtwVarM.b;
        wdsVar3.e = 3;
        wdsVar3.b = 8 | wdsVar3.b;
        new rhd(qwnVar, rmeVar, (wds) vtwVarM.r());
    }

    private static void f(qxr qxrVar, qyb qybVar, qwn qwnVar, qyn qynVar) {
        qyo qyoVar = new qyo(qwnVar);
        xwk xwkVar = qybVar.b.c;
        xwkVar.b = qyoVar;
        tst tstVar = qwnVar.n;
        tstVar.getClass();
        xwkVar.c = tstVar;
        tst tstVar2 = qwnVar.o;
        tstVar2.getClass();
        xwkVar.a = tstVar2;
        qxrVar.b = qybVar;
        qxrVar.i = qynVar;
        qxrVar.j.r();
    }

    public final AppCompatDialogFragment a(qyb qybVar, qwn qwnVar) {
        AppCompatDialogFragment appCompatDialogFragmentD = d(this.d);
        if (appCompatDialogFragmentD != null) {
            return appCompatDialogFragmentD;
        }
        Bundle bundle = new Bundle();
        rrx rrxVar = qwnVar.e.q;
        bundle.putBoolean("enableDynamicColors", true);
        qxr qxrVar = new qxr();
        qxrVar.setArguments(bundle);
        f(qxrVar, qybVar, qwnVar, this.f);
        return qxrVar;
    }

    public final rme b() {
        sjl.c();
        rme rmeVar = (rme) d(this.d);
        if (rmeVar != null) {
            return rmeVar;
        }
        rme rmeVar2 = new rme();
        Bundle bundle = new Bundle();
        bundle.putBoolean("accountMenuFlavorsStyle", true);
        rmeVar2.setArguments(bundle);
        e(rmeVar2);
        return rmeVar2;
    }

    public final void c(AppCompatDialogFragment appCompatDialogFragment) {
        sjl.c();
        if (this.e.isFinishing() || appCompatDialogFragment.isAdded()) {
            return;
        }
        cr crVar = this.d;
        if (crVar.ab()) {
            return;
        }
        appCompatDialogFragment.showNow(crVar, a);
    }
}
