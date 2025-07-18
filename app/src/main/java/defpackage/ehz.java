package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class ehz {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ eiz d;

    public ehz(eiz eizVar, int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = eizVar;
    }

    public final boolean a(int i) {
        eiz eizVar = this.d;
        synchronized (eizVar) {
            List list = eizVar.a;
            if (this.c != list.size()) {
                return false;
            }
            efn efnVar = (efn) list.get(i);
            efnVar.c().m();
            int iS = eizVar.s(efnVar);
            int iR = eizVar.r(efnVar);
            int i2 = this.a;
            boolean z = ebc.a;
            if ((i >= i2 || efnVar.c().h()) && i <= this.b) {
                if (efnVar.p(iS, iR)) {
                    return true;
                }
                efnVar.t(eizVar.e, iS, iR, null);
                return true;
            }
            eizVar.E.remove(Integer.valueOf(i));
            if (dyd.b()) {
                eiz.B(efnVar, eizVar.i);
                return true;
            }
            eizVar.f.post(new eia(eizVar, efnVar));
            return true;
        }
    }
}
