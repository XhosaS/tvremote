package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mko implements nws {
    final /* synthetic */ mkr a;

    public mko(mkr mkrVar) {
        this.a = mkrVar;
    }

    @Override // defpackage.nyc
    public final void aD(Bundle bundle) {
        krd.b("onConnected");
        mkr mkrVar = this.a;
        if (mkrVar.H()) {
            return;
        }
        String string = mkrVar.i.getString(krh.CAST_V2_SESSION_ID, "");
        krd.b("sessionRestore sessionId: ".concat(String.valueOf(string)));
        if (TextUtils.isEmpty(string)) {
            nwu nwuVar = mkrVar.h;
            String str = mkrVar.j;
            jzs jzsVar = nkm.a;
            nxr nxrVarB = nwuVar.b(new nkd(nwuVar, str));
            krd.b("start receiver app " + str + ":" + nwuVar.g());
            nxrVarB.i(new mkk(mkrVar, 4));
            return;
        }
        nwu nwuVar2 = mkrVar.h;
        String str2 = mkrVar.j;
        jzs jzsVar2 = nkm.a;
        nxr nxrVarB2 = nwuVar2.b(new nke(nwuVar2, str2, string));
        krd.b("sessionRestore join app " + str2 + ":" + string + ":" + nwuVar2.g());
        nxrVarB2.i(new mkk(mkrVar, 3));
    }

    @Override // defpackage.nyc
    public final void aE(int i) {
        krd.f(a.cf(i, "onConnectionSuspended: "));
        if (i == 1) {
            this.a.C(false);
        } else if (i == 2) {
            mkr mkrVar = this.a;
            if (mkrVar.n == 3) {
                mkrVar.F(1);
            }
        }
    }
}
