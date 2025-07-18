package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vja extends BroadcastReceiver {
    final /* synthetic */ vjb a;

    public vja(vjb vjbVar) {
        this.a = vjbVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        vjb vjbVar = this.a;
        wvl wvlVarB = vjbVar.f.b("MultiProcessAccountDataService BroadcastReceiver", "com/google/apps/tiktok/account/data/MultiProcessAccountDataServiceReceiverRegistrationWrapper$2", "onReceive", 96);
        try {
            vjbVar.c.a(zxy.a, "com.google.apps.tiktok.account.data.AllAccounts");
            wvlVarB.close();
        } catch (Throwable th) {
            try {
                wvlVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
