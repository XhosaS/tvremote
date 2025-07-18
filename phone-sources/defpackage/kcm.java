package defpackage;

import android.view.LayoutInflater;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kcm implements sch {
    private final /* synthetic */ int a;

    public /* synthetic */ kcm(int i) {
        this.a = i;
    }

    @Override // defpackage.sch
    public final void a(Object obj, View view) {
        if (this.a == 0) {
            by byVarN = ihz.N(view);
            if (byVarN != null) {
                byVarN.finish();
                return;
            }
            return;
        }
        dxd dxdVarM = ihz.M(view);
        kka kkaVar = null;
        kka kkaVar2 = dxdVarM instanceof kka ? (kka) dxdVarM : null;
        if (kkaVar2 == null) {
            LayoutInflater.Factory factoryN = ihz.N(view);
            if (factoryN instanceof kka) {
                kkaVar = (kka) factoryN;
            }
        } else {
            kkaVar = kkaVar2;
        }
        if (kkaVar != null) {
            kkaVar.u();
        }
    }
}
