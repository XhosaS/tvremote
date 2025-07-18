package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rik extends ril {
    public static final nte a = nte.a(78315553, whn.LOGGER_OVERRIDE_PROVIDER);
    private final qth b;
    private final nsz c;
    private final nsz d;
    private final String e;

    public rik(qth qthVar, Context context) {
        List list = nsz.l;
        nsu nsuVar = new nsu(context, "ONEGOOGLE_MOBILE");
        nsuVar.e = new ntc() { // from class: rij
            @Override // defpackage.ntc
            public final nte a() {
                return rik.a;
            }
        };
        nsz nszVarA = nsuVar.a();
        nsz nszVarI = nsz.i(context, "ONEGOOGLE_MOBILE");
        this.c = nszVarA;
        this.d = nszVarI;
        this.b = qthVar;
        this.e = context.getApplicationContext().getPackageName();
    }

    @Override // defpackage.ril, defpackage.rim
    public final void a(Object obj, wds wdsVar) {
        qth qthVar = this.b;
        int i = qthVar.a(obj).b;
        if (i == 4) {
            return;
        }
        if (i == 1) {
            if (obj != null) {
                qthVar.j(obj);
            } else {
                i = 2;
            }
        }
        b(i, obj, wdsVar);
    }

    public final void b(int i, Object obj, wds wdsVar) {
        nsy nsyVarG;
        int iA = wef.a(wdsVar.c);
        boolean z = false;
        a.H((iA == 0 || iA == 1) ? false : true);
        int iC = wae.c(wdsVar.d);
        a.H((iC == 0 || iC == 1) ? false : true);
        int iAT = a.aT(wdsVar.f);
        if (iAT != 0 && iAT != 1) {
            z = true;
        }
        a.H(z);
        vtw vtwVarM = wdt.a.m();
        vtw vtwVar = (vtw) wdsVar.a(5, null);
        vtwVar.x(wdsVar);
        String str = this.e;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wds wdsVar2 = (wds) vtwVar.b;
        str.getClass();
        wdsVar2.b |= 64;
        wdsVar2.g = str;
        wds wdsVar3 = (wds) vtwVar.r();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wdt wdtVar = (wdt) vtwVarM.b;
        wdsVar3.getClass();
        wdtVar.c = wdsVar3;
        wdtVar.b |= 1;
        wdt wdtVar2 = (wdt) vtwVarM.r();
        int i2 = i - 1;
        if (i2 != 0) {
            nsyVarG = i2 != 1 ? this.d.g(wdtVar2) : this.c.g(wdtVar2);
        } else {
            nsyVarG = this.c.g(wdtVar2);
            nsyVarG.g(String.valueOf(this.b.d(obj)));
        }
        nsyVarG.i((wef.a(wdsVar.c) != 0 ? r8 : 1) - 1);
        nsyVarG.c();
    }
}
