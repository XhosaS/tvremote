package defpackage;

import android.content.Context;
import androidx.media3.ui.PlayerView;
import com.google.android.apps.googletv.app.player.PlayerActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jde {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public jde(igi igiVar, Context context, wkg wkgVar, String str) {
        this.c = igiVar;
        this.b = context;
        this.d = wkgVar;
        this.a = str;
    }

    public final void a(int i, Throwable th) {
        kmd kmdVar = null;
        if (i == 1) {
            igi igiVar = (igi) this.c;
            String str = igiVar.c;
            if (str == null) {
                yks.c("transactionId");
                str = null;
            }
            kmd kmdVar2 = igiVar.b;
            if (kmdVar2 == null) {
                yks.c("product");
            } else {
                kmdVar = kmdVar2;
            }
            kuw kuwVar = igiVar.d;
            str.getClass();
            kmdVar.getClass();
            nuh nuhVarD = kuwVar.D(194423);
            vtw vtwVarM = ubx.a.m();
            wdm wdmVarC = kuw.C(str, kmdVar, 1);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            ubx ubxVar = (ubx) vtwVarM.b;
            ubxVar.f = wdmVarC;
            ubxVar.b |= 8;
            nuhVarD.w(kuw.y((ubx) vtwVarM.r()));
            ((ntp) kuwVar.b).w(nuhVarD.y());
            krd.b("User cancelled purchase flow");
            return;
        }
        ((tug) ((tug) igi.a.g()).i(th).j("com/google/android/apps/googletv/app/actions/purchaseflow/PurchaseFlowActionHandler$handle$1$1", "onPurchaseFailure", 78, "PurchaseFlowActionHandler.kt")).s("Purchase failed.");
        igi igiVar2 = (igi) this.c;
        String str2 = igiVar2.c;
        if (str2 == null) {
            yks.c("transactionId");
            str2 = null;
        }
        kmd kmdVar3 = igiVar2.b;
        if (kmdVar3 == null) {
            yks.c("product");
        } else {
            kmdVar = kmdVar3;
        }
        kuw kuwVar2 = igiVar2.d;
        str2.getClass();
        kmdVar.getClass();
        nuh nuhVarD2 = kuwVar2.D(194419);
        vtw vtwVarM2 = ubx.a.m();
        wdm wdmVarC2 = kuw.C(str2, kmdVar, i);
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        ubx ubxVar2 = (ubx) vtwVarM2.b;
        ubxVar2.f = wdmVarC2;
        ubxVar2.b |= 8;
        nuhVarD2.w(kuw.y((ubx) vtwVarM2.r()));
        ((ntp) kuwVar2.b).w(nuhVarD2.y());
        Context context = (Context) this.b;
        by byVarF = hju.F(context);
        byVarF.getClass();
        if (byVarF.getSupportFragmentManager().x) {
            return;
        }
        by byVarF2 = hju.F(context);
        byVarF2.getClass();
        byVarF2.runOnUiThread(new ejq(igiVar2, context, i, (wkg) this.d, (String) this.a, 3));
    }

    public /* synthetic */ jde(yjv yjvVar, PlayerView playerView, PlayerActivity playerActivity, PlayerActivity playerActivity2) {
        this.a = yjvVar;
        this.b = playerView;
        this.c = playerActivity;
        this.d = playerActivity2;
    }
}
