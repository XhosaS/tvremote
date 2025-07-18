package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
class eie implements dsm {
    final /* synthetic */ efn a;
    final /* synthetic */ eiz b;

    public eie(eiz eizVar, efn efnVar) {
        this.a = efnVar;
        this.b = eizVar;
    }

    @Override // defpackage.dsm
    public final void a(int i, int i2, boolean z) {
        eiz eizVar = this.b;
        if (eizVar.t() != -1 && z) {
            dxt dxtVar = new dxt();
            efn efnVar = this.a;
            int iIntValue = 0;
            efnVar.g(eizVar.e, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0), dxtVar);
            eizVar.l.put(efnVar, Integer.valueOf(dxtVar.b));
            if (dxtVar.b != eizVar.y.b) {
                if (dxtVar.b > eizVar.y.b) {
                    eizVar.y = dxtVar;
                    synchronized (eizVar) {
                        eizVar.N();
                    }
                    return;
                }
                eiz eizVar2 = this.b;
                Iterator it = eizVar2.l.entrySet().iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) ((Map.Entry) it.next()).getValue();
                    if (iIntValue < num.intValue()) {
                        iIntValue = num.intValue();
                    }
                }
                if (iIntValue != eizVar2.y.b) {
                    eizVar2.y = new dxt(dxtVar.a, iIntValue);
                    synchronized (eizVar2) {
                        eizVar2.N();
                    }
                }
            }
        }
    }
}
