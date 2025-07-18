package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jaa extends BroadcastReceiver {
    public iea a;
    public kuw b;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String dataString;
        wae.B(this, context);
        kuw kuwVar = this.b;
        if (kuwVar == null) {
            yks.c("semanticEventLogger");
            kuwVar = null;
        }
        if (intent == null || (dataString = intent.getDataString()) == null) {
            dataString = "";
        }
        dataString.getClass();
        nuh nuhVarD = kuwVar.D(185272);
        vtw vtwVarM = ubx.a.m();
        vtw vtwVarM2 = ubv.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        ubv ubvVar = (ubv) vtwVarM2.b;
        ubvVar.b |= 1;
        ubvVar.c = dataString;
        ubv ubvVar2 = (ubv) vtwVarM2.r();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ubx ubxVar = (ubx) vtwVarM.b;
        ubvVar2.getClass();
        ubxVar.e = ubvVar2;
        ubxVar.b |= 4;
        nuhVarD.w(kuw.y((ubx) vtwVarM.r()));
        ((ntp) kuwVar.b).w(nuhVarD.y());
    }
}
