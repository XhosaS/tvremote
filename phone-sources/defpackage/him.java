package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
final class him implements hii {
    public wde b;
    public final hin c;

    public him(Context context, wde wdeVar) {
        this.c = new hin(context);
        this.b = wdeVar;
    }

    @Override // defpackage.hii
    public final void a(wcy wcyVar) {
        try {
            e(wcyVar, this.b);
        } catch (Throwable th) {
            hiy.f("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // defpackage.hii
    public final void b(wcy wcyVar, long j, boolean z) {
        wde wdeVar;
        try {
            vtw vtwVar = (vtw) wcyVar.a(5, null);
            vtwVar.x(wcyVar);
            wdg wdgVar = wcyVar.c == 7 ? (wdg) wcyVar.d : wdg.a;
            vtw vtwVar2 = (vtw) wdgVar.a(5, null);
            vtwVar2.x(wdgVar);
            if (!vtwVar2.b.A()) {
                vtwVar2.u();
            }
            wdg wdgVar2 = (wdg) vtwVar2.b;
            wdg wdgVar3 = wdg.a;
            wdgVar2.b |= 2;
            wdgVar2.c = z;
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            wcy wcyVar2 = (wcy) vtwVar.b;
            wdg wdgVar4 = (wdg) vtwVar2.r();
            wdgVar4.getClass();
            wcyVar2.d = wdgVar4;
            wcyVar2.c = 7;
            wcy wcyVar3 = (wcy) vtwVar.r();
            if (j == 0) {
                wdeVar = this.b;
            } else {
                wde wdeVar2 = this.b;
                vtw vtwVar3 = (vtw) wdeVar2.a(5, null);
                vtwVar3.x(wdeVar2);
                if (!vtwVar3.b.A()) {
                    vtwVar3.u();
                }
                wde wdeVar3 = (wde) vtwVar3.b;
                wde wdeVar4 = wde.a;
                wdeVar3.b |= 32;
                wdeVar3.h = j;
                wdeVar = (wde) vtwVar3.r();
            }
            e(wcyVar3, wdeVar);
        } catch (Throwable th) {
            hiy.f("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // defpackage.hii
    public final void c(wcz wczVar) {
        try {
            f(wczVar, this.b);
        } catch (Throwable th) {
            hiy.f("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // defpackage.hii
    public final void d(wdi wdiVar) {
        try {
            hin hinVar = this.c;
            vtw vtwVarM = wdh.a.m();
            wde wdeVar = this.b;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vuc vucVar = vtwVarM.b;
            wdh wdhVar = (wdh) vucVar;
            wdeVar.getClass();
            wdhVar.e = wdeVar;
            wdhVar.b |= 1;
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            wdh wdhVar2 = (wdh) vtwVarM.b;
            wdiVar.getClass();
            wdhVar2.d = wdiVar;
            wdhVar2.c = 8;
            hinVar.a((wdh) vtwVarM.r());
        } catch (Throwable th) {
            hiy.f("BillingLogger", "Unable to log.", th);
        }
    }

    public final void e(wcy wcyVar, wde wdeVar) {
        if (wcyVar != null) {
            try {
                vtw vtwVarM = wdh.a.m();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                vuc vucVar = vtwVarM.b;
                wdh wdhVar = (wdh) vucVar;
                wdeVar.getClass();
                wdhVar.e = wdeVar;
                wdhVar.b |= 1;
                if (!vucVar.A()) {
                    vtwVarM.u();
                }
                wdh wdhVar2 = (wdh) vtwVarM.b;
                wdhVar2.d = wcyVar;
                wdhVar2.c = 2;
                this.c.a((wdh) vtwVarM.r());
            } catch (Throwable th) {
                hiy.f("BillingLogger", "Unable to log.", th);
            }
        }
    }

    public final void f(wcz wczVar, wde wdeVar) {
        if (wczVar != null) {
            try {
                vtw vtwVarM = wdh.a.m();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                vuc vucVar = vtwVarM.b;
                wdh wdhVar = (wdh) vucVar;
                wdeVar.getClass();
                wdhVar.e = wdeVar;
                wdhVar.b |= 1;
                if (!vucVar.A()) {
                    vtwVarM.u();
                }
                wdh wdhVar2 = (wdh) vtwVarM.b;
                wdhVar2.d = wczVar;
                wdhVar2.c = 3;
                this.c.a((wdh) vtwVarM.r());
            } catch (Throwable th) {
                hiy.f("BillingLogger", "Unable to log.", th);
            }
        }
    }
}
