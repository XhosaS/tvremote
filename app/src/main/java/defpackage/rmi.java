package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rmi extends BroadcastReceiver {
    public static volatile rkk a;
    static volatile rkl b;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra == null) {
            return;
        }
        if (stringExtra.contains("../") || stringExtra.contains("/..")) {
            Log.w("PhUpdateBroadcastRecv", a.e(stringExtra, "Got an invalid config package for P/H that includes '..': ", ". Exiting."));
            return;
        }
        rkk rkkVar = a;
        if (rkkVar == null) {
            Log.w("PhUpdateBroadcastRecv", "No callback registered for P/H UPDATE broadcast. Exiting.");
            return;
        }
        rkp[] rkpVarArrC = rkkVar.a.c(stringExtra);
        if (rkpVarArrC != null) {
            for (rkp rkpVar : rkpVarArrC) {
                rko rkoVar = rkp.a;
                rkpVar.d();
            }
        }
    }
}
